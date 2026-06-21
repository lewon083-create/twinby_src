package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Gpu implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "gpu";

    @Nullable
    private String apiType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private Integer f26065id;

    @Nullable
    private Integer memorySize;

    @Nullable
    private Boolean multiThreadedRendering;

    @Nullable
    private String name;

    @Nullable
    private String npotSupport;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String vendorId;

    @Nullable
    private String vendorName;

    @Nullable
    private String version;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Gpu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Gpu deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Gpu gpu = new Gpu();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "npot_support":
                        gpu.npotSupport = objectReader.nextStringOrNull();
                        break;
                    case "vendor_id":
                        gpu.vendorId = objectReader.nextStringOrNull();
                        break;
                    case "multi_threaded_rendering":
                        gpu.multiThreadedRendering = objectReader.nextBooleanOrNull();
                        break;
                    case "id":
                        gpu.f26065id = objectReader.nextIntegerOrNull();
                        break;
                    case "name":
                        gpu.name = objectReader.nextStringOrNull();
                        break;
                    case "vendor_name":
                        gpu.vendorName = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        gpu.version = objectReader.nextStringOrNull();
                        break;
                    case "api_type":
                        gpu.apiType = objectReader.nextStringOrNull();
                        break;
                    case "memory_size":
                        gpu.memorySize = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            gpu.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return gpu;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String API_TYPE = "api_type";
        public static final String ID = "id";
        public static final String MEMORY_SIZE = "memory_size";
        public static final String MULTI_THREADED_RENDERING = "multi_threaded_rendering";
        public static final String NAME = "name";
        public static final String NPOT_SUPPORT = "npot_support";
        public static final String VENDOR_ID = "vendor_id";
        public static final String VENDOR_NAME = "vendor_name";
        public static final String VERSION = "version";
    }

    public Gpu() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Gpu.class == obj.getClass()) {
            Gpu gpu = (Gpu) obj;
            if (Objects.equals(this.name, gpu.name) && Objects.equals(this.f26065id, gpu.f26065id) && Objects.equals(this.vendorId, gpu.vendorId) && Objects.equals(this.vendorName, gpu.vendorName) && Objects.equals(this.memorySize, gpu.memorySize) && Objects.equals(this.apiType, gpu.apiType) && Objects.equals(this.multiThreadedRendering, gpu.multiThreadedRendering) && Objects.equals(this.version, gpu.version) && Objects.equals(this.npotSupport, gpu.npotSupport)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getApiType() {
        return this.apiType;
    }

    @Nullable
    public Integer getId() {
        return this.f26065id;
    }

    @Nullable
    public Integer getMemorySize() {
        return this.memorySize;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getNpotSupport() {
        return this.npotSupport;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getVendorId() {
        return this.vendorId;
    }

    @Nullable
    public String getVendorName() {
        return this.vendorName;
    }

    @Nullable
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.f26065id, this.vendorId, this.vendorName, this.memorySize, this.apiType, this.multiThreadedRendering, this.version, this.npotSupport);
    }

    @Nullable
    public Boolean isMultiThreadedRendering() {
        return this.multiThreadedRendering;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.f26065id != null) {
            objectWriter.name("id").value(this.f26065id);
        }
        if (this.vendorId != null) {
            objectWriter.name(JsonKeys.VENDOR_ID).value(this.vendorId);
        }
        if (this.vendorName != null) {
            objectWriter.name(JsonKeys.VENDOR_NAME).value(this.vendorName);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.apiType != null) {
            objectWriter.name(JsonKeys.API_TYPE).value(this.apiType);
        }
        if (this.multiThreadedRendering != null) {
            objectWriter.name(JsonKeys.MULTI_THREADED_RENDERING).value(this.multiThreadedRendering);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        if (this.npotSupport != null) {
            objectWriter.name(JsonKeys.NPOT_SUPPORT).value(this.npotSupport);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setApiType(@Nullable String str) {
        this.apiType = str;
    }

    public void setId(Integer num) {
        this.f26065id = num;
    }

    public void setMemorySize(@Nullable Integer num) {
        this.memorySize = num;
    }

    public void setMultiThreadedRendering(@Nullable Boolean bool) {
        this.multiThreadedRendering = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNpotSupport(@Nullable String str) {
        this.npotSupport = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVendorId(@Nullable String str) {
        this.vendorId = str;
    }

    public void setVendorName(@Nullable String str) {
        this.vendorName = str;
    }

    public void setVersion(@Nullable String str) {
        this.version = str;
    }

    public Gpu(@NotNull Gpu gpu) {
        this.name = gpu.name;
        this.f26065id = gpu.f26065id;
        this.vendorId = gpu.vendorId;
        this.vendorName = gpu.vendorName;
        this.memorySize = gpu.memorySize;
        this.apiType = gpu.apiType;
        this.multiThreadedRendering = gpu.multiThreadedRendering;
        this.version = gpu.version;
        this.npotSupport = gpu.npotSupport;
        this.unknown = CollectionUtils.newConcurrentHashMap(gpu.unknown);
    }
}
