package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class im2 {
    public final jm2 a() {
        jm2 jm2Var;
        jm2 jm2Var2 = jm2.f39916d;
        if (jm2Var2 != null) {
            return jm2Var2;
        }
        synchronized (this) {
            jm2Var = jm2.f39916d;
            if (jm2Var == null) {
                jm2Var = new jm2();
                jm2.f39916d = jm2Var;
            }
        }
        return jm2Var;
    }
}
