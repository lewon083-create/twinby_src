package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r3.b {
    @Override // r3.b
    public final int G(List list, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).setRepeatingBurstRequests(list, iVar, captureCallback);
    }

    @Override // r3.b
    public final int H(CaptureRequest captureRequest, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).setSingleRepeatingRequest(captureRequest, iVar, captureCallback);
    }

    @Override // r3.b
    public final int q(List list, j0.i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f32188c).captureBurstRequests(list, iVar, captureCallback);
    }
}
