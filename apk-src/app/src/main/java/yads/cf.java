package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class cf {
    public static final ct1 a(Context context, fq3 fq3Var) {
        su3 su3Var = su3.f43085a;
        if (et1.f38253b == null) {
            synchronized (ct1.f37494e) {
                try {
                    if (et1.f38253b == null) {
                        Context contextA = uz.a(context);
                        et1.f38253b = et1.a(contextA, et1.f38252a.a(contextA), fq3Var);
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        ct1 ct1Var = et1.f38253b;
        if (ct1Var != null) {
            return ct1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
