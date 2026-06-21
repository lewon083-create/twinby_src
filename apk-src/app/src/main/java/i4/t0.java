package i4;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f21014c;

    public t0(v0 v0Var, int i) {
        this.f21014c = v0Var;
        this.f21013b = i;
    }

    @Override // i4.b1
    public final void a() throws IOException {
        int i = this.f21013b;
        v0 v0Var = this.f21014c;
        v0Var.f21045v[i].z();
        m4.n nVar = v0Var.f21036m;
        int iE = v0Var.f21029e.e(v0Var.F);
        IOException iOException = nVar.f28673d;
        if (iOException != null) {
            throw iOException;
        }
        m4.j jVar = nVar.f28672c;
        if (jVar != null) {
            if (iE == Integer.MIN_VALUE) {
                iE = jVar.f28659b;
            }
            IOException iOException2 = jVar.f28663f;
            if (iOException2 != null && jVar.f28664g > iE) {
                throw iOException2;
            }
        }
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        v0 v0Var = this.f21014c;
        if (v0Var.w()) {
            return -3;
        }
        int i10 = this.f21013b;
        v0Var.r(i10);
        int iC = v0Var.f21045v[i10].C(bVar, eVar, i, v0Var.P);
        if (iC == -3) {
            v0Var.s(i10);
        }
        return iC;
    }

    @Override // i4.b1
    public final int h(long j10) {
        v0 v0Var = this.f21014c;
        if (v0Var.w()) {
            return 0;
        }
        int i = this.f21013b;
        v0Var.r(i);
        a1 a1Var = v0Var.f21045v[i];
        int iV = a1Var.v(j10, v0Var.P);
        a1Var.H(iV);
        if (iV == 0) {
            v0Var.s(i);
        }
        return iV;
    }

    @Override // i4.b1
    public final boolean isReady() {
        v0 v0Var = this.f21014c;
        return !v0Var.w() && v0Var.f21045v[this.f21013b].x(v0Var.P);
    }
}
