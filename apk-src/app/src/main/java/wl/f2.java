package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum f2 extends c3 {
    public f2() {
        super("CommentEndBang", 49);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        b2 b2Var = c3.V;
        if (cD == 0) {
            m0Var.m(this);
            StringBuilder sb2 = m0Var.f35473n.f35445d;
            sb2.append("--!");
            sb2.append((char) 65533);
            m0Var.f35463c = b2Var;
            return;
        }
        if (cD == '-') {
            m0Var.f35473n.f35445d.append("--!");
            m0Var.f35463c = c3.W;
            return;
        }
        x0 x0Var = c3.f35386b;
        if (cD == '>') {
            m0Var.i();
            m0Var.f35463c = x0Var;
        } else if (cD == 65535) {
            m0Var.l(this);
            m0Var.i();
            m0Var.f35463c = x0Var;
        } else {
            StringBuilder sb3 = m0Var.f35473n.f35445d;
            sb3.append("--!");
            sb3.append(cD);
            m0Var.f35463c = b2Var;
        }
    }
}
