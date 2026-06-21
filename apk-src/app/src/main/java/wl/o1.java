package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum o1 extends c3 {
    public o1() {
        super("AttributeName", 34);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        String strH = aVar.h(c3.f35418s0);
        l0 l0Var = m0Var.i;
        String str = l0Var.f35453f;
        if (str != null) {
            strH = str.concat(strH);
        }
        l0Var.f35453f = strH;
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.m(this);
            m0Var.i.r((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '\'') {
                if (cD == '/') {
                    m0Var.f35463c = c3.Q;
                    return;
                }
                x0 x0Var = c3.f35386b;
                if (cD == 65535) {
                    m0Var.l(this);
                    m0Var.f35463c = x0Var;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    switch (cD) {
                        case '<':
                            break;
                        case '=':
                            m0Var.f35463c = c3.L;
                            break;
                        case '>':
                            m0Var.k();
                            m0Var.f35463c = x0Var;
                            break;
                        default:
                            m0Var.i.r(cD);
                            break;
                    }
                    return;
                }
            }
            m0Var.m(this);
            m0Var.i.r(cD);
            return;
        }
        m0Var.f35463c = c3.K;
    }
}
