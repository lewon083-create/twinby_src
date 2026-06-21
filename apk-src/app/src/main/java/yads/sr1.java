package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sr1 {
    public static final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ur1 ur1Var = (ur1) it.next();
            int iOrdinal = ur1Var.f43760b.ordinal();
            if (iOrdinal == 0) {
                nc1.b(ur1Var.f43759a, new Object[0]);
            } else if (iOrdinal == 1) {
                nc1.a(ur1Var.f43759a, new Object[0]);
            }
        }
    }
}
