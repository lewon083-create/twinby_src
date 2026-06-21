package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends r {
    @Override // r3.b
    public final Set x() throws a {
        try {
            return ((CameraManager) this.f32188c).getConcurrentCameraIds();
        } catch (CameraAccessException e3) {
            throw new a(e3);
        }
    }
}
