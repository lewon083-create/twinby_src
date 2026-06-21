package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum i2 extends c3 {
    public i2() {
        super("DoctypeName", 52);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.o()) {
            m0Var.f35472m.f35446d.append(aVar.e());
            return;
        }
        char cD = aVar.d();
        if (cD == 0) {
            m0Var.m(this);
            m0Var.f35472m.f35446d.append((char) 65533);
            return;
        }
        if (cD != ' ') {
            x0 x0Var = c3.f35386b;
            if (cD == '>') {
                m0Var.j();
                m0Var.f35463c = x0Var;
                return;
            }
            if (cD == 65535) {
                m0Var.l(this);
                m0Var.f35472m.f35450h = true;
                m0Var.j();
                m0Var.f35463c = x0Var;
                return;
            }
            if (cD != '\t' && cD != '\n' && cD != '\f' && cD != '\r') {
                m0Var.f35472m.f35446d.append(cD);
                return;
            }
        }
        m0Var.f35463c = c3.f35389c0;
    }
}
