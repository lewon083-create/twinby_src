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
public final class OperatingSystem implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "os";

    @Nullable
    private String build;

    @Nullable
    private String kernelVersion;

    @Nullable
    private String name;

    @Nullable
    private String rawDescription;

    @Nullable
    private Boolean rooted;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String version;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<OperatingSystem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public OperatingSystem deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            OperatingSystem operatingSystem = new OperatingSystem();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "rooted":
                        operatingSystem.rooted = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_description":
                        operatingSystem.rawDescription = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        operatingSystem.name = objectReader.nextStringOrNull();
                        break;
                    case "build":
                        operatingSystem.build = objectReader.nextStringOrNull();
                        break;
                    case "version":
                        operatingSystem.version = objectReader.nextStringOrNull();
                        break;
                    case "kernel_version":
                        operatingSystem.kernelVersion = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            operatingSystem.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return operatingSystem;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String BUILD = "build";
        public static final String KERNEL_VERSION = "kernel_version";
        public static final String NAME = "name";
        public static final String RAW_DESCRIPTION = "raw_description";
        public static final String ROOTED = "rooted";
        public static final String VERSION = "version";
    }

    public OperatingSystem() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OperatingSystem.class == obj.getClass()) {
            OperatingSystem operatingSystem = (OperatingSystem) obj;
            if (Objects.equals(this.name, operatingSystem.name) && Objects.equals(this.version, operatingSystem.version) && Objects.equals(this.rawDescription, operatingSystem.rawDescription) && Objects.equals(this.build, operatingSystem.build) && Objects.equals(this.kernelVersion, operatingSystem.kernelVersion) && Objects.equals(this.rooted, operatingSystem.rooted)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getBuild() {
        return this.build;
    }

    @Nullable
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getRawDescription() {
        return this.rawDescription;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.rawDescription, this.build, this.kernelVersion, this.rooted);
    }

    @Nullable
    public Boolean isRooted() {
        return this.rooted;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.version != null) {
            objectWriter.name("version").value(this.version);
        }
        if (this.rawDescription != null) {
            objectWriter.name("raw_description").value(this.rawDescription);
        }
        if (this.build != null) {
            objectWriter.name(JsonKeys.BUILD).value(this.build);
        }
        if (this.kernelVersion != null) {
            objectWriter.name(JsonKeys.KERNEL_VERSION).value(this.kernelVersion);
        }
        if (this.rooted != null) {
            objectWriter.name(JsonKeys.ROOTED).value(this.rooted);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setBuild(@Nullable String str) {
        this.build = str;
    }

    public void setKernelVersion(@Nullable String str) {
        this.kernelVersion = str;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setRawDescription(@Nullable String str) {
        this.rawDescription = str;
    }

    public void setRooted(@Nullable Boolean bool) {
        this.rooted = bool;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVersion(@Nullable String str) {
        this.version = str;
    }

    public OperatingSystem(@NotNull OperatingSystem operatingSystem) {
        this.name = operatingSystem.name;
        this.version = operatingSystem.version;
        this.rawDescription = operatingSystem.rawDescription;
        this.build = operatingSystem.build;
        this.kernelVersion = operatingSystem.kernelVersion;
        this.rooted = operatingSystem.rooted;
        this.unknown = CollectionUtils.newConcurrentHashMap(operatingSystem.unknown);
    }
}
