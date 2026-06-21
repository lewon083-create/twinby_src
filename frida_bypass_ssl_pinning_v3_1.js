/**
 * Twinby SSL Pinning Bypass v3 (Oracle-Fixed)
 * ============================================
 * Target: com.twinby (Flutter Embedding v2 + Java)
 * 
 * v2 → v3 CHANGES (all Oracle-identified bugs fixed):
 * 
 * 1. REMOVED SSLContext.init hook (was FATAL no-op in v2).
 *    SSLContext.init now works normally. Permissive TrustManager injected
 *    via TrustManagerFactory.getTrustManagers() at factory level.
 * 
 * 2. REMOVED onLeave memory writes to SSL_CTX struct (was FATAL corruption).
 *    The onEnter args[1]=0, args[2]=NULL is sufficient — the original
 *    function receives modified args and writes verify_mode=0 correctly.
 * 
 * 3. REMOVED HttpsURLConnection hooks (had potential recursion in v3-draft).
 *    Not needed — TMF.getTrustManagers + checkServerTrusted hooks on
 *    RootTrustManager and Conscrypt already cover all Java SSL paths.
 *    Setting SSLSocketFactory on HUC would risk self-recursion.
 * 
 * 4. CACHED permissive SSLSocketFactory in makePermissiveSSF().
 * 
 * 5. Added explicit warning: RELEASE builds have STRIPPED libflutter.so.
 *    BoringSSL symbol hooks will NOT find symbols. For Dart HTTP traffic
 *    bypass, use alternative approaches (see report).
 * 
 * KEY ARCHITECTURE DECISIONS:
 * - TMF.getTrustManagers is the SINGLE injection point for Java SSL
 * - SSLContext.init is never hooked (avoids all recursion issues)
 * - checkServerTrusted overloads are no-opped as defense-in-depth
 * - Native BoringSSL hooks are best-effort only (stripped symbols in release)
 * 
 * Usage:
 *   SPAWN: frida -U -f com.twinby -l frida_bypass_ssl_pinning_v3.js --no-pause
 *   ATTACH: frida -U com.twinby -l frida_bypass_ssl_pinning_v3.js
 *           (restart app after script loads for best results)
 */

"use strict";

// ============================================================
// UTILITIES
// ============================================================
var hookedLibs = {};
var PERMISSIVE_TM = null;
var PERMISSIVE_HV = null;
var PERMISSIVE_SSF = null;  // cached after first creation

function log(msg)    { console.log("[v3] " + msg); }
function logOk(msg)  { console.log("[v3 ✓] " + msg); }
function logWarn(msg){ console.log("[v3 ⚠] " + msg); }
function logErr(msg) { console.log("[v3 ✗] " + msg); }

// ============================================================
// SECTION A: NATIVE BORINGSSL BYPASS (BEST-EFFORT)
// ============================================================

// ============================================================
// SECTION A0: NATIVE EXIT BYPASS (runs BEFORE Java.perform!)
// ============================================================
// PairIP license check calls System.exit(0) during
// Application.attachBaseContext() — BEFORE Java.perform runs.
// System.exit → Runtime.exit → ProcessManager.exit → libc exit()
// We hook libc exit() in the IMMEDIATE scope to prevent this.
(function() {
    var exitAddr = Module.findExportByName(null, "exit");
    if (exitAddr) {
        Interceptor.replace(exitAddr, new NativeCallback(function(code) {
            console.log("[v3 NATIVE] exit(" + code + ") BLOCKED — PairIP kill prevented");
            // Don't call real exit. Just return.
            // The app will continue running.
        }, "void", ["int"]));
        console.log("[v3 ✓] + Native exit() hook (blocks PairIP kill)");
    } else {
        console.log("[v3 ✗] exit() not found");
    }

    // Also hook _exit (alternative exit path)
    var exit2 = Module.findExportByName(null, "_exit");
    if (exit2) {
        Interceptor.replace(exit2, new NativeCallback(function(code) {
            console.log("[v3 NATIVE] _exit(" + code + ") BLOCKED");
        }, "void", ["int"]));
    }

    // Hook abort() — some license checks call abort()
    var abortAddr = Module.findExportByName(null, "abort");
    if (abortAddr) {
        Interceptor.replace(abortAddr, new NativeCallback(function() {
            console.log("[v3 NATIVE] abort() BLOCKED");
        }, "void", []));
    }
})();

