package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8876h;

    public p1() {
        this.f8869a = -1L;
        this.f8870b = -1L;
        this.f8871c = -1L;
        this.f8872d = -1L;
        this.f8873e = -1L;
        this.f8874f = -1L;
        this.f8875g = -1L;
        this.f8876h = -1L;
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return m3.z.k(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }

    public static long b(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((j14 - j13) / (j12 - j11)) * (j10 - j11));
        String str = cq0.f4293a;
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r6.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.content.Context r6, android.view.View r7) {
        /*
            r5 = this;
            long r0 = r5.f8871c
            r5.f8872d = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.f8871c = r0
            long r0 = r5.f8873e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r5.f8874f = r0
        L14:
            java.lang.String r0 = "window"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r6.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L29
            goto L2c
        L29:
            r6.getMetrics(r0)
        L2c:
            int r6 = r0.widthPixels
            int r1 = r0.heightPixels
            int r6 = r6 * r1
            if (r7 != 0) goto L35
            goto Lc1
        L35:
            int r1 = r7.getWidth()
            int r4 = r0.widthPixels
            int r1 = java.lang.Math.min(r1, r4)
            int r4 = r7.getHeight()
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.min(r4, r0)
            int r0 = r0 * r1
            int r1 = r0 + r0
            if (r1 < r6) goto L4f
            goto Lbc
        L4f:
            if (r0 != 0) goto Lc1
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "DebugGestureViewWrapper"
            boolean r6 = r6.contains(r0)     // Catch: java.lang.Throwable -> Lc1
            if (r6 == 0) goto L68
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            android.view.View r7 = r7.getChildAt(r6)     // Catch: java.lang.Throwable -> Lc1
        L68:
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "getAdConfiguration"
            r1 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r6 = r6.invoke(r7, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "adType"
            java.lang.reflect.Field r7 = r7.getField(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Lc1
            r7.intValue()     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "adTypeToString"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> Lc1
            java.lang.reflect.Method r6 = r6.getMethod(r0, r4)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r6 = r6.invoke(r1, r7)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = "INTERSTITIAL"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "APP_OPEN"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "REWARDED"
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc1
            if (r6 == 0) goto Lc1
        Lbc:
            long r6 = r5.f8871c
            r5.f8873e = r6
            return
        Lc1:
            r5.f8873e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p1.c(android.content.Context, android.view.View):void");
    }

    public p1(long j10, long j11, long j12, long j13, long j14, long j15, int i) {
        switch (i) {
            case 2:
                this.f8869a = j10;
                this.f8870b = j11;
                this.f8872d = 0L;
                this.f8873e = j12;
                this.f8874f = j13;
                this.f8875g = j14;
                this.f8871c = j15;
                this.f8876h = a(j11, 0L, j12, j13, j14, j15);
                break;
            default:
                this.f8869a = j10;
                this.f8870b = j11;
                this.f8872d = 0L;
                this.f8873e = j12;
                this.f8874f = j13;
                this.f8875g = j14;
                this.f8871c = j15;
                this.f8876h = b(j11, 0L, j12, j13, j14, j15);
                break;
        }
    }
}
