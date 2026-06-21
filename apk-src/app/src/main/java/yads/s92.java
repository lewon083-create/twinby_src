package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s92 {
    public static t92 a() {
        t92 t92Var;
        t92 t92Var2 = t92.f43248d;
        if (t92Var2 != null) {
            return t92Var2;
        }
        synchronized (t92.f43247c) {
            t92Var = t92.f43248d;
            if (t92Var == null) {
                t92Var = new t92(new da2());
                t92.f43248d = t92Var;
            }
        }
        return t92Var;
    }
}