// 
// ⚠️  RELEASE BUILDS: libflutter.so is STRIPPED — BoringSSL export symbols
//     (SSL_set_custom_verify, SSL_CTX_set_verify, etc.) will NOT be found.
//     This section works ONLY on debug builds or rooted devices with
//     modified libflutter.so. For release builds, Dart HTTP traffic
//     interception requires alternative approaches:
//     - Frida Dart hooks (HttpClient.badCertificateCallback)
//     - APK repackaging with debuggable=true
//     - Frida Gadget injection
//     - Xposed/LSPosed module (TrustMeAlready)
// ============================================================

var SSL_HOOK_TARGETS = [
    "SSL_set_custom_verify",
    "SSL_CTX_set_custom_verify",
    "SSL_set_verify",
    "SSL_CTX_set_verify",
    "SSL_CTX_set_cert_verify_callback",
];

/**
 * Hook BoringSSL functions by modifying arguments in onEnter.
 * For SSL_CTX_set_custom_verify(ctx, mode, callback):
 *   Set mode=0 (SSL_VERIFY_NONE), callback=NULL.
 * The original function receives modified args and writes verify_mode=0.
 *
 * NO onLeave — args modification in onEnter is sufficient and safe.
 */
function installNativeHooks(moduleName) {
    if (moduleName && hookedLibs[moduleName]) return;

    SSL_HOOK_TARGETS.forEach(function(symName) {
        var addr = null;

        if (moduleName) {
            addr = Module.findExportByName(moduleName, symName);
        } else {
            // Fallback: search all loaded modules
            addr = Module.findExportByName(null, symName);
        }

        if (!addr) return;

        var key = moduleName ? (moduleName + ":" + symName) : ("*:" + symName);
        if (hookedLibs[key]) return;

        try {
            Interceptor.attach(addr, {
                onEnter: function(args) {
                    // args[0] = SSL_CTX* or SSL*
                    // args[1] = mode (int) → set to 0 = SSL_VERIFY_NONE
                    // args[2] = callback (function*) → set to NULL
                    args[1] = ptr(0);
                    args[2] = ptr(0);
                }
                // No onLeave. args modification in onEnter is forwarded
                // to the original function which correctly writes the
                // verify_mode field without memory corruption.
            });

            logOk("+ " + symName + " in " + (moduleName || "(any)") + " @ " + addr);
            hookedLibs[key] = true;

        } catch(e) {
            logErr(symName + ": " + e.message);
        }
    });

    if (moduleName) hookedLibs[moduleName] = true;
}

// --- A2: Hook android_dlopen_ext to detect late-loading SSL libs ---
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
                    var modName = name.split("/").pop();
                    log("NATIVE: dlopen " + modName);
                    setTimeout(function() { installNativeHooks(modName); }, 5);
                }
            }
        });
        logOk("+ Hooked android_dlopen_ext");
    }
} catch(e) {
    logErr("dlopen_ext: " + e.message);
}

// --- A3: Immediate hooks on already-loaded modules ---
log("NATIVE: Scanning loaded modules for BoringSSL symbols...");
installNativeHooks(null); // search ALL modules first

// Then per-module for SSL-specific libs
var SSL_LIB_PATTERNS = ["flutter", "ssl", "boringssl", "crypto"];
Process.enumerateModules().forEach(function(mod) {
    if (mod.size < 100 * 1024) return;
    for (var i = 0; i < SSL_LIB_PATTERNS.length; i++) {
        if (mod.name.toLowerCase().indexOf(SSL_LIB_PATTERNS[i]) !== -1) {
            installNativeHooks(mod.name);
            break;
        }
    }
});

