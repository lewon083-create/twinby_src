package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryLogEventAttributeValue implements JsonUnknown, JsonSerializable {

    @NotNull
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private Object value;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryLogEventAttributeValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryLogEventAttributeValue deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            String strNextStringOrNull = null;
            Object objNextObjectOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("type")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals("value")) {
                    objNextObjectOrNull = objectReader.nextObjectOrNull();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (strNextStringOrNull != null) {
                SentryLogEventAttributeValue sentryLogEventAttributeValue = new SentryLogEventAttributeValue(strNextStringOrNull, objNextObjectOrNull);
                sentryLogEventAttributeValue.setUnknown(map);
                return sentryLogEventAttributeValue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String TYPE = "type";
        public static final String VALUE = "value";
    }

    public SentryLogEventAttributeValue(@NotNull String str, @Nullable Object obj) {
        this.type = str;
        if (obj == null || !str.equals("string")) {
            this.value = obj;
        } else {
            this.value = obj.toString();
        }
    }

    @NotNull
    public static SentryLogEventAttributeValue fromAttribute(@NotNull SentryAttribute sentryAttribute) {
        Object value = sentryAttribute.getValue();
        return new SentryLogEventAttributeValue(sentryAttribute.getType() == null ? SentryAttributeType.inferFrom(value) : sentryAttribute.getType(), value);
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public Object getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(iLogger, this.type);
        objectWriter.name("value").value(iLogger, this.value);
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

    public SentryLogEventAttributeValue(@NotNull SentryAttributeType sentryAttributeType, @Nullable Object obj) {
        this(sentryAttributeType.apiName(), obj);
    }
}
