package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p43 {
    public static q43 a() {
        if (q43.f42184b == null) {
            synchronized (q43.f42185c) {
                try {
                    if (q43.f42184b == null) {
                        q43.f42184b = new q43();
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        q43 q43Var = q43.f42184b;
        if (q43Var != null) {
            return q43Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
