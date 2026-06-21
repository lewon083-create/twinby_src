package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum n0 extends c3 {
    public n0() {
        super("TagName", 9);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        int i;
        char c8;
        aVar.b();
        int i10 = aVar.f35329e;
        int i11 = aVar.f35327c;
        char[] cArr = aVar.f35325a;
        while (true) {
            i = aVar.f35329e;
            if (i >= i11 || (c8 = cArr[i]) == '\t' || c8 == '\n' || c8 == '\r' || c8 == '\f' || c8 == ' ' || c8 == '/' || c8 == '>' || c8 == 0) {
                break;
            } else {
                aVar.f35329e = i + 1;
            }
        }
        m0Var.i.v(i > i10 ? a.c(cArr, aVar.f35332h, i10, i - i10) : "");
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.i.v(c3.f35422u0);
            return;
        }
        if (cD != ' ') {
            if (cD == '/') {
                m0Var.f35463c = c3.Q;
                return;
            }
            x0 x0Var = c3.f35386b;
            if (cD == '>') {
                m0Var.k();
                m0Var.f35463c = x0Var;
                return;
            }
            if (cD == 65535) {
                m0Var.l(this);
                m0Var.f35463c = x0Var;
                return;
            } else if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                l0 l0Var = m0Var.i;
                l0Var.getClass();
                l0Var.v(String.valueOf(cD));
                return;
            }
        }
        m0Var.f35463c = c3.I;
    }
}
