"use strict";

// ============================================================
// Twinby SSL Pinning Bypass v4 — Complete Flutter+Java Bypass
// Target: com.twinby (Flutter app, Dart/BoringSSL + Java SDKs)
// Usage: frida -U com.twinby -l frida_bypass_ssl_pinning.js  (attach)
//    OR: frida -U -f com.twinby -l frida_bypass_ssl_pinning.js  (spawn)
// ============================================================

// ── Global state ──────────────────────────────────────────────
var nativeCounters = {};
var javaCounters = {};

function logNative(label) {
    nativeCounters[label] = (nativeCounters[label] || 0) + 1;
    console.log("[N-" + label + " #" + nativeCounters[label] + "]");
}

function logJava(label) {
    javaCounters[label] = (javaCounters[label] || 0) + 1;
    console.log("[J-" + label + " #" + javaCounters[label] + "]");
}

// ============================================================
// SECTION A: NATIVE SSL BYPASS (Dart/BoringSSL)
// Must run in IMMEDIATE scope — before Java.perform — because
// native SSL connections start before the JVM is fully ready.
// ============================================================
console.log("=== [NATIVE] Enumerating modules for BoringSSL exports ===");

var nativeFunctions = {}; // Save originals so we can call them with modified args

// BoringSSL export names to search for across ALL loaded modules
var SSL_EXPORTS = [
    "SSL_CTX_set_verify",
    "SSL_set_verify",
    "SSL_CTX_set_custom_verify",
    "SSL_set_custom_verify"
];

// x509_verify_callback is not a standard export name — it may appear
// as "x509_verify_callback" or similar in libflutter.so
var EXTRA_EXPORTS = [
    "x509_verify_callback",
    "SSL_CTX_set_cert_verify_callback"
];

var ALL_EXPORTS = SSL_EXPORTS.concat(EXTRA_EXPORTS);

Process.enumerateModules().forEach(function (mod) {
    // Skip tiny modules (< 100KB) that won't contain SSL implementations
    if (mod.size < 100 * 1024) return;

    ALL_EXPORTS.forEach(function (exportName) {
        try {
            var addr = Module.findExportByName(mod.name, exportName);
            if (addr === null || addr === undefined) return;

            console.log("[N-FOUND] " + exportName + " in " + mod.name + " @ " + addr);

            if (exportName === "SSL_CTX_set_verify" || exportName === "SSL_set_verify") {
                // Signature: void SSL_CTX_set_verify(SSL_CTX* ctx, int mode, ssl_verify_cb callback)
                // Strategy: Call original with mode=0 and callback=NULL to disable verification
                var orig = new NativeFunction(addr, "void", ["pointer", "int", "pointer"]);
                nativeFunctions[mod.name + "!" + exportName] = orig;

                Interceptor.replace(addr, new NativeCallback(function (ctx, mode, callback) {
                    logNative(exportName + "@" + mod.name);
                    // Call original with mode=0 (SSL_VERIFY_NONE) and no callback
                    orig(ctx, 0, ptr(0));
                }, "void", ["pointer", "int", "pointer"]));

                console.log("[N-HOOKED] " + exportName + " in " + mod.name + " → mode=0, cb=NULL");
            }

            if (exportName === "SSL_CTX_set_custom_verify" || exportName === "SSL_set_custom_verify") {
                // Flutter-specific BoringSSL API
                // Signature: void SSL_CTX_set_custom_verify(SSL_CTX* ctx, int mode,
                //   enum ssl_verify_result_t (*callback)(SSL* ssl, uint8_t* out_alert))
                // Strategy: Replace entirely — set mode to SSL_VERIFY_NONE (0)
                // so no custom verification callback is invoked at all
                var origCV = new NativeFunction(addr, "void", ["pointer", "int", "pointer"]);
                nativeFunctions[mod.name + "!" + exportName] = origCV;

                Interceptor.replace(addr, new NativeCallback(function (ctx, mode, callback) {
                    logNative(exportName + "@" + mod.name);
                    // mode=0 means SSL_VERIFY_NONE — no verification requested
                    origCV(ctx, 0, ptr(0));
                }, "void", ["pointer", "int", "pointer"]));

                console.log("[N-HOOKED] " + exportName + " in " + mod.name + " → mode=0, cb=NULL");
            }

            if (exportName === "x509_verify_callback") {
                // This is a verification callback that returns int (1=success, 0=failure)
                // Strategy: Always return 1 (verification success)
                Interceptor.replace(addr, new NativeCallback(function (ssl, out_alert) {
                    logNative("x509_verify_cb@" + mod.name);
                    return 1; // Verification OK
                }, "int", ["pointer", "pointer"]));

                console.log("[N-HOOKED] x509_verify_callback in " + mod.name + " → always return 1");
            }

            if (exportName === "SSL_CTX_set_cert_verify_callback") {
                // Signature: void SSL_CTX_set_cert_verify_callback(SSL_CTX* ctx,
                //   int (*cb)(X509_STORE_CTX* store_ctx, void* arg), void* arg)
                // Strategy: Install a callback that always returns 1 (success)
                var alwaysOkCB = new NativeCallback(function (store_ctx, arg) {
                    logNative("cert_verify_cb@" + mod.name);
                    return 1;
                }, "int", ["pointer", "pointer"]);

                var origCertVerify = new NativeFunction(addr, "void", ["pointer", "pointer", "pointer"]);
                nativeFunctions[mod.name + "!" + exportName] = origCertVerify;

                Interceptor.replace(addr, new NativeCallback(function (ctx, cb, arg) {
                    logNative(exportName + "@" + mod.name);
                    // Install our always-ok callback
                    origCertVerify(ctx, alwaysOkCB, ptr(0));
                }, "void", ["pointer", "pointer", "pointer"]));

                console.log("[N-HOOKED] SSL_CTX_set_cert_verify_callback in " + mod.name);
            }

        } catch (e) {
            console.log("[N-ERR] " + exportName + "@" + mod.name + ": " + e.message);
        }
    });
});

