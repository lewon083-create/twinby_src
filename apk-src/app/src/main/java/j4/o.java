package j4;

import com.google.android.gms.internal.measurement.j4;
import i4.a1;
import p3.c0;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j3.o f26518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f26519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f26520s;

    public o(p3.h hVar, p3.l lVar, j3.o oVar, int i, Object obj, long j10, long j11, long j12, int i10, j3.o oVar2) {
        super(hVar, lVar, oVar, i, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f26517p = i10;
        this.f26518q = oVar2;
    }

    @Override // j4.m
    public final boolean b() {
        return this.f26520s;
    }

    @Override // m4.k
    public final void load() {
        c0 c0Var = this.f26476j;
        h3.e eVar = this.f26446n;
        eVar.getClass();
        for (a1 a1Var : (a1[]) eVar.f20376d) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.f20857z = true;
            }
        }
        a0 a0VarE = eVar.E(this.f26517p);
        a0VarE.a(this.f26518q);
        try {
            long jOpen = c0Var.open(this.f26470c.c(this.f26519r));
            if (jOpen != -1) {
                jOpen += this.f26519r;
            }
            q4.h hVar = new q4.h(this.f26476j, this.f26519r, jOpen);
            for (int iC = 0; iC != -1; iC = a0VarE.c(hVar, Integer.MAX_VALUE, true)) {
                this.f26519r += (long) iC;
            }
            a0VarE.f(this.f26475h, 1, (int) this.f26519r, 0, null);
            j4.g(c0Var);
            this.f26520s = true;
        } catch (Throwable th2) {
            j4.g(c0Var);
            throw th2;
        }
    }

    @Override // m4.k
    public final void d() {
    }
}
