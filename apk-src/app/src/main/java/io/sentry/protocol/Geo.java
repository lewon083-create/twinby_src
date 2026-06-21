package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Geo implements JsonUnknown, JsonSerializable {

    @Nullable
    private String city;

    @Nullable
    private String countryCode;

    @Nullable
    private String region;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Geo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Geo deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Geo geo = new Geo();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "region":
                        geo.region = objectReader.nextStringOrNull();
                        break;
                    case "city":
                        geo.city = objectReader.nextStringOrNull();
                        break;
                    case "country_code":
                        geo.countryCode = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            geo.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return geo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CITY = "city";
        public static final String COUNTRY_CODE = "country_code";
        public static final String REGION = "region";
    }

    public Geo() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Geo fromMap(@NotNull Map<String, Object> map) {
        Geo geo = new Geo();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            byte b2 = -1;
            switch (key.hashCode()) {
                case -934795532:
                    if (key.equals(JsonKeys.REGION)) {
                        b2 = 0;
                    }
                    break;
                case 3053931:
                    if (key.equals(JsonKeys.CITY)) {
                        b2 = 1;
                    }
                    break;
                case 1481071862:
                    if (key.equals(JsonKeys.COUNTRY_CODE)) {
                        b2 = 2;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    geo.region = value instanceof String ? (String) value : null;
                    break;
                case 1:
                    geo.city = value instanceof String ? (String) value : null;
                    break;
                case 2:
                    geo.countryCode = value instanceof String ? (String) value : null;
                    break;
            }
        }
        return geo;
    }

    @Nullable
    public String getCity() {
        return this.city;
    }

    @Nullable
    public String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public String getRegion() {
        return this.region;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.city != null) {
            objectWriter.name(JsonKeys.CITY).value(this.city);
        }
        if (this.countryCode != null) {
            objectWriter.name(JsonKeys.COUNTRY_CODE).value(this.countryCode);
        }
        if (this.region != null) {
            objectWriter.name(JsonKeys.REGION).value(this.region);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setCity(@Nullable String str) {
        this.city = str;
    }

    public void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public void setRegion(@Nullable String str) {
        this.region = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public Geo(@NotNull Geo geo) {
        this.city = geo.city;
        this.countryCode = geo.countryCode;
        this.region = geo.region;
    }
}
