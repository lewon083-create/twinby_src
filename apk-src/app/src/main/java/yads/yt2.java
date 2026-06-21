package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yt2 {
    public static zt2 a() {
        zt2 zt2Var;
        zt2 zt2Var2 = zt2.f45530c;
        if (zt2Var2 != null) {
            return zt2Var2;
        }
        synchronized (zt2.f45529b) {
            zt2Var = zt2.f45530c;
            if (zt2Var == null) {
                zt2Var = new zt2();
                zt2.f45530c = zt2Var;
            }
        }
        return zt2Var;
    }
}
