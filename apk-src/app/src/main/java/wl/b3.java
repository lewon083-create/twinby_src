package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum b3 extends c3 {
    public b3() {
        super("EndTagOpen", 8);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        boolean zJ = aVar.j();
        x0 x0Var = c3.f35386b;
        if (zJ) {
            m0Var.l(this);
            m0Var.h("</");
            m0Var.f35463c = x0Var;
        } else if (aVar.o()) {
            m0Var.d(false);
            m0Var.f35463c = c3.f35402k;
        } else if (aVar.m('>')) {
            m0Var.m(this);
            m0Var.a(x0Var);
        } else {
            m0Var.m(this);
            m0Var.a(c3.R);
        }
    }
}
