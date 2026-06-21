package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v92 implements wp2, vp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od3 f43957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w92 f43958c;

    public v92(w92 w92Var, String str, y92 y92Var) {
        this.f43958c = w92Var;
        this.f43956a = str;
        this.f43957b = y92Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        this.f43957b.a();
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        ((vg1) this.f43958c.f44311b.f36669a).a("YmadOmSdkJs", (String) obj);
        aa2 aa2Var = this.f43958c.f44311b;
        ((vg1) aa2Var.f36669a).a("YmadOmSdkJsUrl", this.f43956a);
        this.f43957b.a();
    }
}
