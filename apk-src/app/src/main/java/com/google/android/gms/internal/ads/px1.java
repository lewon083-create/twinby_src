package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 implements gy1, fy1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1 f9201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fy1 f9202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ox1[] f9203d = new ox1[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9204e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9205f;

    public px1(ay1 ay1Var, long j10) {
        this.f9201b = ay1Var;
        this.f9205f = j10;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void a(long j10) {
        this.f9201b.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long b(d[] dVarArr, boolean[] zArr, gz1[] gz1VarArr, boolean[] zArr2, long j10) {
        int length = gz1VarArr.length;
        this.f9203d = new ox1[length];
        gz1[] gz1VarArr2 = new gz1[length];
        for (int i = 0; i < gz1VarArr.length; i++) {
            ox1[] ox1VarArr = this.f9203d;
            ox1 ox1Var = (ox1) gz1VarArr[i];
            ox1VarArr[i] = ox1Var;
            gz1VarArr2[i] = ox1Var != null ? ox1Var.f8852a : null;
        }
        long jB = this.f9201b.b(dVarArr, zArr, gz1VarArr2, zArr2, j10);
        long j11 = this.f9205f;
        long jMax = Math.max(jB, j10);
        if (j11 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j11);
        }
        long j12 = -9223372036854775807L;
        if (o()) {
            if (jB < j10) {
                j12 = jMax;
                break;
            }
            if (jB != 0) {
                for (d dVar : dVarArr) {
                    if (dVar != null) {
                        jx1 jx1VarL = dVar.l();
                        if (!ra.d(jx1VarL.f6975m, jx1VarL.f6972j)) {
                            j12 = jMax;
                            break;
                        }
                    }
                }
            }
        }
        this.f9204e = j12;
        for (int i10 = 0; i10 < gz1VarArr.length; i10++) {
            gz1 gz1Var = gz1VarArr2[i10];
            if (gz1Var == null) {
                this.f9203d[i10] = null;
            } else {
                ox1[] ox1VarArr2 = this.f9203d;
                ox1 ox1Var2 = ox1VarArr2[i10];
                if (ox1Var2 == null || ox1Var2.f8852a != gz1Var) {
                    ox1VarArr2[i10] = new ox1(this, gz1Var);
                }
            }
            gz1VarArr[i10] = this.f9203d[i10];
        }
        return jMax;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long c(long j10, uu1 uu1Var) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = uu1Var.f11103a;
        String str = cq0.f4293a;
        long jMax = Math.max(0L, Math.min(j11, j10));
        long j12 = uu1Var.f11104b;
        long j13 = this.f9205f;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != j11 || jMax2 != j12) {
            uu1Var = new uu1(jMax, jMax2);
        }
        return this.f9201b.c(j10, uu1Var);
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final /* bridge */ /* synthetic */ void d(hz1 hz1Var) {
        fy1 fy1Var = this.f9202c;
        fy1Var.getClass();
        fy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        long jE = this.f9201b.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f9205f;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        long jF = this.f9201b.f();
        if (jF != Long.MIN_VALUE) {
            long j10 = this.f9205f;
            if (j10 == Long.MIN_VALUE || jF < j10) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final mz1 g() {
        return this.f9201b.g();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void h() {
        this.f9201b.h();
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final void i(gy1 gy1Var) {
        fy1 fy1Var = this.f9202c;
        fy1Var.getClass();
        fy1Var.i(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        return this.f9201b.j(yt1Var);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long k(long j10) {
        this.f9204e = -9223372036854775807L;
        for (ox1 ox1Var : this.f9203d) {
            if (ox1Var != null) {
                ox1Var.f8853b = false;
            }
        }
        long jK = this.f9201b.k(j10);
        long j11 = this.f9205f;
        long jMax = Math.max(jK, 0L);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void l(fy1 fy1Var, long j10) {
        this.f9202c = fy1Var;
        this.f9201b.l(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long m() {
        if (o()) {
            long j10 = this.f9204e;
            this.f9204e = -9223372036854775807L;
            long jM = m();
            return jM != -9223372036854775807L ? jM : j10;
        }
        long jM2 = this.f9201b.m();
        if (jM2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f9205f;
        long jMax = Math.max(jM2, 0L);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
        this.f9201b.n(j10);
    }

    public final boolean o() {
        return this.f9204e != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        return this.f9201b.q();
    }
}
