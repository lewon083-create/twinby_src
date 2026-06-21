package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ot0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht0 f8770c;

    public /* synthetic */ ot0(ht0 ht0Var, int i) {
        this.f8769b = i;
        this.f8770c = ht0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f8769b
            switch(r0) {
                case 0: goto L71;
                case 1: goto L3a;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.ht0 r0 = r11.f8770c
            r0.t()
            return
        Lb:
            com.google.android.gms.internal.ads.ht0 r0 = r11.f8770c
            r0.d()
            return
        L11:
            com.google.android.gms.internal.ads.ht0 r0 = r11.f8770c
            r0.d()
            return
        L17:
            com.google.android.gms.internal.ads.ht0 r0 = r11.f8770c
            com.google.android.gms.internal.ads.kx0 r1 = r0.f6257r
            if (r1 == 0) goto L39
            ua.a r2 = r0.f6258s
            com.google.android.gms.internal.ads.mt0 r9 = r0.f6259t
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            q9.x2 r2 = r0.f6245e
            int r6 = r2.f31984e
            java.lang.String r10 = r0.f()
            java.lang.String r2 = "pae"
            java.lang.String r3 = "paeo_ts"
            r7 = 0
            r8 = 0
            r1.P(r2, r3, r4, r6, r7, r8, r9, r10)
        L39:
            return
        L3a:
            com.google.android.gms.internal.ads.ht0 r1 = r11.f8770c
            monitor-enter(r1)
            q9.p0 r0 = r1.f6248h     // Catch: java.lang.Throwable -> L4f
            r2 = 2
            if (r0 == 0) goto L56
            q9.x2 r3 = r1.f6245e     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            android.os.Parcel r4 = r0.D0()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            com.google.android.gms.internal.ads.vg.c(r4, r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            r0.L1(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            goto L56
        L4f:
            r0 = move-exception
            goto L6f
        L51:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            u9.i.h(r0)     // Catch: java.lang.Throwable -> L4f
        L56:
            q9.q0 r0 = r1.i     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L66
            java.lang.String r3 = r1.f6251l     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            android.os.Parcel r4 = r0.D0()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r4.writeString(r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r0.L1(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
        L66:
            monitor-exit(r1)
            goto L6e
        L68:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            u9.i.h(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
        L6e:
            return
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0
        L71:
            com.google.android.gms.internal.ads.ht0 r0 = r11.f8770c
            r0.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ot0.run():void");
    }
}
