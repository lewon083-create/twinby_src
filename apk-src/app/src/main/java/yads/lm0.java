package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class lm0 {
    public static mm0 a(Context context) {
        mm0 mm0Var;
        mm0 mm0Var2 = mm0.f40958c;
        if (mm0Var2 != null) {
            return mm0Var2;
        }
        synchronized (mm0.f40959d) {
            mm0Var = mm0.f40958c;
            if (mm0Var == null) {
                mm0Var = new mm0(new km0(), xg.a(context.getApplicationContext()));
                mm0.f40958c = mm0Var;
            }
        }
        return mm0Var;
    }
}
