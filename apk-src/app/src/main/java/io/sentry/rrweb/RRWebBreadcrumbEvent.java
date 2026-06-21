package io.sentry.rrweb;

import gf.a;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RRWebBreadcrumbEvent extends RRWebEvent implements JsonUnknown, JsonSerializable {
    public static final String EVENT_TAG = "breadcrumb";
    private double breadcrumbTimestamp;

    @Nullable
    private String breadcrumbType;

    @Nullable
    private String category;

    @Nullable
    private Map<String, Object> data;

    @Nullable
    private Map<String, Object> dataUnknown;

    @Nullable
    private SentryLevel level;

    @Nullable
    private String message;

    @Nullable
    private Map<String, Object> payloadUnknown;

    @NotNull
    private String tag;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<RRWebBreadcrumbEvent> {
        private void deserializeData(@NotNull RRWebBreadcrumbEvent rRWebBreadcrumbEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebBreadcrumbEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebBreadcrumbEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(@NotNull RRWebBreadcrumbEvent rRWebBreadcrumbEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "data":
                        Map mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            rRWebBreadcrumbEvent.data = mapNewConcurrentHashMap;
                            break;
                        }
                        break;
                    case "type":
                        rRWebBreadcrumbEvent.breadcrumbType = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        rRWebBreadcrumbEvent.category = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        rRWebBreadcrumbEvent.breadcrumbTimestamp = objectReader.nextDouble();
                        break;
                    case "level":
                        try {
                            rRWebBreadcrumbEvent.level = new SentryLevel.Deserializer().deserialize(objectReader, iLogger);
                            break;
                        } catch (Exception e3) {
                            iLogger.log(SentryLevel.DEBUG, e3, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        rRWebBreadcrumbEvent.message = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebBreadcrumbEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public RRWebBreadcrumbEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            RRWebBreadcrumbEvent rRWebBreadcrumbEvent = new RRWebBreadcrumbEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebBreadcrumbEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebBreadcrumbEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebBreadcrumbEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebBreadcrumbEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CATEGORY = "category";
        public static final String DATA = "data";
        public static final String LEVEL = "level";
        public static final String MESSAGE = "message";
        public static final String PAYLOAD = "payload";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
    }

    public RRWebBreadcrumbEvent() {
        super(RRWebEventType.Custom);
        this.tag = EVENT_TAG;
    }

    private void serializeData(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    private void serializePayload(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.breadcrumbType != null) {
            objectWriter.name("type").value(this.breadcrumbType);
        }
        objectWriter.name("timestamp").value(iLogger, BigDecimal.valueOf(this.breadcrumbTimestamp));
        if (this.category != null) {
            objectWriter.name("category").value(this.category);
        }
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        Map<String, Object> map = this.payloadUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.payloadUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public double getBreadcrumbTimestamp() {
        return this.breadcrumbTimestamp;
    }

    @Nullable
    public String getBreadcrumbType() {
        return this.breadcrumbType;
    }

    @Nullable
    public String getCategory() {
        return this.category;
    }

    @Nullable
    public Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    @Nullable
    public SentryLevel getLevel() {
        return this.level;
    }

    @Nullable
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public Map<String, Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBreadcrumbTimestamp(double d10) {
        this.breadcrumbTimestamp = d10;
    }

    public void setBreadcrumbType(@Nullable String str) {
        this.breadcrumbType = str;
    }

    public void setCategory(@Nullable String str) {
        this.category = str;
    }

    public void setData(@Nullable Map<String, Object> map) {
        this.data = map == null ? null : new ConcurrentHashMap(map);
    }

    public void setDataUnknown(@Nullable Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setLevel(@Nullable SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setMessage(@Nullable String str) {
        this.message = str;
    }

    public void setPayloadUnknown(@Nullable Map<String, Object> map) {
        this.payloadUnknown = map;
    }

    public void setTag(@NotNull String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
