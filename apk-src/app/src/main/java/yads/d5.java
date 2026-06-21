package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d5 {
    public static e5 a() {
        e5 e5Var;
        e5 e5Var2 = e5.f38011d;
        if (e5Var2 != null) {
            return e5Var2;
        }
        synchronized (e5.f38010c) {
            e5Var = e5.f38011d;
            if (e5Var == null) {
                e5Var = new e5();
                e5.f38011d = e5Var;
            }
        }
        return e5Var;
    }
}
