package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7395h;
    public final Object i;

    public l5(tk0 tk0Var, tk0 tk0Var2, boolean z5) throws eb {
        this.i = tk0Var;
        this.f7395h = tk0Var2;
        this.f7392e = z5;
        tk0Var2.E(12);
        this.f7388a = tk0Var2.h();
        tk0Var.E(12);
        this.f7394g = tk0Var.h();
        rs.i("first_chunk must be 1", tk0Var.b() == 1);
        this.f7389b = -1;
    }

    public boolean a() {
        m3.p pVar = (m3.p) this.f7395h;
        m3.p pVar2 = (m3.p) this.i;
        int i = this.f7389b + 1;
        this.f7389b = i;
        if (i == this.f7388a) {
            return false;
        }
        this.f7391d = this.f7392e ? pVar.F() : pVar.B();
        if (this.f7389b == this.f7393f) {
            this.f7390c = pVar2.D();
            pVar2.N(4);
            int i10 = this.f7394g - 1;
            this.f7394g = i10;
            this.f7393f = i10 > 0 ? pVar2.D() - 1 : -1;
        }
        return true;
    }

    public boolean b() {
        tk0 tk0Var = (tk0) this.f7395h;
        int i = this.f7389b + 1;
        this.f7389b = i;
        if (i == this.f7388a) {
            return false;
        }
        this.f7391d = this.f7392e ? tk0Var.j() : tk0Var.P();
        if (this.f7389b == this.f7393f) {
            tk0 tk0Var2 = (tk0) this.i;
            this.f7390c = tk0Var2.h();
            tk0Var2.G(4);
            int i10 = this.f7394g - 1;
            this.f7394g = i10;
            this.f7393f = i10 > 0 ? (-1) + tk0Var2.h() : -1;
        }
        return true;
    }

    public l5(m3.p pVar, m3.p pVar2, boolean z5) throws j3.d0 {
        this.i = pVar;
        this.f7395h = pVar2;
        this.f7392e = z5;
        pVar2.M(12);
        this.f7388a = pVar2.D();
        pVar.M(12);
        this.f7394g = pVar.D();
        q4.b.e("first_chunk must be 1", pVar.m() == 1);
        this.f7389b = -1;
    }
}
