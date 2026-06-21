package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class MeasurementValue implements JsonUnknown, JsonSerializable {
    public static final String KEY_APP_START_COLD = "app_start_cold";
    public static final String KEY_APP_START_WARM = "app_start_warm";
    public static final String KEY_FRAMES_DELAY = "frames_delay";
    public static final String KEY_FRAMES_FROZEN = "frames_frozen";
    public static final String KEY_FRAMES_SLOW = "frames_slow";
    public static final String KEY_FRAMES_TOTAL = "frames_total";
    public static final String KEY_TIME_TO_FULL_DISPLAY = "time_to_full_display";
    public static final String KEY_TIME_TO_INITIAL_DISPLAY = "time_to_initial_display";

    @Nullable
    private final String unit;

    @Nullable
    private Map<String, Object> unknown;

    @NotNull
    private final Number value;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<MeasurementValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public MeasurementValue deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            Number number = null;
            String strNextStringOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("unit")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals("value")) {
                    number = (Number) objectReader.nextObjectOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            objectReader.endObject();
            if (number != null) {
                MeasurementValue measurementValue = new MeasurementValue(number, strNextStringOrNull);
                measurementValue.setUnknown(concurrentHashMap);
                return measurementValue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public MeasurementValue(@NotNull Number number, @Nullable String str) {
        this.value = number;
        this.unit = str;
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
    public Number getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(this.value);
        if (this.unit != null) {
            objectWriter.name("unit").value(this.unit);
        }
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

    public MeasurementValue(@NotNull Number number, @Nullable String str, @Nullable Map<String, Object> map) {
        this.value = number;
        this.unit = str;
        this.unknown = map;
    }
}
