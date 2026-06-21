package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 extends xu implements x60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yj0 f12156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.i4 f12157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cw f12158d;

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void H(xa.a aVar) {
        com.google.android.gms.internal.measurement.i4 i4Var = this.f12157c;
        if (i4Var != null) {
            synchronized (i4Var) {
                ((jx) i4Var.f13783d).b(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void H1(xa.a aVar) {
        cw cwVar = this.f12158d;
        if (cwVar != null) {
            ci0 ci0Var = (ci0) cwVar.f4349e;
            ((tj0) cwVar.f4350f).f10628c.execute(new d1((eq0) cwVar.f4347c, (xp0) cwVar.f4348d, ci0Var, 8));
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void H3(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12634e.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void L(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12633d.F1();
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void O2(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12633d.A1(v60.f11256f);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void V(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.V(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void Y0(xa.a aVar, zu zuVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12634e.N(zuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void b4(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12634e.N(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void g2(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12632c.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void h0(xa.a aVar, int i) {
        cw cwVar = this.f12158d;
        if (cwVar != null) {
            u9.i.h("Fail to initialize adapter ".concat(String.valueOf(((ci0) cwVar.f4349e).f4216a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void i3(xa.a aVar, int i) {
        com.google.android.gms.internal.measurement.i4 i4Var = this.f12157c;
        if (i4Var != null) {
            i4Var.u(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.x60
    public final synchronized void n0(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f12157c = i4Var;
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final synchronized void s0(xa.a aVar) {
        yj0 yj0Var = this.f12156b;
        if (yj0Var != null) {
            yj0Var.f12631b.m();
        }
    }
}
