package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FeatureFlag implements JsonUnknown, JsonSerializable {

    @NotNull
    public static final String DATA_PREFIX = "flag.evaluation.";

    @NotNull
    private String flag;
    private boolean result;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<FeatureFlag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public FeatureFlag deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            String strNextStringOrNull = null;
            Boolean boolNextBooleanOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.RESULT)) {
                    boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                } else if (strNextName.equals(JsonKeys.FLAG)) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolNextBooleanOrNull == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            FeatureFlag featureFlag = new FeatureFlag(strNextStringOrNull, boolNextBooleanOrNull.booleanValue());
            featureFlag.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return featureFlag;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String FLAG = "flag";
        public static final String RESULT = "result";
    }

    public FeatureFlag(@NotNull String str, boolean z5) {
        this.flag = str;
        this.result = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FeatureFlag.class == obj.getClass()) {
            FeatureFlag featureFlag = (FeatureFlag) obj;
            if (Objects.equals(this.flag, featureFlag.flag) && Objects.equals(Boolean.valueOf(this.result), Boolean.valueOf(featureFlag.result))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String getFlag() {
        return this.flag;
    }

    @NotNull
    public Boolean getResult() {
        return Boolean.valueOf(this.result);
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return Objects.hash(this.flag, Boolean.valueOf(this.result));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.FLAG).value(this.flag);
        objectWriter.name(JsonKeys.RESULT).value(this.result);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setFlag(@NotNull String str) {
        this.flag = str;
    }

    public void setResult(@NotNull Boolean bool) {
        this.result = bool.booleanValue();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
