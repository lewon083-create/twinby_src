/**
 * Twinby SSL Pinning Bypass v2
 * =============================
 * Target: com.twinby (Flutter Embedding v2 + Java)
 * 
 * КЛЮЧЕВЫЕ ОТЛИЧИЯ ОТ v4:
 * 
 * 1. Native BoringSSL hooks:
 *    - Поиск символов через Module.findExportByName(null, ...) — во всех модулях
 *    - Перехват android_dlopen_ext для обнаружения загрузки libflutter.so
 *    - Мгновенная установка хуков при обнаружении загрузки (delay 10ms)
 *    - Polling 50ms вместо 500ms для spawn mode
 *    - Прямая модификация SSL_CTX.verify_mode через pointer arithmetic
 * 
 * 2. Java SSL hooks:
 *    - ИСПРАВЛЕНА рекурсия в SSLContext.init (критический баг v4!)
 *    - Добавлен хук TrustManagerFactory.getTrustManagers
 *    - Более надёжное покрытие overloads через .overloads.forEach
 *    - Двойное патчение zk.u экземпляров (0s + 2s)
 * 
 * 3. Usage:
 *    SPAWN (рекомендуется):  frida -U -f com.twinby -l frida_bypass_ssl_pinning_v2.js --no-pause
 *    ATTACH:                  frida -U com.twinby -l frida_bypass_ssl_pinning_v2.js
 *                             (после загрузки перезапустить приложение)
 */

"use strict";

// ============================================================
// UTILITIES
// ============================================================
var hookedLibs = {};
var PERMISSIVE_TM = null;
var PERMISSIVE_HV = null;

function log(msg)    { console.log("[v2] " + msg); }
function logOk(msg)  { console.log("[v2 ✓] " + msg); }
function logErr(msg) { console.log("[v2 ✗] " + msg); }

// ============================================================
// SECTION A: NATIVE BORINGSSL BYPASS
// ============================================================

var SSL_HOOK_TARGETS = [
    "SSL_set_custom_verify",
    "SSL_CTX_set_custom_verify",
    "SSL_set_verify",
    "SSL_CTX_set_verify",
    "SSL_CTX_set_cert_verify_callback",
];

/**
 * A1: Установка хуков на BoringSSL функции.
 * Используем Interceptor.attach с onEnter для подмены аргументов —
 * это надёжнее чем Interceptor.replace (не ломает calling conventions
 * и не требует точного знания сигнатуры).
 */
function installNativeHooks(moduleName) {
    if (moduleName && hookedLibs[moduleName]) return;

    SSL_HOOK_TARGETS.forEach(function(symName) {
        var addr;
        if (moduleName) {
            addr = Module.findExportByName(moduleName, symName);
        } else {
            addr = Module.findExportByName(null, symName);
        }
        if (!addr) return;

        try {
            Interceptor.attach(addr, {
                onEnter: function(args) {
                    // Для всех SSL_CTX_set_verify / SSL_set_custom_verify:
                    //   args[0] = SSL_CTX* или SSL*
                    //   args[1] = mode (int)
                    //   args[2] = callback (function pointer)
                    // Устанавливаем mode=0 (SSL_VERIFY_NONE), callback=NULL
                    this.ctx = args[0];
                    args[1] = ptr(0);
                    args[2] = ptr(0);
                },
                onLeave: function(retval) {
                    // Пост-хук: патчим verify_mode напрямую в SSL_CTX
                    // BoringSSL SSL_CTX.verify_mode обычно по смещению 0x68-0x78
                    if (this.ctx && !this.ctx.isNull()) {
                        for (var offset = 0x60; offset <= 0x80; offset += 4) {
                            try { this.ctx.add(offset).writeInt(0); } catch(e) {}
                        }
                    }
                }
            });
            
            var modLabel = moduleName || "(any)";
            logOk("+ " + symName + " in " + modLabel + " @ " + addr);
            
            var key = moduleName ? (moduleName + ":" + symName) : ("*:" + symName);
            hookedLibs[key] = true;
            
        } catch(e) {
            logErr(symName + ": " + e.message);
        }
    });

    if (moduleName) hookedLibs[moduleName] = true;
}

