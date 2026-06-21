package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 implements gy1, fy1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy1 f3478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f3480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nx1 f3481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gy1 f3482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fy1 f3483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3484h = -9223372036854775807L;

    public ay1(hy1 hy1Var, i iVar, long j10) {
        this.f3478b = hy1Var;
        this.f3480d = iVar;
        this.f3479c = j10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void a(long j10) {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        gy1Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long b(d[] dVarArr, boolean[] zArr, gz1[] gz1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f3484h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f3479c) ? j10 : j11;
        this.f3484h = -9223372036854775807L;
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.b(dVarArr, zArr, gz1VarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long c(long j10, uu1 uu1Var) {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.c(j10, uu1Var);
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final /* bridge */ /* synthetic */ void d(hz1 hz1Var) {
        fy1 fy1Var = this.f3483g;
        String str = cq0.f4293a;
        fy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.f();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final mz1 g() {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.g();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void h() {
        gy1 gy1Var = this.f3482f;
        if (gy1Var != null) {
            gy1Var.h();
            return;
        }
        nx1 nx1Var = this.f3481e;
        if (nx1Var != null) {
            nx1Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final void i(gy1 gy1Var) {
        fy1 fy1Var = this.f3483g;
        String str = cq0.f4293a;
        fy1Var.i(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        gy1 gy1Var = this.f3482f;
        return gy1Var != null && gy1Var.j(yt1Var);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long k(long j10) {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.k(j10);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void l(fy1 fy1Var, long j10) {
        this.f3483g = fy1Var;
        gy1 gy1Var = this.f3482f;
        if (gy1Var != null) {
            long j11 = this.f3484h;
            if (j11 == -9223372036854775807L) {
                j11 = this.f3479c;
            }
            gy1Var.l(this, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long m() {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        return gy1Var.m();
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
        gy1 gy1Var = this.f3482f;
        String str = cq0.f4293a;
        gy1Var.n(j10);
    }

    public final void o(hy1 hy1Var) {
        long j10 = this.f3484h;
        if (j10 == -9223372036854775807L) {
            j10 = this.f3479c;
        }
        nx1 nx1Var = this.f3481e;
        nx1Var.getClass();
        gy1 gy1VarC = nx1Var.c(hy1Var, this.f3480d, j10);
        this.f3482f = gy1VarC;
        if (this.f3483g != null) {
            gy1VarC.l(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        gy1 gy1Var = this.f3482f;
        return gy1Var != null && gy1Var.q();
    }
}
