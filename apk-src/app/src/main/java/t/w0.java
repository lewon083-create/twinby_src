package t;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0.u1 f33312a;

    public w0(a0.u1 u1Var) {
        this.f33312a = u1Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
        i0.o.w(new k0.h(1, (j1.k) this.f33312a.A()));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Log.d("Camera2PresenceSrc", "System onCameraAvailable: " + cameraId);
        i0.o.w(new k0.h(1, (j1.k) this.f33312a.A()));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Log.d("Camera2PresenceSrc", "System onCameraUnavailable: " + cameraId);
        i0.o.w(new k0.h(1, (j1.k) this.f33312a.A()));
    }
}
