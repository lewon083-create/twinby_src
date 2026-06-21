package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum y1 extends c3 {
    public y1() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        if (aVar.k("--")) {
            m0Var.f35473n.m();
            m0Var.f35463c = c3.T;
        } else if (aVar.l("DOCTYPE")) {
            m0Var.f35463c = c3.Z;
        } else if (aVar.k("[CDATA[")) {
            m0Var.e();
            m0Var.f35463c = c3.f35412p0;
        } else {
            m0Var.m(this);
            m0Var.a(c3.R);
        }
    }
}
