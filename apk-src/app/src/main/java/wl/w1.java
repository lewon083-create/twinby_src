package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum w1 extends c3 {
    public w1() {
        super("SelfClosingStartTag", 41);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        x0 x0Var = c3.f35386b;
        if (cD == '>') {
            m0Var.i.f35457k = true;
            m0Var.k();
            m0Var.f35463c = x0Var;
        } else if (cD == 65535) {
            m0Var.l(this);
            m0Var.f35463c = x0Var;
        } else {
            m0Var.m(this);
            aVar.q();
            m0Var.f35463c = c3.I;
        }
    }
}
