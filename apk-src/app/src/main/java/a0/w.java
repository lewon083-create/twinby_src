package a0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f238c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f239a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new g0.m1(0));
        f237b = new w(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new g0.m1(1));
        f238c = new w(linkedHashSet2);
    }

    public w(LinkedHashSet linkedHashSet) {
        this.f239a = linkedHashSet;
    }

    public final List a(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f239a.iterator();
        while (it.hasNext()) {
            arrayList = ((t) it.next()).a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public final Integer b() {
        Integer num = null;
        for (t tVar : this.f239a) {
            if (tVar instanceof g0.m1) {
                Integer numValueOf = Integer.valueOf(((g0.m1) tVar).f19658b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final g0.f0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((g0.f0) it.next()).b());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            g0.f0 f0Var = (g0.f0) it2.next();
            if (listA.contains(f0Var.b())) {
                linkedHashSet2.add(f0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (g0.f0) it3.next();
        }
        StringBuilder sb2 = new StringBuilder("Cams:");
        sb2.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            g0.d0 d0VarP = ((g0.f0) it4.next()).p();
            sb2.append(" Id:" + d0VarP.e() + "  Lens:" + d0VarP.l());
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet<t> linkedHashSet3 = this.f239a;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        for (t tVar : linkedHashSet3) {
            sb3.append(" Id:");
            tVar.getClass();
            sb3.append(t.f222a);
            if (tVar instanceof g0.m1) {
                sb3.append(" LensFilter:");
                sb3.append(((g0.m1) tVar).f19658b);
            }
        }
        throw new IllegalArgumentException(t.z.e("No available camera can be found. ", string, " ", sb3.toString()));
    }
}
