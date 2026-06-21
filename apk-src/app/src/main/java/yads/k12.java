package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k12 implements hq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f40043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v22 f40044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lr1 f40045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9 f40046d;

    public /* synthetic */ k12(d4 d4Var) {
        this(d4Var, new h22(), new lr1());
    }

    public final ho2 a() {
        ho2 ho2Var;
        ho2 ho2Var2 = new ho2((Map) null, 3);
        v9 v9Var = this.f40046d;
        if (v9Var == null) {
            return ho2Var2;
        }
        ho2 ho2VarA = io2.a(ho2Var2, this.f40044b.a(v9Var, this.f40043a, (f12) v9Var.f43948t));
        sq1 sq1Var = this.f40043a.f37622k;
        lr1 lr1Var = this.f40045c;
        if (sq1Var != null) {
            lr1Var.getClass();
            ho2Var = lr1.a(sq1Var);
        } else {
            lr1Var.getClass();
            ho2Var = new ho2(new LinkedHashMap(), 2);
            ho2Var.b(do2.f37869a, "adapter");
        }
        return io2.a(ho2VarA, ho2Var);
    }

    public k12(d4 d4Var, v22 v22Var, lr1 lr1Var) {
        this.f40043a = d4Var;
        this.f40044b = v22Var;
        this.f40045c = lr1Var;
    }
}
