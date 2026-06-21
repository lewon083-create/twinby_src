package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SdkInfo implements JsonUnknown, JsonSerializable {

    @Nullable
    private String sdkName;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private Integer versionMajor;

    @Nullable
    private Integer versionMinor;

    @Nullable
    private Integer versionPatchlevel;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SdkInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SdkInfo deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SdkInfo sdkInfo = new SdkInfo();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk_name":
                        sdkInfo.sdkName = objectReader.nextStringOrNull();
                        break;
                    case "version_patchlevel":
                        sdkInfo.versionPatchlevel = objectReader.nextIntegerOrNull();
                        break;
                    case "version_major":
                        sdkInfo.versionMajor = objectReader.nextIntegerOrNull();
                        break;
                    case "version_minor":
                        sdkInfo.versionMinor = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            sdkInfo.setUnknown(map);
            return sdkInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String SDK_NAME = "sdk_name";
        public static final String VERSION_MAJOR = "version_major";
        public static final String VERSION_MINOR = "version_minor";
        public static final String VERSION_PATCHLEVEL = "version_patchlevel";
    }

    @Nullable
    public String getSdkName() {
        return this.sdkName;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public Integer getVersionMajor() {
        return this.versionMajor;
    }

    @Nullable
    public Integer getVersionMinor() {
        return this.versionMinor;
    }

    @Nullable
    public Integer getVersionPatchlevel() {
        return this.versionPatchlevel;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sdkName != null) {
            objectWriter.name(JsonKeys.SDK_NAME).value(this.sdkName);
        }
        if (this.versionMajor != null) {
            objectWriter.name(JsonKeys.VERSION_MAJOR).value(this.versionMajor);
        }
        if (this.versionMinor != null) {
            objectWriter.name(JsonKeys.VERSION_MINOR).value(this.versionMinor);
        }
        if (this.versionPatchlevel != null) {
            objectWriter.name(JsonKeys.VERSION_PATCHLEVEL).value(this.versionPatchlevel);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setSdkName(@Nullable String str) {
        this.sdkName = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVersionMajor(@Nullable Integer num) {
        this.versionMajor = num;
    }

    public void setVersionMinor(@Nullable Integer num) {
        this.versionMinor = num;
    }

    public void setVersionPatchlevel(@Nullable Integer num) {
        this.versionPatchlevel = num;
    }
}
