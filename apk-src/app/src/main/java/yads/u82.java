package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43602a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ep2 f43603b;

    public static final ep2 a(Context context) {
        ep2 ep2VarA;
        ep2 ep2Var = f43603b;
        if (ep2Var != null) {
            return ep2Var;
        }
        synchronized (f43602a) {
            ep2VarA = f43603b;
            if (ep2VarA == null) {
                ep2VarA = fp2.a(context, m82.a(context));
                f43603b = ep2VarA;
                ep2VarA.a();
            }
        }
        return ep2VarA;
    }
}
