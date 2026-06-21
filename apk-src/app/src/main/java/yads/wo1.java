package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up1 f44436a;

    public wo1(up1 up1Var) {
        this.f44436a = up1Var;
    }

    public final ArrayList a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String strB = this.f44436a.b((sq1) obj);
            Object arrayList2 = linkedHashMap.get(strB);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(strB, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sq1 sq1Var = ((String) entry.getKey()) != null ? (sq1) CollectionsKt.D((List) entry.getValue()) : null;
            if (sq1Var != null) {
                arrayList3.add(sq1Var);
            }
        }
        return arrayList3;
    }
}
