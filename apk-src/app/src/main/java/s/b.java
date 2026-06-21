package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import z.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public static final g0.g M = new g0.g("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final g0.g N = new g0.g("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final g0.g O = new g0.g("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final g0.g P = new g0.g("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final g0.g Q = new g0.g("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final g0.g R = new g0.g("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static g0.g u(CaptureRequest.Key key) {
        return new g0.g("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
