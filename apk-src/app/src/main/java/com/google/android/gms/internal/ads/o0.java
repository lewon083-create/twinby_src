package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x41 f8529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jx1 f8530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f8534f;

    public o0(s0 s0Var, Context context) {
        this.f8534f = s0Var;
        cq0.j(context);
        v41 v41Var = x41.f12018c;
        this.f8529a = r51.f9713f;
        this.f8532d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void A0(int i) {
        this.f8534f.f10109e.A0(i);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void B() {
        s0 s0Var = this.f8534f;
        if (s0Var.f10113j.h() == 0) {
            s0Var.f10109e.B();
            return;
        }
        ro0 ro0Var = new ro0(0);
        if (s0Var.f10113j.h() <= 0) {
            s0Var.f10113j = ro0Var;
        } else {
            ((r0) s0Var.f10113j.i()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void B0(List list) {
        if (this.f8529a.equals(list)) {
            return;
        }
        this.f8529a = x41.v(list);
        jx1 jx1Var = this.f8530b;
        if (jx1Var == null) {
            return;
        }
        ow1 ow1Var = new ow1(jx1Var);
        rm1 rm1Var = jx1Var.C;
        if (rm1Var == null || !rm1Var.d()) {
            rm1Var = rm1.f9992h;
        }
        ow1Var.B = rm1Var;
        ow1Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void C0(boolean z5) {
        s0 s0Var = this.f8534f;
        if (s0Var.f10108d) {
            s0Var.f10109e.C0(z5);
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void D0(long j10) {
        this.f8531c = j10;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void E0(jx1 jx1Var, long j10, int i, List list) {
        ix.k0(false);
        this.f8529a = x41.v(list);
        this.f8530b = jx1Var;
        this.f8534f.getClass();
        ow1 ow1Var = new ow1(jx1Var);
        rm1 rm1Var = jx1Var.C;
        if (rm1Var == null || !rm1Var.d()) {
            rm1Var = rm1.f9992h;
        }
        ow1Var.B = rm1Var;
        ow1Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void G() {
        s0 s0Var = this.f8534f;
        if (s0Var.f10117n == 2) {
            return;
        }
        lo0 lo0Var = s0Var.f10114k;
        if (lo0Var != null) {
            lo0Var.f7588a.removeCallbacksAndMessages(null);
        }
        s0Var.f10115l = null;
        s0Var.f10117n = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0044 A[Catch: rc0 -> 0x0036, TryCatch #0 {rc0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[Catch: rc0 -> 0x0036, TRY_LEAVE, TryCatch #0 {rc0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003e, B:29:0x0044, B:31:0x0048, B:38:0x005b, B:41:0x0062, B:46:0x0086, B:36:0x0053), top: B:51:0x001d }] */
    @Override // com.google.android.gms.internal.ads.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G0(com.google.android.gms.internal.ads.jx1 r10) throws com.google.android.gms.internal.ads.j1 {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            com.google.android.gms.internal.ads.s0 r1 = r9.f8534f
            int r2 = r1.f10117n
            r3 = 0
            r4 = 1
            if (r2 != 0) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            com.google.android.gms.internal.ads.ix.k0(r2)
            com.google.android.gms.internal.ads.rm1 r2 = r10.C
            if (r2 == 0) goto L1b
            boolean r5 = r2.d()
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            com.google.android.gms.internal.ads.rm1 r2 = com.google.android.gms.internal.ads.rm1.f9992h
        L1d:
            int r2 = r2.f9995c     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r2 != r7) goto L41
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            r8 = 34
            if (r2 >= r8) goto L3c
            if (r2 < r6) goto L39
            boolean r2 = com.google.android.gms.internal.ads.fs1.Q(r5)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            if (r2 == 0) goto L39
            r2 = r4
            goto L3a
        L36:
            r0 = move-exception
            goto L9e
        L39:
            r2 = r3
        L3a:
            if (r2 != 0) goto L3e
        L3c:
            r2 = r7
            goto L41
        L3e:
            com.google.android.gms.internal.ads.rm1 r10 = new com.google.android.gms.internal.ads.rm1     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            goto L88
        L41:
            r8 = 6
            if (r2 != r8) goto L51
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            if (r7 < r6) goto L4f
            boolean r5 = com.google.android.gms.internal.ads.fs1.Q(r5)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            if (r5 == 0) goto L4f
            r3 = r4
        L4f:
            r4 = r3
            goto L59
        L51:
            if (r2 != r7) goto L59
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r4 = com.google.android.gms.internal.ads.fs1.Q(r3)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
        L59:
            if (r4 != 0) goto L7f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            r4 = 29
            if (r3 >= r4) goto L62
            goto L7f
        L62:
            java.lang.String r3 = "PlaybackVidGraphWrapper"
            java.lang.String r4 = com.google.android.gms.internal.ads.cq0.f4293a     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            java.util.Locale r4 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            r4.<init>(r0)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            r4.append(r2)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r4.append(r0)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            java.lang.String r0 = r4.toString()     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            com.google.android.gms.internal.ads.rs.r(r3, r0)     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            com.google.android.gms.internal.ads.rm1 r10 = com.google.android.gms.internal.ads.rm1.f9992h     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
            goto L88
        L7f:
            r0 = 2
            if (r2 == r0) goto L86
            r0 = 10
            if (r2 != r0) goto L88
        L86:
            com.google.android.gms.internal.ads.rm1 r10 = com.google.android.gms.internal.ads.rm1.f9992h     // Catch: com.google.android.gms.internal.ads.rc0 -> L36
        L88:
            com.google.android.gms.internal.ads.c6 r10 = r1.f10110f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r2 = 0
            com.google.android.gms.internal.ads.lo0 r10 = r10.y(r0, r2)
            r1.f10114k = r10
            com.google.android.gms.internal.ads.q0 r10 = r1.f10106b
            r10.a()
            throw r2
        L9e:
            com.google.android.gms.internal.ads.j1 r1 = new com.google.android.gms.internal.ads.j1
            r1.<init>(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0.G0(com.google.android.gms.internal.ads.jx1):boolean");
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean I(boolean z5) {
        return this.f8534f.f10109e.f3530a.e(false);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void f() {
        long j10 = this.f8532d;
        s0 s0Var = this.f8534f;
        s0Var.getClass();
        if (s0Var.f10118o >= j10) {
            s0Var.f10109e.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void h() {
        s0 s0Var = this.f8534f;
        if (s0Var.f10108d) {
            s0Var.f10109e.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void j() {
        s0 s0Var = this.f8534f;
        if (s0Var.f10108d) {
            s0Var.f10109e.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final Surface n() {
        ix.k0(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void o() {
        s0 s0Var = this.f8534f;
        s0Var.getClass();
        yk0.f12649c.getClass();
        s0Var.f10115l = null;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void u0(boolean z5) {
        this.f8532d = -9223372036854775807L;
        s0 s0Var = this.f8534f;
        if (s0Var.f10117n == 1) {
            s0Var.f10116m++;
            s0Var.f10109e.u0(z5);
            while (s0Var.f10113j.h() > 1) {
                s0Var.f10113j.i();
            }
            if (s0Var.f10113j.h() == 1) {
                ((r0) s0Var.f10113j.i()).getClass();
                throw null;
            }
            s0Var.f10118o = -9223372036854775807L;
            lo0 lo0Var = s0Var.f10114k;
            lo0Var.getClass();
            lo0Var.e(new s(2, s0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void v0(float f10) {
        s0 s0Var = this.f8534f;
        w0 w0Var = s0Var.i;
        w0Var.getClass();
        ix.o(f10 > 0.0f);
        w0Var.f11558d = new Range(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), Double.valueOf(1.0d / ((double) f10)));
        w0Var.d();
        s0Var.f10109e.v0(f10);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean w0(long j10, g0 g0Var) {
        int i;
        ix.k0(false);
        long j11 = j10 + this.f8531c;
        s0 s0Var = this.f8534f;
        w0 w0Var = s0Var.i;
        long j12 = w0Var.f11555a == -9223372036854775807L ? -9223372036854775807L : (long) (((j11 - r3) * w0Var.f11557c) + w0Var.f11556b);
        if (j12 != -9223372036854775807L) {
            long j13 = s0Var.f10112h;
            if (j13 != -9223372036854775807L && j12 < j13 && (i = this.f8533e) < 2) {
                this.f8533e = i + 1;
                g0Var.a();
                return true;
            }
        }
        int i10 = s0Var.f10119p;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void x0(t0 t0Var) {
        this.f8534f.f10109e.f3538j = t0Var;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void y0(long j10, long j11) throws j1 {
        this.f8534f.f10109e.y0(j10 + this.f8531c, j11);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void z0(Surface surface, yk0 yk0Var) {
        s0 s0Var = this.f8534f;
        Pair pair = s0Var.f10115l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((yk0) s0Var.f10115l.second).equals(yk0Var)) {
            return;
        }
        s0Var.f10115l = Pair.create(surface, yk0Var);
        yk0Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void F0(f0 f0Var) {
    }
}
