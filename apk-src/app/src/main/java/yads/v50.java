package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er1 f43896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pr1 f43897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j50 f43898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr1 f43899d;

    public v50(er1 er1Var, pr1 pr1Var, j50 j50Var, mr1 mr1Var) {
        this.f43896a = er1Var;
        this.f43897b = pr1Var;
        this.f43898c = j50Var;
        this.f43899d = mr1Var;
    }

    public final u50 a(b80 b80Var, j80 j80Var) {
        List list;
        List list2;
        List list3;
        List list4;
        Iterator it;
        h50 h50Var;
        Object next;
        a50 y40Var;
        if (j80Var == null || (list = j80Var.f39775g) == null) {
            list = kotlin.collections.b0.f27475b;
        }
        m50 m50Var = b80Var.f36954a;
        t80 t80Var = b80Var.f36955b;
        b40 b40Var = new b40(j80Var != null ? j80Var.f39769a : null, j80Var != null ? j80Var.f39772d : null, j80Var != null ? j80Var.f39771c : null);
        List<dr1> list5 = b80Var.f36956c;
        ArrayList arrayListA = this.f43897b.a(list);
        if (!arrayListA.isEmpty()) {
            list5 = arrayListA;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list5, 10));
        for (dr1 dr1Var : list5) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.a(((g80) next).f38671b, dr1Var.f37879a)) {
                    break;
                }
            }
            g80 g80Var = (g80) next;
            this.f43896a.getClass();
            boolean zA = er1.a(dr1Var);
            this.f43899d.getClass();
            List list6 = dr1Var.f37882d;
            if ((list6 instanceof Collection) && list6.isEmpty()) {
                y40Var = x40.f44597a;
            } else {
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    if (!((cr1) it3.next()).f37483c) {
                        List list7 = dr1Var.f37882d;
                        if ((list7 instanceof Collection) && list7.isEmpty()) {
                            y40Var = z40.f45247a;
                        } else {
                            Iterator it4 = list7.iterator();
                            while (it4.hasNext()) {
                                if (((cr1) it4.next()).f37483c) {
                                    fr1 fr1Var = fr1.f38541b;
                                    y40Var = new y40();
                                    break;
                                }
                            }
                            y40Var = z40.f45247a;
                        }
                    }
                }
                y40Var = x40.f44597a;
            }
            a50 a50Var = y40Var;
            String str = dr1Var.f37879a;
            String str2 = g80Var != null ? g80Var.f38672c : null;
            cr1 cr1Var = (cr1) CollectionsKt.firstOrNull(dr1Var.f37882d);
            String str3 = cr1Var != null ? cr1Var.f37482b : null;
            String str4 = g80Var != null ? g80Var.f38675f : null;
            String str5 = dr1Var.f37881c;
            List list8 = dr1Var.f37882d;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(list8, 10));
            Iterator it5 = list8.iterator();
            while (it5.hasNext()) {
                arrayList2.add(((cr1) it5.next()).f37481a);
            }
            arrayList.add(new b50(str, str2, zA, str3, str4, str5, a50Var, arrayList2));
        }
        d50 d50Var = new d50(arrayList);
        t50 t50Var = b80Var.f36957d;
        u70 u70Var = b80Var.f36958e;
        if (j80Var == null || (list2 = j80Var.f39774f) == null) {
            list2 = kotlin.collections.b0.f27475b;
        }
        j50 j50Var = this.f43898c;
        List list9 = j80Var != null ? j80Var.f39773e : null;
        j50Var.getClass();
        if (list9 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list9) {
                g50 g50Var = (g50) obj;
                if (g50Var.f38657a != null || g50Var.f38658b != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(kotlin.collections.t.j(arrayList3, 10));
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                g50 g50Var2 = (g50) it6.next();
                String str6 = g50Var2.f38657a;
                String str7 = g50Var2.f38658b;
                h50[] h50VarArrValues = h50.values();
                int length = h50VarArrValues.length;
                List list10 = list2;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        it = it6;
                        h50Var = null;
                        break;
                    }
                    int i10 = length;
                    h50Var = h50VarArrValues[i];
                    int i11 = i;
                    it = it6;
                    if (Intrinsics.a(g50Var2.f38659c, h50Var.f39031b)) {
                        break;
                    }
                    i = i11 + 1;
                    it6 = it;
                    length = i10;
                }
                if (h50Var == null) {
                    h50Var = h50.f39029c;
                }
                arrayList4.add(new i50(str6, str7, h50Var));
                list2 = list10;
                it6 = it;
            }
            list3 = list2;
            list4 = arrayList4;
        } else {
            list3 = list2;
            list4 = kotlin.collections.b0.f27475b;
        }
        return new u50(m50Var, t80Var, b40Var, d50Var, t50Var, u70Var, list3, list4);
    }
}
