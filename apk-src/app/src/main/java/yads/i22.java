package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i22 {
    public static j22 a() {
        j22 j22Var;
        j22 j22Var2 = j22.f39712b;
        if (j22Var2 != null) {
            return j22Var2;
        }
        synchronized (j22.f39711a) {
            j22Var = j22.f39712b;
            if (j22Var == null) {
                j22Var = new j22();
                j22.f39712b = j22Var;
            }
        }
        return j22Var;
    }
}
