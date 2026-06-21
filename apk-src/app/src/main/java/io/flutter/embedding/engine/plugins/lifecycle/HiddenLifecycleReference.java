package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class HiddenLifecycleReference {

    @NonNull
    private final p lifecycle;

    public HiddenLifecycleReference(@NonNull p pVar) {
        this.lifecycle = pVar;
    }

    @NonNull
    public p getLifecycle() {
        return this.lifecycle;
    }
}
