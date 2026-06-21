package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj f38656a;

    public g42(cj cjVar) {
        this.f38656a = cjVar;
    }

    public final f42 a() {
        r72 r72Var;
        Object obj = this.f38656a.f37405a.get("media");
        g62 g62Var = null;
        qn1 qn1Var = obj instanceof qn1 ? (qn1) obj : null;
        if (qn1Var != null) {
            g62 g62Var2 = qn1Var.f42351b != null ? new g62() : null;
            r72Var = qn1Var.f42350a != null ? new r72() : null;
            g62Var = g62Var2;
        } else {
            r72Var = null;
        }
        return new f42(g62Var, r72Var);
    }
}
