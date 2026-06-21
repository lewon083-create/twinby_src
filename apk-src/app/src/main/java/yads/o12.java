package yads;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o12 {
    public static p12 a() {
        p12 p12Var;
        p12 p12Var2 = p12.f41801c;
        if (p12Var2 != null) {
            return p12Var2;
        }
        synchronized (p12.f41800b) {
            p12Var = p12.f41801c;
            if (p12Var == null) {
                p12Var = new p12(new WeakHashMap());
                p12.f41801c = p12Var;
            }
        }
        return p12Var;
    }
}