// --- A2: Хук android_dlopen_ext — ловим загрузку libflutter.so ---
try {
    var dlopenExt = Module.findExportByName(null, "android_dlopen_ext");
    if (dlopenExt) {
        Interceptor.attach(dlopenExt, {
            onEnter: function(args) {
                this.filename = args[0].readCString();
            },
            onLeave: function() {
                var name = this.filename || "";
                if (name.indexOf("flutter") !== -1 ||
                    name.indexOf("ssl") !== -1 ||
                    name.indexOf("crypto") !== -1 ||
                    name.indexOf("boringssl") !== -1) {
                    log("NATIVE: dlopen: " + name + " — installing hooks in 10ms");
                    var modName = name.split("/").pop();
                    setTimeout(function() { installNativeHooks(modName); }, 10);
                }
            }
        });
        logOk("+ Hooked android_dlopen_ext");
    }
} catch(e) {
    logErr("dlopen_ext: " + e.message);
}

// --- A3: Немедленная установка хуков на уже загруженные модули ---
log("NATIVE: Installing immediate hooks...");
installNativeHooks(null); // поиск во ВСЕХ модулях

Process.enumerateModules().forEach(function(mod) {
    if (mod.size < 100 * 1024) return;
    installNativeHooks(mod.name);
});

// --- A4: Быстрый polling для spawn mode (50ms вместо 500ms!) ---
var pollCount = 0;
var pollInterval = setInterval(function() {
    pollCount++;
    if (pollCount > 40) { clearInterval(pollInterval); return; }

    Process.enumerateModules().forEach(function(mod) {
        if (mod.size < 100 * 1024) return;
        if (hookedLibs[mod.name]) return;

        var isTarget = (mod.name.indexOf("flutter") !== -1 ||
                       mod.name.indexOf("ssl") !== -1 ||
                       mod.name.indexOf("boringssl") !== -1 ||
                       mod.name.indexOf("crypto") !== -1);

        if (isTarget) {
            log("NATIVE: Found " + mod.name + " on poll #" + pollCount);
            installNativeHooks(mod.name);
        }
    });
}, 50);

