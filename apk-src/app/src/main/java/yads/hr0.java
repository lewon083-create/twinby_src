package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ir0 f39295a;

    public static final synchronized ir0 a(Context context) {
        ir0 ir0Var;
        ir0Var = f39295a;
        if (ir0Var == null) {
            ir0Var = new ir0(context);
            f39295a = ir0Var;
        }
        return ir0Var;
    }
}
