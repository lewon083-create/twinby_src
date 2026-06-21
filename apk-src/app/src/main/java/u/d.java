package u;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f33956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f33957d;

    public /* synthetic */ d(e eVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f33955b = i;
        this.f33956c = eVar;
        this.f33957d = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33955b) {
            case 0:
                this.f33956c.f33958a.onActive(this.f33957d);
                break;
            case 1:
                this.f33956c.f33958a.onClosed(this.f33957d);
                break;
            case 2:
                this.f33956c.f33958a.onCaptureQueueEmpty(this.f33957d);
                break;
            case 3:
                this.f33956c.f33958a.onConfigured(this.f33957d);
                break;
            case 4:
                this.f33956c.f33958a.onReady(this.f33957d);
                break;
            default:
                this.f33956c.f33958a.onConfigureFailed(this.f33957d);
                break;
        }
    }
}
