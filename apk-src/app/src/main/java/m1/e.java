package m1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import n1.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final n1.b L0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f28489q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final bb.e f28490r0 = new bb.e(this);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final l6.a f28491s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f28492t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public p1.e f28493u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f28494v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final k1.c f28495w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f28496x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f28497y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f28498z0;

    public e() {
        l6.a aVar = new l6.a();
        aVar.f27938a = true;
        aVar.f27939b = true;
        aVar.f27942e = new ArrayList();
        new ArrayList();
        aVar.f27943f = null;
        aVar.f27944g = new n1.b();
        aVar.f27945h = new ArrayList();
        aVar.f27940c = this;
        aVar.f27941d = this;
        this.f28491s0 = aVar;
        this.f28493u0 = null;
        this.f28494v0 = false;
        this.f28495w0 = new k1.c();
        this.f28498z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new n1.b();
    }

    public static void V(d dVar, p1.e eVar, n1.b bVar) {
        int i;
        int i10;
        if (eVar == null) {
            return;
        }
        int i11 = dVar.f28463g0;
        int[] iArr = dVar.f28482t;
        if (i11 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f28969e = 0;
            bVar.f28970f = 0;
            return;
        }
        int[] iArr2 = dVar.f28478p0;
        bVar.f28965a = iArr2[0];
        bVar.f28966b = iArr2[1];
        bVar.f28967c = dVar.q();
        bVar.f28968d = dVar.k();
        bVar.i = false;
        bVar.f28973j = 0;
        boolean z5 = bVar.f28965a == 3;
        boolean z10 = bVar.f28966b == 3;
        boolean z11 = z5 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z5 && dVar.t(0) && dVar.f28480r == 0 && !z11) {
            bVar.f28965a = 2;
            if (z10 && dVar.f28481s == 0) {
                bVar.f28965a = 1;
            }
            z5 = false;
        }
        if (z10 && dVar.t(1) && dVar.f28481s == 0 && !z12) {
            bVar.f28966b = 2;
            if (z5 && dVar.f28480r == 0) {
                bVar.f28966b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f28965a = 1;
            z5 = false;
        }
        if (dVar.B()) {
            bVar.f28966b = 1;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                bVar.f28965a = 1;
            } else if (!z10) {
                if (bVar.f28966b == 1) {
                    i10 = bVar.f28968d;
                } else {
                    bVar.f28965a = 2;
                    eVar.b(dVar, bVar);
                    i10 = bVar.f28970f;
                }
                bVar.f28965a = 1;
                bVar.f28967c = (int) (dVar.W * i10);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                bVar.f28966b = 1;
            } else if (!z5) {
                if (bVar.f28965a == 1) {
                    i = bVar.f28967c;
                } else {
                    bVar.f28966b = 2;
                    eVar.b(dVar, bVar);
                    i = bVar.f28969e;
                }
                bVar.f28966b = 1;
                if (dVar.X == -1) {
                    bVar.f28968d = (int) (i / dVar.W);
                } else {
                    bVar.f28968d = (int) (dVar.W * i);
                }
            }
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f28969e);
        dVar.L(bVar.f28970f);
        dVar.E = bVar.f28972h;
        dVar.I(bVar.f28971g);
        bVar.f28973j = 0;
    }

    @Override // m1.d
    public final void C() {
        this.f28495w0.t();
        this.f28496x0 = 0;
        this.f28497y0 = 0;
        this.f28489q0.clear();
        super.C();
    }

    @Override // m1.d
    public final void F(bb.e eVar) {
        super.F(eVar);
        int size = this.f28489q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f28489q0.get(i)).F(eVar);
        }
    }

    @Override // m1.d
    public final void P(boolean z5, boolean z10) {
        super.P(z5, z10);
        int size = this.f28489q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f28489q0.get(i)).P(z5, z10);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i10 = this.f28498z0 + 1;
            b[] bVarArr = this.C0;
            if (i10 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i11 = this.f28498z0;
            bVarArr2[i11] = new b(dVar, 0, this.f28494v0);
            this.f28498z0 = i11 + 1;
            return;
        }
        if (i == 1) {
            int i12 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.A0;
            bVarArr4[i13] = new b(dVar, 1, this.f28494v0);
            this.A0 = i13 + 1;
        }
    }

    public final void S(k1.c cVar) {
        e eVar;
        k1.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f28489q0.size();
        boolean z5 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f28489q0.get(i);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f28489q0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f28533r0; i11++) {
                        d dVar3 = aVar.f28532q0[i11];
                        if (aVar.f28423t0 || dVar3.c()) {
                            int i12 = aVar.f28422s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f28489q0.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i14 = 0; i14 < gVar.f28533r0; i14++) {
                    if (hashSet.contains(gVar.f28532q0[i14])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (k1.c.f26800q) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f28489q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f28478p0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f28489q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f28478p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f28498z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z5) {
        boolean z10;
        boolean z11;
        l6.a aVar = this.f28491s0;
        ArrayList<n> arrayList = (ArrayList) aVar.f27942e;
        e eVar = (e) aVar.f27940c;
        boolean z12 = false;
        int iJ = eVar.j(0);
        int[] iArr = eVar.f28478p0;
        int iJ2 = eVar.j(1);
        int iR = eVar.r();
        int iS = eVar.s();
        if (z5 && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = z5;
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f29005f == i && !nVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z11 && iJ == 2) {
                    eVar.M(1);
                    eVar.O(aVar.d(eVar, 0));
                    eVar.f28456d.f29004e.d(eVar.q());
                }
            } else if (z11 && iJ2 == 2) {
                eVar.N(1);
                eVar.L(aVar.d(eVar, 1));
                eVar.f28458e.f29004e.d(eVar.k());
            }
        }
        if (i == 0) {
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int iQ = eVar.q() + iR;
                eVar.f28456d.i.d(iQ);
                eVar.f28456d.f29004e.d(iQ - iR);
                z10 = true;
            }
            z10 = false;
        } else {
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int iK = eVar.k() + iS;
                eVar.f28458e.i.d(iK);
                eVar.f28458e.f29004e.d(iK - iS);
                z10 = true;
            }
            z10 = false;
        }
        aVar.g();
        for (n nVar2 : arrayList) {
            if (nVar2.f29005f == i && (nVar2.f29001b != eVar || nVar2.f29006g)) {
                nVar2.e();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z12 = true;
                break;
            }
            n nVar3 = (n) it2.next();
            if (nVar3.f29005f == i && (z10 || nVar3.f29001b != eVar)) {
                if (!nVar3.f29007h.f28984j || !nVar3.i.f28984j || (!(nVar3 instanceof n1.c) && !nVar3.f29004e.f28984j)) {
                    break;
                }
            }
        }
        eVar.M(iJ);
        eVar.N(iJ2);
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x083b A[LOOP:14: B:498:0x0839->B:499:0x083b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [m1.d, m1.e] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v118, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v86, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v69, types: [int] */
    /* JADX WARN: Type inference failed for: r6v83, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instruction units count: 2344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.e.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // m1.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.f28466j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        Iterator it = this.f28489q0.iterator();
        while (it.hasNext()) {
            ((d) it.next()).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
