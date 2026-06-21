package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr1 f42001a;

    public pr1(qr1 qr1Var) {
        this.f42001a = qr1Var;
    }

    public final ArrayList a(List list) {
        jr1 jr1Var;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g80 g80Var = (g80) it.next();
            List<String> list2 = g80Var.f38674e;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(list2, 10));
            for (String str : list2) {
                List listJ = StringsKt.J(str, new char[]{'.'});
                String str2 = (String) CollectionsKt.F(kotlin.collections.s.e(listJ) - 1, listJ);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new qq1(str2, str));
            }
            String str3 = g80Var.f38671b;
            String str4 = g80Var.f38670a;
            if (str4 != null) {
                jr1.f39937c.getClass();
                jr1Var = (jr1) jr1.f39938d.get(str4);
                if (jr1Var == null) {
                    jr1Var = jr1.f39957x;
                }
            } else {
                jr1Var = jr1.f39957x;
            }
            arrayList.add(new rq1(str3, jr1Var, arrayList2));
        }
        return this.f42001a.a(arrayList);
    }
}
