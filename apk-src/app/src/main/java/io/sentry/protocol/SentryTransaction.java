package io.sentry.protocol;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryTracer;
import io.sentry.Span;
import io.sentry.SpanContext;
import io.sentry.SpanStatus;
import io.sentry.TracesSamplingDecision;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.TransactionInfo;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryTransaction extends SentryBaseEvent implements JsonUnknown, JsonSerializable {

    @NotNull
    private final Map<String, MeasurementValue> measurements;

    @NotNull
    private final List<SentrySpan> spans;

    @NotNull
    private Double startTimestamp;

    @Nullable
    private Double timestamp;

    @Nullable
    private String transaction;

    @NotNull
    private TransactionInfo transactionInfo;

    @NotNull
    private final String type;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryTransaction deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryTransaction sentryTransaction = new SentryTransaction("", Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), null, new ArrayList(), new HashMap(), new TransactionInfo(TransactionNameSource.CUSTOM.apiName()));
            SentryBaseEvent.Deserializer deserializer = new SentryBaseEvent.Deserializer();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "start_timestamp":
                        try {
                            Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                            if (dNextDoubleOrNull != null) {
                                sentryTransaction.startTimestamp = dNextDoubleOrNull;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            if (dateNextDateOrNull != null) {
                                sentryTransaction.startTimestamp = Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        if (mapNextMapOrNull != null) {
                            sentryTransaction.measurements.putAll(mapNextMapOrNull);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        objectReader.nextString();
                        break;
                    case "timestamp":
                        try {
                            Double dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
                            if (dNextDoubleOrNull2 != null) {
                                sentryTransaction.timestamp = dNextDoubleOrNull2;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            if (dateNextDateOrNull2 != null) {
                                sentryTransaction.timestamp = Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull2));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listNextListOrNull = objectReader.nextListOrNull(iLogger, new SentrySpan.Deserializer());
                        if (listNextListOrNull != null) {
                            sentryTransaction.spans.addAll(listNextListOrNull);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        sentryTransaction.transactionInfo = new TransactionInfo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "transaction":
                        sentryTransaction.transaction = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (deserializer.deserializeValue(sentryTransaction, strNextName, objectReader, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                            break;
                        }
                        break;
                }
            }
            sentryTransaction.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryTransaction;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String MEASUREMENTS = "measurements";
        public static final String SPANS = "spans";
        public static final String START_TIMESTAMP = "start_timestamp";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRANSACTION = "transaction";
        public static final String TRANSACTION_INFO = "transaction_info";
        public static final String TYPE = "type";
    }

    public SentryTransaction(@NotNull SentryTracer sentryTracer) {
        super(sentryTracer.getEventId());
        this.spans = new ArrayList();
        this.type = "transaction";
        this.measurements = new HashMap();
        Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(sentryTracer.getStartDate().nanoTimestamp()));
        this.timestamp = Double.valueOf(DateUtils.nanosToSeconds(sentryTracer.getStartDate().laterDateNanosTimestampByDiff(sentryTracer.getFinishDate())));
        this.transaction = sentryTracer.getName();
        for (Span span : sentryTracer.getChildren()) {
            if (Boolean.TRUE.equals(span.isSampled())) {
                this.spans.add(new SentrySpan(span));
            }
        }
        Contexts contexts = getContexts();
        contexts.putAll(sentryTracer.getContexts());
        SpanContext spanContext = sentryTracer.getSpanContext();
        Map<String, Object> data = sentryTracer.getData();
        SpanContext spanContext2 = new SpanContext(spanContext.getTraceId(), spanContext.getSpanId(), spanContext.getParentSpanId(), spanContext.getOperation(), spanContext.getDescription(), spanContext.getSamplingDecision(), spanContext.getStatus(), spanContext.getOrigin());
        for (Map.Entry<String, String> entry : spanContext.getTags().entrySet()) {
            setTag(entry.getKey(), entry.getValue());
        }
        if (data != null) {
            for (Map.Entry<String, Object> entry2 : data.entrySet()) {
                spanContext2.setData(entry2.getKey(), entry2.getValue());
            }
        }
        FeatureFlags featureFlags = spanContext.getFeatureFlagBuffer().getFeatureFlags();
        if (featureFlags != null) {
            for (FeatureFlag featureFlag : featureFlags.getValues()) {
                spanContext2.setData(FeatureFlag.DATA_PREFIX + featureFlag.getFlag(), featureFlag.getResult());
            }
        }
        contexts.setTrace(spanContext2);
        this.transactionInfo = new TransactionInfo(sentryTracer.getTransactionNameSource().apiName());
    }

    @NotNull
    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Nullable
    public TracesSamplingDecision getSamplingDecision() {
        SpanContext trace = getContexts().getTrace();
        if (trace == null) {
            return null;
        }
        return trace.getSamplingDecision();
    }

    @NotNull
    public List<SentrySpan> getSpans() {
        return this.spans;
    }

    @NotNull
    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public SpanStatus getStatus() {
        SpanContext trace = getContexts().getTrace();
        if (trace != null) {
            return trace.getStatus();
        }
        return null;
    }

    @Nullable
    public Double getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public String getTransaction() {
        return this.transaction;
    }

    @NotNull
    public String getType() {
        return "transaction";
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public boolean isFinished() {
        return this.timestamp != null;
    }

    public boolean isSampled() {
        TracesSamplingDecision samplingDecision = getSamplingDecision();
        if (samplingDecision == null) {
            return false;
        }
        return samplingDecision.getSampled().booleanValue();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        objectWriter.name("start_timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        }
        if (!this.spans.isEmpty()) {
            objectWriter.name(JsonKeys.SPANS).value(iLogger, this.spans);
        }
        objectWriter.name("type").value("transaction");
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        objectWriter.name(JsonKeys.TRANSACTION_INFO).value(iLogger, this.transactionInfo);
        new SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryTransaction(@Nullable String str, @NotNull Double d10, @Nullable Double d11, @NotNull List<SentrySpan> list, @NotNull Map<String, MeasurementValue> map, @NotNull TransactionInfo transactionInfo) {
        ArrayList arrayList = new ArrayList();
        this.spans = arrayList;
        this.type = "transaction";
        HashMap map2 = new HashMap();
        this.measurements = map2;
        this.transaction = str;
        this.startTimestamp = d10;
        this.timestamp = d11;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator<SentrySpan> it = list.iterator();
        while (it.hasNext()) {
            this.measurements.putAll(it.next().getMeasurements());
        }
        this.transactionInfo = transactionInfo;
    }
}
