package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ku1 {
    public static lu1 a() {
        lu1 lu1Var;
        lu1 lu1Var2 = lu1.f40684b;
        if (lu1Var2 != null) {
            return lu1Var2;
        }
        synchronized (lu1.f40685c) {
            lu1Var = lu1.f40684b;
            if (lu1Var == null) {
                lu1Var = new lu1();
                lu1.f40684b = lu1Var;
            }
        }
        return lu1Var;
    }
}
