package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum a3 extends c3 {
    public a3() {
        super("TagOpen", 7);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cI = aVar.i();
        if (cI == '!') {
            m0Var.a(c3.S);
            return;
        }
        if (cI == '/') {
            m0Var.a(c3.f35400j);
            return;
        }
        if (cI == '?') {
            m0Var.a(c3.R);
            return;
        }
        if (aVar.o()) {
            m0Var.d(true);
            m0Var.f35463c = c3.f35402k;
        } else {
            m0Var.m(this);
            m0Var.f('<');
            m0Var.f35463c = c3.f35386b;
        }
    }
}
