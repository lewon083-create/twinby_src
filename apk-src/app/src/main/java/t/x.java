package t;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33314b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f33315c;

    public x(c0 c0Var, String str) {
        this.f33315c = c0Var;
        this.f33313a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f33313a.equals(str)) {
            this.f33314b = true;
            if (this.f33315c.M == 4 || this.f33315c.M == 5) {
                this.f33315c.K(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f33313a.equals(str)) {
            this.f33314b = false;
        }
    }
}
