package io.sentry;

import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryLogLevel;
import io.sentry.SpanId;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryLogEvent implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, SentryLogEventAttributeValue> attributes;

    @NotNull
    private String body;

    @NotNull
    private SentryLogLevel level;

    @Nullable
    private Integer severityNumber;

    @Nullable
    private SpanId spanId;

    @NotNull
    private Double timestamp;

    @NotNull
    private SentryId traceId;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryLogEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryLogEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryId = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull = null;
            HashMap map = null;
            SentryLogLevel sentryLogLevel = null;
            Map<String, SentryLogEventAttributeValue> mapNextMapOrNull = null;
            Integer numNextIntegerOrNull = null;
            SpanId spanId = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case "severity_number":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    case "body":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "level":
                        sentryLogLevel = (SentryLogLevel) objectReader.nextOrNull(iLogger, new SentryLogLevel.Deserializer());
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
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (sentryLogLevel == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            SentryLogEvent sentryLogEvent = new SentryLogEvent(sentryId, dNextDoubleOrNull, strNextStringOrNull, sentryLogLevel);
            sentryLogEvent.setAttributes(mapNextMapOrNull);
            sentryLogEvent.setSeverityNumber(numNextIntegerOrNull);
            sentryLogEvent.setSpanId(spanId);
            sentryLogEvent.setUnknown(map);
            return sentryLogEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ATTRIBUTES = "attributes";
        public static final String BODY = "body";
        public static final String LEVEL = "level";
        public static final String SEVERITY_NUMBER = "severity_number";
        public static final String SPAN_ID = "span_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentryLogEvent(@NotNull SentryId sentryId, @NotNull SentryDate sentryDate, @NotNull String str, @NotNull SentryLogLevel sentryLogLevel) {
        this(sentryId, Double.valueOf(DateUtils.nanosToSeconds(sentryDate.nanoTimestamp())), str, sentryLogLevel);
    }

    @Nullable
    public Map<String, SentryLogEventAttributeValue> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public String getBody() {
        return this.body;
    }

    @NotNull
    public SentryLogLevel getLevel() {
        return this.level;
    }

    @Nullable
    public Integer getSeverityNumber() {
        return this.severityNumber;
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

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        if (this.spanId != null) {
            objectWriter.name("span_id").value(iLogger, this.spanId);
        }
        objectWriter.name(JsonKeys.BODY).value(this.body);
        objectWriter.name("level").value(iLogger, this.level);
        if (this.severityNumber != null) {
            objectWriter.name(JsonKeys.SEVERITY_NUMBER).value(iLogger, this.severityNumber);
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

    public void setBody(@NotNull String str) {
        this.body = str;
    }

    public void setLevel(@NotNull SentryLogLevel sentryLogLevel) {
        this.level = sentryLogLevel;
    }

    public void setSeverityNumber(@Nullable Integer num) {
        this.severityNumber = num;
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

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryLogEvent(@NotNull SentryId sentryId, @NotNull Double d10, @NotNull String str, @NotNull SentryLogLevel sentryLogLevel) {
        this.traceId = sentryId;
        this.timestamp = d10;
        this.body = str;
        this.level = sentryLogLevel;
    }
}
