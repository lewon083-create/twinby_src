package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i93 implements uw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb2 f39467a = new kb2(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k93 f39468b;

    public i93(k93 k93Var) {
        this.f39468b = k93Var;
    }

    @Override // yads.uw2
    public final void a(b73 b73Var, qq0 qq0Var, o93 o93Var) {
    }

    @Override // yads.uw2
    public final void a(lb2 lb2Var) {
        if (lb2Var.m() == 0 && (lb2Var.m() & 128) != 0) {
            lb2Var.e(lb2Var.f40464b + 6);
            int i = (lb2Var.f40465c - lb2Var.f40464b) / 4;
            for (int i10 = 0; i10 < i; i10++) {
                kb2 kb2Var = this.f39467a;
                lb2Var.a(kb2Var.f40144a, 0, 4);
                kb2Var.b(0);
                int iA = this.f39467a.a(16);
                this.f39467a.c(3);
                if (iA == 0) {
                    this.f39467a.c(13);
                } else {
                    int iA2 = this.f39467a.a(13);
                    if (this.f39468b.f40114g.get(iA2) == null) {
                        k93 k93Var = this.f39468b;
                        k93Var.f40114g.put(iA2, new vw2(new j93(k93Var, iA2)));
                        this.f39468b.f40119m++;
                    }
                }
            }
            k93 k93Var2 = this.f39468b;
            if (k93Var2.f40108a != 2) {
                k93Var2.f40114g.remove(0);
            }
        }
    }
}
