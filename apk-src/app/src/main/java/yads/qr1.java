package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42377a;

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rq1 rq1Var = (rq1) it.next();
            List<qq1> list2 = rq1Var.f42701c;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(list2, 10));
            for (qq1 qq1Var : list2) {
                try {
                    if (qm2.a(qq1Var.f42372b, new Object[0]) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception unused) {
                }
                arrayList2.add(new cr1(qq1Var.f42371a, null, false));
            }
            String str = this.f42377a;
            this.f42377a = null;
            arrayList.add(new dr1(rq1Var.f42699a, rq1Var.f42700b.f39959b, str, arrayList2));
        }
        return arrayList;
    }
}
