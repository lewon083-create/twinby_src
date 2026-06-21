package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class od0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f8667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f8668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f8669d;

    public /* synthetic */ od0(int i, ls1 ls1Var, ls1 ls1Var2, Object obj) {
        this.f8666a = i;
        this.f8667b = ls1Var;
        this.f8668c = ls1Var2;
        this.f8669d = (qs1) obj;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        switch (this.f8666a) {
            case 0:
                return new nd0((qd0) this.f8667b.j(), (wd0) this.f8669d.j(), ((Integer) this.f8668c.j()).intValue());
            case 1:
                return new b11((File) this.f8667b.j(), (cv0) this.f8668c.j(), (j21) this.f8669d.j());
            default:
                js1 js1VarB = ls1.b(this.f8667b);
                js1 js1VarB2 = ls1.b(this.f8668c);
                if (true == ((ux0) this.f8669d.j()).V()) {
                    js1VarB = js1VarB2;
                }
                n11 n11Var = (n11) js1VarB.j();
                gr.G(n11Var);
                return n11Var;
        }
    }

    public od0(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3) {
        this.f8666a = 0;
        this.f8667b = ls1Var;
        this.f8669d = ls1Var2;
        this.f8668c = ls1Var3;
    }
}
