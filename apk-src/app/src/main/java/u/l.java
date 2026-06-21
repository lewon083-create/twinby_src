package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k {
    @Override // u.k
    public final void h(v.s sVar) throws a {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sVar.f34637a.b();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f2253b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }
}
