package yads;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ac3 {
    public static final void a(ru3 ru3Var, go2 go2Var) {
        String strA;
        Set setB;
        try {
            c cVarA = go2Var.a();
            if (cVarA == null || (strA = cVarA.a()) == null) {
                strA = "";
            }
            c cVarA2 = go2Var.a();
            if (cVarA2 == null || (setB = cVarA2.b()) == null) {
                setB = kotlin.collections.d0.f27478b;
            }
            ru3Var.a(strA);
            ru3Var.a(setB);
            Objects.toString(setB);
        } catch (Throwable th2) {
            th2.toString();
        }
    }
}
