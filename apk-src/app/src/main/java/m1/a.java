package m1;

import a0.u;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f28422s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f28423t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f28424u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f28425v0;

    @Override // m1.d
    public final boolean A() {
        return this.f28425v0;
    }

    @Override // m1.d
    public final boolean B() {
        return this.f28425v0;
    }

    public final boolean T() {
        int i;
        int i10;
        int i11;
        boolean z5 = true;
        int i12 = 0;
        while (true) {
            i = this.f28533r0;
            if (i12 >= i) {
                break;
            }
            d dVar = this.f28532q0[i12];
            if ((this.f28423t0 || dVar.c()) && ((((i10 = this.f28422s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f28422s0) == 2 || i11 == 3) && !dVar.B()))) {
                z5 = false;
            }
            i12++;
        }
        if (!z5 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f28533r0; i13++) {
            d dVar2 = this.f28532q0[i13];
            if (this.f28423t0 || dVar2.c()) {
                if (!z10) {
                    int i14 = this.f28422s0;
                    if (i14 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i14 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i14 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i14 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i15 = this.f28422s0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i16 = iMax + this.f28424u0;
        int i17 = this.f28422s0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f28425v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f28422s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // m1.d
    public final void b(k1.c cVar, boolean z5) {
        boolean z10;
        int i;
        int i10;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i12 = this.f28422s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.f28425v0) {
            T();
        }
        if (this.f28425v0) {
            this.f28425v0 = false;
            int i13 = this.f28422s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.i, this.Y);
                cVar.d(cVar4.i, this.Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.i, this.Z);
                    cVar.d(cVar5.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f28533r0; i14++) {
            d dVar = this.f28532q0[i14];
            if ((this.f28423t0 || dVar.c()) && ((((i10 = this.f28422s0) == 0 || i10 == 1) && dVar.f28478p0[0] == 3 && dVar.I.f28447f != null && dVar.K.f28447f != null) || ((i10 == 2 || i10 == 3) && dVar.f28478p0[1] == 3 && dVar.J.f28447f != null && dVar.L.f28447f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i15 = !(!z10 && (((i = this.f28422s0) == 0 && z11) || ((i == 2 && z12) || ((i == 1 && z11) || (i == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f28533r0) {
            d dVar2 = this.f28532q0[i16];
            if (this.f28423t0 || dVar2.c()) {
                k1.e eVarK = cVar.k(dVar2.Q[this.f28422s0]);
                c[] cVarArr2 = dVar2.Q;
                int i17 = this.f28422s0;
                c cVar8 = cVarArr2[i17];
                cVar8.i = eVarK;
                c cVar9 = cVar8.f28447f;
                int i18 = (cVar9 == null || cVar9.f28445d != this) ? 0 : cVar8.f28448g;
                if (i17 == 0 || i17 == i11) {
                    k1.e eVar = cVar7.i;
                    int i19 = this.f28424u0 - i18;
                    k1.b bVarL = cVar.l();
                    k1.e eVarM = cVar.m();
                    eVarM.f26822e = 0;
                    bVarL.c(eVar, eVarK, eVarM, i19);
                    cVar.c(bVarL);
                } else {
                    k1.e eVar2 = cVar7.i;
                    int i20 = this.f28424u0 + i18;
                    k1.b bVarL2 = cVar.l();
                    k1.e eVarM2 = cVar.m();
                    eVarM2.f26822e = 0;
                    bVarL2.b(eVar2, eVarK, eVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.i, eVarK, this.f28424u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f28422s0;
        if (i21 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.T.K.i, 0, 4);
            cVar.e(cVar2.i, this.T.I.i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.T.I.i, 0, 4);
            cVar.e(cVar2.i, this.T.K.i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.T.L.i, 0, 4);
            cVar.e(cVar3.i, this.T.J.i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.T.J.i, 0, 4);
            cVar.e(cVar3.i, this.T.L.i, 0, 0);
        }
    }

    @Override // m1.d
    public final boolean c() {
        return true;
    }

    @Override // m1.d
    public final String toString() {
        String strO = u.o(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.f28533r0; i++) {
            d dVar = this.f28532q0[i];
            if (i > 0) {
                strO = om1.x(strO, ", ");
            }
            StringBuilder sbJ = pe.a.j(strO);
            sbJ.append(dVar.h0);
            strO = sbJ.toString();
        }
        return om1.x(strO, "}");
    }
}
