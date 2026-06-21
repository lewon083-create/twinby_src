package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum b2 extends c3 {
    public b2() {
        super("Comment", 46);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cI = aVar.i();
        if (cI == 0) {
            m0Var.m(this);
            aVar.a();
            m0Var.f35473n.f35445d.append((char) 65533);
        } else if (cI == '-') {
            m0Var.a(c3.W);
        } else {
            if (cI != 65535) {
                m0Var.f35473n.f35445d.append(aVar.g('-', 0));
                return;
            }
            m0Var.l(this);
            m0Var.i();
            m0Var.f35463c = c3.f35386b;
        }
    }
}
