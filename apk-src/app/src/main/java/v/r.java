package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface r {
    void a(g gVar);

    Object b();

    g c();

    int d();

    CameraCaptureSession.StateCallback e();

    List f();

    void g(CaptureRequest captureRequest);

    Executor getExecutor();
}
