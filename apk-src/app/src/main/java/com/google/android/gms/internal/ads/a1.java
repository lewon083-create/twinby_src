package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f2698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2703h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f2711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DisplayManager.DisplayListener f2713s;

    public a1(Context context, int i) {
        switch (i) {
            case 1:
                this.f2696a = context;
                d0 d0Var = new d0();
                d0Var.f4406d = new c0(1);
                d0Var.f4407e = new c0(1);
                d0Var.f4404b = -9223372036854775807L;
                this.f2712r = d0Var;
                this.f2699d = -1.0f;
                this.f2702g = 1.0f;
                this.f2703h = 0;
                break;
            default:
                this.f2696a = context;
                d0 d0Var2 = new d0();
                d0Var2.f4406d = new c0(0);
                d0Var2.f4407e = new c0(0);
                d0Var2.f4404b = -9223372036854775807L;
                this.f2712r = d0Var2;
                this.f2699d = -1.0f;
                this.f2702g = 1.0f;
                this.f2703h = 0;
                break;
        }
    }

    public void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f2698c) == null || this.f2703h == Integer.MIN_VALUE || this.f2701f == 0.0f || !surface.isValid()) {
            return;
        }
        this.f2701f = 0.0f;
        try {
            this.f2698c.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e3) {
            m3.b.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }

    public void b() {
        this.f2705k = 0L;
        this.f2709o = -1L;
        this.f2706l = -1L;
        this.i = 0L;
        this.f2704j = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2712r
            com.google.android.gms.internal.ads.d0 r0 = (com.google.android.gms.internal.ads.d0) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L9b
            android.view.Surface r1 = r9.f2698c
            if (r1 != 0) goto L10
            goto L9b
        L10:
            java.lang.Object r1 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r1 = (com.google.android.gms.internal.ads.c0) r1
            boolean r1 = r1.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r1 = (com.google.android.gms.internal.ads.c0) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r1 = (com.google.android.gms.internal.ads.c0) r1
            long r4 = r1.f3980e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L33
            goto L36
        L33:
            long r6 = r1.f3981f
            long r6 = r6 / r4
        L36:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r1 = (float) r6
            goto L43
        L3f:
            r1 = r3
            goto L43
        L41:
            float r1 = r9.f2699d
        L43:
            float r4 = r9.f2700e
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 != 0) goto L4a
            goto L9b
        L4a:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L8e
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8e
            java.lang.Object r2 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r2 = (com.google.android.gms.internal.ads.c0) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r2 = (com.google.android.gms.internal.ads.c0) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L6d
            java.lang.Object r0 = r0.f4406d
            com.google.android.gms.internal.ads.c0 r0 = (com.google.android.gms.internal.ads.c0) r0
            long r2 = r0.f3981f
            goto L72
        L6d:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L72:
            r4 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L7f
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L81
        L7f:
            r0 = 1065353216(0x3f800000, float:1.0)
        L81:
            float r2 = r9.f2700e
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L9b
            goto L95
        L8e:
            if (r5 == 0) goto L91
            goto L95
        L91:
            int r0 = r0.f4405c
            if (r0 < r2) goto L9b
        L95:
            r9.f2700e = r1
            r0 = 0
            r9.d(r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a1.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L49
            android.view.Surface r0 = r3.f2698c
            if (r0 == 0) goto L49
            int r1 = r3.f2703h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L49
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L49
        L17:
            boolean r0 = r3.f2697b
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.f2700e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.f2702g
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L32
            float r4 = r3.f2701f
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L32
            goto L49
        L32:
            r3.f2701f = r0
            android.view.Surface r4 = r3.f2698c
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L3c
            r1 = 0
            goto L3d
        L3c:
            r1 = 1
        L3d:
            j7.a.s(r4, r0, r1)     // Catch: java.lang.IllegalStateException -> L41
            return
        L41:
            r4 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            m3.b.f(r0, r1, r4)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a1.d(boolean):void");
    }

    public void e() {
        this.f2705k = 0L;
        this.f2709o = -1L;
        this.f2706l = -1L;
        this.i = 0L;
        this.f2704j = 0L;
    }

    public void f() {
        float f10;
        if (Build.VERSION.SDK_INT < 30 || this.f2698c == null) {
            return;
        }
        d0 d0Var = (d0) this.f2712r;
        if (!((c0) d0Var.f4406d).e()) {
            f10 = this.f2699d;
        } else if (((c0) d0Var.f4406d).e()) {
            f10 = (float) (1.0E9d / (((c0) d0Var.f4406d).f3980e != 0 ? r2.f3981f / r4 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f11 = this.f2700e;
        if (f10 != f11) {
            if (f10 != -1.0f && f11 != -1.0f) {
                float f12 = 1.0f;
                if (((c0) d0Var.f4406d).e()) {
                    if ((((c0) d0Var.f4406d).e() ? ((c0) d0Var.f4406d).f3981f : -9223372036854775807L) >= 5000000000L) {
                        f12 = 0.1f;
                    }
                }
                if (Math.abs(f10 - this.f2700e) < f12) {
                    return;
                }
            } else if (f10 == -1.0f && d0Var.f4405c < 30) {
                return;
            }
            this.f2700e = f10;
            g(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L48
            android.view.Surface r0 = r3.f2698c
            if (r0 == 0) goto L48
            int r1 = r3.f2703h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L48
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L17
            goto L48
        L17:
            boolean r0 = r3.f2697b
            r1 = 0
            if (r0 == 0) goto L28
            float r0 = r3.f2700e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            float r2 = r3.f2702g
            float r0 = r0 * r2
            goto L29
        L28:
            r0 = r1
        L29:
            if (r4 != 0) goto L31
            float r4 = r3.f2701f
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L48
        L31:
            r3.f2701f = r0
            android.view.Surface r4 = r3.f2698c
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L3b
            r1 = 0
            goto L3c
        L3b:
            r1 = 1
        L3c:
            j7.a.s(r4, r0, r1)     // Catch: java.lang.IllegalStateException -> L40
            return
        L40:
            r4 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            com.google.android.gms.internal.ads.rs.H(r0, r1, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a1.g(boolean):void");
    }

    public void h() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f2698c) == null || this.f2703h == Integer.MIN_VALUE || this.f2701f == 0.0f || !surface.isValid()) {
            return;
        }
        this.f2701f = 0.0f;
        try {
            this.f2698c.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e3) {
            rs.H("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }
}
