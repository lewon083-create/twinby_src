package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rm3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo2 f42632a = null;

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        ee3 ee3Var;
        if (lm3Var.f40609b == null) {
            String message = lm3Var.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            ee3Var = new ee3(message);
        } else {
            ee3Var = new ee3("Ping error");
        }
        vo2 vo2Var = this.f42632a;
        if (vo2Var != null) {
            vo2Var.a(ee3Var);
        }
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        h82 h82Var = (h82) obj;
        vo2 vo2Var = this.f42632a;
        if (vo2Var != null) {
            vo2Var.onSuccess(h82Var);
        }
    }
}
