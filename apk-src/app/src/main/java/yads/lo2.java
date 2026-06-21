package yads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lo2 extends no2 implements i30 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fx2 f40630f;

    public lo2(long j10, nx0 nx0Var, r51 r51Var, fx2 fx2Var, ArrayList arrayList) {
        super(nx0Var, r51Var, fx2Var, arrayList);
        this.f40630f = fx2Var;
    }

    @Override // yads.i30
    public final long a(long j10, long j11) {
        return this.f40630f.c(j10, j11);
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f40630f.b(j10, j11);
    }

    @Override // yads.no2
    public final String c() {
        return null;
    }

    @Override // yads.no2
    public final i30 d() {
        return this;
    }

    @Override // yads.no2
    public final rl2 e() {
        return null;
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f40630f.b(j10);
    }

    @Override // yads.i30
    public final long b() {
        return this.f40630f.f38570d;
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return this.f40630f.a(j10, j11);
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        fx2 fx2Var = this.f40630f;
        if (fx2Var.f38572f != null) {
            return -9223372036854775807L;
        }
        long jA = fx2Var.a(j10, j11);
        long jA2 = fx2Var.a(j10);
        if (jA2 == -1) {
            jA2 = (int) (fx2Var.c((j11 - fx2Var.f38574h) + fx2Var.i, j10) - fx2Var.a(j10, j11));
        }
        long j12 = jA2 + jA;
        return (fx2Var.b(j12, j10) + fx2Var.b(j12)) - fx2Var.i;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        long jA = this.f40630f.a(j10);
        return jA != -1 ? jA : (int) (r0.c((j11 - r0.f38574h) + r0.i, j10) - r0.a(j10, j11));
    }

    @Override // yads.i30
    public final boolean a() {
        return this.f40630f.b();
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f40630f.a(j10);
    }

    @Override // yads.i30
    public final rl2 b(long j10) {
        return this.f40630f.a(j10, this);
    }
}
