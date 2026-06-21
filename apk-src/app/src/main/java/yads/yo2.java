package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yo2 {
    public static zo2 a() {
        zo2 zo2Var;
        zo2 zo2Var2 = zo2.f45505b;
        if (zo2Var2 != null) {
            return zo2Var2;
        }
        synchronized (zo2.f45504a) {
            zo2Var = zo2.f45505b;
            if (zo2Var == null) {
                zo2Var = new zo2();
                zo2.f45505b = zo2Var;
            }
        }
        return zo2Var;
    }
}
