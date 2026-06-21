package ob;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f30428c;

    public t2(u2 u2Var, int i) {
        this.f30427b = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(u2Var);
                this.f30428c = u2Var;
                break;
            default:
                Objects.requireNonNull(u2Var);
                this.f30428c = u2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30427b) {
            case 0:
                u2 u2Var = this.f30428c;
                u2Var.f30446f = u2Var.f30450k;
                break;
            default:
                this.f30428c.f30450k = null;
                break;
        }
    }
}