// ============================================================
// SECTION B: JAVA SSL BYPASS
// ============================================================
Java.perform(function() {
    log("JAVA: Starting Java-level SSL bypass...");

    // --- B1: Permissive TrustManager & HostnameVerifier ---
    var TrustAllManager = Java.registerClass({
        name: "com.bypass.TrustAllV2",
        implements: [Java.use("javax.net.ssl.X509TrustManager")],
        methods: {
            checkClientTrusted: function() {},
            checkServerTrusted: function() {},
            getAcceptedIssuers: function() {
                return Java.array("java.security.cert.X509Certificate", []);
            }
        }
    });
    var TrustAllHV = Java.registerClass({
        name: "com.bypass.HVV2",
        implements: [Java.use("javax.net.ssl.HostnameVerifier")],
        methods: { verify: function() { return true; } }
    });

    PERMISSIVE_TM = TrustAllManager.$new();
    PERMISSIVE_HV = TrustAllHV.$new();

    function makePermissiveSSF() {
        var ctx = Java.use("javax.net.ssl.SSLContext").getInstance("TLS");
        ctx.init(null, Java.array("javax.net.ssl.TrustManager", [PERMISSIVE_TM]), null);
        return ctx.getSocketFactory();
    }

    // --- B2: TrustManagerFactory (ФАБРИЧНЫЙ УРОВЕНЬ) ---
    try {
        var TMF = Java.use("javax.net.ssl.TrustManagerFactory");
        TMF.getTrustManagers.implementation = function() {
            log("JAVA: TMF.getTrustManagers → permissive");
            return Java.array("javax.net.ssl.TrustManager", [PERMISSIVE_TM]);
        };
        logOk("+ TMF.getTrustManagers");
    } catch(e) { logErr("TMF: " + e.message); }

    // --- B3: SSLContext.init — ИСПРАВЛЕНО (нет рекурсии!) ---
    // СТРАТЕГИЯ v2: Не вызываем this.init() внутри хука.
    // Вместо этого полагаемся на TMF.getTrustManagers хук,
    // который всегда возвращает permissive TM.
    // SSLContext.init вызывает TMF.getTrustManagers → наш permissive TM.
    try {
        var SSLCtx = Java.use("javax.net.ssl.SSLContext");
        SSLCtx.init.overloads.forEach(function(overload) {
            overload.implementation = function() {
                log("JAVA: SSLContext.init — TMF hook covers this");
                // Не вызываем оригинал — TMF хук уже всё сделает при
                // следующем вызове getTrustManagers()
            };
        });
        logOk("+ SSLContext.init (no recursion!)");
    } catch(e) { logErr("SSLContext.init: " + e.message); }

    // --- B4: OkHttp Platform (hl.n) ---
    try {
        var Platform = Java.use("hl.n");
        Platform.m.implementation = function() {
            log("JAVA: hl.n.m → permissive TM");
            return PERMISSIVE_TM;
        };
        Platform.l.implementation = function(tm) {
            log("JAVA: hl.n.l → permissive SSF");
            return makePermissiveSSF();
        };
        logOk("+ OkHttp Platform (hl.n)");
    } catch(e) { logErr("hl.n: " + e.message); }

    // --- B5: OkHttp HostnameVerifier (ll.c) ---
    try {
        Java.use("ll.c").verify.overload(
            "java.lang.String", "javax.net.ssl.SSLSession"
        ).implementation = function(hostname, session) {
            return true;
        };
        logOk("+ OkHttp HV (ll.c)");
    } catch(e) { logErr("ll.c: " + e.message); }

    // --- B6: HttpsURLConnection ---
    try {
        var HUC = Java.use("javax.net.ssl.HttpsURLConnection");
        HUC.setDefaultSSLSocketFactory.implementation = function() {};
        HUC.setDefaultHostnameVerifier.implementation = function() {};
        logOk("+ HttpsURLConnection");
    } catch(e) { logErr("HUC: " + e.message); }

    // --- B7: RootTrustManager (NSC) ---
    try {
        var RTM = Java.use("android.security.net.config.RootTrustManager");
        RTM.checkServerTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        RTM.checkClientTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        RTM.getAcceptedIssuers.implementation = function() {
            return Java.array("java.security.cert.X509Certificate", []);
        };
        logOk("+ RootTrustManager");
    } catch(e) { logErr("RTM: " + e.message); }

    // --- B8: Conscrypt TrustManagerImpl ---
    try {
        var TMI = Java.use("com.android.org.conscrypt.TrustManagerImpl");
        TMI.checkServerTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        TMI.getAcceptedIssuers.implementation = function() {
            return Java.array("java.security.cert.X509Certificate", []);
        };
        logOk("+ Conscrypt TrustManagerImpl");
    } catch(e) { logErr("TMI: " + e.message); }

    // --- B9: Yandex Ads — yads.qu2 (ALL overloads) ---
    try {
        var YadsTM = Java.use("yads.qu2");
        YadsTM.checkServerTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        YadsTM.checkClientTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        YadsTM.getAcceptedIssuers.implementation = function() {
            return Java.array("java.security.cert.X509Certificate", []);
        };
        logOk("+ Yandex qu2 (ALL overloads)");
    } catch(e) { logErr("yads.qu2: " + e.message); }

    // --- B10: Yandex delegate mw2.a ---
    try {
        var Mw2 = Java.use("yads.mw2");
        Mw2.a.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function() {};
        logOk("+ Yandex mw2.a");
    } catch(e) { logErr("yads.mw2: " + e.message); }

    // --- B11: OkHttpClient (zk.u) instance patching ---
    function patchZkU() {
        try {
            Java.choose("zk.u", {
                onMatch: function(inst) {
                    try {
                        inst.f46489q.value = PERMISSIVE_TM;
                        inst.f46488p.value = makePermissiveSSF();
                        inst.f46492t.value = PERMISSIVE_HV;
                        log("JAVA: Patched zk.u instance");
                    } catch(e) {}
                },
                onComplete: function() { log("JAVA: zk.u scan done"); }
            });
        } catch(e) {}
    }
    patchZkU();
    setTimeout(patchZkU, 2000); // Повторное патчение новых экземпляров

    // --- B12: PairIP License Bypass ---
    try {
        var LC = Java.use("com.pairip.licensecheck.LicenseClient");
        LC.checkLicense.overload("android.content.Context").implementation = function(ctx) {};
        try { LC.performLocalInstallerCheck.implementation = function() { return true; }; } catch(e) {}
        logOk("+ PairIP license bypass");
    } catch(e) { logErr("PairIP: " + e.message); }

    // --- B13: System.exit block ---
    try {
        Java.use("java.lang.System").exit.implementation = function(code) {
            log("JAVA: System.exit(" + code + ") BLOCKED");
        };
        logOk("+ System.exit blocked");
    } catch(e) {}

    // ============================================================
    log("========================================");
    log("TWINBY SSL BYPASS v2 — READY");
    log("========================================");
    log("Native: BoringSSL hooks + dlopen monitor");
    log("Java: TMF + SSLContext + OkHttp + HUC + RTM + TMI + Yandex");
    log("PairIP: License check bypassed");
    log("========================================");
    log("BEST: frida -U -f com.twinby -l THIS_SCRIPT.js --no-pause");
    log("========================================");
});
