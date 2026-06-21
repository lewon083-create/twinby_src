package io.sentry;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.profiling.SentryProfile;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileChunk implements JsonUnknown, JsonSerializable {
    public static final String PLATFORM_ANDROID = "android";
    public static final String PLATFORM_JAVA = "java";

    @NotNull
    private SentryId chunkId;

    @Nullable
    private SdkVersion clientSdk;

    @Nullable
    private DebugMeta debugMeta;

    @Nullable
    private String environment;

    @NotNull
    private final Map<String, ProfileMeasurement> measurements;

    @NotNull
    private String platform;

    @NotNull
    private SentryId profilerId;

    @NotNull
    private String release;

    @Nullable
    private String sampledProfile;

    @Nullable
    private SentryProfile sentryProfile;
    private double timestamp;

    @Nullable
    private final File traceFile;

    @Nullable
    private Map<String, Object> unknown;

    @NotNull
    private String version;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Builder {

        @NotNull
        private final SentryId chunkId;

        @NotNull
        private final Map<String, ProfileMeasurement> measurements;

        @NotNull
        private final String platform;

        @NotNull
        private final SentryId profilerId;
        private final double timestamp;

        @NotNull
        private final File traceFile;

        public Builder(@NotNull SentryId sentryId, @NotNull SentryId sentryId2, @NotNull Map<String, ProfileMeasurement> map, @NotNull File file, @NotNull SentryDate sentryDate, @NotNull String str) {
            this.profilerId = sentryId;
            this.chunkId = sentryId2;
            this.measurements = new ConcurrentHashMap(map);
            this.traceFile = file;
            this.timestamp = DateUtils.nanosToSeconds(sentryDate.nanoTimestamp());
            this.platform = str;
        }

        public ProfileChunk build(SentryOptions sentryOptions) {
            return new ProfileChunk(this.profilerId, this.chunkId, this.traceFile, this.measurements, Double.valueOf(this.timestamp), this.platform, sentryOptions);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<ProfileChunk> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public ProfileChunk deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ProfileChunk profileChunk = new ProfileChunk();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "debug_meta":
                        DebugMeta debugMeta = (DebugMeta) objectReader.nextOrNull(iLogger, new DebugMeta.Deserializer());
                        if (debugMeta == null) {
                            break;
                        } else {
                            profileChunk.debugMeta = debugMeta;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new ProfileMeasurement.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            profileChunk.measurements.putAll(mapNextMapOrNull);
                            break;
                        }
                        break;
                    case "profile":
                        SentryProfile sentryProfile = (SentryProfile) objectReader.nextOrNull(iLogger, new SentryProfile.Deserializer());
                        if (sentryProfile == null) {
                            break;
                        } else {
                            profileChunk.sentryProfile = sentryProfile;
                            break;
                        }
                        break;
                    case "environment":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profileChunk.environment = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull == null) {
                            break;
                        } else {
                            profileChunk.timestamp = dNextDoubleOrNull.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        SentryId sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        if (sentryId == null) {
                            break;
                        } else {
                            profileChunk.profilerId = sentryId;
                            break;
                        }
                        break;
                    case "version":
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 == null) {
                            break;
                        } else {
                            profileChunk.version = strNextStringOrNull2;
                            break;
                        }
                        break;
                    case "release":
                        String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull3 == null) {
                            break;
                        } else {
                            profileChunk.release = strNextStringOrNull3;
                            break;
                        }
                        break;
                    case "client_sdk":
                        SdkVersion sdkVersion = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                        if (sdkVersion == null) {
                            break;
                        } else {
                            profileChunk.clientSdk = sdkVersion;
                            break;
                        }
                        break;
                    case "platform":
                        String strNextStringOrNull4 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull4 == null) {
                            break;
                        } else {
                            profileChunk.platform = strNextStringOrNull4;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strNextStringOrNull5 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull5 == null) {
                            break;
                        } else {
                            profileChunk.sampledProfile = strNextStringOrNull5;
                            break;
                        }
                        break;
                    case "chunk_id":
                        SentryId sentryId2 = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        if (sentryId2 == null) {
                            break;
                        } else {
                            profileChunk.chunkId = sentryId2;
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
            profileChunk.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileChunk;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String CHUNK_ID = "chunk_id";
        public static final String CLIENT_SDK = "client_sdk";
        public static final String DEBUG_META = "debug_meta";
        public static final String ENVIRONMENT = "environment";
        public static final String MEASUREMENTS = "measurements";
        public static final String PLATFORM = "platform";
        public static final String PROFILER_ID = "profiler_id";
        public static final String RELEASE = "release";
        public static final String SAMPLED_PROFILE = "sampled_profile";
        public static final String SENTRY_PROFILE = "profile";
        public static final String TIMESTAMP = "timestamp";
        public static final String VERSION = "version";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileChunk() {
        SentryId sentryId = SentryId.EMPTY_ID;
        this(sentryId, sentryId, null, new HashMap(), Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), "android", SentryOptions.empty());
    }

    @NotNull
    private BigDecimal doubleToBigDecimal(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileChunk)) {
            return false;
        }
        ProfileChunk profileChunk = (ProfileChunk) obj;
        return Objects.equals(this.debugMeta, profileChunk.debugMeta) && Objects.equals(this.profilerId, profileChunk.profilerId) && Objects.equals(this.chunkId, profileChunk.chunkId) && Objects.equals(this.clientSdk, profileChunk.clientSdk) && Objects.equals(this.measurements, profileChunk.measurements) && Objects.equals(this.platform, profileChunk.platform) && Objects.equals(this.release, profileChunk.release) && Objects.equals(this.environment, profileChunk.environment) && Objects.equals(this.version, profileChunk.version) && Objects.equals(this.sampledProfile, profileChunk.sampledProfile) && Objects.equals(this.unknown, profileChunk.unknown) && Objects.equals(this.sentryProfile, profileChunk.sentryProfile);
    }

    @NotNull
    public SentryId getChunkId() {
        return this.chunkId;
    }

    @Nullable
    public SdkVersion getClientSdk() {
        return this.clientSdk;
    }

    @Nullable
    public DebugMeta getDebugMeta() {
        return this.debugMeta;
    }

    @Nullable
    public String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public Map<String, ProfileMeasurement> getMeasurements() {
        return this.measurements;
    }

    @NotNull
    public String getPlatform() {
        return this.platform;
    }

    @NotNull
    public SentryId getProfilerId() {
        return this.profilerId;
    }

    @NotNull
    public String getRelease() {
        return this.release;
    }

    @Nullable
    public String getSampledProfile() {
        return this.sampledProfile;
    }

    @Nullable
    public SentryProfile getSentryProfile() {
        return this.sentryProfile;
    }

    public double getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public File getTraceFile() {
        return this.traceFile;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @NotNull
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.debugMeta, this.profilerId, this.chunkId, this.clientSdk, this.measurements, this.platform, this.release, this.environment, this.version, this.sampledProfile, this.sentryProfile, this.unknown);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.debugMeta != null) {
            objectWriter.name("debug_meta").value(iLogger, this.debugMeta);
        }
        objectWriter.name("profiler_id").value(iLogger, this.profilerId);
        objectWriter.name(JsonKeys.CHUNK_ID).value(iLogger, this.chunkId);
        if (this.clientSdk != null) {
            objectWriter.name(JsonKeys.CLIENT_SDK).value(iLogger, this.clientSdk);
        }
        if (!this.measurements.isEmpty()) {
            String indent = objectWriter.getIndent();
            objectWriter.setIndent("");
            objectWriter.name("measurements").value(iLogger, this.measurements);
            objectWriter.setIndent(indent);
        }
        objectWriter.name("platform").value(iLogger, this.platform);
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        objectWriter.name("version").value(iLogger, this.version);
        if (this.sampledProfile != null) {
            objectWriter.name("sampled_profile").value(iLogger, this.sampledProfile);
        }
        objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(Double.valueOf(this.timestamp)));
        if (this.sentryProfile != null) {
            objectWriter.name("profile").value(iLogger, this.sentryProfile);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setDebugMeta(@Nullable DebugMeta debugMeta) {
        this.debugMeta = debugMeta;
    }

    public void setSampledProfile(@Nullable String str) {
        this.sampledProfile = str;
    }

    public void setSentryProfile(@Nullable SentryProfile sentryProfile) {
        this.sentryProfile = sentryProfile;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public ProfileChunk(@NotNull SentryId sentryId, @NotNull SentryId sentryId2, @Nullable File file, @NotNull Map<String, ProfileMeasurement> map, @NotNull Double d10, @NotNull String str, @NotNull SentryOptions sentryOptions) {
        this.sampledProfile = null;
        this.profilerId = sentryId;
        this.chunkId = sentryId2;
        this.traceFile = file;
        this.measurements = map;
        this.debugMeta = null;
        this.clientSdk = sentryOptions.getSdkVersion();
        this.release = sentryOptions.getRelease() != null ? sentryOptions.getRelease() : "";
        this.environment = sentryOptions.getEnvironment();
        this.platform = str;
        this.version = "2";
        this.timestamp = d10.doubleValue();
    }
}
