package androidx.camera.core.internal.compat.quirk;

import g0.a2;
import g0.w1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends w1 {
    static boolean d(a2 a2Var) {
        Iterator it = a2Var.j(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    default boolean a() {
        return true;
    }
}
