package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeModulesLoader extends ModulesLoader {
    private final List<IModulesLoader> loaders;

    public CompositeModulesLoader(@NotNull List<IModulesLoader> list, @NotNull ILogger iLogger) {
        super(iLogger);
        this.loaders = list;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        Iterator<IModulesLoader> it = this.loaders.iterator();
        while (it.hasNext()) {
            Map<String, String> orLoadModules = it.next().getOrLoadModules();
            if (orLoadModules != null) {
                treeMap.putAll(orLoadModules);
            }
        }
        return treeMap;
    }
}
