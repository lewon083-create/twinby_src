package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum k1 extends c3 {
    public k1() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        h1 h1Var = c3.D;
        if (cD == 0) {
            m0Var.m(this);
            m0Var.f((char) 65533);
            m0Var.f35463c = h1Var;
            return;
        }
        if (cD == '-') {
            m0Var.f(cD);
            return;
        }
        if (cD == '<') {
            m0Var.f(cD);
            m0Var.f35463c = c3.G;
        } else if (cD == '>') {
            m0Var.f(cD);
            m0Var.f35463c = c3.f35396g;
        } else if (cD != 65535) {
            m0Var.f(cD);
            m0Var.f35463c = h1Var;
        } else {
            m0Var.l(this);
            m0Var.f35463c = c3.f35386b;
        }
    }
}
