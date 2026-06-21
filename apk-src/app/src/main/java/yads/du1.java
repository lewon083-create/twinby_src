package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class du1 {
    public final eu1 a() {
        eu1 eu1Var;
        eu1 eu1Var2 = eu1.f38255f;
        if (eu1Var2 != null) {
            return eu1Var2;
        }
        synchronized (this) {
            eu1Var = eu1.f38255f;
            if (eu1Var == null) {
                eu1Var = new eu1();
                eu1.f38255f = eu1Var;
            }
        }
        return eu1Var;
    }
}
