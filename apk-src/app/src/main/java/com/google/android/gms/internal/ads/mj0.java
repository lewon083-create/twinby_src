package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mj0 implements k81 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zp0 f7894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xp0 f7895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ at0 f7897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eq0 f7898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oj0 f7899h;

    public mj0(oj0 oj0Var, long j10, zp0 zp0Var, xp0 xp0Var, String str, at0 at0Var, eq0 eq0Var) {
        this.f7893b = j10;
        this.f7894c = zp0Var;
        this.f7895d = xp0Var;
        this.f7896e = str;
        this.f7897f = at0Var;
        this.f7898g = eq0Var;
        Objects.requireNonNull(oj0Var);
        this.f7899h = oj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: all -> 0x0023, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0010, B:6:0x0014, B:10:0x0026, B:12:0x002a, B:14:0x002c, B:15:0x002e, B:18:0x0039, B:25:0x004d, B:26:0x005d, B:27:0x0067, B:23:0x0041, B:24:0x0042, B:31:0x006b, B:16:0x002f, B:20:0x003b), top: B:34:0x0010, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6i(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.oj0 r12 = r11.f7899h
            ua.a r0 = r12.f8698a
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r11.f7893b
            long r6 = r0 - r2
            monitor-enter(r12)
            boolean r0 = r12.f8702e     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            com.google.android.gms.internal.ads.oq0 r4 = r12.f8699b     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zp0 r5 = r11.f7894c     // Catch: java.lang.Throwable -> L23
            r8 = r6
            com.google.android.gms.internal.ads.xp0 r6 = r11.f7895d     // Catch: java.lang.Throwable -> L23
            r7 = 0
            r9 = r8
            r8 = 0
            r4.o(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
            r8 = r9
            goto L26
        L23:
            r0 = move-exception
            goto L6c
        L25:
            r8 = r6
        L26:
            boolean r0 = r12.f8704g     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L2c
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            return
        L2c:
            com.google.android.gms.internal.ads.xp0 r0 = r11.f7895d     // Catch: java.lang.Throwable -> L23
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashMap r1 = r12.f8701d     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.nj0 r1 = (com.google.android.gms.internal.ads.nj0) r1     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L3b
        L39:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            goto L4d
        L3b:
            int r1 = r1.f8319c     // Catch: java.lang.Throwable -> L69
            r2 = 8
            if (r1 != r2) goto L39
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashMap r1 = r12.f8701d     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.nj0 r1 = (com.google.android.gms.internal.ads.nj0) r1     // Catch: java.lang.Throwable -> L23
            r1.f8320d = r8     // Catch: java.lang.Throwable -> L23
            goto L5d
        L4d:
            java.util.LinkedHashMap r1 = r12.f8701d     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.nj0 r4 = new com.google.android.gms.internal.ads.nj0     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r11.f7896e     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r0.f12238f0     // Catch: java.lang.Throwable -> L23
            r7 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L23
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L23
        L5d:
            com.google.android.gms.internal.ads.ei0 r4 = r12.f8703f     // Catch: java.lang.Throwable -> L23
            r9 = r8
            r8 = 0
            r6 = r9
            r9 = 1
            r5 = r0
            r4.c(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            return
        L69:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L23
        L6c:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L23
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mj0.mo6i(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.k81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Throwable r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mj0.k(java.lang.Throwable):void");
    }
}
