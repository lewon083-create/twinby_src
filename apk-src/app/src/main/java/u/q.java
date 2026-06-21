package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class q extends r3.b {
    public static boolean K(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.b
    public void D(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws a {
        try {
            ((CameraManager) this.f32188c).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e3) {
            throw new a(e3);
        } catch (IllegalArgumentException e7) {
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!K(e11)) {
                throw e11;
            }
            throw new a(e11);
        }
    }

    @Override // r3.b
    public final void E(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f32188c).registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // r3.b
    public final void I(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f32188c).unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // r3.b
    public CameraCharacteristics w(String str) throws a {
        try {
            return super.w(str);
        } catch (RuntimeException e3) {
            if (K(e3)) {
                throw new a(e3);
            }
            throw e3;
        }
    }
}
