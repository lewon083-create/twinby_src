package w3;

import ad.j0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements v3.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f35073g;

    public k(j3.o oVar, j0 j0Var, n nVar, ArrayList arrayList) {
        super(oVar, j0Var, nVar, arrayList);
        this.f35073g = nVar;
    }

    @Override // v3.g
    public final long D(long j10, long j11) {
        return this.f35073g.f(j10, j11);
    }

    @Override // v3.g
    public final boolean N() {
        return this.f35073g.i();
    }

    @Override // v3.g
    public final long Q() {
        return this.f35073g.f35081d;
    }

    @Override // v3.g
    public final long S(long j10) {
        return this.f35073g.d(j10);
    }

    @Override // v3.g
    public final long T(long j10, long j11) {
        return this.f35073g.b(j10, j11);
    }

    @Override // w3.m
    public final String a() {
        return null;
    }

    @Override // v3.g
    public final long b(long j10) {
        return this.f35073g.g(j10);
    }

    @Override // w3.m
    public final j d() {
        return null;
    }

    @Override // v3.g
    public final long f(long j10, long j11) {
        return this.f35073g.e(j10, j11);
    }

    @Override // v3.g
    public final long m(long j10, long j11) {
        return this.f35073g.c(j10, j11);
    }

    @Override // v3.g
    public final long n(long j10, long j11) {
        n nVar = this.f35073g;
        if (nVar.f35083f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(jB, j10) + nVar.g(jB)) - nVar.i;
    }

    @Override // v3.g
    public final j o(long j10) {
        return this.f35073g.h(this, j10);
    }

    @Override // w3.m
    public final v3.g c() {
        return this;
    }
}
