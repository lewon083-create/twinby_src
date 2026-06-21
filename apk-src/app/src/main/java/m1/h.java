package m1;

import java.util.ArrayList;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f28526q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f28527r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f28528s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f28529t0 = this.J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f28530u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f28531v0;

    public h() {
        this.R.clear();
        this.R.add(this.f28529t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f28529t0;
        }
    }

    @Override // m1.d
    public final boolean A() {
        return this.f28531v0;
    }

    @Override // m1.d
    public final boolean B() {
        return this.f28531v0;
    }

    @Override // m1.d
    public final void Q(k1.c cVar, boolean z5) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f28529t0;
        cVar.getClass();
        int iN = k1.c.n(cVar2);
        if (this.f28530u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.f28529t0.l(i);
        this.f28531v0 = true;
    }

    public final void S(int i) {
        if (this.f28530u0 == i) {
            return;
        }
        this.f28530u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f28530u0 == 1) {
            this.f28529t0 = this.I;
        } else {
            this.f28529t0 = this.J;
        }
        arrayList.add(this.f28529t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f28529t0;
        }
    }

    @Override // m1.d
    public final void b(k1.c cVar, boolean z5) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.T;
        boolean z10 = dVar != null && dVar.f28478p0[0] == 2;
        if (this.f28530u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.T;
            z10 = dVar2 != null && dVar2.f28478p0[1] == 2;
        }
        if (this.f28531v0) {
            c cVar2 = this.f28529t0;
            if (cVar2.f28444c) {
                k1.e eVarK = cVar.k(cVar2);
                cVar.d(eVarK, this.f28529t0.d());
                if (this.f28527r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), eVarK, 0, 5);
                    }
                } else if (this.f28528s0 != -1 && z10) {
                    k1.e eVarK2 = cVar.k(objI2);
                    cVar.f(eVarK, cVar.k(objI), 0, 5);
                    cVar.f(eVarK2, eVarK, 0, 5);
                }
                this.f28531v0 = false;
                return;
            }
        }
        if (this.f28527r0 != -1) {
            k1.e eVarK3 = cVar.k(this.f28529t0);
            cVar.e(eVarK3, cVar.k(objI), this.f28527r0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), eVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f28528s0 != -1) {
            k1.e eVarK4 = cVar.k(this.f28529t0);
            k1.e eVarK5 = cVar.k(objI2);
            cVar.e(eVarK4, eVarK5, -this.f28528s0, 8);
            if (z10) {
                cVar.f(eVarK4, cVar.k(objI), 0, 5);
                cVar.f(eVarK5, eVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f28526q0 != -1.0f) {
            k1.e eVarK6 = cVar.k(this.f28529t0);
            k1.e eVarK7 = cVar.k(objI2);
            float f10 = this.f28526q0;
            k1.b bVarL = cVar.l();
            bVarL.f26798d.g(eVarK6, -1.0f);
            bVarL.f26798d.g(eVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // m1.d
    public final boolean c() {
        return true;
    }

    @Override // m1.d
    public final c i(int i) {
        int iM = z.m(i);
        if (iM != 1) {
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        return null;
                    }
                }
            }
            if (this.f28530u0 == 0) {
                return this.f28529t0;
            }
            return null;
        }
        if (this.f28530u0 == 1) {
            return this.f28529t0;
        }
        return null;
    }
}
