package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r33 implements qq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq0 f42484c;

    public r33(long j10, qq0 qq0Var) {
        this.f42483b = j10;
        this.f42484c = qq0Var;
    }

    @Override // yads.qq0
    public final void a() {
        this.f42484c.a();
    }

    @Override // yads.qq0
    public final void a(yw2 yw2Var) {
        this.f42484c.a(new q33(this, yw2Var));
    }

    @Override // yads.qq0
    public final p73 a(int i, int i10) {
        return this.f42484c.a(i, i10);
    }
}
