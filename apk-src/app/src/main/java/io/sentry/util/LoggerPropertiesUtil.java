package io.sentry.util;

import io.sentry.SentryAttribute;
import io.sentry.SentryAttributes;
import io.sentry.SentryEvent;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class LoggerPropertiesUtil {
    public static void applyPropertiesToAttributes(@NotNull SentryAttributes sentryAttributes, @NotNull List<String> list, @NotNull Map<String, String> map) {
        if (list.isEmpty() || map.isEmpty()) {
            return;
        }
        for (String str : list) {
            String str2 = map.get(str);
            if (str2 != null) {
                sentryAttributes.add(SentryAttribute.stringAttribute("mdc." + str, str2));
            }
        }
    }

    public static void applyPropertiesToEvent(@NotNull SentryEvent sentryEvent, @NotNull List<String> list, @NotNull Map<String, String> map, @NotNull String str) {
        if (!list.isEmpty() && !map.isEmpty()) {
            for (String str2 : list) {
                String strRemove = map.remove(str2);
                if (strRemove != null) {
                    sentryEvent.setTag(str2, strRemove);
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        sentryEvent.getContexts().put(str, map);
    }

    public static void applyPropertiesToEvent(@NotNull SentryEvent sentryEvent, @NotNull List<String> list, @NotNull Map<String, String> map) {
        applyPropertiesToEvent(sentryEvent, list, map, "MDC");
    }
}
