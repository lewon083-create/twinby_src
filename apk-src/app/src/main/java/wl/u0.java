package wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum u0 extends c3 {
    public u0() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // wl.c3
    public final void d(m0 m0Var, a aVar) {
        char cD = aVar.d();
        if (cD == '!') {
            m0Var.h("<!");
            m0Var.f35463c = c3.f35421u;
        } else if (cD == '/') {
            m0Var.e();
            m0Var.f35463c = c3.f35417s;
        } else {
            m0Var.h("<");
            aVar.q();
            m0Var.f35463c = c3.f35396g;
        }
    }
}
