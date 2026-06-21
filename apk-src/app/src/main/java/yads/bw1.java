package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bw1 implements p11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv1 f37163a;

    public bw1(yv1 yv1Var) {
        this.f37163a = yv1Var;
    }

    @Override // yads.p11
    public final void a(jb2 jb2Var, Map map) {
        p11 p11Var;
        yv1 yv1Var = this.f37163a;
        jb2 jb2Var2 = yv1Var.f45158a;
        c53 c53Var = new c53(jb2Var2);
        yv1Var.f45161d.getClass();
        ul3 ul3Var = new ul3(ql3.a(jb2Var2));
        cq0 cq0VarA = yv1Var.f45163f.a(yv1Var.f45158a);
        eq0 eq0Var = new eq0(cq0VarA.f37474a, cq0VarA.f37475b);
        jl3 jl3Var = jl3.f39901c;
        yv1Var.f45173q = jl3Var;
        yv1Var.f45159b.a(jl3Var, ul3Var, eq0Var, c53Var);
        yv1Var.f45159b.b("notifyReadyEvent();");
        jw1 jw1Var = yv1Var.f45168l;
        if (jw1Var == null || (p11Var = (p11) jw1Var.f39999a.get()) == null) {
            return;
        }
        p11Var.a(jb2Var, map);
    }

    @Override // yads.p11
    public final void a(String str) throws vv1 {
        this.f37163a.b(str);
    }

    @Override // yads.p11
    public final void a() {
        this.f37163a.a();
    }

    @Override // yads.p11
    public final void a(boolean z5) {
        yv1 yv1Var = this.f37163a;
        yv1Var.getClass();
        yv1Var.f45159b.a(new ul3(z5));
        if (z5) {
            gq0 gq0Var = yv1Var.f45166j;
            if (gq0Var.f38850e == null) {
                fq0 fq0Var = new fq0(gq0Var.f38849d, gq0Var.f38846a, gq0Var.f38847b, gq0Var.f38848c);
                gq0Var.f38850e = fq0Var;
                gq0Var.f38849d.post(fq0Var);
                return;
            }
            return;
        }
        gq0 gq0Var2 = yv1Var.f45166j;
        gq0Var2.f38849d.removeCallbacksAndMessages(null);
        gq0Var2.f38850e = null;
        cq0 cq0VarA = yv1Var.f45163f.a(yv1Var.f45158a);
        if (Intrinsics.a(cq0VarA, yv1Var.f45174r)) {
            return;
        }
        yv1Var.f45174r = cq0VarA;
        yv1Var.f45159b.a(new eq0(cq0VarA.f37474a, cq0VarA.f37475b));
    }
}
