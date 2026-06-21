package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum q1 extends c3 {
    public q1() {
        super("BeforeAttributeValue", 36);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        u1 u1Var = c3.O;
        if (cD == 0) {
            m0Var.m(this);
            m0Var.i.s((char) 65533);
            m0Var.f35463c = u1Var;
            return;
        }
        if (cD != ' ') {
            if (cD == '\"') {
                m0Var.f35463c = c3.M;
                return;
            }
            if (cD != '`') {
                x0 x0Var = c3.f35386b;
                if (cD == 65535) {
                    m0Var.l(this);
                    m0Var.k();
                    m0Var.f35463c = x0Var;
                    return;
                }
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                    return;
                }
                if (cD == '&') {
                    aVar.q();
                    m0Var.f35463c = u1Var;
                    return;
                }
                if (cD == '\'') {
                    m0Var.f35463c = c3.N;
                    return;
                }
                switch (cD) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        m0Var.m(this);
                        m0Var.k();
                        m0Var.f35463c = x0Var;
                        break;
                    default:
                        aVar.q();
                        m0Var.f35463c = u1Var;
                        break;
                }
                return;
            }
            m0Var.m(this);
            m0Var.i.s(cD);
            m0Var.f35463c = u1Var;
        }
    }
}
