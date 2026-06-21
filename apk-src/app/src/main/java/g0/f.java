package g0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f19559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f19560b;

    public f(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f19559a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f19560b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f19559a.equals(fVar.f19559a) && this.f19560b.equals(fVar.f19560b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19559a.hashCode() ^ 1000003) * 1000003) ^ this.f19560b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f19559a + ", schedulerHandler=" + this.f19560b + "}";
    }
}
