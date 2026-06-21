package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class NoOpDebugImagesLoader implements IDebugImagesLoader {
    private static final NoOpDebugImagesLoader instance = new NoOpDebugImagesLoader();

    private NoOpDebugImagesLoader() {
    }

    public static NoOpDebugImagesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    @Nullable
    public List<DebugImage> loadDebugImages() {
        return null;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    @Nullable
    public Set<DebugImage> loadDebugImagesForAddresses(Set<String> set) {
        return null;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
    }
}
