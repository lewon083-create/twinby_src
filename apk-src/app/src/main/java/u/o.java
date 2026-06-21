package u;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;
import t.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraManager.AvailabilityCallback f33973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33974c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33975d = false;

    public o(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f33972a = executor;
        this.f33973b = availabilityCallback;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f33974c) {
            try {
                if (!this.f33975d) {
                    this.f33972a.execute(new a0(6, this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f33974c) {
            try {
                if (!this.f33975d) {
                    this.f33972a.execute(new n(this, str, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f33974c) {
            try {
                if (!this.f33975d) {
                    this.f33972a.execute(new n(this, str, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
