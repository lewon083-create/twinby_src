package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gw1 extends fo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv1 f38917b;

    public gw1(iw1 iw1Var, oh3 oh3Var, zv1 zv1Var, zv1 zv1Var2, zv1 zv1Var3, jw1 jw1Var, yv1 yv1Var) {
        super(iw1Var);
        this.f38917b = yv1Var;
        yv1Var.f45168l = jw1Var;
        yv1Var.a(oh3Var);
        yv1Var.a(zv1Var);
        yv1Var.b(zv1Var2);
        yv1Var.c(zv1Var3);
    }

    @Override // yads.fo
    public final void a(String str) {
        this.f38917b.a(str);
    }

    public final void a(mw1 mw1Var) {
        this.f38503a.setHtmlWebViewListener(new bw1(this.f38917b));
    }
}
