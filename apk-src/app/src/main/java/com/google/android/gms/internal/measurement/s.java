package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13950a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13951b;

    public s(int i) {
        this.f13951b = i;
    }

    public static m c(com.google.firebase.messaging.y yVar, List list) {
        w wVar = w.ADD;
        rl.b.A("FN", 2, list);
        n nVarC = ((t) yVar.f14900c).c(yVar, (n) list.get(0));
        n nVarC2 = ((t) yVar.f14900c).c(yVar, (n) list.get(1));
        if (!(nVarC2 instanceof d)) {
            throw new IllegalArgumentException(om1.k("FN requires an ArrayValue of parameter names found ", nVarC2.getClass().getCanonicalName()));
        }
        List listP = ((d) nVarC2).p();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(nVarC.l(), (ArrayList) listP, arrayList, yVar);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.l());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.l());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).f13924b.compareTo(((q) nVar2).f13924b) < 0;
        }
        double dDoubleValue = nVar.g().doubleValue();
        double dDoubleValue2 = nVar2.g().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue2 == ConfigValue.DOUBLE_DEFAULT_VALUE) || ((dDoubleValue == ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue2 == ConfigValue.DOUBLE_DEFAULT_VALUE) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            return nVar instanceof g ? (Double.isNaN(nVar.g().doubleValue()) || Double.isNaN(nVar2.g().doubleValue()) || nVar.g().doubleValue() != nVar2.g().doubleValue()) ? false : true : nVar instanceof q ? nVar.l().equals(nVar2.l()) : nVar instanceof e ? nVar.i().equals(nVar2.i()) : nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z5 = nVar instanceof g;
        if (z5 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.g()));
        }
        boolean z10 = nVar instanceof q;
        if (z10 && (nVar2 instanceof g)) {
            return f(new g(nVar.g()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.g()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.g()));
        }
        if ((z10 || z5) && (nVar2 instanceof j)) {
            return f(nVar, new q(nVar2.l()));
        }
        if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
            return f(new q(nVar.l()), nVar2);
        }
        return false;
    }

    public static n g(v vVar, Iterator it, n nVar) {
        com.google.firebase.messaging.y yVarC;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f14009a) {
                    case 0:
                        yVarC = vVar.f14010b.C();
                        String str = vVar.f14011c;
                        yVarC.F(str, nVar2);
                        ((HashMap) yVarC.f14902e).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        yVarC = vVar.f14010b.C();
                        yVarC.F(vVar.f14011c, nVar2);
                        break;
                    default:
                        yVarC = vVar.f14010b;
                        yVarC.F(vVar.f14011c, nVar2);
                        break;
                }
                n nVarB = yVarC.B((d) nVar);
                if (nVarB instanceof f) {
                    f fVar = (f) nVarB;
                    String str2 = fVar.f13723c;
                    if ("break".equals(str2)) {
                        return n.B1;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.B1;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.l());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.l());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.g().doubleValue()) || Double.isNaN(nVar2.g().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:506:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n a(java.lang.String r12, com.google.firebase.messaging.y r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 3856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s.a(java.lang.String, com.google.firebase.messaging.y, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (!this.f13950a.contains(rl.b.D(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
