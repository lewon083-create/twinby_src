package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum p0 extends c3 {
    public p0() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (!aVar.o()) {
            m0Var.h("</");
            m0Var.f35463c = c3.f35390d;
            return;
        }
        m0Var.d(false);
        l0 l0Var = m0Var.i;
        char cI = aVar.i();
        l0Var.getClass();
        l0Var.v(String.valueOf(cI));
        m0Var.f35468h.append(aVar.i());
        m0Var.a(c3.f35408n);
    }
}
