package t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f33047b;

    public void a() {
        h1 h1Var = this.f33047b;
        synchronized (h1Var.f33063a) {
            try {
                if (h1Var.f33071j == 8) {
                    h1Var.l(h1Var.f33068f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        String str;
        h1 h1Var = this.f33047b;
        synchronized (h1Var.f33063a) {
            f2.g.h("Release completer expected to be null", h1Var.f33073l == null);
            h1Var.f33073l = hVar;
            str = "Release[session=" + h1Var + "]";
        }
        return str;
    }
}
