package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum q0 extends c3 {
    public q0() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(m0 m0Var, a aVar) {
        m0Var.h("</" + m0Var.f35468h.toString());
        aVar.q();
        m0Var.f35463c = c3.f35390d;
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.o()) {
            String strE = aVar.e();
            m0Var.i.v(strE);
            m0Var.f35468h.append(strE);
            return;
        }
        char cD = aVar.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            if (m0Var.n()) {
                m0Var.f35463c = c3.I;
                return;
            } else {
                e(m0Var, aVar);
                return;
            }
        }
        if (cD == '/') {
            if (m0Var.n()) {
                m0Var.f35463c = c3.Q;
                return;
            } else {
                e(m0Var, aVar);
                return;
            }
        }
        if (cD != '>') {
            e(m0Var, aVar);
        } else if (!m0Var.n()) {
            e(m0Var, aVar);
        } else {
            m0Var.k();
            m0Var.f35463c = c3.f35386b;
        }
    }
}
