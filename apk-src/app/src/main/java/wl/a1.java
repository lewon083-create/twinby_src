package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum a1 extends c3 {
    public a1() {
        super("ScriptDataEscaped", 21);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.j()) {
            m0Var.l(this);
            m0Var.f35463c = c3.f35386b;
            return;
        }
        char cI = aVar.i();
        if (cI == 0) {
            m0Var.m(this);
            aVar.a();
            m0Var.f((char) 65533);
        } else if (cI == '-') {
            m0Var.f('-');
            m0Var.a(c3.f35426x);
        } else if (cI != '<') {
            m0Var.h(aVar.g('-', '<', 0));
        } else {
            m0Var.a(c3.f35428z);
        }
    }
}
