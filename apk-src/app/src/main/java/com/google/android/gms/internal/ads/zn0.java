package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f13046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f13047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vw f13050f;

    public zn0(vw vwVar, Context context, ScheduledExecutorService scheduledExecutorService, gx gxVar, int i, boolean z5, boolean z10) {
        this.f13050f = vwVar;
        this.f13045a = context;
        this.f13046b = scheduledExecutorService;
        this.f13047c = gxVar;
        this.f13048d = z5;
        this.f13049e = z10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        jx jxVar = new jx();
        u9.d dVar = q9.r.f31959g.f31960a;
        ma.g gVar = ma.g.f28775b;
        Context context = this.f13045a;
        int iC = gVar.c(context, 12451000);
        if (iC == 0 || iC == 2) {
            hx.f6279a.execute(new uw(this.f13050f, context, jxVar));
        }
        i81 i81VarS = i81.s(jxVar);
        final int i = 1;
        c31 c31Var = new c31(this) { // from class: com.google.android.gms.internal.ads.yn0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zn0 f12670b;

            {
                this.f12670b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.c31
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L86;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.zn0 r0 = r8.f12670b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
                    r1.<init>()
                    boolean r2 = r0.f13048d
                    if (r2 != 0) goto L25
                    com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.N3
                    q9.s r3 = q9.s.f31967e
                    com.google.android.gms.internal.ads.yk r3 = r3.f31970c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L38
                    goto L7f
                L25:
                    com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.O3
                    q9.s r3 = q9.s.f31967e
                    com.google.android.gms.internal.ads.yk r3 = r3.f31970c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L38
                    goto L7f
                L38:
                    android.content.Context r1 = r0.f13045a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.mx0 r2 = com.google.android.gms.internal.ads.mx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.T3     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    q9.s r5 = q9.s.f31967e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.yk r5 = r5.f31970c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = r0.f13049e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<com.google.android.gms.internal.ads.mx0> r1 = com.google.android.gms.internal.ads.mx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.jx0 r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L7f
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    p9.k r2 = p9.k.C
                    com.google.android.gms.internal.ads.bx r2 = r2.f31302h
                    r2.d(r1, r0)
                    com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
                    r1.<init>()
                L7f:
                    com.google.android.gms.internal.ads.ao0 r0 = new com.google.android.gms.internal.ads.ao0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                L86:
                    com.google.android.gms.internal.ads.zn0 r0 = r8.f12670b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    q9.r r9 = q9.r.f31959g
                    u9.d r9 = r9.f31960a
                    android.content.Context r9 = r0.f13045a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9c
                    r9 = r0
                    goto La2
                L9c:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La2:
                    com.google.android.gms.internal.ads.ao0 r1 = new com.google.android.gms.internal.ads.ao0
                    com.google.android.gms.internal.ads.jx0 r2 = new com.google.android.gms.internal.ads.jx0
                    r2.<init>()
                    r1.<init>(r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yn0.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.f13047c;
        final int i10 = 0;
        return vv.G((i81) vv.I(vv.K(i81VarS, c31Var, executor), ((Long) q9.s.f31967e.f31970c.a(al.f3205t1)).longValue(), TimeUnit.MILLISECONDS, this.f13046b), Throwable.class, new c31(this) { // from class: com.google.android.gms.internal.ads.yn0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ zn0 f12670b;

            {
                this.f12670b = this;
            }

            @Override // com.google.android.gms.internal.ads.c31
            public final Object apply(Object v5) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L86;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.zn0 r0 = r8.f12670b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
                    r1.<init>()
                    boolean r2 = r0.f13048d
                    if (r2 != 0) goto L25
                    com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.N3
                    q9.s r3 = q9.s.f31967e
                    com.google.android.gms.internal.ads.yk r3 = r3.f31970c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L38
                    goto L7f
                L25:
                    com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.O3
                    q9.s r3 = q9.s.f31967e
                    com.google.android.gms.internal.ads.yk r3 = r3.f31970c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L38
                    goto L7f
                L38:
                    android.content.Context r1 = r0.f13045a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.mx0 r2 = com.google.android.gms.internal.ads.mx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.T3     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    q9.s r5 = q9.s.f31967e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.yk r5 = r5.f31970c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = r0.f13049e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<com.google.android.gms.internal.ads.mx0> r1 = com.google.android.gms.internal.ads.mx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    com.google.android.gms.internal.ads.jx0 r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L7f
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    p9.k r2 = p9.k.C
                    com.google.android.gms.internal.ads.bx r2 = r2.f31302h
                    r2.d(r1, r0)
                    com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
                    r1.<init>()
                L7f:
                    com.google.android.gms.internal.ads.ao0 r0 = new com.google.android.gms.internal.ads.ao0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                L86:
                    com.google.android.gms.internal.ads.zn0 r0 = r8.f12670b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    q9.r r9 = q9.r.f31959g
                    u9.d r9 = r9.f31960a
                    android.content.Context r9 = r0.f13045a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9c
                    r9 = r0
                    goto La2
                L9c:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La2:
                    com.google.android.gms.internal.ads.ao0 r1 = new com.google.android.gms.internal.ads.ao0
                    com.google.android.gms.internal.ads.jx0 r2 = new com.google.android.gms.internal.ads.jx0
                    r2.<init>()
                    r1.<init>(r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yn0.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 40;
    }
}
