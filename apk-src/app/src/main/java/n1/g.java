package n1;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f28988a = new b();

    public static boolean a(m1.d dVar) {
        int[] iArr = dVar.f28478p0;
        int i = iArr[0];
        int i10 = iArr[1];
        m1.d dVar2 = dVar.T;
        m1.e eVar = dVar2 != null ? (m1.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f28478p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f28478p0[1];
        }
        boolean z5 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f28480r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f28480r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f28481s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i10 == 3 && dVar.f28481s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z5 || z10)) || (z5 && z10);
    }

    public static m b(m1.d dVar, int i, ArrayList arrayList, m mVar) {
        int i10;
        int i11 = i == 0 ? dVar.f28475n0 : dVar.o0;
        if (i11 != -1 && (mVar == null || i11 != mVar.f28996b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i12);
                if (mVar2.f28996b == i11) {
                    if (mVar != null) {
                        mVar.c(i, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (dVar instanceof m1.i) {
                m1.i iVar = (m1.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f28533r0) {
                        i10 = -1;
                        break;
                    }
                    m1.d dVar2 = iVar.f28532q0[i13];
                    if ((i == 0 && (i10 = dVar2.f28475n0) != -1) || (i == 1 && (i10 = dVar2.o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        m mVar3 = (m) arrayList.get(i14);
                        if (mVar3.f28996b == i10) {
                            mVar = mVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f28995a = new ArrayList();
                mVar.f28998d = null;
                mVar.f28999e = -1;
                int i15 = m.f28994f;
                m.f28994f = i15 + 1;
                mVar.f28996b = i15;
                mVar.f28997c = i;
            }
            arrayList.add(mVar);
        }
        int i16 = mVar.f28996b;
        ArrayList arrayList2 = mVar.f28995a;
        if (arrayList2.contains(dVar)) {
            return mVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof m1.h) {
            m1.h hVar = (m1.h) dVar;
            hVar.f28529t0.c(hVar.f28530u0 == 0 ? 1 : 0, arrayList, mVar);
        }
        if (i == 0) {
            dVar.f28475n0 = i16;
            dVar.I.c(i, arrayList, mVar);
            dVar.K.c(i, arrayList, mVar);
        } else {
            dVar.o0 = i16;
            dVar.J.c(i, arrayList, mVar);
            dVar.M.c(i, arrayList, mVar);
            dVar.L.c(i, arrayList, mVar);
        }
        dVar.P.c(i, arrayList, mVar);
        return mVar;
    }

    public static void c(int i, m1.d dVar, p1.e eVar, boolean z5) {
        m1.c cVar;
        m1.c cVar2;
        boolean z10;
        m1.c cVar3;
        m1.c cVar4;
        if (dVar.f28472m) {
            return;
        }
        if (!(dVar instanceof m1.e) && dVar.z() && a(dVar)) {
            m1.e.V(dVar, eVar, new b());
        }
        m1.c cVarI = dVar.i(2);
        m1.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<m1.c> hashSet = cVarI.f28442a;
        if (hashSet != null && cVarI.f28444c) {
            for (m1.c cVar5 : hashSet) {
                m1.d dVar2 = cVar5.f28445d;
                int i10 = i + 1;
                boolean zA = a(dVar2);
                m1.c cVar6 = dVar2.I;
                m1.c cVar7 = dVar2.K;
                if (dVar2.z() && zA) {
                    z10 = true;
                    m1.e.V(dVar2, eVar, new b());
                } else {
                    z10 = true;
                }
                boolean z11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f28447f) != null && cVar4.f28444c) || (cVar5 == cVar7 && (cVar3 = cVar6.f28447f) != null && cVar3.f28444c)) ? z10 : false;
                int i11 = dVar2.f28478p0[0];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f28447f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i10, dVar2, eVar, z5);
                        } else if (cVar5 == cVar7 && cVar6.f28447f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i10, dVar2, eVar, z5);
                        } else if (z11 && !dVar2.x()) {
                            d(i10, dVar2, eVar, z5);
                        }
                    }
                } else if (i11 == 3 && dVar2.f28484v >= 0 && dVar2.f28483u >= 0 && (dVar2.f28463g0 == 8 || (dVar2.f28480r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z11 && !dVar2.x()) {
                        e(i10, dVar, eVar, dVar2, z5);
                    }
                }
            }
        }
        if (dVar instanceof m1.h) {
            return;
        }
        HashSet<m1.c> hashSet2 = cVarI2.f28442a;
        if (hashSet2 != null && cVarI2.f28444c) {
            for (m1.c cVar8 : hashSet2) {
                m1.d dVar3 = cVar8.f28445d;
                int i12 = i + 1;
                boolean zA2 = a(dVar3);
                m1.c cVar9 = dVar3.I;
                m1.c cVar10 = dVar3.K;
                if (dVar3.z() && zA2) {
                    m1.e.V(dVar3, eVar, new b());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f28447f) != null && cVar2.f28444c) || (cVar8 == cVar10 && (cVar = cVar9.f28447f) != null && cVar.f28444c);
                int i13 = dVar3.f28478p0[0];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f28447f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i12, dVar3, eVar, z5);
                        } else if (cVar8 == cVar10 && cVar9.f28447f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i12, dVar3, eVar, z5);
                        } else if (z12 && !dVar3.x()) {
                            d(i12, dVar3, eVar, z5);
                        }
                    }
                } else if (i13 == 3 && dVar3.f28484v >= 0 && dVar3.f28483u >= 0) {
                    if (dVar3.f28463g0 == 8 || (dVar3.f28480r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z12 && !dVar3.x()) {
                            e(i12, dVar, eVar, dVar3, z5);
                        }
                    }
                }
            }
        }
        dVar.f28472m = true;
    }

    public static void d(int i, m1.d dVar, p1.e eVar, boolean z5) {
        float f10 = dVar.f28457d0;
        m1.c cVar = dVar.I;
        int iD = cVar.f28447f.d();
        m1.c cVar2 = dVar.K;
        int iD2 = cVar2.f28447f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i10 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i10 = (iD - iD2) - iQ;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iQ;
        if (iD > iD2) {
            i12 = i11 - iQ;
        }
        dVar.J(i11, i12);
        c(i + 1, dVar, eVar, z5);
    }

    public static void e(int i, m1.d dVar, p1.e eVar, m1.d dVar2, boolean z5) {
        float f10 = dVar2.f28457d0;
        m1.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f28447f.d();
        m1.c cVar2 = dVar2.K;
        int iD = cVar2.f28447f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f28463g0 != 8) {
                int i10 = dVar2.f28480r;
                if (i10 == 2) {
                    iQ = (int) (dVar2.f28457d0 * 0.5f * (dVar instanceof m1.e ? dVar.q() : dVar.T.q()));
                } else if (i10 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f28483u, iQ);
                int i11 = dVar2.f28484v;
                if (i11 > 0) {
                    iQ = Math.min(i11, iQ);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i12, iQ + i12);
            c(i + 1, dVar2, eVar, z5);
        }
    }

    public static void f(int i, m1.d dVar, p1.e eVar) {
        float f10 = dVar.f28459e0;
        m1.c cVar = dVar.J;
        int iD = cVar.f28447f.d();
        m1.c cVar2 = dVar.L;
        int iD2 = cVar2.f28447f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        dVar.K(i12, i13);
        i(i + 1, dVar, eVar);
    }

    public static void g(int i, m1.d dVar, p1.e eVar, m1.d dVar2) {
        float f10 = dVar2.f28459e0;
        m1.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f28447f.d();
        m1.c cVar2 = dVar2.L;
        int iD = cVar2.f28447f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f28463g0 != 8) {
                int i10 = dVar2.f28481s;
                if (i10 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof m1.e ? dVar.k() : dVar.T.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f28486x, iK);
                int i11 = dVar2.f28487y;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i12, iK + i12);
            i(i + 1, dVar2, eVar);
        }
    }

    public static boolean h(int i, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i, m1.d dVar, p1.e eVar) {
        boolean z5;
        m1.c cVar;
        m1.c cVar2;
        m1.c cVar3;
        m1.c cVar4;
        if (dVar.f28474n) {
            return;
        }
        if (!(dVar instanceof m1.e) && dVar.z() && a(dVar)) {
            m1.e.V(dVar, eVar, new b());
        }
        m1.c cVarI = dVar.i(3);
        m1.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<m1.c> hashSet = cVarI.f28442a;
        if (hashSet != null && cVarI.f28444c) {
            for (m1.c cVar5 : hashSet) {
                m1.d dVar2 = cVar5.f28445d;
                int i10 = i + 1;
                boolean zA = a(dVar2);
                m1.c cVar6 = dVar2.J;
                m1.c cVar7 = dVar2.L;
                if (dVar2.z() && zA) {
                    m1.e.V(dVar2, eVar, new b());
                }
                boolean z10 = (cVar5 == cVar6 && (cVar4 = cVar7.f28447f) != null && cVar4.f28444c) || (cVar5 == cVar7 && (cVar3 = cVar6.f28447f) != null && cVar3.f28444c);
                int i11 = dVar2.f28478p0[1];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f28447f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i10, dVar2, eVar);
                        } else if (cVar5 == cVar7 && cVar6.f28447f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i10, dVar2, eVar);
                        } else if (z10 && !dVar2.y()) {
                            f(i10, dVar2, eVar);
                        }
                    }
                } else if (i11 == 3 && dVar2.f28487y >= 0 && dVar2.f28486x >= 0 && (dVar2.f28463g0 == 8 || (dVar2.f28481s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z10 && !dVar2.y()) {
                        g(i10, dVar, eVar, dVar2);
                    }
                }
            }
        }
        boolean z11 = true;
        z11 = true;
        z11 = true;
        if (dVar instanceof m1.h) {
            return;
        }
        HashSet<m1.c> hashSet2 = cVarI2.f28442a;
        if (hashSet2 != null && cVarI2.f28444c) {
            for (m1.c cVar8 : hashSet2) {
                m1.d dVar3 = cVar8.f28445d;
                int i12 = i + 1;
                boolean zA2 = a(dVar3);
                m1.c cVar9 = dVar3.J;
                m1.c cVar10 = dVar3.L;
                if (dVar3.z() && zA2) {
                    m1.e.V(dVar3, eVar, new b());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f28447f) != null && cVar2.f28444c) || (cVar8 == cVar10 && (cVar = cVar9.f28447f) != null && cVar.f28444c);
                int i13 = dVar3.f28478p0[1];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f28447f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i12, dVar3, eVar);
                        } else if (cVar8 == cVar10 && cVar9.f28447f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i12, dVar3, eVar);
                        } else if (z12 && !dVar3.y()) {
                            f(i12, dVar3, eVar);
                        }
                    }
                } else if (i13 == 3 && dVar3.f28487y >= 0 && dVar3.f28486x >= 0 && (dVar3.f28463g0 == 8 || (dVar3.f28481s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z12 && !dVar3.y()) {
                        g(i12, dVar, eVar, dVar3);
                    }
                }
            }
        }
        m1.c cVarI3 = dVar.i(6);
        if (cVarI3.f28442a != null && cVarI3.f28444c) {
            int iD3 = cVarI3.d();
            for (m1.c cVar11 : cVarI3.f28442a) {
                m1.d dVar4 = cVar11.f28445d;
                int i14 = i + 1;
                boolean zA3 = a(dVar4);
                m1.c cVar12 = dVar4.M;
                if (dVar4.z() && zA3) {
                    m1.e.V(dVar4, eVar, new b());
                }
                if (dVar4.f28478p0[z11 ? 1 : 0] != 3 || zA3) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (dVar4.E) {
                                int i15 = iE5 - dVar4.f28451a0;
                                int i16 = dVar4.V + i15;
                                dVar4.Z = i15;
                                dVar4.J.l(i15);
                                dVar4.L.l(i16);
                                cVar12.l(iE5);
                                z5 = z11 ? 1 : 0;
                                dVar4.f28470l = z5;
                            } else {
                                z5 = z11 ? 1 : 0;
                            }
                            i(i14, dVar4, eVar);
                        }
                        z11 = z5;
                    }
                }
                z5 = z11 ? 1 : 0;
                z11 = z5;
            }
        }
        dVar.f28474n = z11;
    }
}
