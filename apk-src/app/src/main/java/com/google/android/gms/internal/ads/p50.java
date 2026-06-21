package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8929a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f8930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d60 f8931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f8932d;

    public p50(d60 d60Var, ls1 ls1Var, ls1 ls1Var2) {
        this.f8931c = d60Var;
        this.f8930b = ls1Var;
        this.f8932d = ls1Var2;
    }

    public jl0 a() {
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        iq0 iq0VarA = this.f8931c.a();
        return new jl0(gxVar, iq0VarA, ((Integer) this.f8932d.j()).intValue());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f8929a) {
            case 0:
                return new o50((Context) this.f8932d.j(), ((j10) this.f8930b).a(), this.f8931c.a(), 0);
            case 1:
                return new we0((ff0) this.f8930b.j(), this.f8931c.a(), (String) this.f8932d.j());
            default:
                return a();
        }
    }

    public p50(ls1 ls1Var, d60 d60Var, ls1 ls1Var2) {
        this.f8930b = ls1Var;
        this.f8931c = d60Var;
        this.f8932d = ls1Var2;
    }

    public p50(ls1 ls1Var, qs1 qs1Var, d60 d60Var) {
        this.f8932d = ls1Var;
        this.f8930b = qs1Var;
        this.f8931c = d60Var;
    }
}
