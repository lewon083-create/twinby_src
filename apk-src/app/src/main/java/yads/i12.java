package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz1 f39405a;

    public /* synthetic */ i12() {
        this(new rz1());
    }

    public static ArrayList b(f12 f12Var) {
        List list = f12Var.f38323a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((hy1) it.next()).f39365c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List a(f12 f12Var) {
        List<hy1> list = f12Var.f38323a;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        for (hy1 hy1Var : list) {
            kj kjVar = this.f39405a.f42768a;
            List list2 = hy1Var.f39364b;
            kjVar.getClass();
            Set setA = kj.a(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = setA.iterator();
            while (it.hasNext()) {
                String str = ((w41) it.next()).f44276d;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            arrayList.add(CollectionsKt.R(arrayList3));
        }
        return kotlin.collections.t.k(arrayList);
    }

    public i12(rz1 rz1Var) {
        this.f39405a = rz1Var;
    }
}
