package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class re3 {
    public static se3 a(Context context) {
        se3 se3Var;
        se3 se3Var2 = se3.f42921c;
        if (se3Var2 != null) {
            return se3Var2;
        }
        synchronized (se3.f42920b) {
            se3Var = se3.f42921c;
            if (se3Var == null) {
                se3Var = new se3(xp3.a(context, 1));
                se3.f42921c = se3Var;
            }
        }
        return se3Var;
    }
}
