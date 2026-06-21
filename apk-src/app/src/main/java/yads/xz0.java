package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xz0 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a01 f44851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c01 f44852b;

    public /* synthetic */ xz0(Context context) {
        this(new a01(context), new c01(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // yads.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.td a() {
        /*
            r7 = this;
            yads.a01 r0 = r7.f44851a
            r0.getClass()
            r1 = 0
            r2 = 0
            yads.rm2 r3 = r0.f36599a     // Catch: java.lang.Throwable -> L4c
            r3.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L4c
            yads.rm2 r4 = r0.f36599a     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "getAdvertisingIdInfo"
            android.content.Context r6 = r0.f36601c     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L4c
            r4.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = yads.rm2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4c
            java.lang.String r4 = "getId"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = yads.qm2.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "isLimitAdTrackingEnabled"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r3 = yads.qm2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4c
            yads.ud r0 = r0.f36600b     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4c
            if (r4 == 0) goto L4c
            yads.td r0 = new yads.td     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
            r0 = r2
        L4d:
            if (r0 != 0) goto L88
            yads.c01 r0 = r7.f44852b
            yads.e01 r3 = r0.f37235d
            r3.getClass()
            android.content.Intent r3 = yads.e01.a()
            yads.is2 r4 = r0.f37232a
            android.content.Context r5 = r0.f37233b
            r4.getClass()
            android.content.pm.PackageManager r4 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L6a
            android.content.pm.ResolveInfo r1 = r4.resolveService(r3, r1)     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
            r1 = r2
        L6b:
            if (r1 == 0) goto L89
            yads.zz0 r1 = new yads.zz0     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
            android.content.Context r4 = r0.f37233b     // Catch: java.lang.Throwable -> L89
            r5 = 1
            boolean r3 = r4.bindService(r3, r1, r5)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L89
            yads.d01 r3 = r0.f37234c     // Catch: java.lang.Throwable -> L89
            yads.td r3 = r3.a(r1)     // Catch: java.lang.Throwable -> L89
            android.content.Context r0 = r0.f37233b     // Catch: java.lang.Throwable -> L89
            r0.unbindService(r1)     // Catch: java.lang.Throwable -> L89
            r2 = r3
            goto L89
        L88:
            r2 = r0
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xz0.a():yads.td");
    }

    public xz0(a01 a01Var, c01 c01Var) {
        this.f44851a = a01Var;
        this.f44852b = c01Var;
    }
}
