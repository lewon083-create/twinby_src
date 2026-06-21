package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cu1 {
    public static bu1 a(Context context) {
        ot1 ot1Var = new ot1(new sd3());
        e2 e2Var = new e2();
        ah ahVar = new ah(context);
        wb1 e3 = null;
        try {
            ot1Var.a(xt1.f44800b);
            e = null;
        } catch (wb1 e7) {
            e = e7;
        }
        try {
            e2Var.a(context);
            e = null;
        } catch (wb1 e10) {
            e = e10;
        }
        try {
            jc2.a(context);
            e = null;
        } catch (wb1 e11) {
            e = e11;
        }
        try {
            ahVar.a();
        } catch (wb1 e12) {
            e3 = e12;
        }
        wb1[] elements = {e, e, e, e3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListL = kotlin.collections.p.l(elements);
        return !arrayListL.isEmpty() ? new au1(arrayListL) : zt1.f45528a;
    }
}
