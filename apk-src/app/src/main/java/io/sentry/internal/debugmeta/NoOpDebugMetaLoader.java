package io.sentry.internal.debugmeta;

import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpDebugMetaLoader implements IDebugMetaLoader {
    private static final NoOpDebugMetaLoader instance = new NoOpDebugMetaLoader();

    private NoOpDebugMetaLoader() {
    }

    public static NoOpDebugMetaLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    @Nullable
    public List<Properties> loadDebugMeta() {
        return null;
    }
}
