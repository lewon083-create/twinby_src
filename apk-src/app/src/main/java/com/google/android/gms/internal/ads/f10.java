package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f5171b;

    public /* synthetic */ f10(cw cwVar, ls1 ls1Var, int i) {
        this.f5170a = i;
        this.f5171b = ls1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        int i = this.f5170a;
        ls1 ls1Var = this.f5171b;
        switch (i) {
            case 0:
                te0 te0Var = (te0) ls1Var.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                Set setSingleton = ((Boolean) q9.s.f31967e.f31970c.a(al.f2918a2)).booleanValue() ? Collections.singleton(new s80(te0Var, gxVar)) : Collections.EMPTY_SET;
                gr.G(setSingleton);
                return setSingleton;
            case 1:
                return new bj0((gd0) ls1Var.j());
            case 2:
                return new wj0((gd0) ls1Var.j());
            case 3:
                jc0 jc0Var = (jc0) ls1Var.j();
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new qq0(jc0Var, gxVar2);
            case 4:
                return new o20();
            case 5:
                s80 s80Var = new s80((k40) ls1Var.j(), hx.f6285g);
                int i10 = d51.f4468d;
                return new e51(s80Var);
            case 6:
                Set setSingleton2 = Collections.singleton(new s80((k40) ls1Var.j(), hx.f6285g));
                gr.G(setSingleton2);
                return setSingleton2;
            case 7:
                return new s80((i40) ls1Var.j(), hx.f6284f);
            case 8:
                return new s80((i40) ls1Var.j(), hx.f6284f);
            case 9:
                Set setSingleton3 = Collections.singleton(new s80((k40) ls1Var.j(), hx.f6285g));
                gr.G(setSingleton3);
                return setSingleton3;
            case 10:
                p40 p40Var = (p40) ls1Var.j();
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new s80(p40Var, gxVar3);
            case 11:
                return new a50((w60) ls1Var.j());
            case 12:
                g70 g70Var = (g70) ls1Var.j();
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new s80(g70Var, gxVar4);
            case 13:
                g70 g70Var2 = (g70) ls1Var.j();
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new s80(g70Var2, gxVar5);
            case 14:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 15:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 16:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 17:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 18:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 19:
                return new s80((e50) ls1Var.j(), hx.f6285g);
            case 20:
                s80 s80Var2 = new s80((g50) ls1Var.j(), hx.f6285g);
                int i11 = d51.f4468d;
                return new e51(s80Var2);
            case 21:
                s80 s80Var3 = new s80((g50) ls1Var.j(), hx.f6285g);
                int i12 = d51.f4468d;
                return new e51(s80Var3);
            case 22:
                x80 x80Var = (x80) ls1Var.j();
                gx gxVar6 = hx.f6279a;
                gr.G(gxVar6);
                return new s80(x80Var, gxVar6);
            case 23:
                e30 e30Var = (e30) ls1Var.j();
                gx gxVar7 = hx.f6279a;
                gr.G(gxVar7);
                return new s80(e30Var, gxVar7);
            case 24:
                e30 e30Var2 = (e30) ls1Var.j();
                gx gxVar8 = hx.f6279a;
                gr.G(gxVar8);
                return new s80(e30Var2, gxVar8);
            case 25:
                e30 e30Var3 = (e30) ls1Var.j();
                gx gxVar9 = hx.f6279a;
                gr.G(gxVar9);
                return new s80(e30Var3, gxVar9);
            case 26:
                e30 e30Var4 = (e30) ls1Var.j();
                gx gxVar10 = hx.f6279a;
                gr.G(gxVar10);
                return new s80(e30Var4, gxVar10);
            case 27:
                e30 e30Var5 = (e30) ls1Var.j();
                gx gxVar11 = hx.f6279a;
                gr.G(gxVar11);
                return new s80(e30Var5, gxVar11);
            case 28:
                e30 e30Var6 = (e30) ls1Var.j();
                gx gxVar12 = hx.f6279a;
                gr.G(gxVar12);
                return new s80(e30Var6, gxVar12);
            default:
                e30 e30Var7 = (e30) ls1Var.j();
                gx gxVar13 = hx.f6279a;
                gr.G(gxVar13);
                return new s80(e30Var7, gxVar13);
        }
    }

    public /* synthetic */ f10(ls1 ls1Var, int i) {
        this.f5170a = i;
        this.f5171b = ls1Var;
    }
}
