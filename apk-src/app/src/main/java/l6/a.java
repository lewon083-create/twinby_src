package l6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n1.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f27940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f27942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f27943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f27944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f27945h;

    public void a(n1.e eVar, int i, ArrayList arrayList, n1.k kVar) {
        n nVar = eVar.f28979d;
        n1.k kVar2 = nVar.f29002c;
        n1.e eVar2 = nVar.i;
        n1.e eVar3 = nVar.f29007h;
        if (kVar2 == null) {
            m1.e eVar4 = (m1.e) this.f27940c;
            if (nVar == eVar4.f28456d || nVar == eVar4.f28458e) {
                return;
            }
            if (kVar == null) {
                kVar = new n1.k();
                kVar.f28990a = null;
                kVar.f28991b = new ArrayList();
                kVar.f28990a = nVar;
                arrayList.add(kVar);
            }
            nVar.f29002c = kVar;
            kVar.f28991b.add(nVar);
            for (n1.d dVar : eVar3.f28985k) {
                if (dVar instanceof n1.e) {
                    a((n1.e) dVar, i, arrayList, kVar);
                }
            }
            for (n1.d dVar2 : eVar2.f28985k) {
                if (dVar2 instanceof n1.e) {
                    a((n1.e) dVar2, i, arrayList, kVar);
                }
            }
            if (i == 1 && (nVar instanceof n1.l)) {
                for (n1.d dVar3 : ((n1.l) nVar).f28992k.f28985k) {
                    if (dVar3 instanceof n1.e) {
                        a((n1.e) dVar3, i, arrayList, kVar);
                    }
                }
            }
            Iterator it = eVar3.f28986l.iterator();
            while (it.hasNext()) {
                a((n1.e) it.next(), i, arrayList, kVar);
            }
            Iterator it2 = eVar2.f28986l.iterator();
            while (it2.hasNext()) {
                a((n1.e) it2.next(), i, arrayList, kVar);
            }
            if (i == 1 && (nVar instanceof n1.l)) {
                Iterator it3 = ((n1.l) nVar).f28992k.f28986l.iterator();
                while (it3.hasNext()) {
                    a((n1.e) it3.next(), i, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(m1.e r25) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.a.b(m1.e):void");
    }

    public void c() {
        m1.e eVar = (m1.e) this.f27940c;
        ArrayList arrayList = (ArrayList) this.f27945h;
        ArrayList<n> arrayList2 = (ArrayList) this.f27942e;
        arrayList2.clear();
        m1.e eVar2 = (m1.e) this.f27941d;
        eVar2.f28456d.f();
        eVar2.f28458e.f();
        arrayList2.add(eVar2.f28456d);
        arrayList2.add(eVar2.f28458e);
        HashSet hashSet = null;
        for (m1.d dVar : eVar2.f28489q0) {
            if (dVar instanceof m1.h) {
                n1.h hVar = new n1.h(dVar);
                dVar.f28456d.f();
                dVar.f28458e.f();
                hVar.f29005f = ((m1.h) dVar).f28530u0;
                arrayList2.add(hVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f28452b == null) {
                        dVar.f28452b = new n1.c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f28452b);
                } else {
                    arrayList2.add(dVar.f28456d);
                }
                if (dVar.y()) {
                    if (dVar.f28454c == null) {
                        dVar.f28454c = new n1.c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f28454c);
                } else {
                    arrayList2.add(dVar.f28458e);
                }
                if (dVar instanceof m1.i) {
                    arrayList2.add(new n1.i(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
        for (n nVar : arrayList2) {
            if (nVar.f29001b != eVar2) {
                nVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f28456d, 0, arrayList);
        e(eVar.f28458e, 1, arrayList);
        this.f27938a = false;
    }

    public int d(m1.e eVar, int i) {
        ArrayList arrayList;
        int i10;
        long jMax;
        float f10;
        m1.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f27945h;
        int size = arrayList2.size();
        long j10 = 0;
        int i11 = 0;
        long jMax2 = 0;
        while (i11 < size) {
            n nVar = ((n1.k) arrayList2.get(i11)).f28990a;
            if (!(nVar instanceof n1.c) ? !(i != 0 ? (nVar instanceof n1.l) : (nVar instanceof n1.j)) : ((n1.c) nVar).f29005f != i) {
                n1.e eVar3 = (i == 0 ? eVar2.f28456d : eVar2.f28458e).f29007h;
                n1.e eVar4 = (i == 0 ? eVar2.f28456d : eVar2.f28458e).i;
                n1.e eVar5 = nVar.f29007h;
                n1.e eVar6 = nVar.i;
                boolean zContains = eVar5.f28986l.contains(eVar3);
                boolean zContains2 = eVar6.f28986l.contains(eVar4);
                long j11 = nVar.j();
                if (zContains && zContains2) {
                    long jB = n1.k.b(eVar5, j10);
                    long jA = n1.k.a(eVar6, j10);
                    long j12 = jB - j11;
                    int i12 = eVar6.f28981f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j12 >= (-i12)) {
                        j12 += (long) i12;
                    }
                    long j13 = eVar5.f28981f;
                    long j14 = ((-jA) - j11) - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    m1.d dVar = nVar.f29001b;
                    if (i == 0) {
                        f10 = dVar.f28457d0;
                    } else if (i == 1) {
                        f10 = dVar.f28459e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j12 / (1.0f - f10)) + (j14 / f10)) : 0L;
                    jMax = (((long) eVar5.f28981f) + ((((long) ((f11 * f10) + 0.5f)) + j11) + ((long) (((1.0f - f10) * f11) + 0.5f)))) - ((long) eVar6.f28981f);
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    jMax = zContains ? Math.max(n1.k.b(eVar5, eVar5.f28981f), ((long) eVar5.f28981f) + j11) : zContains2 ? Math.max(-n1.k.a(eVar6, eVar6.f28981f), ((long) (-eVar6.f28981f)) + j11) : (nVar.j() + ((long) eVar5.f28981f)) - ((long) eVar6.f28981f);
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                jMax = j10;
            }
            jMax2 = Math.max(jMax2, jMax);
            i11++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i10;
            j10 = 0;
        }
        return (int) jMax2;
    }

    public void e(n nVar, int i, ArrayList arrayList) {
        n1.e eVar = nVar.f29007h;
        n1.e eVar2 = nVar.i;
        for (n1.d dVar : eVar.f28985k) {
            if (dVar instanceof n1.e) {
                a((n1.e) dVar, i, arrayList, null);
            } else if (dVar instanceof n) {
                a(((n) dVar).f29007h, i, arrayList, null);
            }
        }
        for (n1.d dVar2 : eVar2.f28985k) {
            if (dVar2 instanceof n1.e) {
                a((n1.e) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof n) {
                a(((n) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (n1.d dVar3 : ((n1.l) nVar).f28992k.f28985k) {
                if (dVar3 instanceof n1.e) {
                    a((n1.e) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public void f(int i, int i10, int i11, int i12, m1.d dVar) {
        n1.b bVar = (n1.b) this.f27944g;
        bVar.f28965a = i;
        bVar.f28966b = i11;
        bVar.f28967c = i10;
        bVar.f28968d = i12;
        ((p1.e) this.f27943f).b(dVar, bVar);
        dVar.O(bVar.f28969e);
        dVar.L(bVar.f28970f);
        dVar.E = bVar.f28972h;
        dVar.I(bVar.f28971g);
    }

    public void g() {
        n1.a aVar;
        for (m1.d dVar : ((m1.e) this.f27940c).f28489q0) {
            if (!dVar.f28450a) {
                int[] iArr = dVar.f28478p0;
                boolean z5 = false;
                int i = iArr[0];
                int i10 = iArr[1];
                int i11 = dVar.f28480r;
                int i12 = dVar.f28481s;
                boolean z10 = i == 2 || (i == 3 && i11 == 1);
                if (i10 == 2 || (i10 == 3 && i12 == 1)) {
                    z5 = true;
                }
                n1.f fVar = dVar.f28456d.f29004e;
                boolean z11 = fVar.f28984j;
                n1.f fVar2 = dVar.f28458e.f29004e;
                boolean z12 = fVar2.f28984j;
                boolean z13 = z10;
                if (z11 && z12) {
                    f(1, fVar.f28982g, 1, fVar2.f28982g, dVar);
                    dVar.f28450a = true;
                } else if (z11 && z5) {
                    f(1, fVar.f28982g, 2, fVar2.f28982g, dVar);
                    if (i10 == 3) {
                        dVar.f28458e.f29004e.f28987m = dVar.k();
                    } else {
                        dVar.f28458e.f29004e.d(dVar.k());
                        dVar.f28450a = true;
                    }
                } else if (z12 && z13) {
                    f(2, fVar.f28982g, 1, fVar2.f28982g, dVar);
                    if (i == 3) {
                        dVar.f28456d.f29004e.f28987m = dVar.q();
                    } else {
                        dVar.f28456d.f29004e.d(dVar.q());
                        dVar.f28450a = true;
                    }
                }
                if (dVar.f28450a && (aVar = dVar.f28458e.f28993l) != null) {
                    aVar.d(dVar.f28451a0);
                }
            }
        }
    }
}
