package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lz1 implements gy1, fy1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1 f7696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fy1 f7698d;

    public lz1(gy1 gy1Var, long j10) {
        this.f7696b = gy1Var;
        this.f7697c = j10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void a(long j10) {
        this.f7696b.a(j10 - this.f7697c);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long b(d[] dVarArr, boolean[] zArr, gz1[] gz1VarArr, boolean[] zArr2, long j10) {
        gz1[] gz1VarArr2 = new gz1[gz1VarArr.length];
        int i = 0;
        while (true) {
            gz1 gz1Var = null;
            if (i >= gz1VarArr.length) {
                break;
            }
            kz1 kz1Var = (kz1) gz1VarArr[i];
            if (kz1Var != null) {
                gz1Var = kz1Var.f7351a;
            }
            gz1VarArr2[i] = gz1Var;
            i++;
        }
        long j11 = this.f7697c;
        long jB = this.f7696b.b(dVarArr, zArr, gz1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < gz1VarArr.length; i10++) {
            gz1 gz1Var2 = gz1VarArr2[i10];
            if (gz1Var2 == null) {
                gz1VarArr[i10] = null;
            } else {
                gz1 gz1Var3 = gz1VarArr[i10];
                if (gz1Var3 == null || ((kz1) gz1Var3).f7351a != gz1Var2) {
                    gz1VarArr[i10] = new kz1(gz1Var2, j11);
                }
            }
        }
        return jB + j11;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long c(long j10, uu1 uu1Var) {
        gy1 gy1Var = this.f7696b;
        long j11 = this.f7697c;
        return gy1Var.c(j10 - j11, uu1Var) + j11;
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final /* bridge */ /* synthetic */ void d(hz1 hz1Var) {
        fy1 fy1Var = this.f7698d;
        fy1Var.getClass();
        fy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        long jE = this.f7696b.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.f7697c;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        long jF = this.f7696b.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.f7697c;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final mz1 g() {
        return this.f7696b.g();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void h() {
        this.f7696b.h();
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final void i(gy1 gy1Var) {
        fy1 fy1Var = this.f7698d;
        fy1Var.getClass();
        fy1Var.i(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        long j10 = yt1Var.f12742a;
        xt1 xt1Var = new xt1();
        xt1Var.f12329b = yt1Var.f12743b;
        xt1Var.f12330c = yt1Var.f12744c;
        xt1Var.f12328a = j10 - this.f7697c;
        return this.f7696b.j(new yt1(xt1Var));
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long k(long j10) {
        gy1 gy1Var = this.f7696b;
        long j11 = this.f7697c;
        return gy1Var.k(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void l(fy1 fy1Var, long j10) {
        this.f7698d = fy1Var;
        this.f7696b.l(this, j10 - this.f7697c);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long m() {
        long jM = this.f7696b.m();
        if (jM == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jM + this.f7697c;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
        this.f7696b.n(j10 - this.f7697c);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        return this.f7696b.q();
    }
}
