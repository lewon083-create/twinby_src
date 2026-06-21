package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sn1 {
    public static Set a(hy1 hy1Var) {
        List list = hy1Var.f39364b;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f41542c);
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(qn1.class, "klass");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(qn1.class, "klass");
        for (Object obj : arrayList) {
            if (qn1.class.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return CollectionsKt.V(destination);
    }
}
