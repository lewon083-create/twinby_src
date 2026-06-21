package io.sentry.internal.modules;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NoOpModulesLoader implements IModulesLoader {
    private static final NoOpModulesLoader instance = new NoOpModulesLoader();

    private NoOpModulesLoader() {
    }

    public static NoOpModulesLoader getInstance() {
        return instance;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    @Nullable
    public Map<String, String> getOrLoadModules() {
        return null;
    }
}
