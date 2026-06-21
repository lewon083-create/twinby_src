package io.sentry;

import io.sentry.SentryMetricsEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryMetricsEvents implements JsonUnknown, JsonSerializable {

    @NotNull
    private List<SentryMetricsEvent> items;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryMetricsEvents> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryMetricsEvents deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            List listNextListOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("items")) {
                    listNextListOrNull = objectReader.nextListOrNull(iLogger, new SentryMetricsEvent.Deserializer());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (listNextListOrNull != null) {
                SentryMetricsEvents sentryMetricsEvents = new SentryMetricsEvents(listNextListOrNull);
                sentryMetricsEvents.setUnknown(map);
                return sentryMetricsEvents;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ITEMS = "items";
    }

    public SentryMetricsEvents(@NotNull List<SentryMetricsEvent> list) {
        this.items = list;
    }

    @NotNull
    public List<SentryMetricsEvent> getItems() {
        return this.items;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("items").value(iLogger, this.items);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
