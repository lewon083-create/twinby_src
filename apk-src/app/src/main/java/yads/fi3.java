package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fi3 {
    public final gi3 a(Context context) {
        gi3 gi3Var;
        gi3 gi3Var2 = gi3.f38769d;
        if (gi3Var2 != null) {
            return gi3Var2;
        }
        synchronized (this) {
            gi3Var = gi3.f38769d;
            if (gi3Var == null) {
                gi3Var = new gi3(context);
                gi3.f38769d = gi3Var;
            }
        }
        return gi3Var;
    }
}