// ── Additional: Hook ssl_verify_callback_type if found ────────
// Some Flutter builds embed a standalone verify function
try {
    Process.enumerateModules().forEach(function (mod) {
        if (mod.size < 100 * 1024) return;
        // Search for any export containing "verify" in likely SSL modules
        // libflutter.so, libssl.so, libboringssl.so
        var sslModuleNames = ["libflutter.so", "libssl.so", "libboringssl.so"];
        if (sslModuleNames.indexOf(mod.name) === -1) return;

        try {
            mod.enumerateExports().forEach(function (exp) {
                if (exp.name.indexOf("verify") !== -1 &&
                    exp.name !== "SSL_CTX_set_verify" &&
                    exp.name !== "SSL_set_verify" &&
                    exp.name !== "SSL_CTX_set_custom_verify" &&
                    exp.name !== "SSL_set_custom_verify" &&
                    exp.name !== "x509_verify_callback" &&
                    exp.name !== "SSL_CTX_set_cert_verify_callback") {
                    console.log("[N-EXTRA] Additional verify export found: " + exp.name + " in " + mod.name);
                }
            });
        } catch (e) {
            console.log("[N-ERR] Export enumeration in " + mod.name + ": " + e.message);
        }
    });
} catch (e) {
    console.log("[N-ERR] Module enumeration: " + e.message);
}

console.log("=== [NATIVE] SSL hooks complete (immediate scope) ===");

// ── Delayed native hook polling for libflutter.so ────────────
// On spawn mode (-f), libflutter.so loads AFTER the script starts.
// The immediate-scope enumeration won't find it. We poll until it appears.
var alreadyHookedModules = {}; // Track which modules we've already hooked
Process.enumerateModules().forEach(function (mod) {
    if (mod.size >= 100 * 1024) alreadyHookedModules[mod.name] = true;
});

function hookNativeExportsInModule(modName) {
    var mod = Process.findModuleByName(modName);
    if (!mod) return false;
    if (alreadyHookedModules[modName]) return true; // Already hooked

    console.log("[N-DELAYED] " + modName + " now loaded, hooking SSL exports...");

    ALL_EXPORTS.forEach(function (exportName) {
        try {
            var addr = Module.findExportByName(modName, exportName);
            if (addr === null || addr === undefined) return;

            console.log("[N-DELAYED-FOUND] " + exportName + " in " + modName + " @ " + addr);

            if (exportName === "SSL_CTX_set_verify" || exportName === "SSL_set_verify") {
                var orig = new NativeFunction(addr, "void", ["pointer", "int", "pointer"]);
                nativeFunctions[modName + "!" + exportName] = orig;
                Interceptor.replace(addr, new NativeCallback(function (ctx, mode, callback) {
                    logNative(exportName + "@" + modName);
                    orig(ctx, 0, ptr(0));
                }, "void", ["pointer", "int", "pointer"]));
                console.log("[N-DELAYED-HOOKED] " + exportName + " in " + modName + " → mode=0, cb=NULL");
            }

            if (exportName === "SSL_CTX_set_custom_verify" || exportName === "SSL_set_custom_verify") {
                var origCV = new NativeFunction(addr, "void", ["pointer", "int", "pointer"]);
                nativeFunctions[modName + "!" + exportName] = origCV;
                Interceptor.replace(addr, new NativeCallback(function (ctx, mode, callback) {
                    logNative(exportName + "@" + modName);
                    origCV(ctx, 0, ptr(0));
                }, "void", ["pointer", "int", "pointer"]));
                console.log("[N-DELAYED-HOOKED] " + exportName + " in " + modName + " → mode=0, cb=NULL");
            }

            if (exportName === "x509_verify_callback") {
                Interceptor.replace(addr, new NativeCallback(function (ssl, out_alert) {
                    logNative("x509_verify_cb@" + modName);
                    return 1;
                }, "int", ["pointer", "pointer"]));
                console.log("[N-DELAYED-HOOKED] x509_verify_callback in " + modName + " → always return 1");
            }

            if (exportName === "SSL_CTX_set_cert_verify_callback") {
                var alwaysOkCB = new NativeCallback(function (store_ctx, arg) {
                    logNative("cert_verify_cb@" + modName);
                    return 1;
                }, "int", ["pointer", "pointer"]);
                var origCertVerify = new NativeFunction(addr, "void", ["pointer", "pointer", "pointer"]);
                nativeFunctions[modName + "!" + exportName] = origCertVerify;
                Interceptor.replace(addr, new NativeCallback(function (ctx, cb, arg) {
                    logNative(exportName + "@" + modName);
                    origCertVerify(ctx, alwaysOkCB, ptr(0));
                }, "void", ["pointer", "pointer", "pointer"]));
                console.log("[N-DELAYED-HOOKED] SSL_CTX_set_cert_verify_callback in " + modName);
            }

        } catch (e) {
            console.log("[N-DELAYED-ERR] " + exportName + "@" + modName + ": " + e.message);
        }
    });

    alreadyHookedModules[modName] = true;
    return true;
}

