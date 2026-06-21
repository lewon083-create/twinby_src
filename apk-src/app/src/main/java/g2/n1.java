package g2;

import android.view.Surface;
import android.view.SurfaceControl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n1 {
    public static /* synthetic */ Surface d(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder e() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction f() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction h(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void l() {
    }
}
