package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cp0 {
    public static ep0 a() {
        ep0 ep0Var;
        ep0 ep0Var2 = ep0.f38221d;
        if (ep0Var2 != null) {
            return ep0Var2;
        }
        synchronized (ep0.f38220c) {
            ep0Var = ep0.f38221d;
            if (ep0Var == null) {
                ep0Var = new ep0();
                ep0.f38221d = ep0Var;
            }
        }
        return ep0Var;
    }
}
