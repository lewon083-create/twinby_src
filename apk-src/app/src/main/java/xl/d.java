package xl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import vl.q;
import vl.r;
import wl.b0;
import wl.d0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36267a;

    public /* synthetic */ d(int i) {
        this.f36267a = i;
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        b0 b0Var;
        switch (this.f36267a) {
            case 0:
                return true;
            case 1:
                for (vl.p pVar : Collections.unmodifiableList(kVar2.j())) {
                    if (!(pVar instanceof vl.e) && !(pVar instanceof vl.i)) {
                        return false;
                    }
                }
                return true;
            case 2:
                vl.k kVar3 = (vl.k) kVar2.f34939b;
                return (kVar3 == null || (kVar3 instanceof vl.h) || kVar2.y() != 0) ? false : true;
            case 3:
                vl.k kVar4 = (vl.k) kVar2.f34939b;
                return (kVar4 == null || (kVar4 instanceof vl.h) || kVar2.y() != new b0(kVar4.v()).size() - 1) ? false : true;
            case 4:
                vl.p pVar2 = kVar2.f34939b;
                vl.k kVar5 = (vl.k) pVar2;
                if (kVar5 == null || (kVar5 instanceof vl.h)) {
                    return false;
                }
                if (pVar2 == null) {
                    b0Var = new b0(0, 1);
                } else {
                    List<vl.k> listV = ((vl.k) pVar2).v();
                    b0 b0Var2 = new b0(listV.size() - 1, 1);
                    for (vl.k kVar6 : listV) {
                        if (kVar6 != kVar2) {
                            b0Var2.add(kVar6);
                        }
                    }
                    b0Var = b0Var2;
                }
                return b0Var.size() == 0;
            case 5:
                vl.k kVar7 = (vl.k) kVar2.f34939b;
                if (kVar7 == null || (kVar7 instanceof vl.h)) {
                    return false;
                }
                Iterator<E> it = new b0(kVar7.v()).iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((vl.k) it.next()).f34922d.equals(kVar2.f34922d)) {
                        i++;
                    }
                }
                return i == 1;
            case 6:
                if (kVar instanceof vl.h) {
                    kVar = (vl.k) kVar.v().get(0);
                }
                return kVar2 == kVar;
            case 7:
                if (kVar2 instanceof q) {
                    return true;
                }
                kVar2.getClass();
                ArrayList arrayList = new ArrayList();
                for (vl.p pVar3 : kVar2.f34924f) {
                    if (pVar3 instanceof r) {
                        arrayList.add((r) pVar3);
                    }
                }
                Iterator it2 = Collections.unmodifiableList(arrayList).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    r rVar = (r) it2.next();
                    String str = kVar2.f34922d.f35436a;
                    k3.f.v(str);
                    HashMap map = d0.f35429j;
                    d0 d0Var = (d0) map.get(str);
                    if (d0Var == null) {
                        String strTrim = str.trim();
                        k3.f.t(strTrim);
                        d0Var = (d0) map.get(strTrim);
                        if (d0Var == null) {
                            d0Var = new d0(strTrim);
                            d0Var.f35437b = false;
                        }
                    }
                    q qVar = new q(d0Var, kVar2.f34926h, kVar2.d());
                    rVar.getClass();
                    k3.f.v(rVar.f34939b);
                    vl.p pVar4 = rVar.f34939b;
                    pVar4.getClass();
                    k3.f.r(rVar.f34939b == pVar4);
                    vl.p pVar5 = qVar.f34939b;
                    if (pVar5 != null) {
                        pVar5.s(qVar);
                    }
                    int i10 = rVar.f34940c;
                    pVar4.j().set(i10, qVar);
                    qVar.f34939b = pVar4;
                    qVar.f34940c = i10;
                    rVar.f34939b = null;
                    qVar.t(rVar);
                }
                break;
            default:
                return kVar == kVar2;
        }
    }

    public String toString() {
        switch (this.f36267a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return super.toString();
        }
    }
}
