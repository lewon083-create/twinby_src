package s;

import android.hardware.camera2.CameraCaptureSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends CameraCaptureSession.StateCallback {
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }
}
