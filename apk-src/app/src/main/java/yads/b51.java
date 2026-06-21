package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y41 f36935a = new y41();

    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f41542c;
            if (Intrinsics.a(oiVar.f41541b, "media") && (obj instanceof qn1) && (list2 = ((qn1) obj).f42352c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    this.f36935a.getClass();
                    if (y41.a((w41) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
