package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x92 {
    public final z92 a(Context context) {
        z92 z92Var;
        z92 z92Var2 = z92.i;
        if (z92Var2 != null) {
            return z92Var2;
        }
        synchronized (this) {
            z92Var = z92.i;
            if (z92Var == null) {
                z92Var = new z92(context);
                z92.i = z92Var;
            }
        }
        return z92Var;
    }
}
