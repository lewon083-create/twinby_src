package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f42548a;

    public rc2(w5 w5Var) {
        this.f42548a = w5Var;
    }

    public final LinkedHashMap a(Set set) {
        List listR;
        w5 w5Var = this.f42548a;
        synchronized (w5Var.f44281a) {
            listR = CollectionsKt.R(w5Var.f44284d);
        }
        ek.g gVarB = ek.u.b(CollectionsKt.w(listR), new qc2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ek.f fVar = new ek.f(gVarB);
        while (fVar.hasNext()) {
            u5 u5Var = (u5) fVar.next();
            String str = u5Var.f43558a.f43895b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(u5Var.f43559b);
        }
        return linkedHashMap;
    }
}
