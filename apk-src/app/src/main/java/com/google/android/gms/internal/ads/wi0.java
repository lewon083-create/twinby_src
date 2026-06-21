package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 extends mr implements x60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nr f11813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.i4 f11814c;

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void B3(q9.x1 x1Var) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.B3(x1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void E2() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.E2();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void E3(String str, String str2) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.E3(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void G1(qn qnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void O(int i) {
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11814c;
        if (i4Var != null) {
            i4Var.u(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void U() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.U();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void W1(bv bvVar) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.W1(bvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void Y(int i) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.Y(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void Z() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void a0(String str) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.a0(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void c() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void c4(int i, String str) {
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11814c;
        if (i4Var != null) {
            synchronized (i4Var) {
                try {
                    if (!i4Var.f13781b) {
                        i4Var.f13781b = true;
                        if (str == null) {
                            str = dk0.c(i, ((ci0) i4Var.f13782c).f4216a);
                        }
                        i4Var.z(new q9.x1(i, str, StringUtils.UNDEFINED, null, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void d() {
        try {
            nr nrVar = this.f11813b;
            if (nrVar != null) {
                nrVar.d();
            }
            com.google.android.gms.internal.measurement.i4 i4Var = this.f11814c;
            if (i4Var != null) {
                synchronized (i4Var) {
                    ((jx) i4Var.f13783d).b(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void e0() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.e0();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void f() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void i() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void i1(q9.x1 x1Var) {
        com.google.android.gms.internal.measurement.i4 i4Var = this.f11814c;
        if (i4Var != null) {
            synchronized (i4Var) {
                if (!i4Var.f13781b) {
                    i4Var.f13781b = true;
                    i4Var.z(x1Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void m() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.m();
        }
    }

    public final synchronized void m4(ek0 ek0Var) {
        this.f11813b = ek0Var;
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void n() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.x60
    public final synchronized void n0(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f11814c = i4Var;
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void r() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void t1(zu zuVar) {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.t1(zuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final synchronized void y() {
        nr nrVar = this.f11813b;
        if (nrVar != null) {
            nrVar.y();
        }
    }
}
