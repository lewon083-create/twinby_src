package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum h2 extends c3 {
    public h2() {
        super("BeforeDoctypeName", 51);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        boolean zO = aVar.o();
        i2 i2Var = c3.f35387b0;
        if (zO) {
            m0Var.f35472m.m();
            m0Var.f35463c = i2Var;
            return;
        }
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.m(this);
            h0 h0Var = m0Var.f35472m;
            h0Var.m();
            h0Var.f35446d.append((char) 65533);
            m0Var.f35463c = i2Var;
            return;
        }
        if (cD != ' ') {
            if (cD == 65535) {
                m0Var.l(this);
                h0 h0Var2 = m0Var.f35472m;
                h0Var2.m();
                h0Var2.f35450h = true;
                m0Var.j();
                m0Var.f35463c = c3.f35386b;
                return;
            }
            if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                return;
            }
            m0Var.f35472m.m();
            m0Var.f35472m.f35446d.append(cD);
            m0Var.f35463c = i2Var;
        }
    }
}
