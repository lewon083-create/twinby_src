package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v82 {
    public final y82 a(Context context) {
        y82 y82Var;
        y82 y82Var2 = y82.f44951e;
        if (y82Var2 != null) {
            return y82Var2;
        }
        synchronized (this) {
            y82Var = y82.f44951e;
            if (y82Var == null) {
                y82Var = new y82(context, new l31());
                y82.f44951e = y82Var;
            }
        }
        return y82Var;
    }
}
