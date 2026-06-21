package n1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28975l;

    public c(m1.d dVar, int i) {
        m1.d dVar2;
        super(dVar);
        ArrayList<n> arrayList = new ArrayList();
        this.f28974k = arrayList;
        this.f29005f = i;
        m1.d dVar3 = this.f29001b;
        m1.d dVarM = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f29005f);
            }
        }
        this.f29001b = dVar2;
        int i10 = this.f29005f;
        arrayList.add(i10 == 0 ? dVar2.f28456d : i10 == 1 ? dVar2.f28458e : null);
        m1.d dVarL = dVar2.l(this.f29005f);
        while (dVarL != null) {
            int i11 = this.f29005f;
            arrayList.add(i11 == 0 ? dVarL.f28456d : i11 == 1 ? dVarL.f28458e : null);
            dVarL = dVarL.l(this.f29005f);
        }
        for (n nVar : arrayList) {
            int i12 = this.f29005f;
            if (i12 == 0) {
                nVar.f29001b.f28452b = this;
            } else if (i12 == 1) {
                nVar.f29001b.f28454c = this;
            }
        }
        if (this.f29005f == 0 && ((m1.e) this.f29001b.T).f28494v0 && arrayList.size() > 1) {
            this.f29001b = ((n) gf.a.g(1, arrayList)).f29001b;
        }
        this.f28975l = this.f29005f == 0 ? this.f29001b.f28465i0 : this.f29001b.f28467j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // n1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n1.d r28) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.c.a(n1.d):void");
    }

    @Override // n1.n
    public final void d() {
        ArrayList arrayList = this.f28974k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        m1.d dVar = ((n) arrayList.get(0)).f29001b;
        m1.d dVar2 = ((n) arrayList.get(size - 1)).f29001b;
        int i = this.f29005f;
        e eVar = this.i;
        e eVar2 = this.f29007h;
        if (i == 0) {
            m1.c cVar = dVar.I;
            m1.c cVar2 = dVar2.K;
            e eVarI = n.i(cVar, 0);
            int iE = cVar.e();
            m1.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (eVarI != null) {
                n.b(eVar2, eVarI, iE);
            }
            e eVarI2 = n.i(cVar2, 0);
            int iE2 = cVar2.e();
            m1.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (eVarI2 != null) {
                n.b(eVar, eVarI2, -iE2);
            }
        } else {
            m1.c cVar3 = dVar.J;
            m1.c cVar4 = dVar2.L;
            e eVarI3 = n.i(cVar3, 1);
            int iE3 = cVar3.e();
            m1.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (eVarI3 != null) {
                n.b(eVar2, eVarI3, iE3);
            }
            e eVarI4 = n.i(cVar4, 1);
            int iE4 = cVar4.e();
            m1.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (eVarI4 != null) {
                n.b(eVar, eVarI4, -iE4);
            }
        }
        eVar2.f28976a = this;
        eVar.f28976a = this;
    }

    @Override // n1.n
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f28974k;
            if (i >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // n1.n
    public final void f() {
        this.f29002c = null;
        Iterator it = this.f28974k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // n1.n
    public final long j() {
        ArrayList arrayList = this.f28974k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList.get(i);
            j10 = ((long) nVar.i.f28981f) + nVar.j() + j10 + ((long) nVar.f29007h.f28981f);
        }
        return j10;
    }

    @Override // n1.n
    public final boolean k() {
        ArrayList arrayList = this.f28974k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((n) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final m1.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f28974k;
            if (i >= arrayList.size()) {
                return null;
            }
            m1.d dVar = ((n) arrayList.get(i)).f29001b;
            if (dVar.f28463g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final m1.d n() {
        ArrayList arrayList = this.f28974k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m1.d dVar = ((n) arrayList.get(size)).f29001b;
            if (dVar.f28463g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f29005f == 0 ? "horizontal : " : "vertical : ");
        for (n nVar : this.f28974k) {
            sb2.append("<");
            sb2.append(nVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
