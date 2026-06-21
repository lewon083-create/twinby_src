package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum u1 extends c3 {
    public u1() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        String strH = aVar.h(c3.f35420t0);
        if (strH.length() > 0) {
            m0Var.i.t(strH);
        }
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.m(this);
            m0Var.i.s((char) 65533);
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '`') {
                x0 x0Var = c3.f35386b;
                if (cD == 65535) {
                    m0Var.l(this);
                    m0Var.f35463c = x0Var;
                    return;
                }
                if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                    if (cD == '&') {
                        int[] iArrC = m0Var.c('>', true);
                        if (iArrC != null) {
                            m0Var.i.u(iArrC);
                            return;
                        } else {
                            m0Var.i.s('&');
                            return;
                        }
                    }
                    if (cD != '\'') {
                        switch (cD) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                m0Var.k();
                                m0Var.f35463c = x0Var;
                                break;
                            default:
                                m0Var.i.s(cD);
                                break;
                        }
                        return;
                    }
                }
            }
            m0Var.m(this);
            m0Var.i.s(cD);
            return;
        }
        m0Var.f35463c = c3.I;
    }
}
