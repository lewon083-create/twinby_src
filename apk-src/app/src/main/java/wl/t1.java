package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum t1 extends c3 {
    public t1() {
        super("Rcdata", 2);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cI = aVar.i();
        if (cI == 0) {
            m0Var.m(this);
            aVar.a();
            m0Var.f((char) 65533);
        } else {
            if (cI == '&') {
                m0Var.a(c3.f35392e);
                return;
            }
            if (cI == '<') {
                m0Var.a(c3.f35404l);
            } else if (cI != 65535) {
                m0Var.h(aVar.g('&', '<', 0));
            } else {
                m0Var.g(new i0());
            }
        }
    }
}
