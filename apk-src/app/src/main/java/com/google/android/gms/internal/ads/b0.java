package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f3530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f3531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f3532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f3534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jx1 f3535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i1 f3537h;
    public Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f3538j;

    public b0(v0 v0Var, w0 w0Var, c6 c6Var) {
        this.f3530a = v0Var;
        this.f3531b = w0Var;
        v0Var.f11168k = c6Var;
        this.f3532c = new b1(new ut(1, this), v0Var, w0Var);
        this.f3533d = new ArrayDeque();
        this.f3535f = new jx1(new ow1());
        this.f3536g = -9223372036854775807L;
        this.f3537h = i1.f6334a;
        this.i = z.f12806b;
        this.f3538j = y.f12431c;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void A0(int i) {
        a1 a1Var = this.f3530a.f11160b;
        if (a1Var.f2703h == i) {
            return;
        }
        a1Var.f2703h = i;
        a1Var.g(true);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void B() {
        v0 v0Var = this.f3530a;
        if (v0Var.f11162d == 0) {
            v0Var.f11162d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void B0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void C0(boolean z5) {
        v0 v0Var = this.f3530a;
        v0Var.i = z5;
        v0Var.f11166h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void D0(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void E0(jx1 jx1Var, long j10, int i, List list) {
        ix.k0(list.isEmpty());
        int i10 = jx1Var.f6982t;
        int i11 = jx1Var.f6983u;
        jx1 jx1Var2 = this.f3535f;
        int i12 = jx1Var2.f6982t;
        b1 b1Var = this.f3532c;
        if (i10 != i12 || i11 != jx1Var2.f6983u) {
            long j11 = b1Var.f3543a;
            ((ro0) b1Var.f3549g).g(j11 == -9223372036854775807L ? 0L : j11 + 1, new bs(1.0f, i10, i11));
        }
        float f10 = jx1Var.f6986x;
        if (f10 != this.f3535f.f6986x) {
            this.f3530a.d(f10);
        }
        this.f3535f = jx1Var;
        if (j10 != this.f3536g) {
            if (((rg0) b1Var.i).f9933c == 0) {
                ((v0) b1Var.f3547e).a(i);
                b1Var.f3546d = j10;
            } else {
                ro0 ro0Var = (ro0) b1Var.f3550h;
                long j12 = b1Var.f3543a;
                ro0Var.g(j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1, Long.valueOf(j10));
            }
            this.f3536g = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void F0(f0 f0Var) {
        this.f3537h = f0Var;
        this.i = f81.f5272b;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean G0(jx1 jx1Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean I(boolean z5) {
        return this.f3530a.e(z5);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean d() {
        b1 b1Var = this.f3532c;
        long j10 = b1Var.f3545c;
        return j10 != -9223372036854775807L && b1Var.f3544b == j10;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void f() {
        b1 b1Var = this.f3532c;
        long j10 = b1Var.f3543a;
        if (j10 == -9223372036854775807L) {
            j10 = Long.MIN_VALUE;
            b1Var.f3543a = Long.MIN_VALUE;
            b1Var.f3544b = Long.MIN_VALUE;
        }
        b1Var.f3545c = j10;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void h() {
        this.f3531b.d();
        this.f3530a.b();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void j() {
        this.f3531b.d();
        v0 v0Var = this.f3530a;
        v0Var.f11161c = false;
        v0Var.f11166h = -9223372036854775807L;
        a1 a1Var = v0Var.f11160b;
        a1Var.f2697b = false;
        x0 x0Var = (x0) a1Var.f2713s;
        if (x0Var != null) {
            x0Var.h();
        }
        a1Var.h();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final Surface n() {
        Surface surface = this.f3534e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void o() {
        this.f3534e = null;
        this.f3530a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void u0(boolean z5) {
        if (z5) {
            v0 v0Var = this.f3530a;
            v0Var.f11160b.e();
            v0Var.f11165g = -9223372036854775807L;
            v0Var.f11163e = -9223372036854775807L;
            v0Var.f11162d = Math.min(v0Var.f11162d, 1);
            v0Var.f11166h = -9223372036854775807L;
        }
        this.f3531b.d();
        b1 b1Var = this.f3532c;
        rg0 rg0Var = (rg0) b1Var.i;
        rg0Var.f9931a = 0;
        rg0Var.f9932b = -1;
        rg0Var.f9933c = 0;
        b1Var.f3543a = -9223372036854775807L;
        b1Var.f3544b = -9223372036854775807L;
        b1Var.f3545c = -9223372036854775807L;
        ro0 ro0Var = (ro0) b1Var.f3550h;
        if (ro0Var.h() > 0) {
            ix.o(ro0Var.h() > 0);
            while (ro0Var.h() > 1) {
                ro0Var.i();
            }
            Object objI = ro0Var.i();
            objI.getClass();
            b1Var.f3546d = ((Long) objI).longValue();
        }
        ro0 ro0Var2 = (ro0) b1Var.f3549g;
        if (ro0Var2.h() > 0) {
            ix.o(ro0Var2.h() > 0);
            while (ro0Var2.h() > 1) {
                ro0Var2.i();
            }
            Object objI2 = ro0Var2.i();
            objI2.getClass();
            ro0Var2.g(0L, (bs) objI2);
        }
        this.f3533d.clear();
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void v0(float f10) {
        this.f3530a.g(f10);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final boolean w0(long j10, g0 g0Var) {
        this.f3533d.add(g0Var);
        b1 b1Var = this.f3532c;
        rg0 rg0Var = (rg0) b1Var.i;
        int i = rg0Var.f9933c;
        long[] jArr = rg0Var.f9934d;
        int length = jArr.length;
        if (i == length) {
            int i10 = length + length;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i10];
            int i11 = rg0Var.f9931a;
            int i12 = length - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy(rg0Var.f9934d, 0, jArr2, i12, i11);
            rg0Var.f9931a = 0;
            rg0Var.f9932b = rg0Var.f9933c - 1;
            rg0Var.f9934d = jArr2;
            rg0Var.f9935e = i10 - 1;
            jArr = jArr2;
        }
        int i13 = (rg0Var.f9932b + 1) & rg0Var.f9935e;
        rg0Var.f9932b = i13;
        jArr[i13] = j10;
        rg0Var.f9933c++;
        b1Var.f3543a = j10;
        b1Var.f3545c = -9223372036854775807L;
        this.i.execute(new s(1, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void x0(t0 t0Var) {
        this.f3538j = t0Var;
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void y0(long j10, long j11) throws j1 {
        try {
            this.f3532c.b(j10, j11);
        } catch (bt1 e3) {
            throw new j1(e3, this.f3535f);
        }
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void z0(Surface surface, yk0 yk0Var) {
        this.f3534e = surface;
        this.f3530a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.k1
    public final void G() {
    }
}
