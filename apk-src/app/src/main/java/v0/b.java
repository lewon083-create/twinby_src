package v0;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f34640a;

    public b(Context context) {
        this.f34640a = (CameraManager) context.getSystemService(CameraManager.class);
    }
}
