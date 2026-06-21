package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.FeatureFlag;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FeatureFlags implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "flags";

    @Nullable
    private Map<String, Object> unknown;

    @NotNull
    private List<FeatureFlag> values;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<FeatureFlags> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public FeatureFlags deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    arrayList = objectReader.nextListOrNull(iLogger, new FeatureFlag.Deserializer());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            FeatureFlags featureFlags = new FeatureFlags((List<FeatureFlag>) arrayList);
            featureFlags.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return featureFlags;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String VALUES = "values";
    }

    public FeatureFlags() {
        this.values = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FeatureFlags.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.values, ((FeatureFlags) obj).values);
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @NotNull
    public List<FeatureFlag> getValues() {
        return this.values;
    }

    public int hashCode() {
        return Objects.hash(this.values);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("values").value(iLogger, this.values);
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

    public void setValues(@NotNull List<FeatureFlag> list) {
        this.values = list;
    }

    public FeatureFlags(@NotNull FeatureFlags featureFlags) {
        this.values = featureFlags.values;
        this.unknown = CollectionUtils.newConcurrentHashMap(featureFlags.unknown);
    }

    public FeatureFlags(@NotNull List<FeatureFlag> list) {
        this.values = list;
    }
}
