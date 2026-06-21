package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gp3 implements vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo2 f38844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hp3 f38845b;

    public gp3(jp3 jp3Var, hp3 hp3Var) {
        this.f38844a = jp3Var;
        this.f38845b = hp3Var;
    }

    @Override // yads.vo2
    public final void a(ee3 ee3Var) {
        this.f38844a.a(ee3Var);
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        List listO = (List) obj;
        hp3 hp3Var = this.f38845b;
        lp3 lp3Var = hp3Var.f39291a.f41341a.f44660m;
        if (lp3Var != null) {
            if (!lp3Var.f40636b) {
                hp3Var.f39292b.getClass();
                listO = sg3.a(listO).f42603a;
            }
            if (!lp3Var.f40635a) {
                listO = CollectionsKt.O(listO, 1);
            }
            cp3 cp3Var = hp3Var.f39293c;
            cp3Var.getClass();
            int i = 10;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                xd3 xd3Var = (xd3) it.next();
                ap3 ap3Var = cp3Var.f37466b;
                List list = ap3Var.f36831a.f44650b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    kotlin.collections.x.m(arrayList2, ((b20) it2.next()).f36900d);
                }
                List<b20> list2 = xd3Var.f44650b;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.t.j(list2, i));
                for (b20 b20Var : list2) {
                    ap3Var.f36832b.getClass();
                    List list3 = b20Var.f36899c;
                    ArrayList arrayList4 = new ArrayList(kotlin.collections.t.j(list3, i));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((k21) it3.next()).f40050a);
                    }
                    LinkedHashSet linkedHashSetU = CollectionsKt.U(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        kotlin.collections.x.m(arrayList5, ((b20) it4.next()).f36899c);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (linkedHashSetU.add(((k21) obj2).f40050a)) {
                            arrayList6.add(obj2);
                        }
                    }
                    List list4 = b20Var.f36900d;
                    ArrayList arrayListL = CollectionsKt.L(b20Var.f36897a, b20Var.f36898b);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it5 = it;
                    ArrayList arrayList9 = new ArrayList();
                    String str = b20Var.f36904h;
                    arrayList7.addAll(arrayListL);
                    Collection collection = b20Var.f36899c;
                    if (collection == null) {
                        collection = kotlin.collections.b0.f27475b;
                    }
                    arrayList8.addAll(collection);
                    arrayList9.addAll(arrayList2);
                    String str2 = b20Var.f36902f;
                    q03 q03Var = b20Var.f36903g;
                    int i10 = b20Var.i;
                    arrayList8.addAll(arrayList6);
                    arrayList9.addAll(list4 == null ? kotlin.collections.b0.f27475b : list4);
                    String str3 = b20Var.f36905j;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : arrayList7) {
                        ArrayList arrayList11 = arrayList9;
                        int i11 = i10;
                        if (obj3 instanceof ml1) {
                            arrayList10.add(obj3);
                        }
                        arrayList9 = arrayList11;
                        i10 = i11;
                    }
                    ArrayList arrayList12 = arrayList9;
                    int i12 = i10;
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it6 = arrayList7.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Iterator it7 = it6;
                        if (next instanceof tc1) {
                            arrayList13.add(next);
                        }
                        it6 = it7;
                    }
                    arrayList3.add(new b20(arrayList10, arrayList13, arrayList8, arrayList12, null, str2, q03Var, str, i12, str3));
                    it = it5;
                    i = 10;
                }
                Iterator it8 = it;
                bp3 bp3Var = cp3Var.f37467c;
                xd3 xd3Var2 = cp3Var.f37465a;
                bp3Var.getClass();
                ge3 ge3Var = xd3Var.f44652d;
                ge3 ge3Var2 = xd3Var2.f44652d;
                ge3 ge3Var3 = new ge3(CollectionsKt.L(ge3Var.f38748a, ge3Var2.f38748a), CollectionsKt.L(ge3Var.f38749b, ge3Var2.f38749b));
                dp3 dp3Var = cp3Var.f37468d;
                xd3 xd3Var3 = cp3Var.f37465a;
                dp3Var.getClass();
                List listF = kotlin.collections.s.f(xd3Var, xd3Var3);
                ArrayList arrayList14 = new ArrayList();
                Iterator it9 = listF.iterator();
                while (it9.hasNext()) {
                    rl3 rl3Var = ((xd3) it9.next()).f44657j;
                    List list5 = rl3Var != null ? rl3Var.f42631a : null;
                    if (list5 == null) {
                        list5 = kotlin.collections.b0.f27475b;
                    }
                    kotlin.collections.x.m(arrayList14, list5);
                }
                rl3 rl3Var2 = new rl3(arrayList14);
                Map map = xd3Var.f44651c;
                xd3 xd3Var4 = cp3Var.f37465a;
                Map map2 = xd3Var4.f44651c;
                ArrayList arrayListL2 = CollectionsKt.L(xd3Var.f44661n, xd3Var4.f44661n);
                wd3 wd3Var = new wd3(xd3Var.f44649a, new ng3(cp3Var.f37469e));
                wd3Var.f44350k = xd3Var.f44659l;
                wd3Var.f44351l.addAll(arrayList3);
                wd3 wd3VarA = wd3Var.a(map);
                wd3VarA.f44344d = xd3Var.f44653e;
                wd3VarA.f44345e = xd3Var.f44654f;
                wd3VarA.f44346f = xd3Var.f44655g;
                wd3VarA.f44347g = xd3Var.f44656h;
                wd3VarA.f44348h = xd3Var.i;
                wd3VarA.f44354o = ge3Var3;
                wd3VarA.i = rl3Var2;
                wd3VarA.f44343c = xd3Var.f44660m;
                wd3 wd3VarA2 = wd3VarA.a(map2);
                wd3VarA2.f44352m.addAll(arrayListL2);
                arrayList.add(wd3VarA2.a());
                it = it8;
                i = 10;
            }
            listO = arrayList;
        }
        this.f38844a.onSuccess(listO);
    }
}
