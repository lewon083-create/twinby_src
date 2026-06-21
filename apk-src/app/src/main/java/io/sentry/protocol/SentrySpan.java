package io.sentry.protocol;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentrySpan implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, Object> data;

    @Nullable
    private final String description;

    @NotNull
    private final Map<String, MeasurementValue> measurements;

    @NotNull
    private final String op;

    @Nullable
    private final String origin;

    @Nullable
    private final SpanId parentSpanId;

    @NotNull
    private final SpanId spanId;

    @NotNull
    private final Double startTimestamp;

    @Nullable
    private final SpanStatus status;

    @NotNull
    private final Map<String, String> tags;

    @Nullable
    private final Double timestamp;

    @NotNull
    private final SentryId traceId;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentrySpan> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentrySpan deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            SentryId sentryIdDeserialize = null;
            SpanId spanIdDeserialize = null;
            Map map2 = null;
            String strNextStringOrNull = null;
            Double dValueOf2 = null;
            SpanId spanId = null;
            String strNextStringOrNull2 = null;
            SpanStatus spanStatus = null;
            String strNextStringOrNull3 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d10 = dValueOf;
                Map map4 = map;
                SentryId sentryId = sentryIdDeserialize;
                SpanId spanId2 = spanIdDeserialize;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (d10 == null) {
                        throw missingRequiredFieldException("start_timestamp", iLogger);
                    }
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (spanId2 == null) {
                        throw missingRequiredFieldException("span_id", iLogger);
                    }
                    if (strNextStringOrNull == null) {
                        throw missingRequiredFieldException("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    SentrySpan sentrySpan = new SentrySpan(d10, dValueOf2, sentryId, spanId2, spanId, strNextStringOrNull, strNextStringOrNull2, spanStatus, strNextStringOrNull3, map5, map2, map3);
                    sentrySpan.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return sentrySpan;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanIdDeserialize = new SpanId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "parent_span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "description":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            dValueOf = dateNextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "origin":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "status":
                        spanStatus = (SpanStatus) objectReader.nextOrNull(iLogger, new SpanStatus.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "measurements":
                        map2 = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "op":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "data":
                        map3 = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "tags":
                        map = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            dValueOf2 = dateNextDateOrNull2 != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull2)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        spanIdDeserialize = spanId2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String MEASUREMENTS = "measurements";
        public static final String OP = "op";
        public static final String ORIGIN = "origin";
        public static final String PARENT_SPAN_ID = "parent_span_id";
        public static final String SPAN_ID = "span_id";
        public static final String START_TIMESTAMP = "start_timestamp";
        public static final String STATUS = "status";
        public static final String TAGS = "tags";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentrySpan(@NotNull Span span) {
        this(span, span.getData());
    }

    @NotNull
    private BigDecimal doubleToBigDecimal(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @Nullable
    public Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @NotNull
    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @NotNull
    public String getOp() {
        return this.op;
    }

    @Nullable
    public String getOrigin() {
        return this.origin;
    }

    @Nullable
    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    @NotNull
    public SpanId getSpanId() {
        return this.spanId;
    }

    @NotNull
    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public SpanStatus getStatus() {
        return this.status;
    }

    @NotNull
    public Map<String, String> getTags() {
        return this.tags;
    }

    @Nullable
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

    public boolean isFinished() {
        return this.timestamp != null;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("span_id").value(iLogger, this.spanId);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id").value(iLogger, this.parentSpanId);
        }
        objectWriter.name("op").value(this.op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.status != null) {
            objectWriter.name("status").value(iLogger, this.status);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setData(@Nullable Map<String, Object> map) {
        this.data = map;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentrySpan(@NotNull Span span, @Nullable Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        this.origin = span.getSpanContext().getOrigin();
        Map<String, String> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = mapNewConcurrentHashMap == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap;
        Map<String, MeasurementValue> mapNewConcurrentHashMap2 = CollectionUtils.newConcurrentHashMap(span.getMeasurements());
        this.measurements = mapNewConcurrentHashMap2 == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap2;
        this.timestamp = span.getFinishDate() == null ? null : Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().laterDateNanosTimestampByDiff(span.getFinishDate())));
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().nanoTimestamp()));
        this.data = map;
        FeatureFlags featureFlags = span.getSpanContext().getFeatureFlagBuffer().getFeatureFlags();
        if (featureFlags != null) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            for (FeatureFlag featureFlag : featureFlags.getValues()) {
                this.data.put(FeatureFlag.DATA_PREFIX + featureFlag.getFlag(), featureFlag.getResult());
            }
        }
    }

    public SentrySpan(@NotNull Double d10, @Nullable Double d11, @NotNull SentryId sentryId, @NotNull SpanId spanId, @Nullable SpanId spanId2, @NotNull String str, @Nullable String str2, @Nullable SpanStatus spanStatus, @Nullable String str3, @NotNull Map<String, String> map, @NotNull Map<String, MeasurementValue> map2, @Nullable Map<String, Object> map3) {
        this.startTimestamp = d10;
        this.timestamp = d11;
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.op = str;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        this.tags = map;
        this.measurements = map2;
        this.data = map3;
    }
}
