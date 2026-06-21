package com.google.android.gms.ads;

import android.os.RemoteException;
import pa.c0;
import q9.h1;
import q9.k2;
import u9.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        k2 k2VarD = k2.d();
        synchronized (k2VarD.f31929h) {
            c0.k("MobileAds.initialize() must be called prior to setting the plugin.", k2VarD.i != null);
            h1 h1Var = k2VarD.i;
            if (h1Var == null) {
                return;
            }
            try {
                h1Var.a0(str);
            } catch (RemoteException e3) {
                i.f("Unable to set plugin.", e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void stop() {
        /*
            q9.k2 r0 = q9.k2.d()
            java.lang.Object r1 = r0.f31925d
            monitor-enter(r1)
            r2 = 0
            r0.f31928g = r2     // Catch: java.lang.Throwable -> L47
            r0.f31927f = r2     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r2 = r0.f31926e     // Catch: java.lang.Throwable -> L47
            r2.clear()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r0.f31929h
            monitor-enter(r2)
            q9.h1 r1 = r0.i     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            if (r1 == 0) goto L25
            r1.b0()     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            goto L25
        L1d:
            r0 = move-exception
            goto L45
        L1f:
            r1 = move-exception
            java.lang.String r3 = "Unable to stop the SDK."
            u9.i.f(r3, r1)     // Catch: java.lang.Throwable -> L1d
        L25:
            r1 = 0
            r0.i = r1     // Catch: java.lang.Throwable -> L1d
            q9.h2 r3 = r0.f31922a     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L31
            r3.f()     // Catch: java.lang.Throwable -> L1d
            r0.f31922a = r1     // Catch: java.lang.Throwable -> L1d
        L31:
            q9.h2 r3 = r0.f31923b     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L3a
            r3.f()     // Catch: java.lang.Throwable -> L1d
            r0.f31923b = r1     // Catch: java.lang.Throwable -> L1d
        L3a:
            q9.h2 r3 = r0.f31924c     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L43
            r3.f()     // Catch: java.lang.Throwable -> L1d
            r0.f31924c = r1     // Catch: java.lang.Throwable -> L1d
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L47:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MobileAds.stop():void");
    }
}
