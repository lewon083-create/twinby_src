package n1;

import java.util.ArrayList;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f28992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f28993l;

    @Override // n1.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i;
        if (z.m(this.f29008j) == 3) {
            m1.d dVar2 = this.f29001b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        f fVar = this.f29004e;
        if (fVar.f28978c && !fVar.f28984j && this.f29003d == 3) {
            m1.d dVar3 = this.f29001b;
            int i10 = dVar3.f28481s;
            if (i10 == 2) {
                m1.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f28458e.f29004e.f28984j) {
                        fVar.d((int) ((r5.f28982g * dVar3.f28488z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                f fVar2 = dVar3.f28456d.f29004e;
                if (fVar2.f28984j) {
                    int i11 = dVar3.X;
                    if (i11 == -1) {
                        f10 = fVar2.f28982g;
                        f11 = dVar3.W;
                    } else if (i11 == 0) {
                        f12 = fVar2.f28982g * dVar3.W;
                        i = (int) (f12 + 0.5f);
                        fVar.d(i);
                    } else if (i11 != 1) {
                        i = 0;
                        fVar.d(i);
                    } else {
                        f10 = fVar2.f28982g;
                        f11 = dVar3.W;
                    }
                    f12 = f10 / f11;
                    i = (int) (f12 + 0.5f);
                    fVar.d(i);
                }
            }
        }
        e eVar = this.f29007h;
        boolean z5 = eVar.f28978c;
        ArrayList arrayList = eVar.f28986l;
        if (z5) {
            e eVar2 = this.i;
            boolean z10 = eVar2.f28978c;
            ArrayList arrayList2 = eVar2.f28986l;
            if (z10) {
                if (eVar.f28984j && eVar2.f28984j && fVar.f28984j) {
                    return;
                }
                if (!fVar.f28984j && this.f29003d == 3) {
                    m1.d dVar5 = this.f29001b;
                    if (dVar5.f28480r == 0 && !dVar5.y()) {
                        e eVar3 = (e) arrayList.get(0);
                        e eVar4 = (e) arrayList2.get(0);
                        int i12 = eVar3.f28982g + eVar.f28981f;
                        int i13 = eVar4.f28982g + eVar2.f28981f;
                        eVar.d(i12);
                        eVar2.d(i13);
                        fVar.d(i13 - i12);
                        return;
                    }
                }
                if (!fVar.f28984j && this.f29003d == 3 && this.f29000a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar5 = (e) arrayList.get(0);
                    int i14 = (((e) arrayList2.get(0)).f28982g + eVar2.f28981f) - (eVar5.f28982g + eVar.f28981f);
                    int i15 = fVar.f28987m;
                    if (i14 < i15) {
                        fVar.d(i14);
                    } else {
                        fVar.d(i15);
                    }
                }
                if (fVar.f28984j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar6 = (e) arrayList.get(0);
                    e eVar7 = (e) arrayList2.get(0);
                    int i16 = eVar6.f28982g;
                    int i17 = eVar.f28981f + i16;
                    int i18 = eVar7.f28982g;
                    int i19 = eVar2.f28981f + i18;
                    float f13 = this.f29001b.f28459e0;
                    if (eVar6 == eVar7) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    eVar.d((int) ((((i18 - i16) - fVar.f28982g) * f13) + i16 + 0.5f));
                    eVar2.d(eVar.f28982g + fVar.f28982g);
                }
            }
        }
    }

    @Override // n1.n
    public final void d() {
        m1.d dVar;
        m1.d dVar2;
        m1.d dVar3;
        m1.d dVar4;
        e eVar = this.f28992k;
        m1.d dVar5 = this.f29001b;
        boolean z5 = dVar5.f28450a;
        f fVar = this.f29004e;
        if (z5) {
            fVar.d(dVar5.k());
        }
        boolean z10 = fVar.f28984j;
        ArrayList arrayList = fVar.f28985k;
        ArrayList arrayList2 = fVar.f28986l;
        e eVar2 = this.i;
        e eVar3 = this.f29007h;
        if (!z10) {
            m1.d dVar6 = this.f29001b;
            this.f29003d = dVar6.f28478p0[1];
            if (dVar6.E) {
                this.f28993l = new a(this);
            }
            int i = this.f29003d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f29001b.T) != null && dVar4.f28478p0[1] == 1) {
                    int iK = (dVar4.k() - this.f29001b.J.e()) - this.f29001b.L.e();
                    n.b(eVar3, dVar4.f28458e.f29007h, this.f29001b.J.e());
                    n.b(eVar2, dVar4.f28458e.i, -this.f29001b.L.e());
                    fVar.d(iK);
                    return;
                }
                if (i == 1) {
                    fVar.d(this.f29001b.k());
                }
            }
        } else if (this.f29003d == 4 && (dVar2 = (dVar = this.f29001b).T) != null && dVar2.f28478p0[1] == 1) {
            n.b(eVar3, dVar2.f28458e.f29007h, dVar.J.e());
            n.b(eVar2, dVar2.f28458e.i, -this.f29001b.L.e());
            return;
        }
        boolean z11 = fVar.f28984j;
        if (z11) {
            m1.d dVar7 = this.f29001b;
            if (dVar7.f28450a) {
                m1.c[] cVarArr = dVar7.Q;
                m1.c cVar = cVarArr[2];
                m1.c cVar2 = cVar.f28447f;
                if (cVar2 != null && cVarArr[3].f28447f != null) {
                    if (dVar7.y()) {
                        eVar3.f28981f = this.f29001b.Q[2].e();
                        eVar2.f28981f = -this.f29001b.Q[3].e();
                    } else {
                        e eVarH = n.h(this.f29001b.Q[2]);
                        if (eVarH != null) {
                            n.b(eVar3, eVarH, this.f29001b.Q[2].e());
                        }
                        e eVarH2 = n.h(this.f29001b.Q[3]);
                        if (eVarH2 != null) {
                            n.b(eVar2, eVarH2, -this.f29001b.Q[3].e());
                        }
                        eVar3.f28977b = true;
                        eVar2.f28977b = true;
                    }
                    m1.d dVar8 = this.f29001b;
                    if (dVar8.E) {
                        n.b(eVar, eVar3, dVar8.f28451a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar3, eVarH3, this.f29001b.Q[2].e());
                        n.b(eVar2, eVar3, fVar.f28982g);
                        m1.d dVar9 = this.f29001b;
                        if (dVar9.E) {
                            n.b(eVar, eVar3, dVar9.f28451a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m1.c cVar3 = cVarArr[3];
                if (cVar3.f28447f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar2, eVarH4, -this.f29001b.Q[3].e());
                        n.b(eVar3, eVar2, -fVar.f28982g);
                    }
                    m1.d dVar10 = this.f29001b;
                    if (dVar10.E) {
                        n.b(eVar, eVar3, dVar10.f28451a0);
                        return;
                    }
                    return;
                }
                m1.c cVar4 = cVarArr[4];
                if (cVar4.f28447f != null) {
                    e eVarH5 = n.h(cVar4);
                    if (eVarH5 != null) {
                        n.b(eVar, eVarH5, 0);
                        n.b(eVar3, eVar, -this.f29001b.f28451a0);
                        n.b(eVar2, eVar3, fVar.f28982g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof m1.i) || dVar7.T == null || dVar7.i(7).f28447f != null) {
                    return;
                }
                m1.d dVar11 = this.f29001b;
                n.b(eVar3, dVar11.T.f28458e.f29007h, dVar11.s());
                n.b(eVar2, eVar3, fVar.f28982g);
                m1.d dVar12 = this.f29001b;
                if (dVar12.E) {
                    n.b(eVar, eVar3, dVar12.f28451a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f29003d != 3) {
            fVar.b(this);
        } else {
            m1.d dVar13 = this.f29001b;
            int i10 = dVar13.f28481s;
            if (i10 == 2) {
                m1.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    f fVar2 = dVar14.f28458e.f29004e;
                    arrayList2.add(fVar2);
                    fVar2.f28985k.add(fVar);
                    fVar.f28977b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                m1.d dVar15 = this.f29001b;
                if (dVar15.f28480r != 3) {
                    f fVar3 = dVar15.f28456d.f29004e;
                    arrayList2.add(fVar3);
                    fVar3.f28985k.add(fVar);
                    fVar.f28977b = true;
                    arrayList.add(eVar3);
                    arrayList.add(eVar2);
                }
            }
        }
        m1.d dVar16 = this.f29001b;
        m1.c[] cVarArr2 = dVar16.Q;
        m1.c cVar5 = cVarArr2[2];
        m1.c cVar6 = cVar5.f28447f;
        if (cVar6 != null && cVarArr2[3].f28447f != null) {
            if (dVar16.y()) {
                eVar3.f28981f = this.f29001b.Q[2].e();
                eVar2.f28981f = -this.f29001b.Q[3].e();
            } else {
                e eVarH6 = n.h(this.f29001b.Q[2]);
                e eVarH7 = n.h(this.f29001b.Q[3]);
                if (eVarH6 != null) {
                    eVarH6.b(this);
                }
                if (eVarH7 != null) {
                    eVarH7.b(this);
                }
                this.f29008j = 4;
            }
            if (this.f29001b.E) {
                c(eVar, eVar3, 1, this.f28993l);
            }
        } else if (cVar6 != null) {
            e eVarH8 = n.h(cVar5);
            if (eVarH8 != null) {
                n.b(eVar3, eVarH8, this.f29001b.Q[2].e());
                c(eVar2, eVar3, 1, fVar);
                if (this.f29001b.E) {
                    c(eVar, eVar3, 1, this.f28993l);
                }
                if (this.f29003d == 3) {
                    m1.d dVar17 = this.f29001b;
                    if (dVar17.W > 0.0f) {
                        j jVar = dVar17.f28456d;
                        if (jVar.f29003d == 3) {
                            jVar.f29004e.f28985k.add(fVar);
                            arrayList2.add(this.f29001b.f28456d.f29004e);
                            fVar.f28976a = this;
                        }
                    }
                }
            }
        } else {
            m1.c cVar7 = cVarArr2[3];
            if (cVar7.f28447f != null) {
                e eVarH9 = n.h(cVar7);
                if (eVarH9 != null) {
                    n.b(eVar2, eVarH9, -this.f29001b.Q[3].e());
                    c(eVar3, eVar2, -1, fVar);
                    if (this.f29001b.E) {
                        c(eVar, eVar3, 1, this.f28993l);
                    }
                }
            } else {
                m1.c cVar8 = cVarArr2[4];
                if (cVar8.f28447f != null) {
                    e eVarH10 = n.h(cVar8);
                    if (eVarH10 != null) {
                        n.b(eVar, eVarH10, 0);
                        c(eVar3, eVar, -1, this.f28993l);
                        c(eVar2, eVar3, 1, fVar);
                    }
                } else if (!(dVar16 instanceof m1.i) && (dVar3 = dVar16.T) != null) {
                    n.b(eVar3, dVar3.f28458e.f29007h, dVar16.s());
                    c(eVar2, eVar3, 1, fVar);
                    if (this.f29001b.E) {
                        c(eVar, eVar3, 1, this.f28993l);
                    }
                    if (this.f29003d == 3) {
                        m1.d dVar18 = this.f29001b;
                        if (dVar18.W > 0.0f) {
                            j jVar2 = dVar18.f28456d;
                            if (jVar2.f29003d == 3) {
                                jVar2.f29004e.f28985k.add(fVar);
                                arrayList2.add(this.f29001b.f28456d.f29004e);
                                fVar.f28976a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            fVar.f28978c = true;
        }
    }

    @Override // n1.n
    public final void e() {
        e eVar = this.f29007h;
        if (eVar.f28984j) {
            this.f29001b.Z = eVar.f28982g;
        }
    }

    @Override // n1.n
    public final void f() {
        this.f29002c = null;
        this.f29007h.c();
        this.i.c();
        this.f28992k.c();
        this.f29004e.c();
        this.f29006g = false;
    }

    @Override // n1.n
    public final boolean k() {
        return this.f29003d != 3 || this.f29001b.f28481s == 0;
    }

    public final void m() {
        this.f29006g = false;
        e eVar = this.f29007h;
        eVar.c();
        eVar.f28984j = false;
        e eVar2 = this.i;
        eVar2.c();
        eVar2.f28984j = false;
        e eVar3 = this.f28992k;
        eVar3.c();
        eVar3.f28984j = false;
        this.f29004e.f28984j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f29001b.h0;
    }
}
