package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum j2 extends c3 {
    public j2() {
        super("AfterDoctypeName", 53);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        boolean zJ = aVar.j();
        x0 x0Var = c3.f35386b;
        if (zJ) {
            m0Var.l(this);
            m0Var.f35472m.f35450h = true;
            m0Var.j();
            m0Var.f35463c = x0Var;
            return;
        }
        if (aVar.n('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.m('>')) {
            m0Var.j();
            m0Var.a(x0Var);
            return;
        }
        if (aVar.l("PUBLIC")) {
            m0Var.f35472m.f35447e = "PUBLIC";
            m0Var.f35463c = c3.f35391d0;
        } else if (aVar.l("SYSTEM")) {
            m0Var.f35472m.f35447e = "SYSTEM";
            m0Var.f35463c = c3.f35401j0;
        } else {
            m0Var.m(this);
            m0Var.f35472m.f35450h = true;
            m0Var.a(c3.o0);
        }
    }
}
