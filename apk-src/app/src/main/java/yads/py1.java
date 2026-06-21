package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class py1 implements n22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j22 f42112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n12 f42114d;

    public py1(List list, j22 j22Var) {
        this.f42111a = list;
        this.f42112b = j22Var;
    }

    public static final boolean a(py1 py1Var, n12 n12Var) {
        List list = py1Var.f42111a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f41545f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pi piVarA = n12Var.a((oi) it.next());
            if (piVarA != null && piVarA.d()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(py1 py1Var, n12 n12Var) {
        Object next;
        pi piVarA;
        Iterator it = py1Var.f42111a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oi oiVar = (oi) next;
            if (oiVar.f41545f && Intrinsics.a(oiVar.f41540a, "sponsored")) {
                break;
            }
        }
        oi oiVar2 = (oi) next;
        return oiVar2 == null || ((piVarA = n12Var.a(oiVar2)) != null && piVarA.d());
    }

    public static final boolean c(py1 py1Var, n12 n12Var) {
        Object next;
        List list = py1Var.f42111a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f41545f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oi oiVar = (oi) next;
            pi piVarA = n12Var.a(oiVar);
            if (piVarA == null) {
                piVarA = null;
            }
            if (piVarA == null || !piVarA.a(oiVar.f41542c)) {
                break;
            }
        }
        oi oiVar2 = (oi) next;
        py1Var.f42113c = oiVar2 != null ? oiVar2.f41540a : null;
        return oiVar2 == null;
    }

    public static final boolean d(py1 py1Var, n12 n12Var) {
        Object next;
        List list = py1Var.f42111a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f41545f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pi piVarA = n12Var.a((oi) next);
            if (piVarA == null || !piVarA.e()) {
                break;
            }
        }
        oi oiVar = (oi) next;
        py1Var.f42113c = oiVar != null ? oiVar.f41540a : null;
        return oiVar == null;
    }

    public final mp2 e() {
        return new mp2(this.f42113c, a(new zl.t0(this, 4)));
    }

    public static final boolean e(py1 py1Var, n12 n12Var) {
        Object next;
        List list = py1Var.f42111a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f41545f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pi piVarA = n12Var.a((oi) next);
            if (piVarA == null || !piVarA.b()) {
                break;
            }
        }
        oi oiVar = (oi) next;
        py1Var.f42113c = oiVar != null ? oiVar.f41540a : null;
        return oiVar == null;
    }

    public final boolean b() {
        return !a(new zl.t0(this, 2));
    }

    public final boolean a() {
        return !a(new zl.t0(this, 3));
    }

    public final boolean a(m22 m22Var) {
        n12 n12Var = this.f42114d;
        if (n12Var == null) {
            return false;
        }
        this.f42112b.getClass();
        return m22Var.a(n12Var);
    }

    public final boolean d() {
        return !a(new zl.t0(this, 1));
    }

    public final boolean c() {
        return !a(new zl.t0(this, 0));
    }

    public final wb3 a(boolean z5) {
        ArrayList arrayList = new ArrayList();
        if (b() && !z5) {
            arrayList.add(vb3.f43989d);
        }
        List list = this.f42111a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((oi) it.next()).f41545f && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            if (i >= 2 && a() && !z5) {
                arrayList.add(vb3.f43990e);
            }
        }
        if (c()) {
            arrayList.add(vb3.f43988c);
        }
        if (d() && !z5) {
            return new tb3(sb3.f42887f, this.f42113c, null);
        }
        return new ub3(arrayList);
    }
}
