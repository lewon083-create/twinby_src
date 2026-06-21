package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum g2 extends c3 {
    public g2() {
        super("Doctype", 50);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        h2 h2Var = c3.f35385a0;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            m0Var.f35463c = h2Var;
            return;
        }
        if (cD != '>') {
            if (cD != 65535) {
                m0Var.m(this);
                m0Var.f35463c = h2Var;
                return;
            }
            m0Var.l(this);
        }
        m0Var.m(this);
        h0 h0Var = m0Var.f35472m;
        h0Var.m();
        h0Var.f35450h = true;
        m0Var.j();
        m0Var.f35463c = c3.f35386b;
    }
}
