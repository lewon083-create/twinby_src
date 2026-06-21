package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f25563id;

    @NonNull
    private final Surface surface;

    public FlutterOverlaySurface(int i, @NonNull Surface surface) {
        this.f25563id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.f25563id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
