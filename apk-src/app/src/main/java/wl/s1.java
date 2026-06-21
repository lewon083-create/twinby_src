package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum s1 extends c3 {
    public s1() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        String strG = aVar.g(c3.f35414q0);
        if (strG.length() > 0) {
            m0Var.i.t(strG);
        } else {
            m0Var.i.i = true;
        }
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.m(this);
            m0Var.i.s((char) 65533);
            return;
        }
        if (cD == 65535) {
            m0Var.l(this);
            m0Var.f35463c = c3.f35386b;
            return;
        }
        if (cD != '&') {
            if (cD != '\'') {
                m0Var.i.s(cD);
                return;
            } else {
                m0Var.f35463c = c3.P;
                return;
            }
        }
        int[] iArrC = m0Var.c('\'', true);
        if (iArrC != null) {
            m0Var.i.u(iArrC);
        } else {
            m0Var.i.s('&');
        }
    }
}
