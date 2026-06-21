package t;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f33049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f33050d;

    public /* synthetic */ f2(h2 h2Var, h2 h2Var2, int i) {
        this.f33048b = i;
        this.f33049c = h2Var;
        this.f33050d = h2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33048b) {
            case 0:
                h2 h2Var = this.f33049c;
                h2 h2Var2 = this.f33050d;
                q9.o oVar = h2Var.f33082b;
                synchronized (oVar.f31947b) {
                    ((LinkedHashSet) oVar.f31948c).remove(h2Var);
                    ((LinkedHashSet) oVar.f31949d).remove(h2Var);
                    break;
                }
                h2Var.g(h2Var2);
                if (h2Var.f33087g != null) {
                    Objects.requireNonNull(h2Var.f33086f);
                    h2Var.f33086f.c(h2Var2);
                    return;
                } else {
                    com.google.android.gms.internal.auth.g.O("SyncCaptureSessionBase", "[" + h2Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
            default:
                h2 h2Var3 = this.f33049c;
                h2 h2Var4 = this.f33050d;
                Objects.requireNonNull(h2Var3.f33086f);
                h2Var3.f33086f.g(h2Var4);
                return;
        }
    }
}
