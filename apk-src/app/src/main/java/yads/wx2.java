package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ wx2 f44512a = new wx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44513b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile yx2 f44514c;

    public static xx2 a(Context context) {
        yx2 yx2Var;
        yx2 yx2Var2 = f44514c;
        if (yx2Var2 != null) {
            return yx2Var2;
        }
        synchronized (f44513b) {
            yx2Var = f44514c;
            if (yx2Var == null) {
                yx2Var = new yx2(wg1.a(context, "YadPreferenceFile"));
                f44514c = yx2Var;
            }
        }
        return yx2Var;
    }
}
