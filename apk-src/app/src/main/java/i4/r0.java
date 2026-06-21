package i4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements q4.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f20991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f20992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.j f20993c = new q4.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f20994d = new AtomicReference(q0.f20987b);

    public r0(a1 a1Var) {
        this.f20991a = a1Var;
        this.f20992b = a1Var;
    }

    @Override // q4.a0
    public final void a(j3.o oVar) {
        this.f20991a.a(oVar);
    }

    @Override // q4.a0
    public final int c(j3.h hVar, int i, boolean z5) {
        return h().c(hVar, i, z5);
    }

    @Override // q4.a0
    public final void d(int i, m3.p pVar) {
        h().d(i, pVar);
    }

    @Override // q4.a0
    public final void e(m3.p pVar, int i, int i10) {
        h().e(pVar, i, i10);
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, q4.z zVar) {
        h().f(j10, i, i10, i11, zVar);
        AtomicReference atomicReference = this.f20994d;
        if (atomicReference.get() == q0.f20988c) {
            this.f20992b.E(false);
            atomicReference.set(q0.f20989d);
        }
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) {
        return h().g(hVar, i, z5);
    }

    public final q4.a0 h() {
        return this.f20994d.get() == q0.f20989d ? this.f20993c : this.f20992b;
    }

    @Override // q4.a0
    public final void b(long j10) {
    }
}
