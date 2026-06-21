package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jp0 {
    public static lp0 a() {
        lp0 lp0Var;
        lp0 lp0Var2 = lp0.f40633c;
        if (lp0Var2 != null) {
            return lp0Var2;
        }
        synchronized (lp0.f40632b) {
            lp0Var = lp0.f40633c;
            if (lp0Var == null) {
                lp0Var = new lp0();
                lp0.f40633c = lp0Var;
            }
        }
        return lp0Var;
    }
}
