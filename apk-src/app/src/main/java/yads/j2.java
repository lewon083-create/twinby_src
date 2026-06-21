package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 {
    public final k2 a() {
        k2 k2Var;
        k2 k2Var2 = k2.f40048c;
        if (k2Var2 != null) {
            return k2Var2;
        }
        synchronized (this) {
            k2Var = k2.f40048c;
            if (k2Var == null) {
                k2Var = new k2();
                k2.f40048c = k2Var;
            }
        }
        return k2Var;
    }
}
