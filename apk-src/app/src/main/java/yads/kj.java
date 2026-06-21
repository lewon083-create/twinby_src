package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f41542c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            List listC = obj instanceof w41 ? kotlin.collections.r.c(obj) : obj instanceof qn1 ? ((qn1) obj).f42352c : null;
            if (listC != null) {
                arrayList2.add(listC);
            }
        }
        return CollectionsKt.V(kotlin.collections.t.k(arrayList2));
    }
}
