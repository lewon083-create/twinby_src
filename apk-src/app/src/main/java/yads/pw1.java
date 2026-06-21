package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pw1 implements hw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1 f42089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f42090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qw1 f42091c;

    public pw1(uw1 uw1Var, qj1 qj1Var, qw1 qw1Var) {
        this.f42089a = uw1Var;
        this.f42090b = qj1Var;
        this.f42091c = qw1Var;
    }

    @Override // yads.hw1
    public final void a() {
        uw1 uw1Var = this.f42089a;
        qw1 qw1Var = this.f42091c;
        if (qw1Var.f42407a && qw1Var.f42408b.isActive()) {
            hk.j jVar = qw1Var.f42408b;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(Unit.f27471a);
        }
    }

    @Override // yads.hw1
    public final void b() {
        qw1 qw1Var = this.f42091c;
        if (qw1Var.f42407a && qw1Var.f42408b.isActive()) {
            hk.j jVar = qw1Var.f42408b;
            ij.k kVar = ij.m.f21341c;
            jVar.resumeWith(Unit.f27471a);
        }
    }
}
