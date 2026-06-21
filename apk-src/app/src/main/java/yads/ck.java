package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ck implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f37411c;

    public ck(wj wjVar, nx0 nx0Var) {
        lb2 lb2Var = wjVar.f44413b;
        this.f37411c = lb2Var;
        lb2Var.e(12);
        int iP = lb2Var.p();
        if ("audio/raw".equals(nx0Var.f41375m)) {
            int iB = lb3.b(nx0Var.B, nx0Var.f41388z);
            if (iP == 0 || iP % iB != 0) {
                kh1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iP);
                iP = iB;
            }
        }
        this.f37409a = iP == 0 ? -1 : iP;
        this.f37410b = lb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return this.f37409a;
    }

    @Override // yads.ak
    public final int b() {
        return this.f37410b;
    }

    @Override // yads.ak
    public final int c() {
        int i = this.f37409a;
        return i == -1 ? this.f37411c.p() : i;
    }
}