// --- A4: Fast polling for spawn mode (50ms interval) ---
var pollCount = 0;
var pollInterval = setInterval(function() {
    pollCount++;
    if (pollCount > 60) { // 3 seconds max
        clearInterval(pollInterval);
        var count = Object.keys(hookedLibs)
            .filter(function(k) { return k.indexOf("SSL_") !== -1; }).length;
        log("NATIVE: Poll ended. " + count + " BoringSSL hooks installed");
        if (count === 0) {
            logWarn("NATIVE: No BoringSSL symbols — libflutter.so is stripped (release build)");
            logWarn("NATIVE: Dart HTTP traffic will NOT be intercepted by this script");
            logWarn("NATIVE: See report for Dart bypass alternatives");
        }
        return;
    }

    Process.enumerateModules().forEach(function(mod) {
        if (mod.size < 100 * 1024) return;
        if (hookedLibs[mod.name]) return;
        for (var i = 0; i < SSL_LIB_PATTERNS.length; i++) {
            if (mod.name.toLowerCase().indexOf(SSL_LIB_PATTERNS[i]) !== -1) {
                installNativeHooks(mod.name);
                break;
            }
        }
    });
}, 50);

// ============================================================
// SECTION A5: PATTERN-SCAN STRIPPED libflutter.so
// ============================================================
// Release Flutter builds strip BoringSSL symbols from libflutter.so.
// We recover the function addresses by reading byte patterns from
// libssl.so (which DOES have symbols — same BoringSSL source code)
// and scanning libflutter.so's .text section for matching bytes.

function scanAndHookStrippedLib() {
    var flutterMod = Process.findModuleByName("libflutter.so");
    if (!flutterMod) {
        logWarn("NATIVE: libflutter.so not loaded yet for pattern scan");
        return false;
    }

    // Get reference byte patterns from a lib that HAS symbols
    var refLib = Process.findModuleByName("libssl.so");
    if (!refLib) {
        refLib = Process.findModuleByName("libjavacrypto.so");
    }
    if (!refLib) {
        logWarn("NATIVE: No reference SSL library for pattern extraction");
        return false;
    }

    var patternsExtracted = 0;

    SSL_HOOK_TARGETS.forEach(function(symName) {
        var refAddr = Module.findExportByName(refLib.name, symName);
        if (!refAddr) return;

        // Read 64 bytes of the function prologue
        var pattern = refAddr.readByteArray(64);
        if (!pattern) return;

        try {
            var results = Memory.scanSync(flutterMod.base, flutterMod.size, pattern);
            if (results.length > 0) {
                var addr = results[0].address;
                try {
                    Interceptor.attach(addr, {
                        onEnter: function(args) {
                            args[1] = ptr(0);
                            args[2] = ptr(0);
                        }
                    });
                    logOk("+ [SCAN] " + symName + " in libflutter.so @ " + addr +
                          " (pattern from " + refLib.name + ")");
                    patternsExtracted++;
                } catch(e) {
                    logErr("[SCAN] " + symName + " hook: " + e.message);
                }
            }
        } catch(e) {
            // Memory.scan may fail on some Android versions
        }
    });

    if (patternsExtracted === 0) {
        logWarn("NATIVE: Pattern scan found 0 functions in libflutter.so");
        logWarn("NATIVE: Dart HTTP bypass NOT available.");
        logWarn("NATIVE: APK repack: android:debuggable=true + user certs");
    }
    return patternsExtracted > 0;
}

// Run immediately (attach mode — libflutter.so is loaded)
scanAndHookStrippedLib();

