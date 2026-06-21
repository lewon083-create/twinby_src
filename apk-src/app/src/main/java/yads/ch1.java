package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ch1 {
    public static dh1 a(Context context) {
        if (dh1.f37762g == null) {
            synchronized (dh1.f37761f) {
                try {
                    if (dh1.f37762g == null) {
                        dh1.f37762g = new dh1(context, new gh1(), new fh1(), fw2.a(), new rx2());
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        dh1 dh1Var = dh1.f37762g;
        if (dh1Var != null) {
            return dh1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
