package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fw2 {
    public static gw2 a() {
        gw2 gw2Var;
        gw2 gw2Var2 = gw2.f38919k;
        if (gw2Var2 != null) {
            return gw2Var2;
        }
        synchronized (gw2.f38918j) {
            gw2Var = gw2.f38919k;
            if (gw2Var == null) {
                gw2Var = new gw2();
                gw2.f38919k = gw2Var;
            }
        }
        return gw2Var;
    }
}
