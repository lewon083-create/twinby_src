package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    @Override // u.q, r3.b
    public final void D(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws a {
        try {
            ((CameraManager) this.f32188c).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }

    @Override // u.q, r3.b
    public final CameraCharacteristics w(String str) throws a {
        try {
            return ((CameraManager) this.f32188c).getCameraCharacteristics(str);
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }
}
