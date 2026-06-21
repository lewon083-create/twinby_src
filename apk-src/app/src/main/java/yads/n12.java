package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv f41133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf0 f41134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22 f41135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f41136d;

    public n12(yf0 yf0Var, a22 a22Var, Map map) {
        this.f41133a = iv.f39647a;
        this.f41134b = yf0Var;
        this.f41135c = a22Var;
        this.f41136d = map;
    }

    public final void a() {
        for (pi piVar : this.f41136d.values()) {
            if (piVar != null) {
                piVar.a();
            }
        }
    }

    public final View b() {
        return this.f41135c.a();
    }

    public final pi a(oi oiVar) {
        if (oiVar != null) {
            return (pi) this.f41136d.get(oiVar.f41540a);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n12(b22 b22Var, d4 d4Var, nu2 nu2Var, oi2 oi2Var, z51 z51Var, zz1 zz1Var, cj cjVar, f42 f42Var, j32 j32Var, v9 v9Var, o72 o72Var, hz1 hz1Var, co1 co1Var, py2 py2Var, t20 t20Var, yf0 yf0Var) {
        a22 a22VarA = b22Var.a();
        this(yf0Var, a22VarA, new ri(a22VarA, oi2Var, new vn1(cjVar, d4Var, z51Var, zz1Var.c(), hz1Var, co1Var, new tn3(a22VarA), py2Var), f42Var, j32Var, v9Var, o72Var, ((lu3) nu2Var).a(), t20Var).a());
    }
}
