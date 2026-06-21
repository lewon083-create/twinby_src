package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j3.d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ad.j0 f20943d;

    public k1(String str, ad.b1 b1Var) {
        super(str, null, false, 1);
        this.f20943d = ad.j0.r(b1Var);
    }

    @Override // j3.d0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        ad.j0 j0Var = this.f20943d;
        if (j0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + j0Var;
    }
}
