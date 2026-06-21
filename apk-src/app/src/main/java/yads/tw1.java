package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tw1 {
    public final uw1 a(Context context) {
        uw1 uw1Var;
        uw1 uw1Var2 = uw1.f43798d;
        if (uw1Var2 != null) {
            return uw1Var2;
        }
        synchronized (this) {
            try {
                uw1Var = uw1.f43798d;
                if (uw1Var == null) {
                    pt2 pt2VarA = fw2.a().a(context);
                    uw1Var = new uw1(pt2VarA != null ? pt2VarA.f42020b : 0);
                    uw1.f43798d = uw1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uw1Var;
    }
}
