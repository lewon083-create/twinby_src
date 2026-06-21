package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y1 {
    public static z1 a() {
        z1 z1Var;
        z1 z1Var2 = z1.f45220c;
        if (z1Var2 != null) {
            return z1Var2;
        }
        synchronized (z1.f45219b) {
            z1Var = z1.f45220c;
            if (z1Var == null) {
                z1Var = new z1();
                z1.f45220c = z1Var;
            }
        }
        return z1Var;
    }
}