// Poll for libflutter.so and any other late-loading SSL modules
var delayedModules = ["libflutter.so", "libboringssl.so", "libssl.so"];
var pollAttempts = 0;
var MAX_POLL_ATTEMPTS = 60; // 30 seconds max (500ms × 60)

var nativePollInterval = setInterval(function () {
    pollAttempts++;
    if (pollAttempts > MAX_POLL_ATTEMPTS) {
        clearInterval(nativePollInterval);
        console.log("[N-POLL] Stopped polling after 30s — modules not found: " + delayedModules.filter(function (m) { return !alreadyHookedModules[m]; }).join(", "));
        return;
    }

    var allFound = true;
    delayedModules.forEach(function (modName) {
        if (!alreadyHookedModules[modName]) {
            if (hookNativeExportsInModule(modName)) {
                console.log("[N-POLL] " + modName + " hooks installed successfully");
            } else {
                allFound = false;
            }
        }
    });

    if (allFound) {
        clearInterval(nativePollInterval);
        console.log("[N-POLL] All delayed modules hooked — polling stopped");
    }
}, 500);


// ============================================================
// SECTION B-F: JAVA-LEVEL BYPASS (inside Java.perform)
// ============================================================
Java.perform(function () {
    console.log("=== [JAVA] Twinby SSL Pinning Bypass v4 ===");

    // ── Register permissive TrustManager ──────────────────────
    var TrustAllManager = Java.registerClass({
        name: "com.bypass.TrustAllManager4",
        implements: [Java.use("javax.net.ssl.X509TrustManager")],
        methods: {
            checkClientTrusted: function (chain, authType) {
                logJava("TrustAll.checkClientT");
            },
            checkServerTrusted: function (chain, authType) {
                logJava("TrustAll.checkServerT");
            },
            getAcceptedIssuers: function () {
                return Java.array("java.security.cert.X509Certificate", []);
            }
        }
    });

    // ── Register permissive HostnameVerifier ──────────────────
    var TrustAllHV = Java.registerClass({
        name: "com.bypass.TrustAllHV4",
        implements: [Java.use("javax.net.ssl.HostnameVerifier")],
        methods: {
            verify: function (hostname, session) {
                logJava("TrustAllHV.verify(" + hostname + ")");
                return true;
            }
        }
    });

    var trustAllInstance = TrustAllManager.$new();
    var trustAllHVInstance = TrustAllHV.$new();

    // Helper: create permissive SSLSocketFactory
    function makePermissiveSSF() {
        var ctx = Java.use("javax.net.ssl.SSLContext").getInstance("TLS");
        ctx.init(null, Java.array("javax.net.ssl.TrustManager", [trustAllInstance]), null);
        return ctx.getSocketFactory();
    }

    // ============================================================
    // SECTION B: PAIRIP LICENSE CHECK BYPASS (CRITICAL — FIRST!)
    // If this fails, app calls System.exit(0) in attachBaseContext()
    // ============================================================
    console.log("=== [B] PairIP License Check Bypass ===");

    // B1: Hook LicenseClient.checkLicense(Context) → do nothing
    try {
        var LicenseClient = Java.use("com.pairip.licensecheck.LicenseClient");
        LicenseClient.checkLicense.overload("android.content.Context").implementation = function (ctx) {
            logJava("PairIP.checkLicense(SKIP)");
            // Don't call original — just return void (method returns void)
        };
        console.log("[✓] PairIP.checkLicense → noop");
    } catch (e) {
        console.log("[!] PairIP.checkLicense: " + e.message);
    }

    // B2: Hook performLocalInstallerCheck → return true
    try {
        var LicenseClient2 = Java.use("com.pairip.licensecheck.LicenseClient");
        // This method checks if installer == "com.android.vending"
        // Return true so it thinks it was installed from Play Store
        LicenseClient2.performLocalInstallerCheck.implementation = function () {
            logJava("PairIP.performLocalInstallerCheck(TRUE)");
            return true;
        };
        console.log("[✓] PairIP.performLocalInstallerCheck → true");
    } catch (e) {
        console.log("[!] PairIP.performLocalInstallerCheck: " + e.message);
    }

    // B3: Hook processResponse → set licenseCheckState = FULL_CHECK_OK
    try {
        var LicenseClient3 = Java.use("com.pairip.licensecheck.LicenseClient");
        LicenseClient3.processResponse.overload("int", "android.os.Bundle").implementation = function (responseCode, responsePayload) {
            logJava("PairIP.processResponse(FULL_CHECK_OK, code=" + responseCode + ")");
            // Force state to FULL_CHECK_OK regardless of response code
            // Response codes: 0=LICENSED, 2=NOT_LICENSED, 3=ERROR
            // FULL_CHECK_OK means license verified successfully
            try {
                // Try to set the field directly if accessible
                var stateField = LicenseClient3.class.getDeclaredField("licenseCheckState");
                stateField.setAccessible(true);
                // FULL_CHECK_OK is typically enum value or int — try both
                try {
                    stateField.set(this, Java.use("com.pairip.licensecheck.LicenseClient$LicenseCheckState").FULL_CHECK_OK.value);
                } catch (e2) {
                    // If enum access fails, try integer value (common implementation)
                    stateField.setInt(this, 0); // 0 = LICENSED/FULL_CHECK_OK
                }
            } catch (e3) {
                console.log("[!] PairIP.processResponse field access: " + e3.message);
            }
        };
        console.log("[✓] PairIP.processResponse → FULL_CHECK_OK");
    } catch (e) {
        console.log("[!] PairIP.processResponse: " + e.message);
    }

    // B4: Prevent System.exit(0) — the app calls this if license fails
    try {
        var SystemClass = Java.use("java.lang.System");
        SystemClass.exit.implementation = function (code) {
            logJava("System.exit(BLOCKED, code=" + code + ")");
            // DON'T call original — prevent the app from exiting
            console.log("[⚠] System.exit(" + code + ") blocked — app would have crashed");
        };
        console.log("[✓] System.exit → blocked");
    } catch (e) {
        console.log("[!] System.exit: " + e.message);
    }

    // B5: Prevent Runtime.exit as well (Android 12+ may use this)
    try {
        var RuntimeClass = Java.use("java.lang.Runtime");
        RuntimeClass.exit.implementation = function (code) {
            logJava("Runtime.exit(BLOCKED, code=" + code + ")");
            console.log("[⚠] Runtime.exit(" + code + ") blocked");
        };
        console.log("[✓] Runtime.exit → blocked");
    } catch (e) {
        console.log("[!] Runtime.exit: " + e.message);
    }

    // B6: Hook exitAction callback (PairIP may use a callback for exit)
    try {
        // PairIP Application class has an exitAction that calls System.exit
        // Try to find and hook it
        var PairipApp = Java.use("com.pairip.application.Application");
        PairipApp.attachBaseContext.implementation = function (base) {
            logJava("PairipApp.attachBaseContext(SAFE)");
            // Call original attachBaseContext but our System.exit hook
            // will prevent the kill
            this.attachBaseContext(base);
        };
        console.log("[✓] Pairip Application.attachBaseContext → safe (exit blocked)");
    } catch (e) {
        console.log("[!] PairipApp.attachBaseContext: " + e.message);
    }

    console.log("=== [B] PairIP bypass complete ===");


    // ============================================================
    // SECTION C: JAVA-LEVEL SSL BYPASS
    // ============================================================
    console.log("=== [C] Java SSL Bypass ===");

    // ── C1: OkHttp Platform (hl.n) ────────────────────────────
    // hl.n.m() returns default X509TrustManager → replace with permissive
    try {
        var OkHttpPlatform = Java.use("hl.n");
        OkHttpPlatform.m.implementation = function () {
            logJava("hl.n.m");
            return trustAllInstance;
        };
        console.log("[✓] hl.n.m() → TrustAllManager");
    } catch (e) {
        console.log("[!] hl.n.m: " + e.message);
    }

    // hl.n.l(X509TrustManager) returns SSLSocketFactory → replace
    try {
        var OkHttpPlatform2 = Java.use("hl.n");
        OkHttpPlatform2.l.implementation = function (tm) {
            logJava("hl.n.l");
            var ctx = Java.use("javax.net.ssl.SSLContext").getInstance("TLS");
            ctx.init(null, Java.array("javax.net.ssl.TrustManager", [trustAllInstance]), null);
            return ctx.getSocketFactory();
        };
        console.log("[✓] hl.n.l() → permissive SSLSocketFactory");
    } catch (e) {
        console.log("[!] hl.n.l: " + e.message);
    }

    // ── C2: OkHttp HostnameVerifier (ll.c) ────────────────────
    try {
        var OkHttpHV = Java.use("ll.c");
        OkHttpHV.verify.overload("java.lang.String", "javax.net.ssl.SSLSession").implementation = function (hostname, session) {
            logJava("ll.c.verify(" + hostname + ")");
            return true;
        };
        console.log("[✓] ll.c.verify → always true");
    } catch (e) {
        console.log("[!] ll.c: " + e.message);
    }

    // ── C3: Yandex Ads SDK TrustManager (yads.qu2) ────────────
    // This is the ACTUAL pinning class — extends X509ExtendedTrustManager
    try {
        var YadsTM = Java.use("yads.qu2");

        // checkServerTrusted — 3 overloads
        YadsTM.checkServerTrusted.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function (certs, authType) {
            logJava("yads.qu2.checkServerT(certs+str)");
        };
        try {
            YadsTM.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("yads.qu2.checkServerT(certs+str+sock)");
            };
        } catch (e) {
            console.log("[!] yads.qu2.checkServerT(sock overload): " + e.message);
        }
        try {
            YadsTM.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("yads.qu2.checkServerT(certs+str+eng)");
            };
        } catch (e) {
            console.log("[!] yads.qu2.checkServerT(eng overload): " + e.message);
        }

        // checkClientTrusted — at least 1 overload
        YadsTM.checkClientTrusted.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function (certs, authType) {
            logJava("yads.qu2.checkClientT");
        };
        try {
            YadsTM.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("yads.qu2.checkClientT(sock)");
            };
        } catch (e) { console.log("[!] yads.qu2.checkClientT(sock): " + e.message); }
        try {
            YadsTM.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("yads.qu2.checkClientT(eng)");
            };
        } catch (e) { console.log("[!] yads.qu2.checkClientT(eng): " + e.message); }

        // getAcceptedIssuers
        YadsTM.getAcceptedIssuers.implementation = function () {
            logJava("yads.qu2.getAcceptedIssuers");
            return Java.array("java.security.cert.X509Certificate", []);
        };

        console.log("[✓] yads.qu2 (Yandex Ads TrustManager) — ALL overloads");
    } catch (e) {
        console.log("[!] yads.qu2: " + e.message);
    }

    // ── C4: Yandex Ads SDK inner delegate (yads.mw2) ──────────
    try {
        var YadsDelegate = Java.use("yads.mw2");
        YadsDelegate.a.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function (certs, str) {
            logJava("yads.mw2.a(certs,str)");
        };
        console.log("[✓] yads.mw2.a → noop");
    } catch (e) {
        console.log("[!] yads.mw2: " + e.message);
    }

    // ── C5: OkHttpClient (zk.u) — replace live instances ──────
    try {
        Java.choose("zk.u", {
            onMatch: function (instance) {
                try {
                    logJava("zk.u(found)");

                    // Replace TrustManager field (f46489q)
                    try {
                        var tmField = instance.f46489q.value;
                        if (tmField !== null && tmField !== undefined) {
                            instance.f46489q.value = trustAllInstance;
                            logJava("zk.u.f46489q→TrustAll");
                        } else {
                            // Even null — set it to our permissive one
                            instance.f46489q.value = trustAllInstance;
                            logJava("zk.u.f46489q→TrustAll(was-null)");
                        }
                    } catch (e) {
                        console.log("[!] zk.u.f46489q: " + e.message);
                    }

                    // Replace SSLSocketFactory field (f46488p)
                    try {
                        instance.f46488p.value = makePermissiveSSF();
                        logJava("zk.u.f46488p→PermissiveSSF");
                    } catch (e) {
                        console.log("[!] zk.u.f46488p: " + e.message);
                    }

                    // Replace HostnameVerifier field (f46492t)
                    try {
                        var hvField = instance.f46492t.value;
                        if (hvField !== null && hvField !== undefined) {
                            instance.f46492t.value = trustAllHVInstance;
                        } else {
                            instance.f46492t.value = trustAllHVInstance;
                        }
                        logJava("zk.u.f46492t→TrustAllHV");
                    } catch (e) {
                        console.log("[!] zk.u.f46492t: " + e.message);
                    }

                } catch (e2) {
                    console.log("[!] zk.u instance patch: " + e2.message);
                }
            },
            onComplete: function () {
                logJava("zk.u.scan-done");
            }
        });
        console.log("[✓] zk.u (OkHttpClient) — live instance scan");
    } catch (e) {
        console.log("[!] zk.u choose: " + e.message);
    }

    // ── C6: OkHttp CertificatePinner (zk.d) ───────────────────
    // Even though pins are currently empty, hook for safety
    try {
        var CertPinner = Java.use("zk.d");
        CertPinner.a.overload("java.lang.String", "kotlin.jvm.functions.Function0").implementation = function (hostname, peerCertsFn) {
            logJava("zk.d.a(" + hostname + ") → noop");
            // Don't call original — just skip pin check entirely
        };
        console.log("[✓] zk.d (CertificatePinner) → noop");
    } catch (e) {
        console.log("[!] zk.d: " + e.message);
    }

    // ── C7: RootTrustManager (NSC wrapper) ────────────────────
    // This is the REAL SSL gate for Android NetworkSecurityConfig
    try {
        var RTM = Java.use("android.security.net.config.RootTrustManager");

        // checkServerTrusted — ALL overloads
        RTM.checkServerTrusted.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function (certs, authType) {
            logJava("RTM.checkServerT(certs+str)");
        };
        try {
            RTM.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("RTM.checkServerT(sock)");
            };
        } catch (e) { console.log("[!] RTM.checkServerT(sock): " + e.message); }
        try {
            RTM.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("RTM.checkServerT(eng)");
            };
        } catch (e) { console.log("[!] RTM.checkServerT(eng): " + e.message); }
        try {
            RTM.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.lang.String"
            ).implementation = function (certs, authType, host) {
                logJava("RTM.checkServerT(host)");
                return Java.use("java.util.ArrayList").$new();
            };
        } catch (e) { console.log("[!] RTM.checkServerT(host): " + e.message); }

        // checkClientTrusted — ALL overloads
        try {
            RTM.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String"
            ).implementation = function (certs, authType) {
                logJava("RTM.checkClientT(certs+str)");
            };
        } catch (e) { console.log("[!] RTM.checkClientT(certs+str): " + e.message); }
        try {
            RTM.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("RTM.checkClientT(sock)");
            };
        } catch (e) { console.log("[!] RTM.checkClientT(sock): " + e.message); }
        try {
            RTM.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("RTM.checkClientT(eng)");
            };
        } catch (e) { console.log("[!] RTM.checkClientT(eng): " + e.message); }

        // getAcceptedIssuers
        RTM.getAcceptedIssuers.implementation = function () {
            logJava("RTM.getAcceptedIssuers");
            return Java.array("java.security.cert.X509Certificate", []);
        };

        console.log("[✓] RootTrustManager (NSC wrapper) — ALL overloads");
    } catch (e) {
        console.log("[!] RootTrustManager: " + e.message);
    }

    // ── C8: Conscrypt TrustManagerImpl ────────────────────────
    // System-level trust manager — ALL checkServerTrusted overloads
    try {
        var TMI = Java.use("com.android.org.conscrypt.TrustManagerImpl");

        TMI.checkServerTrusted.overload(
            "[Ljava.security.cert.X509Certificate;", "java.lang.String"
        ).implementation = function (certs, authType) {
            logJava("TMI.checkServerT(certs+str)");
        };
        try {
            TMI.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("TMI.checkServerT(sock)");
            };
        } catch (e) { console.log("[!] TMI.checkServerT(sock): " + e.message); }
        try {
            TMI.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("TMI.checkServerT(eng)");
            };
        } catch (e) { console.log("[!] TMI.checkServerT(eng): " + e.message); }
        try {
            TMI.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.lang.String"
            ).implementation = function (certs, authType, host) {
                logJava("TMI.checkServerT(host)");
                return null;
            };
        } catch (e) { console.log("[!] TMI.checkServerT(host): " + e.message); }
        try {
            TMI.checkServerTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLSession"
            ).implementation = function (certs, authType, session) {
                logJava("TMI.checkServerT(sess)");
                return null;
            };
        } catch (e) { console.log("[!] TMI.checkServerT(sess): " + e.message); }

        // checkClientTrusted — ALL overloads
        try {
            TMI.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String"
            ).implementation = function (certs, authType) {
                logJava("TMI.checkClientT(certs+str)");
            };
        } catch (e) { console.log("[!] TMI.checkClientT(certs+str): " + e.message); }
        try {
            TMI.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "java.net.Socket"
            ).implementation = function (certs, authType, socket) {
                logJava("TMI.checkClientT(sock)");
            };
        } catch (e) { console.log("[!] TMI.checkClientT(sock): " + e.message); }
        try {
            TMI.checkClientTrusted.overload(
                "[Ljava.security.cert.X509Certificate;", "java.lang.String", "javax.net.ssl.SSLEngine"
            ).implementation = function (certs, authType, engine) {
                logJava("TMI.checkClientT(eng)");
            };
        } catch (e) { console.log("[!] TMI.checkClientT(eng): " + e.message); }

        // checkTrustedRecursive — deep internal (8 args)
        try {
            TMI.checkTrustedRecursive.overload(
                "[Ljava.security.cert.X509Certificate;", "[B", "[B",
                "java.lang.String", "boolean",
                "java.util.ArrayList", "java.util.ArrayList", "java.util.Set"
            ).implementation = function (certs, ocspData, tlsSctData, host, isSha256Based, chain, anchors, used) {
                logJava("TMI.checkTrustedRecursive");
                var list = Java.use("java.util.ArrayList").$new();
                if (certs) {
                    for (var i = 0; i < certs.length; i++) {
                        list.add(certs[i]);
                    }
                }
                return list;
            };
        } catch (e) {
            console.log("[!] TMI.checkTrustedRecursive: " + e.message);
        }

        // verifyChain — deep internal
        try {
            TMI.verifyChain.overload(
                "java.util.List", "java.util.List", "java.lang.String",
                "boolean", "[B", "[B"
            ).implementation = function (chain, anchors, host, isSha256Based, ocspData, tlsSctData) {
                logJava("TMI.verifyChain");
                return (chain && chain.size() > 0) ? chain : Java.use("java.util.ArrayList").$new();
            };
        } catch (e) {
            console.log("[!] TMI.verifyChain: " + e.message);
        }

        // getAcceptedIssuers
        TMI.getAcceptedIssuers.implementation = function () {
            logJava("TMI.getAcceptedIssuers");
            return Java.array("java.security.cert.X509Certificate", []);
        };

        console.log("[✓] Conscrypt TrustManagerImpl — ALL overloads + checkTrustedRecursive + verifyChain");
    } catch (e) {
        console.log("[!] TrustManagerImpl: " + e.message);
    }

    // ── C9: TrustManagerFactory.getTrustManagers ──────────────
    try {
        var TMF = Java.use("javax.net.ssl.TrustManagerFactory");
        TMF.getTrustManagers.implementation = function () {
            logJava("TMF.getTrustManagers");
            return Java.array("javax.net.ssl.TrustManager", [trustAllInstance]);
        };
        console.log("[✓] TrustManagerFactory.getTrustManagers → permissive");
    } catch (e) {
        console.log("[!] TMF.getTrustManagers: " + e.message);
    }

    // ── C10: SSLContext.init ──────────────────────────────────
    try {
        var SSLCtx = Java.use("javax.net.ssl.SSLContext");
        SSLCtx.init.overload(
            "[Ljavax.net.ssl.KeyManager;",
            "[Ljavax.net.ssl.TrustManager;",
            "java.security.SecureRandom"
        ).implementation = function (km, tm, sr) {
            logJava("SSLContext.init");
            this.init(km, Java.array("javax.net.ssl.TrustManager", [trustAllInstance]), sr);
        };
        console.log("[✓] SSLContext.init → permissive TrustManager");
    } catch (e) {
        console.log("[!] SSLContext.init: " + e.message);
    }

    // ── C11: CertPathValidator.validate ───────────────────────
    try {
        var CPV = Java.use("java.security.cert.CertPathValidator");
        CPV.validate.implementation = function (certPath, params) {
            logJava("CertPathValidator.validate");
            // Return a valid result — use PKIXParameters to create a basic valid result
            // The result interface is CertPathValidatorResult which has getCertPath() and clone()
            var resultImpl = Java.registerClass({
                name: "com.bypass.ValidCertResult4",
                implements: [Java.use("java.security.cert.CertPathValidator$CertPathValidatorResult")],
                methods: {
                    getCertPath: function () {
                        return certPath;
                    },
                    clone: function () {
                        return this;
                    }
                }
            });
            return resultImpl.$new();
        };
        console.log("[✓] CertPathValidator.validate → valid result");
    } catch (e) {
        console.log("[!] CertPathValidator: " + e.message);
    }

    // ── C12: HttpsURLConnection.setDefaultSSLSocketFactory ────
    try {
        var HUC = Java.use("javax.net.ssl.HttpsURLConnection");
        HUC.setDefaultSSLSocketFactory.implementation = function (factory) {
            logJava("HUC.setDefaultSSF");
            this.setDefaultSSLSocketFactory(makePermissiveSSF());
        };
        console.log("[✓] HttpsURLConnection.setDefaultSSLSocketFactory → permissive");
    } catch (e) {
        console.log("[!] HUC.setDefaultSSF: " + e.message);
    }

    // ── C13: HttpsURLConnection.setSSLSocketFactory ───────────
    try {
        var HUC2 = Java.use("javax.net.ssl.HttpsURLConnection");
        HUC2.setSSLSocketFactory.implementation = function (factory) {
            logJava("HUC.setSSF");
            this.setSSLSocketFactory(makePermissiveSSF());
        };
        console.log("[✓] HttpsURLConnection.setSSLSocketFactory → permissive");
    } catch (e) {
        console.log("[!] HUC.setSSF: " + e.message);
    }

    // ── C14: HttpsURLConnection.setDefaultHostnameVerifier ────
    try {
        var HUC3 = Java.use("javax.net.ssl.HttpsURLConnection");
        HUC3.setDefaultHostnameVerifier.implementation = function (hv) {
            logJava("HUC.setDefaultHV");
            this.setDefaultHostnameVerifier(trustAllHVInstance);
        };
        console.log("[✓] HttpsURLConnection.setDefaultHostnameVerifier → permissive");
    } catch (e) {
        console.log("[!] HUC.setDefaultHV: " + e.message);
    }

    // ── C15: HttpsURLConnection.setHostnameVerifier ───────────
    try {
        var HUC4 = Java.use("javax.net.ssl.HttpsURLConnection");
        HUC4.setHostnameVerifier.implementation = function (hv) {
            logJava("HUC.setHV");
            this.setHostnameVerifier(trustAllHVInstance);
        };
        console.log("[✓] HttpsURLConnection.setHostnameVerifier → permissive");
    } catch (e) {
        console.log("[!] HUC.setHV: " + e.message);
    }

    console.log("=== [C] Java SSL Bypass complete ===");


    // ============================================================
    // SECTION D: NSC OVERRIDE (Network Security Config bypass)
    // ============================================================
    console.log("=== [D] Network Security Config Override ===");

    // D1: Hook NetworkSecurityConfig to trust user certificates
    try {
        var NSC = Java.use("android.security.net.config.NetworkSecurityConfig");
        // The getConfigForHostname method returns a Config that determines
        // which certificates are trusted. We want to make it trust user certs.
        try {
            NSC.getConfigForHostname.implementation = function (hostname) {
                logJava("NSC.getConfigForHostname(" + hostname + ")");
                // Call original and then try to modify the result
                var config = this.getConfigForHostname(hostname);
                return config;
            };
        } catch (e) {
            console.log("[!] NSC.getConfigForHostname: " + e.message);
        }
        console.log("[✓] NetworkSecurityConfig (hooked, TrustManagerFactory approach covers this)");
    } catch (e) {
        console.log("[!] NSC: " + e.message);
    }

    // D2: Direct TrustManager approach — already covered by our
    // TrustManagerFactory.getTrustManagers and SSLContext.init hooks
    // which force permissive TrustManager everywhere
    console.log("[✓] NSC bypass: TrustManagerFactory + SSLContext.init already covers NSC");


    // ============================================================
    // SECTION E: ERROR MONITORING AND SAFETY
    // ============================================================
    console.log("=== [E] Error Monitoring ===");

    var exceptionMap = {
        "javax.net.ssl.SSLHandshakeException": "HANDSHAKE",
        "javax.net.ssl.SSLException": "SSL-EXC",
        "java.security.cert.CertificateException": "CERT-EXC",
        "java.security.cert.CertPathValidatorException": "CPV-EXC"
    };

    Object.keys(exceptionMap).forEach(function (className) {
        try {
            var cls = Java.use(className);
            cls.$init.overloads.forEach(function (overload) {
                overload.implementation = function () {
                    var msg = "";
                    if (arguments.length > 0) {
                        try {
                            msg = String(arguments[0]);
                        } catch (e) {
                            msg = "(unprintable)";
                        }
                    }
                    logJava("ERR-" + exceptionMap[className] + ": " + msg.substring(0, 150));
                    return this.$init.apply(this, arguments);
                };
            });
            console.log("[✓] " + className + " → monitored");
        } catch (e) {
            console.log("[!] Exception monitor " + className + ": " + e.message);
        }
    });

    // ── E2: Monitor SecurityException (may indicate pin enforcement) ──
    try {
        var SecExc = Java.use("java.lang.SecurityException");
        SecExc.$init.overloads.forEach(function (overload) {
            overload.implementation = function () {
                var msg = "";
                if (arguments.length > 0) {
                    try { msg = String(arguments[0]); } catch (e) { msg = "(unprintable)"; }
                }
                // Only log if SSL-related
                if (msg.indexOf("ssl") !== -1 || msg.indexOf("SSL") !== -1 ||
                    msg.indexOf("cert") !== -1 || msg.indexOf("trust") !== -1 ||
                    msg.indexOf("pin") !== -1) {
                    logJava("ERR-SEC: " + msg.substring(0, 150));
                }
                return this.$init.apply(this, arguments);
            };
        });
        console.log("[✓] SecurityException → monitored (SSL-related only)");
    } catch (e) {
        console.log("[!] SecurityException monitor: " + e.message);
    }


    // ============================================================
    // SECTION F: SUMMARY
    // ============================================================
    console.log("=== Twinby SSL Pinning Bypass v4 READY ===");
    console.log("    Native hooks: SSL_CTX_set_verify, SSL_set_verify,");
    console.log("    SSL_CTX_set_custom_verify, SSL_set_custom_verify,");
    console.log("    x509_verify_callback, SSL_CTX_set_cert_verify_callback");
    console.log("    (all modules enumerated dynamically)");
    console.log("    PairIP: checkLicense noop, installerCheck=true,");
    console.log("    processResponse→FULL_CHECK_OK, System.exit blocked");
    console.log("    Java: OkHttp, Yandex Ads, RootTrustManager,");
    console.log("    Conscrypt TrustManagerImpl, SSLContext, TMF,");
    console.log("    HttpsURLConnection, CertPathValidator, CertificatePinner");
    console.log("    NSC: TrustManagerFactory approach covers NSC bypass");
    console.log("    Errors: SSL/Cert/Security exceptions monitored");
    console.log("=== Run: frida -U -f com.twinby -l frida_bypass_ssl_pinning.js ===");
});
