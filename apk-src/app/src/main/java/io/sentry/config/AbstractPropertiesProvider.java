package io.sentry.config;

import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractPropertiesProvider implements PropertiesProvider {

    @NotNull
    private final String prefix;

    @NotNull
    private final Properties properties;

    public AbstractPropertiesProvider(@NotNull String str, @NotNull Properties properties) {
        this.prefix = (String) Objects.requireNonNull(str, "prefix is required");
        this.properties = (Properties) Objects.requireNonNull(properties, "properties are required");
    }

    @Override // io.sentry.config.PropertiesProvider
    @NotNull
    public Map<String, String> getMap(@NotNull String str) {
        String strG = z.g(new StringBuilder(), this.prefix, str, ".");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.properties.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str2 = (String) entry.getKey();
                if (str2.startsWith(strG)) {
                    map.put(str2.substring(strG.length()), StringUtils.removeSurrounding((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.PropertiesProvider
    @Nullable
    public String getProperty(@NotNull String str) {
        return StringUtils.removeSurrounding(this.properties.getProperty(this.prefix + str), "\"");
    }

    public AbstractPropertiesProvider(@NotNull Properties properties) {
        this("", properties);
    }
}
