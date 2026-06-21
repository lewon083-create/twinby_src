package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class io2 {
    public static final ho2 a(ho2 ho2Var, ho2 ho2Var2) {
        if (ho2Var2 == null) {
            return new ho2(ho2Var.f39286a, ho2Var.f39287b);
        }
        c cVar = ho2Var.f39287b;
        if (cVar == null) {
            cVar = ho2Var2.f39287b;
        }
        return new ho2(kotlin.collections.j0.i(ho2Var.f39286a, ho2Var2.f39286a), cVar);
    }
}
