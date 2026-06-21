package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er1 f44116a;

    public vr1(er1 er1Var) {
        this.f44116a = er1Var;
    }

    public static void a(ArrayList arrayList, String str) {
        int iMax = Math.max(4, 44 - str.length());
        int i = iMax / 2;
        String strK = kotlin.text.a0.k(i, "-");
        String strK2 = kotlin.text.a0.k((iMax % 2) + i, "-");
        String strK3 = kotlin.text.a0.k(1, " ");
        arrayList.add(new ur1(strK + strK3 + str + strK3 + strK2, tr1.f43425b));
    }

    public static void a(ArrayList arrayList, List list, String str, boolean z5) {
        tr1 tr1Var;
        String str2;
        String str3;
        if (z5) {
            tr1Var = tr1.f43425b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            tr1Var = tr1.f43426c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((cr1) it.next()).a());
        }
        String strI = CollectionsKt.I(arrayList2, null, str2.concat(": "), null, null, 61);
        String strK = gf.a.k(str, ": ", str3);
        arrayList.add(new ur1(strI, tr1Var));
        arrayList.add(new ur1(strK, tr1Var));
    }

    public static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !StringsKt.D(str)) {
            arrayList.add(new ur1("SDK Version: ".concat(str), tr1.f43425b));
        }
        if (str2 == null || StringsKt.D(str2)) {
            return;
        }
        arrayList.add(new ur1("ADAPTERS Version: ".concat(str2), tr1.f43425b));
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dr1 dr1Var = (dr1) it.next();
            a(arrayList2, dr1Var.f37879a);
            String str = dr1Var.f37881c;
            String str2 = ((cr1) CollectionsKt.D(dr1Var.f37882d)).f37482b;
            this.f44116a.getClass();
            boolean zA = er1.a(dr1Var);
            if (zA) {
                a(arrayList2, str, str2);
            }
            a(arrayList2, dr1Var.f37882d, dr1Var.f37879a, zA);
        }
        return arrayList2;
    }
}
