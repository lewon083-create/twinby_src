package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z03 implements m72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45218a;

    public z03(List list) {
        this.f45218a = list;
    }

    @Override // yads.m72
    public final void a() {
    }

    @Override // yads.m72
    public final void a(n12 n12Var) {
    }

    @Override // yads.m72
    public final void a(n12 n12Var, gv gvVar) {
        List<oi> list = this.f45218a;
        if (list != null) {
            ob obVar = new ob(n12Var, gvVar);
            for (oi oiVar : list) {
                pi piVarA = n12Var.a(oiVar);
                if (piVarA == null) {
                    piVarA = null;
                }
                if (piVarA != null) {
                    piVarA.c(oiVar.f41542c);
                    piVarA.a(oiVar, obVar);
                }
            }
        }
    }
}
