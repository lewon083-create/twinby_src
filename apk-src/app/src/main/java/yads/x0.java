package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 {
    public static z0 a() {
        z0 z0Var;
        z0 z0Var2 = z0.f45210g;
        if (z0Var2 != null) {
            return z0Var2;
        }
        synchronized (z0.f45209f) {
            z0Var = z0.f45210g;
            if (z0Var == null) {
                z0Var = new z0();
                z0.f45210g = z0Var;
            }
        }
        return z0Var;
    }
}
