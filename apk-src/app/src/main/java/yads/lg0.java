package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final is2 f40549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vs2 f40550b;

    public /* synthetic */ lg0() {
        this(new is2());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r7.getCurrentModeType() == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.kg0 a(android.content.Context r7) {
        /*
            r6 = this;
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            yads.vs2 r1 = r6.f40550b
            android.graphics.Point r1 = r1.a(r7)
            int r2 = r1.x
            int r1 = r1.y
            float r0 = r0.density
            float r2 = (float) r2
            float r3 = r2 / r0
            float r1 = (float) r1
            float r4 = r1 / r0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L1f
            r3 = r4
        L1f:
            r4 = 160(0xa0, float:2.24E-43)
            float r4 = (float) r4
            float r0 = r0 * r4
            float r2 = r2 / r0
            float r1 = r1 / r0
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r1 = r1 + r2
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 13
            boolean r2 = yads.ub.a(r2)
            if (r2 == 0) goto L4d
            java.lang.String r2 = "uimode"
            java.lang.Object r7 = r7.getSystemService(r2)
            boolean r2 = r7 instanceof android.app.UiModeManager
            if (r2 == 0) goto L42
            android.app.UiModeManager r7 = (android.app.UiModeManager) r7
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 == 0) goto L67
            int r7 = r7.getCurrentModeType()
            r2 = 4
            if (r7 != r2) goto L67
            goto L64
        L4d:
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L67
            yads.is2 r2 = r6.f40549a
            java.lang.String r4 = "android.hardware.touchscreen"
            r2.getClass()
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L64
            boolean r7 = r7.hasSystemFeature(r4)     // Catch: java.lang.Throwable -> L64
            if (r7 != 0) goto L67
        L64:
            yads.kg0 r7 = yads.kg0.f40190d
            return r7
        L67:
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L77
            r7 = 1142292480(0x44160000, float:600.0)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L74
            goto L77
        L74:
            yads.kg0 r7 = yads.kg0.f40188b
            return r7
        L77:
            yads.kg0 r7 = yads.kg0.f40189c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lg0.a(android.content.Context):yads.kg0");
    }

    public lg0(is2 is2Var) {
        this.f40549a = is2Var;
        this.f40550b = new vs2();
    }
}
