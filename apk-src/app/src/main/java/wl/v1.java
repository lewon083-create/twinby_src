package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum v1 extends c3 {
    public v1() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        n1 n1Var = c3.I;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            m0Var.f35463c = n1Var;
            return;
        }
        if (cD == '/') {
            m0Var.f35463c = c3.Q;
            return;
        }
        x0 x0Var = c3.f35386b;
        if (cD == '>') {
            m0Var.k();
            m0Var.f35463c = x0Var;
        } else if (cD == 65535) {
            m0Var.l(this);
            m0Var.f35463c = x0Var;
        } else {
            m0Var.m(this);
            aVar.q();
            m0Var.f35463c = n1Var;
        }
    }
}
