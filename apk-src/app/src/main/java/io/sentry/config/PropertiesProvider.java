package io.sentry.config;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface PropertiesProvider {
    @Nullable
    default Boolean getBooleanProperty(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    @Nullable
    default Double getDoubleProperty(@NotNull String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Double.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NotNull
    default List<String> getList(@NotNull String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(StringUtils.COMMA)) : Collections.EMPTY_LIST;
    }

    @Nullable
    default List<String> getListOrNull(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            return Arrays.asList(property.split(StringUtils.COMMA));
        }
        return null;
    }

    @Nullable
    default Long getLongProperty(@NotNull String str) {
        String property = getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return Long.valueOf(property);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NotNull
    Map<String, String> getMap(@NotNull String str);

    @Nullable
    String getProperty(@NotNull String str);

    @NotNull
    default String getProperty(@NotNull String str, @NotNull String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }
}
