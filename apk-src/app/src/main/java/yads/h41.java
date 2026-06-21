package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h41 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m41 f39024b;

    public h41(m41 m41Var) {
        this.f39024b = m41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (i41 i41Var : this.f39024b.f40792d.values()) {
            for (k41 k41Var : i41Var.f39432d) {
                l41 l41Var = k41Var.f40063b;
                if (l41Var != null) {
                    lm3 lm3Var = i41Var.f39431c;
                    if (lm3Var == null) {
                        k41Var.f40062a = i41Var.f39430b;
                        l41Var.a(k41Var, false);
                    } else {
                        l41Var.a(lm3Var);
                    }
                }
            }
        }
        this.f39024b.f40792d.clear();
        this.f39024b.f40794f = null;
    }
}
