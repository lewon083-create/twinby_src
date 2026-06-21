package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mc3 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me3 f40878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk3 f40879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df3 f40880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik3 f40881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40882e;

    public mc3(me3 me3Var, ck3 ck3Var, df3 df3Var, ik3 ik3Var) {
        this.f40878a = me3Var;
        this.f40879b = ck3Var;
        this.f40880c = df3Var;
        this.f40881d = ik3Var;
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        if (this.f40882e || j11 <= 0 || !this.f40881d.a()) {
            return;
        }
        this.f40882e = true;
        this.f40879b.h();
        this.f40880c.f(this.f40878a);
    }

    public /* synthetic */ mc3(me3 me3Var, hk3 hk3Var, ck3 ck3Var, df3 df3Var) {
        this(me3Var, ck3Var, df3Var, new ik3(hk3Var));
    }
}
