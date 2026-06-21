package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAttributes {

    @NotNull
    private final Map<String, SentryAttribute> attributes;

    private SentryAttributes(@NotNull Map<String, SentryAttribute> map) {
        this.attributes = map;
    }

    @NotNull
    public static SentryAttributes fromMap(@Nullable Map<String, Object> map) {
        if (map == null) {
            return new SentryAttributes(new ConcurrentHashMap());
        }
        SentryAttributes sentryAttributes = new SentryAttributes(new ConcurrentHashMap(map.size()));
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                sentryAttributes.add(SentryAttribute.named(key, entry.getValue()));
            }
        }
        return sentryAttributes;
    }

    @NotNull
    public static SentryAttributes of(@Nullable SentryAttribute... sentryAttributeArr) {
        if (sentryAttributeArr == null) {
            return new SentryAttributes(new ConcurrentHashMap());
        }
        SentryAttributes sentryAttributes = new SentryAttributes(new ConcurrentHashMap(sentryAttributeArr.length));
        for (SentryAttribute sentryAttribute : sentryAttributeArr) {
            sentryAttributes.add(sentryAttribute);
        }
        return sentryAttributes;
    }

    public void add(@Nullable SentryAttribute sentryAttribute) {
        if (sentryAttribute == null) {
            return;
        }
        this.attributes.put(sentryAttribute.getName(), sentryAttribute);
    }

    @NotNull
    public Map<String, SentryAttribute> getAttributes() {
        return this.attributes;
    }
}
