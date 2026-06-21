package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y41 f39873a;

    public /* synthetic */ jj() {
        this(new y41());
    }

    public final ArrayList a(List list, Map map) {
        qn1 qn1Var;
        List list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f41542c;
            String str = oiVar.f41541b;
            if ("image".equals(str) && (obj instanceof w41)) {
                this.f39873a.getClass();
                if (y41.a((w41) obj, map)) {
                    arrayList.add(oiVar);
                }
            } else if ("media".equals(str) && (obj instanceof qn1) && (list2 = (qn1Var = (qn1) obj).f42352c) != null) {
                w41 w41Var = list2 != null ? (w41) CollectionsKt.firstOrNull(list2) : null;
                vd3 vd3Var = qn1Var.f42351b;
                qj1 qj1Var = qn1Var.f42350a;
                if (vd3Var == null && qj1Var == null) {
                    if (w41Var != null) {
                        this.f39873a.getClass();
                        if (y41.a(w41Var, map)) {
                        }
                    }
                }
                arrayList.add(oiVar);
            } else {
                arrayList.add(oiVar);
            }
        }
        return arrayList;
    }

    public jj(y41 y41Var) {
        this.f39873a = y41Var;
    }
}
