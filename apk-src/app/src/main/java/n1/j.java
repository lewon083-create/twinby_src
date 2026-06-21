package n1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f28989k = new int[2];

    public static void m(int[] iArr, int i, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f10) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f10) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f10) + 0.5f);
        int i17 = (int) ((i14 / f10) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // n1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(n1.d r24) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.j.a(n1.d):void");
    }

    @Override // n1.n
    public final void d() {
        m1.d dVar;
        m1.d dVar2;
        int i;
        m1.d dVar3;
        m1.d dVar4;
        int i10;
        m1.d dVar5 = this.f29001b;
        boolean z5 = dVar5.f28450a;
        f fVar = this.f29004e;
        if (z5) {
            fVar.d(dVar5.q());
        }
        boolean z10 = fVar.f28984j;
        ArrayList arrayList = fVar.f28985k;
        ArrayList arrayList2 = fVar.f28986l;
        e eVar = this.i;
        e eVar2 = this.f29007h;
        if (!z10) {
            m1.d dVar6 = this.f29001b;
            int i11 = dVar6.f28478p0[0];
            this.f29003d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.T) != null && ((i10 = dVar4.f28478p0[0]) == 1 || i10 == 4)) {
                    int iQ = (dVar4.q() - this.f29001b.I.e()) - this.f29001b.K.e();
                    n.b(eVar2, dVar4.f28456d.f29007h, this.f29001b.I.e());
                    n.b(eVar, dVar4.f28456d.i, -this.f29001b.K.e());
                    fVar.d(iQ);
                    return;
                }
                if (i11 == 1) {
                    fVar.d(dVar6.q());
                }
            }
        } else if (this.f29003d == 4 && (dVar2 = (dVar = this.f29001b).T) != null && ((i = dVar2.f28478p0[0]) == 1 || i == 4)) {
            n.b(eVar2, dVar2.f28456d.f29007h, dVar.I.e());
            n.b(eVar, dVar2.f28456d.i, -this.f29001b.K.e());
            return;
        }
        if (fVar.f28984j) {
            m1.d dVar7 = this.f29001b;
            if (dVar7.f28450a) {
                m1.c[] cVarArr = dVar7.Q;
                m1.c cVar = cVarArr[0];
                m1.c cVar2 = cVar.f28447f;
                if (cVar2 != null && cVarArr[1].f28447f != null) {
                    if (dVar7.x()) {
                        eVar2.f28981f = this.f29001b.Q[0].e();
                        eVar.f28981f = -this.f29001b.Q[1].e();
                        return;
                    }
                    e eVarH = n.h(this.f29001b.Q[0]);
                    if (eVarH != null) {
                        n.b(eVar2, eVarH, this.f29001b.Q[0].e());
                    }
                    e eVarH2 = n.h(this.f29001b.Q[1]);
                    if (eVarH2 != null) {
                        n.b(eVar, eVarH2, -this.f29001b.Q[1].e());
                    }
                    eVar2.f28977b = true;
                    eVar.f28977b = true;
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar2, eVarH3, this.f29001b.Q[0].e());
                        n.b(eVar, eVar2, fVar.f28982g);
                        return;
                    }
                    return;
                }
                m1.c cVar3 = cVarArr[1];
                if (cVar3.f28447f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar, eVarH4, -this.f29001b.Q[1].e());
                        n.b(eVar2, eVar, -fVar.f28982g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof m1.i) || dVar7.T == null || dVar7.i(7).f28447f != null) {
                    return;
                }
                m1.d dVar8 = this.f29001b;
                n.b(eVar2, dVar8.T.f28456d.f29007h, dVar8.r());
                n.b(eVar, eVar2, fVar.f28982g);
                return;
            }
        }
        if (this.f29003d == 3) {
            m1.d dVar9 = this.f29001b;
            int i12 = dVar9.f28480r;
            if (i12 == 2) {
                m1.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    f fVar2 = dVar10.f28458e.f29004e;
                    arrayList2.add(fVar2);
                    fVar2.f28985k.add(fVar);
                    fVar.f28977b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f28481s == 3) {
                    eVar2.f28976a = this;
                    eVar.f28976a = this;
                    l lVar = dVar9.f28458e;
                    lVar.f29007h.f28976a = this;
                    lVar.i.f28976a = this;
                    fVar.f28976a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f29001b.f28458e.f29004e);
                        this.f29001b.f28458e.f29004e.f28985k.add(fVar);
                        l lVar2 = this.f29001b.f28458e;
                        lVar2.f29004e.f28976a = this;
                        arrayList2.add(lVar2.f29007h);
                        arrayList2.add(this.f29001b.f28458e.i);
                        this.f29001b.f28458e.f29007h.f28985k.add(fVar);
                        this.f29001b.f28458e.i.f28985k.add(fVar);
                    } else if (this.f29001b.x()) {
                        this.f29001b.f28458e.f29004e.f28986l.add(fVar);
                        arrayList.add(this.f29001b.f28458e.f29004e);
                    } else {
                        this.f29001b.f28458e.f29004e.f28986l.add(fVar);
                    }
                } else {
                    f fVar3 = dVar9.f28458e.f29004e;
                    arrayList2.add(fVar3);
                    fVar3.f28985k.add(fVar);
                    this.f29001b.f28458e.f29007h.f28985k.add(fVar);
                    this.f29001b.f28458e.i.f28985k.add(fVar);
                    fVar.f28977b = true;
                    arrayList.add(eVar2);
                    arrayList.add(eVar);
                    eVar2.f28986l.add(fVar);
                    eVar.f28986l.add(fVar);
                }
            }
        }
        m1.d dVar11 = this.f29001b;
        m1.c[] cVarArr2 = dVar11.Q;
        m1.c cVar4 = cVarArr2[0];
        m1.c cVar5 = cVar4.f28447f;
        if (cVar5 != null && cVarArr2[1].f28447f != null) {
            if (dVar11.x()) {
                eVar2.f28981f = this.f29001b.Q[0].e();
                eVar.f28981f = -this.f29001b.Q[1].e();
                return;
            }
            e eVarH5 = n.h(this.f29001b.Q[0]);
            e eVarH6 = n.h(this.f29001b.Q[1]);
            if (eVarH5 != null) {
                eVarH5.b(this);
            }
            if (eVarH6 != null) {
                eVarH6.b(this);
            }
            this.f29008j = 4;
            return;
        }
        if (cVar5 != null) {
            e eVarH7 = n.h(cVar4);
            if (eVarH7 != null) {
                n.b(eVar2, eVarH7, this.f29001b.Q[0].e());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        m1.c cVar6 = cVarArr2[1];
        if (cVar6.f28447f != null) {
            e eVarH8 = n.h(cVar6);
            if (eVarH8 != null) {
                n.b(eVar, eVarH8, -this.f29001b.Q[1].e());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof m1.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        n.b(eVar2, dVar3.f28456d.f29007h, dVar11.r());
        c(eVar, eVar2, 1, fVar);
    }

    @Override // n1.n
    public final void e() {
        e eVar = this.f29007h;
        if (eVar.f28984j) {
            this.f29001b.Y = eVar.f28982g;
        }
    }

    @Override // n1.n
    public final void f() {
        this.f29002c = null;
        this.f29007h.c();
        this.i.c();
        this.f29004e.c();
        this.f29006g = false;
    }

    @Override // n1.n
    public final boolean k() {
        return this.f29003d != 3 || this.f29001b.f28480r == 0;
    }

    public final void n() {
        this.f29006g = false;
        e eVar = this.f29007h;
        eVar.c();
        eVar.f28984j = false;
        e eVar2 = this.i;
        eVar2.c();
        eVar2.f28984j = false;
        this.f29004e.f28984j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f29001b.h0;
    }
}
