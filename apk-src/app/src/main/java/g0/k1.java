package g0;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface k1 {
    a0.r1 acquireLatestImage();

    void c(j1 j1Var, Executor executor);

    void close();

    int e();

    int getHeight();

    Surface getSurface();

    int getWidth();

    void h();

    int q();

    a0.r1 r();
}
