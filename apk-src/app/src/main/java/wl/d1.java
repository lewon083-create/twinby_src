package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum d1 extends c3 {
    public d1() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.o()) {
            m0Var.e();
            m0Var.f35468h.append(aVar.i());
            m0Var.h("<" + aVar.i());
            m0Var.a(c3.C);
            return;
        }
        if (aVar.m('/')) {
            m0Var.e();
            m0Var.a(c3.A);
        } else {
            m0Var.f('<');
            m0Var.f35463c = c3.f35425w;
        }
    }
}
