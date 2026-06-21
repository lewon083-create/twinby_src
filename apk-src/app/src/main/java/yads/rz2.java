package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rz2 implements v22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy1 f42769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f42770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f42771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wy f42772d;

    public rz2(hy1 hy1Var, cq2 cq2Var, n9 n9Var, wy wyVar) {
        this.f42769a = hy1Var;
        this.f42770b = cq2Var;
        this.f42771c = n9Var;
        this.f42772d = wyVar;
    }

    @Override // yads.v22
    public final ho2 a(v9 v9Var, d4 d4Var, f12 f12Var) {
        cq2 cq2Var = this.f42770b;
        hy1 hy1Var = this.f42769a;
        ho2 ho2VarA = cq2Var.a(v9Var, d4Var);
        if (f12Var != null) {
            List listA = cq2Var.f37477b.a(f12Var);
            if (!listA.isEmpty()) {
                ho2VarA.a(listA, "image_sizes");
            }
        }
        ho2VarA.b(hy1Var.f39365c, "ad_id");
        Map map = hy1Var.f39373l;
        if (map != null) {
            ho2VarA.f39286a.putAll(map);
        }
        ho2 ho2VarA2 = this.f42771c.a(d4Var.f37617e);
        return io2.a(io2.a(ho2VarA, ho2VarA2), this.f42772d.a(d4Var));
    }
}
