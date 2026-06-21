package u;

import android.hardware.camera2.CameraDevice;
import t.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f33966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f33967d;

    public /* synthetic */ j(v vVar, CameraDevice cameraDevice, int i) {
        this.f33965b = i;
        this.f33966c = vVar;
        this.f33967d = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33965b) {
            case 0:
                ((CameraDevice.StateCallback) this.f33966c.f33304b).onClosed(this.f33967d);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f33966c.f33304b).onDisconnected(this.f33967d);
                break;
            default:
                ((CameraDevice.StateCallback) this.f33966c.f33304b).onOpened(this.f33967d);
                break;
        }
    }
}
