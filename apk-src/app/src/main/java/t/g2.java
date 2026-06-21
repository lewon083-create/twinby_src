package t;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f33055c;

    public /* synthetic */ g2(h2 h2Var, int i) {
        this.f33054b = i;
        this.f33055c = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33054b) {
            case 0:
                h2 h2Var = this.f33055c;
                h2Var.g(h2Var);
                return;
            default:
                h2 h2Var2 = this.f33055c;
                h2Var2.k("Session call super.close()");
                f2.g.g(h2Var2.f33087g, "Need to call openCaptureSession before using this API.");
                q9.o oVar = h2Var2.f33082b;
                synchronized (oVar.f31947b) {
                    ((LinkedHashSet) oVar.f31949d).add(h2Var2);
                    break;
                }
                ((CameraCaptureSession) ((r3.b) h2Var2.f33087g.f27180c).f32188c).close();
                h2Var2.f33084d.execute(new g2(h2Var2, 0));
                return;
        }
    }
}
