package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh1 f39867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic2 f39868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ih1 f39869c;

    public /* synthetic */ jh1(Context context, String str) {
        this(new hh1(context, str), new ic2(context), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ih1 a() {
        /*
            r5 = this;
            yads.hh1 r0 = r5.f39867a
            yads.rm2 r1 = r0.f39189b
            java.lang.String r2 = r0.f39188a
            r1.getClass()
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L2b
            yads.rm2 r3 = r0.f39189b
            android.content.Context r0 = r0.f39190c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3.getClass()
            java.lang.String r3 = "getFusedLocationProviderClient"
            java.lang.Object r0 = yads.rm2.a(r2, r3, r0)
            if (r0 == 0) goto L2b
            yads.zy0 r2 = new yads.zy0
            r2.<init>(r0)
            goto L2c
        L2b:
            r2 = r1
        L2c:
            if (r2 == 0) goto L54
            yads.ic2 r0 = r5.f39868b
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r0.a(r3)
            yads.ic2 r3 = r5.f39868b
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = r3.a(r4)
            if (r0 != 0) goto L42
            if (r3 == 0) goto L54
        L42:
            java.lang.Object r0 = r2.f45590a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getLastLocation"
            java.lang.Object r0 = yads.qm2.a(r0, r3, r2)
            if (r0 == 0) goto L54
            yads.ih1 r1 = new yads.ih1
            r1.<init>(r0)
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jh1.a():yads.ih1");
    }

    public jh1(hh1 hh1Var, ic2 ic2Var, ih1 ih1Var) {
        this.f39867a = hh1Var;
        this.f39868b = ic2Var;
        this.f39869c = ih1Var;
    }
}
