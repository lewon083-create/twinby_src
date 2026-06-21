package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dk2 implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2 f37795c;

    public dk2(gk2 gk2Var, int i) {
        this.f37795c = gk2Var;
        this.f37794b = i;
    }

    @Override // yads.ps2
    public final void a() throws IOException {
        gk2 gk2Var = this.f37795c;
        os2 os2Var = gk2Var.f38804t[this.f37794b];
        nk0 nk0Var = os2Var.f41701h;
        if (nk0Var == null || nk0Var.getState() != 1) {
            gk2Var.f38796l.a(gk2Var.f38790e.a(gk2Var.C));
        } else {
            mk0 mk0VarC = os2Var.f41701h.c();
            mk0VarC.getClass();
            throw mk0VarC;
        }
    }

    @Override // yads.ps2
    public final boolean isReady() {
        gk2 gk2Var = this.f37795c;
        return !gk2Var.E && gk2Var.I == -9223372036854775807L && gk2Var.f38804t[this.f37794b].a(gk2Var.L);
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        gk2 gk2Var = this.f37795c;
        int i10 = this.f37794b;
        if (gk2Var.E || gk2Var.I != -9223372036854775807L) {
            return -3;
        }
        gk2Var.c();
        fk2 fk2Var = gk2Var.f38809y;
        boolean[] zArr = fk2Var.f38471d;
        if (!zArr[i10]) {
            nx0 nx0Var = fk2Var.f38468a.a(i10).f40098e[0];
            dn1 dn1Var = gk2Var.f38791f;
            dn1Var.a(new jm1(1, jt1.d(nx0Var.f41375m), nx0Var, 0, null, dn1Var.a(gk2Var.H), -9223372036854775807L));
            zArr[i10] = true;
        }
        int iA = gk2Var.f38804t[i10].a(ox0Var, sa0Var, i, gk2Var.L);
        if (iA == -3) {
            gk2Var.a(i10);
        }
        return iA;
    }

    @Override // yads.ps2
    public final int a(long j10) throws Throwable {
        gk2 gk2Var = this.f37795c;
        int i = this.f37794b;
        if (gk2Var.E || gk2Var.I != -9223372036854775807L) {
            return 0;
        }
        gk2Var.c();
        fk2 fk2Var = gk2Var.f38809y;
        boolean[] zArr = fk2Var.f38471d;
        if (!zArr[i]) {
            nx0 nx0Var = fk2Var.f38468a.a(i).f40098e[0];
            dn1 dn1Var = gk2Var.f38791f;
            dn1Var.a(new jm1(1, jt1.d(nx0Var.f41375m), nx0Var, 0, null, dn1Var.a(gk2Var.H), -9223372036854775807L));
            zArr[i] = true;
        }
        os2 os2Var = gk2Var.f38804t[i];
        int iA = os2Var.a(j10, gk2Var.L);
        synchronized (os2Var) {
            if (iA >= 0) {
                int i10 = os2Var.f41711s + iA;
                if (i10 <= os2Var.f41708p) {
                    os2Var.f41711s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA == 0) {
            gk2Var.a(i);
        }
        return iA;
    }
}
