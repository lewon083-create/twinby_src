package io.sentry;

import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SpanId;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryMetricsEvent implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, SentryLogEventAttributeValue> attributes;

    @NotNull
    private String name;

    @Nullable
    private SpanId spanId;

    @NotNull
    private Double timestamp;

    @NotNull
    private SentryId traceId;

    @NotNull
    private String type;

    @Nullable
    private String unit;

    @Nullable
    private Map<String, Object> unknown;

    @NotNull
    private Double value;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryMetricsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryMetricsEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            HashMap map = null;
            SentryId sentryId = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            Double dNextDoubleOrNull2 = null;
            Map<String, SentryLogEventAttributeValue> mapNextMapOrNull = null;
            SpanId spanId = null;
            String strNextStringOrNull3 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case "name":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "unit":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "value":
                        dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
                        break;
                    case "attributes":
                        mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new SentryLogEventAttributeValue.Deserializer());
                        break;
                    case "trace_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            if (sentryId == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dNextDoubleOrNull == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextStringOrNull2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (dNextDoubleOrNull2 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(sentryId, dNextDoubleOrNull, strNextStringOrNull, strNextStringOrNull2, dNextDoubleOrNull2);
            sentryMetricsEvent.setAttributes(mapNextMapOrNull);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(strNextStringOrNull3);
            sentryMetricsEvent.setUnknown(map);
            return sentryMetricsEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ATTRIBUTES = "attributes";
        public static final String NAME = "name";
        public static final String SPAN_ID = "span_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
        public static final String TYPE = "type";
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public SentryMetricsEvent(@NotNull SentryId sentryId, @NotNull SentryDate sentryDate, @NotNull String str, @NotNull String str2, @NotNull Double d10) {
        this(sentryId, Double.valueOf(DateUtils.nanosToSeconds(sentryDate.nanoTimestamp())), str, str2, d10);
    }

    @Nullable
    public Map<String, SentryLogEventAttributeValue> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public SpanId getSpanId() {
        return this.spanId;
    }

    @NotNull
    public Double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public SentryId getTraceId() {
        return this.traceId;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @NotNull
    public Double getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        objectWriter.name("type").value(this.type);
        objectWriter.name("name").value(this.name);
        objectWriter.name("value").value(this.value);
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        if (this.spanId != null) {
            objectWriter.name("span_id").value(iLogger, this.spanId);
        }
        if (this.unit != null) {
            objectWriter.name("unit").value(iLogger, this.unit);
        }
        if (this.attributes != null) {
            objectWriter.name("attributes").value(iLogger, this.attributes);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAttribute(@Nullable String str, @Nullable SentryLogEventAttributeValue sentryLogEventAttributeValue) {
        if (str == null) {
            return;
        }
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        this.attributes.put(str, sentryLogEventAttributeValue);
    }

    public void setAttributes(@Nullable Map<String, SentryLogEventAttributeValue> map) {
        this.attributes = map;
    }

    public void setName(@NotNull String str) {
        this.name = str;
    }

    public void setSpanId(@Nullable SpanId spanId) {
        this.spanId = spanId;
    }

    public void setTimestamp(@NotNull Double d10) {
        this.timestamp = d10;
    }

    public void setTraceId(@NotNull SentryId sentryId) {
        this.traceId = sentryId;
    }

    public void setType(@NotNull String str) {
        this.type = str;
    }

    public void setUnit(@Nullable String str) {
        this.unit = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValue(@NotNull Double d10) {
        this.value = d10;
    }

    public SentryMetricsEvent(@NotNull SentryId sentryId, @NotNull Double d10, @NotNull String str, @NotNull String str2, @NotNull Double d11) {
        this.traceId = sentryId;
        this.timestamp = d10;
        this.name = str;
        this.type = str2;
        this.value = d11;
    }
}
