package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class os1 implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps2 f41692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41693c;

    public os1(ps2 ps2Var, long j10) {
        this.f41692b = ps2Var;
        this.f41693c = j10;
    }

    @Override // yads.ps2
    public final void a() {
        this.f41692b.a();
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return this.f41692b.isReady();
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        int iA = this.f41692b.a(ox0Var, sa0Var, i);
        if (iA == -4) {
            sa0Var.f42866f = Math.max(0L, sa0Var.f42866f + this.f41693c);
        }
        return iA;
    }

    @Override // yads.ps2
    public final int a(long j10) {
        return this.f41692b.a(j10 - this.f41693c);
    }
}
