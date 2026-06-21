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
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class App implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "app";

    @Nullable
    private String appBuild;

    @Nullable
    private String appIdentifier;

    @Nullable
    private String appName;

    @Nullable
    private Date appStartTime;

    @Nullable
    private String appVersion;

    @Nullable
    private String buildType;

    @Nullable
    private String deviceAppHash;

    @Nullable
    private Boolean inForeground;

    @Nullable
    private Boolean isSplitApks;

    @Nullable
    private Map<String, String> permissions;

    @Nullable
    private List<String> splitNames;

    @Nullable
    private String startType;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private List<String> viewNames;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<App> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public App deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            App app = new App();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "split_names":
                        List<String> list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            app.setSplitNames(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        app.deviceAppHash = objectReader.nextStringOrNull();
                        break;
                    case "start_type":
                        app.startType = objectReader.nextStringOrNull();
                        break;
                    case "view_names":
                        List<String> list2 = (List) objectReader.nextObjectOrNull();
                        if (list2 == null) {
                            break;
                        } else {
                            app.setViewNames(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        app.appVersion = objectReader.nextStringOrNull();
                        break;
                    case "in_foreground":
                        app.inForeground = objectReader.nextBooleanOrNull();
                        break;
                    case "build_type":
                        app.buildType = objectReader.nextStringOrNull();
                        break;
                    case "app_identifier":
                        app.appIdentifier = objectReader.nextStringOrNull();
                        break;
                    case "app_start_time":
                        app.appStartTime = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "permissions":
                        app.permissions = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "app_name":
                        app.appName = objectReader.nextStringOrNull();
                        break;
                    case "app_build":
                        app.appBuild = objectReader.nextStringOrNull();
                        break;
                    case "is_split_apks":
                        app.isSplitApks = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            app.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return app;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String APP_BUILD = "app_build";
        public static final String APP_IDENTIFIER = "app_identifier";
        public static final String APP_NAME = "app_name";
        public static final String APP_PERMISSIONS = "permissions";
        public static final String APP_START_TIME = "app_start_time";
        public static final String APP_VERSION = "app_version";
        public static final String BUILD_TYPE = "build_type";
        public static final String DEVICE_APP_HASH = "device_app_hash";
        public static final String IN_FOREGROUND = "in_foreground";
        public static final String IS_SPLIT_APKS = "is_split_apks";
        public static final String SPLIT_NAMES = "split_names";
        public static final String START_TYPE = "start_type";
        public static final String VIEW_NAMES = "view_names";
    }

    public App() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && App.class == obj.getClass()) {
            App app = (App) obj;
            if (Objects.equals(this.appIdentifier, app.appIdentifier) && Objects.equals(this.appStartTime, app.appStartTime) && Objects.equals(this.deviceAppHash, app.deviceAppHash) && Objects.equals(this.buildType, app.buildType) && Objects.equals(this.appName, app.appName) && Objects.equals(this.appVersion, app.appVersion) && Objects.equals(this.appBuild, app.appBuild) && Objects.equals(this.permissions, app.permissions) && Objects.equals(this.inForeground, app.inForeground) && Objects.equals(this.viewNames, app.viewNames) && Objects.equals(this.startType, app.startType) && Objects.equals(this.isSplitApks, app.isSplitApks) && Objects.equals(this.splitNames, app.splitNames)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAppBuild() {
        return this.appBuild;
    }

    @Nullable
    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    @Nullable
    public String getAppName() {
        return this.appName;
    }

    @Nullable
    public Date getAppStartTime() {
        Date date = this.appStartTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Nullable
    public String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public String getBuildType() {
        return this.buildType;
    }

    @Nullable
    public String getDeviceAppHash() {
        return this.deviceAppHash;
    }

    @Nullable
    public Boolean getInForeground() {
        return this.inForeground;
    }

    @Nullable
    public Map<String, String> getPermissions() {
        return this.permissions;
    }

    @Nullable
    public Boolean getSplitApks() {
        return this.isSplitApks;
    }

    @Nullable
    public List<String> getSplitNames() {
        return this.splitNames;
    }

    @Nullable
    public String getStartType() {
        return this.startType;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public List<String> getViewNames() {
        return this.viewNames;
    }

    public int hashCode() {
        return Objects.hash(this.appIdentifier, this.appStartTime, this.deviceAppHash, this.buildType, this.appName, this.appVersion, this.appBuild, this.permissions, this.inForeground, this.viewNames, this.startType, this.isSplitApks, this.splitNames);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.appIdentifier != null) {
            objectWriter.name(JsonKeys.APP_IDENTIFIER).value(this.appIdentifier);
        }
        if (this.appStartTime != null) {
            objectWriter.name(JsonKeys.APP_START_TIME).value(iLogger, this.appStartTime);
        }
        if (this.deviceAppHash != null) {
            objectWriter.name(JsonKeys.DEVICE_APP_HASH).value(this.deviceAppHash);
        }
        if (this.buildType != null) {
            objectWriter.name(JsonKeys.BUILD_TYPE).value(this.buildType);
        }
        if (this.appName != null) {
            objectWriter.name(JsonKeys.APP_NAME).value(this.appName);
        }
        if (this.appVersion != null) {
            objectWriter.name(JsonKeys.APP_VERSION).value(this.appVersion);
        }
        if (this.appBuild != null) {
            objectWriter.name(JsonKeys.APP_BUILD).value(this.appBuild);
        }
        Map<String, String> map = this.permissions;
        if (map != null && !map.isEmpty()) {
            objectWriter.name(JsonKeys.APP_PERMISSIONS).value(iLogger, this.permissions);
        }
        if (this.inForeground != null) {
            objectWriter.name(JsonKeys.IN_FOREGROUND).value(this.inForeground);
        }
        if (this.viewNames != null) {
            objectWriter.name(JsonKeys.VIEW_NAMES).value(iLogger, this.viewNames);
        }
        if (this.startType != null) {
            objectWriter.name(JsonKeys.START_TYPE).value(this.startType);
        }
        if (this.isSplitApks != null) {
            objectWriter.name(JsonKeys.IS_SPLIT_APKS).value(this.isSplitApks);
        }
        List<String> list = this.splitNames;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.SPLIT_NAMES).value(iLogger, this.splitNames);
        }
        Map<String, Object> map2 = this.unknown;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAppBuild(@Nullable String str) {
        this.appBuild = str;
    }

    public void setAppIdentifier(@Nullable String str) {
        this.appIdentifier = str;
    }

    public void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public void setAppStartTime(@Nullable Date date) {
        this.appStartTime = date;
    }

    public void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public void setBuildType(@Nullable String str) {
        this.buildType = str;
    }

    public void setDeviceAppHash(@Nullable String str) {
        this.deviceAppHash = str;
    }

    public void setInForeground(@Nullable Boolean bool) {
        this.inForeground = bool;
    }

    public void setPermissions(@Nullable Map<String, String> map) {
        this.permissions = map;
    }

    public void setSplitApks(@Nullable Boolean bool) {
        this.isSplitApks = bool;
    }

    public void setSplitNames(@Nullable List<String> list) {
        this.splitNames = list;
    }

    public void setStartType(@Nullable String str) {
        this.startType = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setViewNames(@Nullable List<String> list) {
        this.viewNames = list;
    }

    public App(@NotNull App app) {
        this.appBuild = app.appBuild;
        this.appIdentifier = app.appIdentifier;
        this.appName = app.appName;
        this.appStartTime = app.appStartTime;
        this.appVersion = app.appVersion;
        this.buildType = app.buildType;
        this.deviceAppHash = app.deviceAppHash;
        this.permissions = CollectionUtils.newConcurrentHashMap(app.permissions);
        this.inForeground = app.inForeground;
        this.viewNames = CollectionUtils.newArrayList(app.viewNames);
        this.startType = app.startType;
        this.isSplitApks = app.isSplitApks;
        this.splitNames = app.splitNames;
        this.unknown = CollectionUtils.newConcurrentHashMap(app.unknown);
    }
}
