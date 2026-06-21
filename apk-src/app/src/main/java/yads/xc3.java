package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xc3 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk3 f44640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf3 f44641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik3 f44642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44643d;

    public xc3(ck3 ck3Var, kf3 kf3Var, ik3 ik3Var) {
        this.f44640a = ck3Var;
        this.f44641b = kf3Var;
        this.f44642c = ik3Var;
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        if (this.f44643d || j11 <= 0 || !this.f44642c.a()) {
            return;
        }
        this.f44643d = true;
        this.f44640a.a(this.f44641b.getVolume(), j10);
    }

    public /* synthetic */ xc3(hk3 hk3Var, ck3 ck3Var, kf3 kf3Var) {
        this(ck3Var, kf3Var, new ik3(hk3Var));
    }
}
