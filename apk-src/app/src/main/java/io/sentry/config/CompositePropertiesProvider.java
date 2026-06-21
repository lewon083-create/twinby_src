package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class CompositePropertiesProvider implements PropertiesProvider {

    @NotNull
    private final List<PropertiesProvider> providers;

    public CompositePropertiesProvider(@NotNull List<PropertiesProvider> list) {
        this.providers = list;
    }

    @Override // io.sentry.config.PropertiesProvider
    @NotNull
    public Map<String, String> getMap(@NotNull String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    @Nullable
    public String getProperty(@NotNull String str) {
        Iterator<PropertiesProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
