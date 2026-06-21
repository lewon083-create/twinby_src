package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g41 implements vp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m41 f38655b;

    public g41(m41 m41Var, String str) {
        this.f38655b = m41Var;
        this.f38654a = str;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        m41 m41Var = this.f38655b;
        String str = this.f38654a;
        i41 i41Var = (i41) m41Var.f40791c.remove(str);
        if (i41Var != null) {
            i41Var.f39431c = lm3Var;
            m41Var.f40792d.put(str, i41Var);
            if (m41Var.f40794f == null) {
                h41 h41Var = new h41(m41Var);
                m41Var.f40794f = h41Var;
                m41Var.f40793e.postDelayed(h41Var, 100);
            }
        }
    }
}
