package io.sentry;

import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfilingTransactionData implements JsonUnknown, JsonSerializable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private String f25883id;

    @NotNull
    private String name;

    @Nullable
    private Long relativeEndCpuMs;

    @Nullable
    private Long relativeEndNs;

    @NotNull
    private Long relativeStartCpuMs;

    @NotNull
    private Long relativeStartNs;

    @NotNull
    private String traceId;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<ProfilingTransactionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public ProfilingTransactionData deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ProfilingTransactionData profilingTransactionData = new ProfilingTransactionData();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "relative_start_ns":
                        Long lNextLongOrNull = objectReader.nextLongOrNull();
                        if (lNextLongOrNull == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeStartNs = lNextLongOrNull;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lNextLongOrNull2 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull2 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeEndNs = lNextLongOrNull2;
                            break;
                        }
                        break;
                    case "id":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profilingTransactionData.f25883id = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "name":
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 == null) {
                            break;
                        } else {
                            profilingTransactionData.name = strNextStringOrNull2;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull3 == null) {
                            break;
                        } else {
                            profilingTransactionData.traceId = strNextStringOrNull3;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lNextLongOrNull3 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull3 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeEndCpuMs = lNextLongOrNull3;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lNextLongOrNull4 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull4 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeStartCpuMs = lNextLongOrNull4;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            profilingTransactionData.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profilingTransactionData;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String END_CPU_MS = "relative_cpu_end_ms";
        public static final String END_NS = "relative_end_ns";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String START_CPU_MS = "relative_cpu_start_ms";
        public static final String START_NS = "relative_start_ns";
        public static final String TRACE_ID = "trace_id";
    }

    public ProfilingTransactionData() {
        this(NoOpTransaction.getInstance(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProfilingTransactionData.class == obj.getClass()) {
            ProfilingTransactionData profilingTransactionData = (ProfilingTransactionData) obj;
            if (this.f25883id.equals(profilingTransactionData.f25883id) && this.traceId.equals(profilingTransactionData.traceId) && this.name.equals(profilingTransactionData.name) && this.relativeStartNs.equals(profilingTransactionData.relativeStartNs) && this.relativeStartCpuMs.equals(profilingTransactionData.relativeStartCpuMs) && Objects.equals(this.relativeEndCpuMs, profilingTransactionData.relativeEndCpuMs) && Objects.equals(this.relativeEndNs, profilingTransactionData.relativeEndNs) && Objects.equals(this.unknown, profilingTransactionData.unknown)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String getId() {
        return this.f25883id;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public Long getRelativeEndCpuMs() {
        return this.relativeEndCpuMs;
    }

    @Nullable
    public Long getRelativeEndNs() {
        return this.relativeEndNs;
    }

    @NotNull
    public Long getRelativeStartCpuMs() {
        return this.relativeStartCpuMs;
    }

    @NotNull
    public Long getRelativeStartNs() {
        return this.relativeStartNs;
    }

    @NotNull
    public String getTraceId() {
        return this.traceId;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return Objects.hash(this.f25883id, this.traceId, this.name, this.relativeStartNs, this.relativeEndNs, this.relativeStartCpuMs, this.relativeEndCpuMs, this.unknown);
    }

    public void notifyFinish(@NotNull Long l10, @NotNull Long l11, @NotNull Long l12, @NotNull Long l13) {
        if (this.relativeEndNs == null) {
            this.relativeEndNs = Long.valueOf(l10.longValue() - l11.longValue());
            this.relativeStartNs = Long.valueOf(this.relativeStartNs.longValue() - l11.longValue());
            this.relativeEndCpuMs = Long.valueOf(l12.longValue() - l13.longValue());
            this.relativeStartCpuMs = Long.valueOf(this.relativeStartCpuMs.longValue() - l13.longValue());
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("id").value(iLogger, this.f25883id);
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("name").value(iLogger, this.name);
        objectWriter.name(JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
        objectWriter.name(JsonKeys.END_NS).value(iLogger, this.relativeEndNs);
        objectWriter.name(JsonKeys.START_CPU_MS).value(iLogger, this.relativeStartCpuMs);
        objectWriter.name(JsonKeys.END_CPU_MS).value(iLogger, this.relativeEndCpuMs);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setId(@NotNull String str) {
        this.f25883id = str;
    }

    public void setName(@NotNull String str) {
        this.name = str;
    }

    public void setRelativeEndNs(@Nullable Long l10) {
        this.relativeEndNs = l10;
    }

    public void setRelativeStartNs(@NotNull Long l10) {
        this.relativeStartNs = l10;
    }

    public void setTraceId(@NotNull String str) {
        this.traceId = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public ProfilingTransactionData(@NotNull ITransaction iTransaction, @NotNull Long l10, @NotNull Long l11) {
        this.f25883id = iTransaction.getEventId().toString();
        this.traceId = iTransaction.getSpanContext().getTraceId().toString();
        this.name = iTransaction.getName().isEmpty() ? "unknown" : iTransaction.getName();
        this.relativeStartNs = l10;
        this.relativeStartCpuMs = l11;
    }
}