// Also scan when libflutter.so is detected via dlopen
var flutterScanned = false;
var dlopenAddr = Module.findExportByName(null, "android_dlopen_ext");
if (dlopenAddr) {
    Interceptor.attach(dlopenAddr, {
        onLeave: function() {
            if (flutterScanned) return;
            var fm = Process.findModuleByName("libflutter.so");
            if (fm) {
                setTimeout(function() {
                    if (scanAndHookStrippedLib()) flutterScanned = true;
                }, 100);
            }
        }
    });
}

// Final attempt after 3 seconds (spawn mode)
setTimeout(function() {
    scanAndHookStrippedLib();
}, 3000);

// ============================================================
// SECTION B: JAVA SSL BYPASS
// ============================================================
Java.perform(function() {
    log("JAVA: Starting Java-level SSL bypass...");

    // --- B1: Create permissive TrustManager & HostnameVerifier ---
    var TrustAllManager = Java.registerClass({
        name: "com.bypass.TrustAllV3",
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
        name: "com.bypass.HVV3",
        implements: [Java.use("javax.net.ssl.HostnameVerifier")],
        methods: { verify: function() { return true; } }
    });

    PERMISSIVE_TM = TrustAllManager.$new();
    PERMISSIVE_HV = TrustAllHV.$new();

    // Cache the permissive SSLSocketFactory for reuse
    function makePermissiveSSF() {
        if (PERMISSIVE_SSF !== null) return PERMISSIVE_SSF;
        try {
            var sslCtx = Java.use("javax.net.ssl.SSLContext").getInstance("TLS");
            // SSLContext.init is NOT hooked — it works normally.
            // The permissive TM is injected via TMF.getTrustManagers hook below.
            sslCtx.init(null,
                Java.array("javax.net.ssl.TrustManager", [PERMISSIVE_TM]),
                null);
            PERMISSIVE_SSF = sslCtx.getSocketFactory();
            log("JAVA: Created permissive SSLSocketFactory (cached)");
            return PERMISSIVE_SSF;
        } catch(e) {
            logErr("makePermissiveSSF: " + e.message);
            return Java.use("javax.net.ssl.SSLSocketFactory").getDefault();
        }
    }

    // ================================================================
    // B2: TrustManagerFactory.getTrustManagers — PRIMARY INJECTION POINT
    // ================================================================
    // This is the SINGLE most important Java hook. Every standard path
    // that creates SSLContext goes through TrustManagerFactory.
    // Returning permissive TM here covers:
    //   - OkHttp via hl.n.m() → TrustManagerFactory.getDefaultAlgorithm()
    //   - Yandex Ads via yads.e93.a() → TrustManagerFactory
    //   - HttpsURLConnection default setup
    //   - Any code using standard SSLContext.init(keyManagers, trustManagers, random)
    // ================================================================
    try {
        var TMF = Java.use("javax.net.ssl.TrustManagerFactory");
        TMF.getTrustManagers.implementation = function() {
            return Java.array("javax.net.ssl.TrustManager", [PERMISSIVE_TM]);
        };
        logOk("+ TMF.getTrustManagers() → permissive TM (PRIMARY hook)");
    } catch(e) { logErr("TMF: " + e.message); }

    // --- B3: SSLContext.init — DELIBERATELY UNHOOKED ---
    // SSLContext.init works normally. Permissive TM is injected at
    // the TMF level (B2). Hook removal avoids ALL recursion issues.
    logOk("+ SSLContext.init: untouched (TMF covers it)");

    // --- B4: OkHttp Platform (hl.n) ---
    // OkHttp uses hl.n.f20755a.m() for TrustManager and
    // hl.n.f20755a.l() for SSLSocketFactory.
    // Both are overridden to return permissive versions.
    try {
        var Platform = Java.use("hl.n");
        Platform.m.implementation = function() {
            return PERMISSIVE_TM;
        };
        Platform.l.implementation = function(tm) {
            return makePermissiveSSF();
        };
        logOk("+ OkHttp Platform hl.n");
    } catch(e) { logErr("hl.n: " + e.message); }

    // --- B5: OkHttp HostnameVerifier (ll.c) ---
    try {
        Java.use("ll.c").verify.overload(
            "java.lang.String", "javax.net.ssl.SSLSession"
        ).implementation = function(hostname, session) {
            return true;
        };
        logOk("+ OkHttp HV ll.c → always true");
    } catch(e) { logErr("ll.c: " + e.message); }

    // --- B6: HttpsURLConnection — NO HOOKS (deliberate) ---
    // Hooks on setDefaultSSLSocketFactory/setDefaultHostnameVerifier
    // risk self-recursion when trying to inject permissive values.
    // Not needed: TMF (B2) already ensures permissive TM for all
    // SSLContext creation. RootTrustManager + Conscrypt hooks below
    // (B7, B8) handle the actual verification.
    logOk("+ HttpsURLConnection: no hooks needed (TMF covers it)");

    // --- B7: RootTrustManager NSC — all overloads → noop ---
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
        logOk("+ RootTrustManager (NSC): all overloads → noop");
    } catch(e) { logErr("RTM: " + e.message); }

    // --- B8: Conscrypt TrustManagerImpl — all overloads → noop ---
    try {
        var TMI = Java.use("com.android.org.conscrypt.TrustManagerImpl");
        TMI.checkServerTrusted.overloads.forEach(function(o) {
            o.implementation = function() {};
        });
        TMI.getAcceptedIssuers.implementation = function() {
            return Java.array("java.security.cert.X509Certificate", []);
        };
        logOk("+ Conscrypt TrustManagerImpl: all overloads → noop");
    } catch(e) { logErr("TMI: " + e.message); }

    // --- B9: Yandex Ads yads.qu2 — ALL overloads → noop ---
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
        logOk("+ Yandex qu2: ALL overloads → noop");
    } catch(e) { logErr("yads.qu2: " + e.message); }

    // --- B10: Yandex delegate yads.mw2.a — defense in depth ---
    try {
        Java.use("yads.mw2").a.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function() {};
        logOk("+ Yandex mw2.a → noop");
    } catch(e) { logErr("yads.mw2: " + e.message); }

    // --- B11: OkHttpClient (zk.u) instance patching (double-pass) ---
    function patchZkU() {
        try {
            Java.choose("zk.u", {
                onMatch: function(inst) {
                    try {
                        inst.f46489q.value = PERMISSIVE_TM;      // X509TrustManager
                        inst.f46488p.value = makePermissiveSSF(); // SSLSocketFactory
                        inst.f46492t.value = PERMISSIVE_HV;       // HostnameVerifier
                    } catch(e) {
                        // Field may be final, null, or already set.
                        // hl.n.m()/hl.n.l() hooks cover new instances.
                    }
                },
                onComplete: function() {}
            });
        } catch(e) {}
    }
    patchZkU();
    setTimeout(patchZkU, 2000); // Second pass for late-created instances

    // --- B12: PairIP License Bypass ---
    try {
        var LC = Java.use("com.pairip.licensecheck.LicenseClient");
        LC.checkLicense.overload("android.content.Context").implementation = function(ctx) {};
        try {
            LC.performLocalInstallerCheck.implementation = function() { return true; };
        } catch(e) {}
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
    // STATUS REPORT
    // ============================================================
    log("========================================");
    log("TWINBY SSL BYPASS v3 — READY");
    log("========================================");
    log("Native: BoringSSL + pattern-scan for stripped libflutter.so");
    log("Java PRIMARY: TMF.getTrustManagers → permissive TM");
    log("Java DEFENSE: RTM + TMI + Yandex checkServerTrusted → noop");
    log("Java OkHttp: hl.n hooks + zk.u patching");
    log("SSLContext.init: UNTOUCHED (no recursion risk)");
    log("HttpsURLConnection: NOT hooked (TMF covers it)");
    log("PairIP: License check bypassed");
    log("========================================");
    log("RUN: frida -U -f com.twinby -l THIS_SCRIPT.js --no-pause");
    log("========================================");
});