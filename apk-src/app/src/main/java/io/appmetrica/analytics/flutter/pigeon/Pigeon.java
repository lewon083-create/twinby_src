package io.appmetrica.analytics.flutter.pigeon;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.api.sdk.exceptions.VKApiCodes;
import he.e;
import ii.f;
import ii.m;
import ii.w;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s7.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Pigeon {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AdRevenuePigeon {
        private String adNetwork;
        private String adPlacementId;
        private String adPlacementName;

        @NonNull
        private String adRevenue;
        private AdTypePigeon adType;
        private String adUnitId;
        private String adUnitName;

        @NonNull
        private String currency;
        private Map<String, String> payload;
        private String precision;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String adNetwork;
            private String adPlacementId;
            private String adPlacementName;
            private String adRevenue;
            private AdTypePigeon adType;
            private String adUnitId;
            private String adUnitName;
            private String currency;
            private Map<String, String> payload;
            private String precision;

            @NonNull
            public AdRevenuePigeon build() {
                AdRevenuePigeon adRevenuePigeon = new AdRevenuePigeon();
                adRevenuePigeon.setAdRevenue(this.adRevenue);
                adRevenuePigeon.setCurrency(this.currency);
                adRevenuePigeon.setAdType(this.adType);
                adRevenuePigeon.setAdNetwork(this.adNetwork);
                adRevenuePigeon.setAdUnitId(this.adUnitId);
                adRevenuePigeon.setAdUnitName(this.adUnitName);
                adRevenuePigeon.setAdPlacementId(this.adPlacementId);
                adRevenuePigeon.setAdPlacementName(this.adPlacementName);
                adRevenuePigeon.setPrecision(this.precision);
                adRevenuePigeon.setPayload(this.payload);
                return adRevenuePigeon;
            }

            @NonNull
            public Builder setAdNetwork(String str) {
                this.adNetwork = str;
                return this;
            }

            @NonNull
            public Builder setAdPlacementId(String str) {
                this.adPlacementId = str;
                return this;
            }

            @NonNull
            public Builder setAdPlacementName(String str) {
                this.adPlacementName = str;
                return this;
            }

            @NonNull
            public Builder setAdRevenue(@NonNull String str) {
                this.adRevenue = str;
                return this;
            }

            @NonNull
            public Builder setAdType(AdTypePigeon adTypePigeon) {
                this.adType = adTypePigeon;
                return this;
            }

            @NonNull
            public Builder setAdUnitId(String str) {
                this.adUnitId = str;
                return this;
            }

            @NonNull
            public Builder setAdUnitName(String str) {
                this.adUnitName = str;
                return this;
            }

            @NonNull
            public Builder setCurrency(@NonNull String str) {
                this.currency = str;
                return this;
            }

            @NonNull
            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            @NonNull
            public Builder setPrecision(String str) {
                this.precision = str;
                return this;
            }
        }

        @NonNull
        public static AdRevenuePigeon fromList(@NonNull ArrayList<Object> arrayList) {
            AdRevenuePigeon adRevenuePigeon = new AdRevenuePigeon();
            adRevenuePigeon.setAdRevenue((String) arrayList.get(0));
            adRevenuePigeon.setCurrency((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            adRevenuePigeon.setAdType(obj == null ? null : AdTypePigeon.values()[((Integer) obj).intValue()]);
            adRevenuePigeon.setAdNetwork((String) arrayList.get(3));
            adRevenuePigeon.setAdUnitId((String) arrayList.get(4));
            adRevenuePigeon.setAdUnitName((String) arrayList.get(5));
            adRevenuePigeon.setAdPlacementId((String) arrayList.get(6));
            adRevenuePigeon.setAdPlacementName((String) arrayList.get(7));
            adRevenuePigeon.setPrecision((String) arrayList.get(8));
            adRevenuePigeon.setPayload((Map) arrayList.get(9));
            return adRevenuePigeon;
        }

        public String getAdNetwork() {
            return this.adNetwork;
        }

        public String getAdPlacementId() {
            return this.adPlacementId;
        }

        public String getAdPlacementName() {
            return this.adPlacementName;
        }

        @NonNull
        public String getAdRevenue() {
            return this.adRevenue;
        }

        public AdTypePigeon getAdType() {
            return this.adType;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public String getAdUnitName() {
            return this.adUnitName;
        }

        @NonNull
        public String getCurrency() {
            return this.currency;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public String getPrecision() {
            return this.precision;
        }

        public void setAdNetwork(String str) {
            this.adNetwork = str;
        }

        public void setAdPlacementId(String str) {
            this.adPlacementId = str;
        }

        public void setAdPlacementName(String str) {
            this.adPlacementName = str;
        }

        public void setAdRevenue(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"adRevenue\" is null.");
            }
            this.adRevenue = str;
        }

        public void setAdType(AdTypePigeon adTypePigeon) {
            this.adType = adTypePigeon;
        }

        public void setAdUnitId(String str) {
            this.adUnitId = str;
        }

        public void setAdUnitName(String str) {
            this.adUnitName = str;
        }

        public void setCurrency(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setPrecision(String str) {
            this.precision = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(10);
            arrayList.add(this.adRevenue);
            arrayList.add(this.currency);
            AdTypePigeon adTypePigeon = this.adType;
            arrayList.add(adTypePigeon == null ? null : Integer.valueOf(adTypePigeon.index));
            arrayList.add(this.adNetwork);
            arrayList.add(this.adUnitId);
            arrayList.add(this.adUnitName);
            arrayList.add(this.adPlacementId);
            arrayList.add(this.adPlacementName);
            arrayList.add(this.precision);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum AdTypePigeon {
        UNKNOWN(0),
        NATIVE(1),
        BANNER(2),
        REWARDED(3),
        INTERSTITIAL(4),
        MREC(5),
        APP_OPEN(6),
        OTHER(7);

        final int index;

        AdTypePigeon(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface AppMetricaConfigConverterPigeon {
        @NonNull
        static m getCodec() {
            return AppMetricaConfigConverterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaConfigConverterPigeon.toJson((AppMetricaConfigPigeon) ((ArrayList) obj).get(0)));
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        static void setup(@NonNull f fVar, AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon) {
            g gVar = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaConfigConverterPigeon.toJson", getCodec(), (Object) null);
            if (appMetricaConfigConverterPigeon != null) {
                gVar.L(new e(4, appMetricaConfigConverterPigeon));
            } else {
                gVar.L(null);
            }
        }

        @NonNull
        String toJson(@NonNull AppMetricaConfigPigeon appMetricaConfigPigeon);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class AppMetricaConfigConverterPigeonCodec extends w {
        public static final AppMetricaConfigConverterPigeonCodec INSTANCE = new AppMetricaConfigConverterPigeonCodec();

        private AppMetricaConfigConverterPigeonCodec() {
        }

        @Override // ii.w
        public Object readValueOfType(byte b2, @NonNull ByteBuffer byteBuffer) {
            switch (b2) {
                case -128:
                    return AppMetricaConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return LocationPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PreloadInfoPigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // ii.w
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AppMetricaConfigPigeon) obj).toList());
            } else if (obj instanceof LocationPigeon) {
                byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                writeValue(byteArrayOutputStream, ((LocationPigeon) obj).toList());
            } else if (!(obj instanceof PreloadInfoPigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PreloadInfoPigeon) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AppMetricaConfigPigeon {
        private Boolean advIdentifiersTracking;
        private Boolean anrMonitoring;
        private Long anrMonitoringTimeout;

        @NonNull
        private String apiKey;
        private Long appBuildNumber;
        private Map<String, String> appEnvironment;
        private Boolean appOpenTrackingEnabled;
        private String appVersion;
        private Boolean crashReporting;
        private List<String> customHosts;
        private Boolean dataSendingEnabled;
        private String deviceType;
        private Long dispatchPeriodSeconds;
        private Map<String, String> errorEnvironment;
        private Boolean firstActivationAsUpdate;
        private LocationPigeon location;
        private Boolean locationTracking;
        private Boolean logs;
        private Long maxReportsCount;
        private Long maxReportsInDatabaseCount;
        private Boolean nativeCrashReporting;
        private PreloadInfoPigeon preloadInfo;
        private Boolean revenueAutoTrackingEnabled;
        private Long sessionTimeout;
        private Boolean sessionsAutoTrackingEnabled;
        private String userProfileID;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private Boolean advIdentifiersTracking;
            private Boolean anrMonitoring;
            private Long anrMonitoringTimeout;
            private String apiKey;
            private Long appBuildNumber;
            private Map<String, String> appEnvironment;
            private Boolean appOpenTrackingEnabled;
            private String appVersion;
            private Boolean crashReporting;
            private List<String> customHosts;
            private Boolean dataSendingEnabled;
            private String deviceType;
            private Long dispatchPeriodSeconds;
            private Map<String, String> errorEnvironment;
            private Boolean firstActivationAsUpdate;
            private LocationPigeon location;
            private Boolean locationTracking;
            private Boolean logs;
            private Long maxReportsCount;
            private Long maxReportsInDatabaseCount;
            private Boolean nativeCrashReporting;
            private PreloadInfoPigeon preloadInfo;
            private Boolean revenueAutoTrackingEnabled;
            private Long sessionTimeout;
            private Boolean sessionsAutoTrackingEnabled;
            private String userProfileID;

            @NonNull
            public AppMetricaConfigPigeon build() {
                AppMetricaConfigPigeon appMetricaConfigPigeon = new AppMetricaConfigPigeon();
                appMetricaConfigPigeon.setApiKey(this.apiKey);
                appMetricaConfigPigeon.setAdvIdentifiersTracking(this.advIdentifiersTracking);
                appMetricaConfigPigeon.setAnrMonitoring(this.anrMonitoring);
                appMetricaConfigPigeon.setAnrMonitoringTimeout(this.anrMonitoringTimeout);
                appMetricaConfigPigeon.setAppBuildNumber(this.appBuildNumber);
                appMetricaConfigPigeon.setAppEnvironment(this.appEnvironment);
                appMetricaConfigPigeon.setAppOpenTrackingEnabled(this.appOpenTrackingEnabled);
                appMetricaConfigPigeon.setAppVersion(this.appVersion);
                appMetricaConfigPigeon.setCrashReporting(this.crashReporting);
                appMetricaConfigPigeon.setCustomHosts(this.customHosts);
                appMetricaConfigPigeon.setDataSendingEnabled(this.dataSendingEnabled);
                appMetricaConfigPigeon.setDeviceType(this.deviceType);
                appMetricaConfigPigeon.setDispatchPeriodSeconds(this.dispatchPeriodSeconds);
                appMetricaConfigPigeon.setErrorEnvironment(this.errorEnvironment);
                appMetricaConfigPigeon.setFirstActivationAsUpdate(this.firstActivationAsUpdate);
                appMetricaConfigPigeon.setLocation(this.location);
                appMetricaConfigPigeon.setLocationTracking(this.locationTracking);
                appMetricaConfigPigeon.setLogs(this.logs);
                appMetricaConfigPigeon.setMaxReportsCount(this.maxReportsCount);
                appMetricaConfigPigeon.setMaxReportsInDatabaseCount(this.maxReportsInDatabaseCount);
                appMetricaConfigPigeon.setNativeCrashReporting(this.nativeCrashReporting);
                appMetricaConfigPigeon.setPreloadInfo(this.preloadInfo);
                appMetricaConfigPigeon.setRevenueAutoTrackingEnabled(this.revenueAutoTrackingEnabled);
                appMetricaConfigPigeon.setSessionTimeout(this.sessionTimeout);
                appMetricaConfigPigeon.setSessionsAutoTrackingEnabled(this.sessionsAutoTrackingEnabled);
                appMetricaConfigPigeon.setUserProfileID(this.userProfileID);
                return appMetricaConfigPigeon;
            }

            @NonNull
            public Builder setAdvIdentifiersTracking(Boolean bool) {
                this.advIdentifiersTracking = bool;
                return this;
            }

            @NonNull
            public Builder setAnrMonitoring(Boolean bool) {
                this.anrMonitoring = bool;
                return this;
            }

            @NonNull
            public Builder setAnrMonitoringTimeout(Long l10) {
                this.anrMonitoringTimeout = l10;
                return this;
            }

            @NonNull
            public Builder setApiKey(@NonNull String str) {
                this.apiKey = str;
                return this;
            }

            @NonNull
            public Builder setAppBuildNumber(Long l10) {
                this.appBuildNumber = l10;
                return this;
            }

            @NonNull
            public Builder setAppEnvironment(Map<String, String> map) {
                this.appEnvironment = map;
                return this;
            }

            @NonNull
            public Builder setAppOpenTrackingEnabled(Boolean bool) {
                this.appOpenTrackingEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setAppVersion(String str) {
                this.appVersion = str;
                return this;
            }

            @NonNull
            public Builder setCrashReporting(Boolean bool) {
                this.crashReporting = bool;
                return this;
            }

            @NonNull
            public Builder setCustomHosts(List<String> list) {
                this.customHosts = list;
                return this;
            }

            @NonNull
            public Builder setDataSendingEnabled(Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setDeviceType(String str) {
                this.deviceType = str;
                return this;
            }

            @NonNull
            public Builder setDispatchPeriodSeconds(Long l10) {
                this.dispatchPeriodSeconds = l10;
                return this;
            }

            @NonNull
            public Builder setErrorEnvironment(Map<String, String> map) {
                this.errorEnvironment = map;
                return this;
            }

            @NonNull
            public Builder setFirstActivationAsUpdate(Boolean bool) {
                this.firstActivationAsUpdate = bool;
                return this;
            }

            @NonNull
            public Builder setLocation(LocationPigeon locationPigeon) {
                this.location = locationPigeon;
                return this;
            }

            @NonNull
            public Builder setLocationTracking(Boolean bool) {
                this.locationTracking = bool;
                return this;
            }

            @NonNull
            public Builder setLogs(Boolean bool) {
                this.logs = bool;
                return this;
            }

            @NonNull
            public Builder setMaxReportsCount(Long l10) {
                this.maxReportsCount = l10;
                return this;
            }

            @NonNull
            public Builder setMaxReportsInDatabaseCount(Long l10) {
                this.maxReportsInDatabaseCount = l10;
                return this;
            }

            @NonNull
            public Builder setNativeCrashReporting(Boolean bool) {
                this.nativeCrashReporting = bool;
                return this;
            }

            @NonNull
            public Builder setPreloadInfo(PreloadInfoPigeon preloadInfoPigeon) {
                this.preloadInfo = preloadInfoPigeon;
                return this;
            }

            @NonNull
            public Builder setRevenueAutoTrackingEnabled(Boolean bool) {
                this.revenueAutoTrackingEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setSessionTimeout(Long l10) {
                this.sessionTimeout = l10;
                return this;
            }

            @NonNull
            public Builder setSessionsAutoTrackingEnabled(Boolean bool) {
                this.sessionsAutoTrackingEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setUserProfileID(String str) {
                this.userProfileID = str;
                return this;
            }
        }

        @NonNull
        public static AppMetricaConfigPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            Long lValueOf5;
            AppMetricaConfigPigeon appMetricaConfigPigeon = new AppMetricaConfigPigeon();
            appMetricaConfigPigeon.setApiKey((String) arrayList.get(0));
            appMetricaConfigPigeon.setAdvIdentifiersTracking((Boolean) arrayList.get(1));
            appMetricaConfigPigeon.setAnrMonitoring((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            Long lValueOf6 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            appMetricaConfigPigeon.setAnrMonitoringTimeout(lValueOf);
            Object obj2 = arrayList.get(4);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            appMetricaConfigPigeon.setAppBuildNumber(lValueOf2);
            appMetricaConfigPigeon.setAppEnvironment((Map) arrayList.get(5));
            appMetricaConfigPigeon.setAppOpenTrackingEnabled((Boolean) arrayList.get(6));
            appMetricaConfigPigeon.setAppVersion((String) arrayList.get(7));
            appMetricaConfigPigeon.setCrashReporting((Boolean) arrayList.get(8));
            appMetricaConfigPigeon.setCustomHosts((List) arrayList.get(9));
            appMetricaConfigPigeon.setDataSendingEnabled((Boolean) arrayList.get(10));
            appMetricaConfigPigeon.setDeviceType((String) arrayList.get(11));
            Object obj3 = arrayList.get(12);
            if (obj3 == null) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            appMetricaConfigPigeon.setDispatchPeriodSeconds(lValueOf3);
            appMetricaConfigPigeon.setErrorEnvironment((Map) arrayList.get(13));
            appMetricaConfigPigeon.setFirstActivationAsUpdate((Boolean) arrayList.get(14));
            Object obj4 = arrayList.get(15);
            appMetricaConfigPigeon.setLocation(obj4 == null ? null : LocationPigeon.fromList((ArrayList) obj4));
            appMetricaConfigPigeon.setLocationTracking((Boolean) arrayList.get(16));
            appMetricaConfigPigeon.setLogs((Boolean) arrayList.get(17));
            Object obj5 = arrayList.get(18);
            if (obj5 == null) {
                lValueOf4 = null;
            } else {
                lValueOf4 = Long.valueOf(obj5 instanceof Integer ? ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsCount(lValueOf4);
            Object obj6 = arrayList.get(19);
            if (obj6 == null) {
                lValueOf5 = null;
            } else {
                lValueOf5 = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsInDatabaseCount(lValueOf5);
            appMetricaConfigPigeon.setNativeCrashReporting((Boolean) arrayList.get(20));
            Object obj7 = arrayList.get(21);
            appMetricaConfigPigeon.setPreloadInfo(obj7 == null ? null : PreloadInfoPigeon.fromList((ArrayList) obj7));
            appMetricaConfigPigeon.setRevenueAutoTrackingEnabled((Boolean) arrayList.get(22));
            Object obj8 = arrayList.get(23);
            if (obj8 != null) {
                lValueOf6 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            appMetricaConfigPigeon.setSessionTimeout(lValueOf6);
            appMetricaConfigPigeon.setSessionsAutoTrackingEnabled((Boolean) arrayList.get(24));
            appMetricaConfigPigeon.setUserProfileID((String) arrayList.get(25));
            return appMetricaConfigPigeon;
        }

        public Boolean getAdvIdentifiersTracking() {
            return this.advIdentifiersTracking;
        }

        public Boolean getAnrMonitoring() {
            return this.anrMonitoring;
        }

        public Long getAnrMonitoringTimeout() {
            return this.anrMonitoringTimeout;
        }

        @NonNull
        public String getApiKey() {
            return this.apiKey;
        }

        public Long getAppBuildNumber() {
            return this.appBuildNumber;
        }

        public Map<String, String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public Boolean getAppOpenTrackingEnabled() {
            return this.appOpenTrackingEnabled;
        }

        public String getAppVersion() {
            return this.appVersion;
        }

        public Boolean getCrashReporting() {
            return this.crashReporting;
        }

        public List<String> getCustomHosts() {
            return this.customHosts;
        }

        public Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public String getDeviceType() {
            return this.deviceType;
        }

        public Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public Map<String, String> getErrorEnvironment() {
            return this.errorEnvironment;
        }

        public Boolean getFirstActivationAsUpdate() {
            return this.firstActivationAsUpdate;
        }

        public LocationPigeon getLocation() {
            return this.location;
        }

        public Boolean getLocationTracking() {
            return this.locationTracking;
        }

        public Boolean getLogs() {
            return this.logs;
        }

        public Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public Boolean getNativeCrashReporting() {
            return this.nativeCrashReporting;
        }

        public PreloadInfoPigeon getPreloadInfo() {
            return this.preloadInfo;
        }

        public Boolean getRevenueAutoTrackingEnabled() {
            return this.revenueAutoTrackingEnabled;
        }

        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public Boolean getSessionsAutoTrackingEnabled() {
            return this.sessionsAutoTrackingEnabled;
        }

        public String getUserProfileID() {
            return this.userProfileID;
        }

        public void setAdvIdentifiersTracking(Boolean bool) {
            this.advIdentifiersTracking = bool;
        }

        public void setAnrMonitoring(Boolean bool) {
            this.anrMonitoring = bool;
        }

        public void setAnrMonitoringTimeout(Long l10) {
            this.anrMonitoringTimeout = l10;
        }

        public void setApiKey(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppBuildNumber(Long l10) {
            this.appBuildNumber = l10;
        }

        public void setAppEnvironment(Map<String, String> map) {
            this.appEnvironment = map;
        }

        public void setAppOpenTrackingEnabled(Boolean bool) {
            this.appOpenTrackingEnabled = bool;
        }

        public void setAppVersion(String str) {
            this.appVersion = str;
        }

        public void setCrashReporting(Boolean bool) {
            this.crashReporting = bool;
        }

        public void setCustomHosts(List<String> list) {
            this.customHosts = list;
        }

        public void setDataSendingEnabled(Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDeviceType(String str) {
            this.deviceType = str;
        }

        public void setDispatchPeriodSeconds(Long l10) {
            this.dispatchPeriodSeconds = l10;
        }

        public void setErrorEnvironment(Map<String, String> map) {
            this.errorEnvironment = map;
        }

        public void setFirstActivationAsUpdate(Boolean bool) {
            this.firstActivationAsUpdate = bool;
        }

        public void setLocation(LocationPigeon locationPigeon) {
            this.location = locationPigeon;
        }

        public void setLocationTracking(Boolean bool) {
            this.locationTracking = bool;
        }

        public void setLogs(Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(Long l10) {
            this.maxReportsCount = l10;
        }

        public void setMaxReportsInDatabaseCount(Long l10) {
            this.maxReportsInDatabaseCount = l10;
        }

        public void setNativeCrashReporting(Boolean bool) {
            this.nativeCrashReporting = bool;
        }

        public void setPreloadInfo(PreloadInfoPigeon preloadInfoPigeon) {
            this.preloadInfo = preloadInfoPigeon;
        }

        public void setRevenueAutoTrackingEnabled(Boolean bool) {
            this.revenueAutoTrackingEnabled = bool;
        }

        public void setSessionTimeout(Long l10) {
            this.sessionTimeout = l10;
        }

        public void setSessionsAutoTrackingEnabled(Boolean bool) {
            this.sessionsAutoTrackingEnabled = bool;
        }

        public void setUserProfileID(String str) {
            this.userProfileID = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(26);
            arrayList.add(this.apiKey);
            arrayList.add(this.advIdentifiersTracking);
            arrayList.add(this.anrMonitoring);
            arrayList.add(this.anrMonitoringTimeout);
            arrayList.add(this.appBuildNumber);
            arrayList.add(this.appEnvironment);
            arrayList.add(this.appOpenTrackingEnabled);
            arrayList.add(this.appVersion);
            arrayList.add(this.crashReporting);
            arrayList.add(this.customHosts);
            arrayList.add(this.dataSendingEnabled);
            arrayList.add(this.deviceType);
            arrayList.add(this.dispatchPeriodSeconds);
            arrayList.add(this.errorEnvironment);
            arrayList.add(this.firstActivationAsUpdate);
            LocationPigeon locationPigeon = this.location;
            arrayList.add(locationPigeon == null ? null : locationPigeon.toList());
            arrayList.add(this.locationTracking);
            arrayList.add(this.logs);
            arrayList.add(this.maxReportsCount);
            arrayList.add(this.maxReportsInDatabaseCount);
            arrayList.add(this.nativeCrashReporting);
            PreloadInfoPigeon preloadInfoPigeon = this.preloadInfo;
            arrayList.add(preloadInfoPigeon != null ? preloadInfoPigeon.toList() : null);
            arrayList.add(this.revenueAutoTrackingEnabled);
            arrayList.add(this.sessionTimeout);
            arrayList.add(this.sessionsAutoTrackingEnabled);
            arrayList.add(this.userProfileID);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AppMetricaDeferredDeeplinkErrorPigeon {

        @NonNull
        private String description;
        private String message;

        @NonNull
        private AppMetricaDeferredDeeplinkReasonPigeon reason;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String description;
            private String message;
            private AppMetricaDeferredDeeplinkReasonPigeon reason;

            @NonNull
            public AppMetricaDeferredDeeplinkErrorPigeon build() {
                AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new AppMetricaDeferredDeeplinkErrorPigeon();
                appMetricaDeferredDeeplinkErrorPigeon.setReason(this.reason);
                appMetricaDeferredDeeplinkErrorPigeon.setDescription(this.description);
                appMetricaDeferredDeeplinkErrorPigeon.setMessage(this.message);
                return appMetricaDeferredDeeplinkErrorPigeon;
            }

            @NonNull
            public Builder setDescription(@NonNull String str) {
                this.description = str;
                return this;
            }

            @NonNull
            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }

            @NonNull
            public Builder setReason(@NonNull AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
                this.reason = appMetricaDeferredDeeplinkReasonPigeon;
                return this;
            }
        }

        @NonNull
        public static AppMetricaDeferredDeeplinkErrorPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new AppMetricaDeferredDeeplinkErrorPigeon();
            Object obj = arrayList.get(0);
            appMetricaDeferredDeeplinkErrorPigeon.setReason(obj == null ? null : AppMetricaDeferredDeeplinkReasonPigeon.values()[((Integer) obj).intValue()]);
            appMetricaDeferredDeeplinkErrorPigeon.setDescription((String) arrayList.get(1));
            appMetricaDeferredDeeplinkErrorPigeon.setMessage((String) arrayList.get(2));
            return appMetricaDeferredDeeplinkErrorPigeon;
        }

        @NonNull
        public String getDescription() {
            return this.description;
        }

        public String getMessage() {
            return this.message;
        }

        @NonNull
        public AppMetricaDeferredDeeplinkReasonPigeon getReason() {
            return this.reason;
        }

        public void setDescription(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setReason(@NonNull AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
            if (appMetricaDeferredDeeplinkReasonPigeon == null) {
                throw new IllegalStateException("Nonnull field \"reason\" is null.");
            }
            this.reason = appMetricaDeferredDeeplinkReasonPigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon = this.reason;
            arrayList.add(appMetricaDeferredDeeplinkReasonPigeon == null ? null : Integer.valueOf(appMetricaDeferredDeeplinkReasonPigeon.index));
            arrayList.add(this.description);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AppMetricaDeferredDeeplinkParametersPigeon {
        private AppMetricaDeferredDeeplinkErrorPigeon error;
        private Map<String, String> parameters;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private AppMetricaDeferredDeeplinkErrorPigeon error;
            private Map<String, String> parameters;

            @NonNull
            public AppMetricaDeferredDeeplinkParametersPigeon build() {
                AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new AppMetricaDeferredDeeplinkParametersPigeon();
                appMetricaDeferredDeeplinkParametersPigeon.setParameters(this.parameters);
                appMetricaDeferredDeeplinkParametersPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkParametersPigeon;
            }

            @NonNull
            public Builder setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }

            @NonNull
            public Builder setParameters(Map<String, String> map) {
                this.parameters = map;
                return this;
            }
        }

        @NonNull
        public static AppMetricaDeferredDeeplinkParametersPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new AppMetricaDeferredDeeplinkParametersPigeon();
            appMetricaDeferredDeeplinkParametersPigeon.setParameters((Map) arrayList.get(0));
            Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkParametersPigeon.setError(obj == null ? null : AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) obj));
            return appMetricaDeferredDeeplinkParametersPigeon;
        }

        public AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public void setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        public void setParameters(Map<String, String> map) {
            this.parameters = map;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.parameters);
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
            arrayList.add(appMetricaDeferredDeeplinkErrorPigeon == null ? null : appMetricaDeferredDeeplinkErrorPigeon.toList());
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AppMetricaDeferredDeeplinkPigeon {
        private String deeplink;
        private AppMetricaDeferredDeeplinkErrorPigeon error;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String deeplink;
            private AppMetricaDeferredDeeplinkErrorPigeon error;

            @NonNull
            public AppMetricaDeferredDeeplinkPigeon build() {
                AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new AppMetricaDeferredDeeplinkPigeon();
                appMetricaDeferredDeeplinkPigeon.setDeeplink(this.deeplink);
                appMetricaDeferredDeeplinkPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkPigeon;
            }

            @NonNull
            public Builder setDeeplink(String str) {
                this.deeplink = str;
                return this;
            }

            @NonNull
            public Builder setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }
        }

        @NonNull
        public static AppMetricaDeferredDeeplinkPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new AppMetricaDeferredDeeplinkPigeon();
            appMetricaDeferredDeeplinkPigeon.setDeeplink((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkPigeon.setError(obj == null ? null : AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) obj));
            return appMetricaDeferredDeeplinkPigeon;
        }

        public String getDeeplink() {
            return this.deeplink;
        }

        public AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public void setDeeplink(String str) {
            this.deeplink = str;
        }

        public void setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.deeplink);
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
            arrayList.add(appMetricaDeferredDeeplinkErrorPigeon == null ? null : appMetricaDeferredDeeplinkErrorPigeon.toList());
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum AppMetricaDeferredDeeplinkReasonPigeon {
        NOT_A_FIRST_LAUNCH(0),
        PARSE_ERROR(1),
        UNKNOWN(2),
        NO_REFERRER(3),
        NO_ERROR(4);

        final int index;

        AppMetricaDeferredDeeplinkReasonPigeon(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface AppMetricaLibraryAdapterPigeon {
        @NonNull
        static m getCodec() {
            return new w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        static void setup(@NonNull f fVar, AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon) {
            g gVar = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData", getCodec(), (Object) null);
            if (appMetricaLibraryAdapterPigeon != null) {
                gVar.L(new e(5, appMetricaLibraryAdapterPigeon));
            } else {
                gVar.L(null);
            }
        }

        void subscribeForAutoCollectedData(@NonNull String str);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface AppMetricaPigeon {
        @NonNull
        static m getCodec() {
            return AppMetricaPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.activate((AppMetricaConfigPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.activateReporter((ReporterConfigPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.putErrorEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportAdRevenue((AdRevenuePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportAppOpen((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportECommerce((ECommerceEventPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportError((ErrorDetailsPigeon) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportErrorWithGroup((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportEvent((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportEventWithJson((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportExternalAttribution((ExternalAttributionPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$19(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportReferralUrl((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.clearAppEnvironment();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$20(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportRevenue((RevenuePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$21(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportUnhandledException((ErrorDetailsPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$22(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportUserProfile((UserProfilePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$23(AppMetricaPigeon appMetricaPigeon, Object obj, final ii.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestDeferredDeeplink(new Result<AppMetricaDeferredDeeplinkPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.1
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th2) {
                    cVar.i(Pigeon.wrapError(th2));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkPigeon);
                    cVar.i(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$24(AppMetricaPigeon appMetricaPigeon, Object obj, final ii.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestDeferredDeeplinkParameters(new Result<AppMetricaDeferredDeeplinkParametersPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.2
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th2) {
                    cVar.i(Pigeon.wrapError(th2));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkParametersPigeon);
                    cVar.i(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$25(AppMetricaPigeon appMetricaPigeon, Object obj, final ii.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestStartupParams((List) ((ArrayList) obj).get(0), new Result<StartupParamsPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.3
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th2) {
                    cVar.i(Pigeon.wrapError(th2));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(StartupParamsPigeon startupParamsPigeon) {
                    arrayList.add(0, startupParamsPigeon);
                    cVar.i(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$26(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.resumeSession();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$27(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.sendEventsBuffer();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$28(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setAdvIdentifiersTracking((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$29(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setDataSendingEnabled((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.enableActivityAutoTracking();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$30(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setLocation((LocationPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$31(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setLocationTracking((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$32(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setUserProfileID((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$33(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.handlePluginInitFinished();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$34(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.touchReporter((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getDeviceId());
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryApiLevel());
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryVersion());
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getUuid());
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.pauseSession();
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(AppMetricaPigeon appMetricaPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.putAppEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        static void setup(@NonNull f fVar, final AppMetricaPigeon appMetricaPigeon) {
            Object obj = null;
            g gVar = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activate", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i = 0;
                gVar.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar.L(null);
            }
            g gVar2 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activateReporter", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i10 = 2;
                gVar2.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i10) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar2.L(null);
            }
            g gVar3 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.clearAppEnvironment", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i11 = 14;
                gVar3.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i11) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar3.L(null);
            }
            g gVar4 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.enableActivityAutoTracking", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i12 = 20;
                gVar4.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i12) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar4.L(null);
            }
            g gVar5 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getDeviceId", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i13 = 21;
                gVar5.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i13) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar5.L(null);
            }
            g gVar6 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryApiLevel", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i14 = 23;
                gVar6.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i14) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar6.L(null);
            }
            g gVar7 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryVersion", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i15 = 24;
                gVar7.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i15) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar7.L(null);
            }
            g gVar8 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getUuid", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i16 = 25;
                gVar8.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i16) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar8.L(null);
            }
            g gVar9 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.pauseSession", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i17 = 26;
                gVar9.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i17) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar9.L(null);
            }
            g gVar10 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putAppEnvironmentValue", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i18 = 27;
                gVar10.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i18) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar10.L(null);
            }
            g gVar11 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putErrorEnvironmentValue", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i19 = 11;
                gVar11.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i19) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar11.L(null);
            }
            g gVar12 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAdRevenue", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i20 = 22;
                gVar12.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i20) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar12.L(null);
            }
            g gVar13 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAppOpen", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i21 = 28;
                gVar13.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i21) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar13.L(null);
            }
            g gVar14 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportECommerce", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i22 = 29;
                gVar14.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i22) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar14.L(null);
            }
            g gVar15 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportError", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i23 = 0;
                gVar15.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21896c;

                    {
                        this.f21896c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i23) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f21896c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f21896c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f21896c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f21896c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f21896c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar15.L(null);
            }
            g gVar16 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportErrorWithGroup", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i24 = 1;
                gVar16.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21896c;

                    {
                        this.f21896c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i24) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f21896c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f21896c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f21896c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f21896c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f21896c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar16.L(null);
            }
            g gVar17 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEvent", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i25 = 2;
                gVar17.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21896c;

                    {
                        this.f21896c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i25) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f21896c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f21896c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f21896c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f21896c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f21896c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar17.L(null);
            }
            g gVar18 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEventWithJson", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i26 = 3;
                gVar18.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21896c;

                    {
                        this.f21896c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i26) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f21896c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f21896c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f21896c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f21896c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f21896c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar18.L(null);
            }
            g gVar19 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportExternalAttribution", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i27 = 4;
                gVar19.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21896c;

                    {
                        this.f21896c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i27) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f21896c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f21896c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f21896c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f21896c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f21896c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar19.L(null);
            }
            g gVar20 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportReferralUrl", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i28 = 1;
                gVar20.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i28) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar20.L(null);
            }
            g gVar21 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportRevenue", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i29 = 3;
                gVar21.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i29) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar21.L(null);
            }
            g gVar22 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUnhandledException", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i30 = 4;
                gVar22.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i30) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar22.L(null);
            }
            g gVar23 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUserProfile", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i31 = 5;
                gVar23.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i31) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar23.L(null);
            }
            g gVar24 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplink", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i32 = 6;
                gVar24.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i32) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar24.L(null);
            }
            g gVar25 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplinkParameters", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i33 = 7;
                gVar25.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i33) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar25.L(null);
            }
            g gVar26 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestStartupParams", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i34 = 8;
                gVar26.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i34) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar26.L(null);
            }
            g gVar27 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.resumeSession", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i35 = 9;
                gVar27.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i35) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar27.L(null);
            }
            g gVar28 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.sendEventsBuffer", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i36 = 10;
                gVar28.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i36) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar28.L(null);
            }
            g gVar29 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setAdvIdentifiersTracking", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i37 = 12;
                gVar29.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i37) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar29.L(null);
            }
            g gVar30 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setDataSendingEnabled", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i38 = 13;
                gVar30.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i38) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar30.L(null);
            }
            g gVar31 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocation", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i39 = 15;
                gVar31.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i39) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar31.L(null);
            }
            g gVar32 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocationTracking", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i40 = 16;
                gVar32.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i40) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar32.L(null);
            }
            g gVar33 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setUserProfileID", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i41 = 17;
                gVar33.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i41) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar33.L(null);
            }
            g gVar34 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.handlePluginInitFinished", getCodec(), obj);
            if (appMetricaPigeon != null) {
                final int i42 = 18;
                gVar34.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i42) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar34.L(null);
            }
            g gVar35 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.touchReporter", getCodec(), obj);
            if (appMetricaPigeon == null) {
                gVar35.L(null);
            } else {
                final int i43 = 19;
                gVar35.L(new ii.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f21894c;

                    {
                        this.f21894c = appMetricaPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i43) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f21894c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f21894c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f21894c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f21894c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f21894c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f21894c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f21894c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f21894c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f21894c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f21894c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f21894c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f21894c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f21894c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f21894c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f21894c, obj2, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f21894c, obj2, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f21894c, obj2, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f21894c, obj2, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f21894c, obj2, eVar);
                                break;
                            case 19:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f21894c, obj2, eVar);
                                break;
                            case 20:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f21894c, obj2, eVar);
                                break;
                            case 21:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f21894c, obj2, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f21894c, obj2, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f21894c, obj2, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f21894c, obj2, eVar);
                                break;
                            case 25:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f21894c, obj2, eVar);
                                break;
                            case 26:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f21894c, obj2, eVar);
                                break;
                            case 27:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f21894c, obj2, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f21894c, obj2, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f21894c, obj2, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void activate(@NonNull AppMetricaConfigPigeon appMetricaConfigPigeon);

        void activateReporter(@NonNull ReporterConfigPigeon reporterConfigPigeon);

        void clearAppEnvironment();

        void enableActivityAutoTracking();

        String getDeviceId();

        @NonNull
        Long getLibraryApiLevel();

        @NonNull
        String getLibraryVersion();

        String getUuid();

        void handlePluginInitFinished();

        void pauseSession();

        void putAppEnvironmentValue(@NonNull String str, String str2);

        void putErrorEnvironmentValue(@NonNull String str, String str2);

        void reportAdRevenue(@NonNull AdRevenuePigeon adRevenuePigeon);

        void reportAppOpen(@NonNull String str);

        void reportECommerce(@NonNull ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(@NonNull ErrorDetailsPigeon errorDetailsPigeon, String str);

        void reportErrorWithGroup(@NonNull String str, ErrorDetailsPigeon errorDetailsPigeon, String str2);

        void reportEvent(@NonNull String str);

        void reportEventWithJson(@NonNull String str, String str2);

        void reportExternalAttribution(@NonNull ExternalAttributionPigeon externalAttributionPigeon);

        void reportReferralUrl(@NonNull String str);

        void reportRevenue(@NonNull RevenuePigeon revenuePigeon);

        void reportUnhandledException(@NonNull ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(@NonNull UserProfilePigeon userProfilePigeon);

        void requestDeferredDeeplink(@NonNull Result<AppMetricaDeferredDeeplinkPigeon> result);

        void requestDeferredDeeplinkParameters(@NonNull Result<AppMetricaDeferredDeeplinkParametersPigeon> result);

        void requestStartupParams(@NonNull List<String> list, @NonNull Result<StartupParamsPigeon> result);

        void resumeSession();

        void sendEventsBuffer();

        void setAdvIdentifiersTracking(@NonNull Boolean bool);

        void setDataSendingEnabled(@NonNull Boolean bool);

        void setLocation(LocationPigeon locationPigeon);

        void setLocationTracking(@NonNull Boolean bool);

        void setUserProfileID(String str);

        void touchReporter(@NonNull String str);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class AppMetricaPigeonCodec extends w {
        public static final AppMetricaPigeonCodec INSTANCE = new AppMetricaPigeonCodec();

        private AppMetricaPigeonCodec() {
        }

        @Override // ii.w
        public Object readValueOfType(byte b2, @NonNull ByteBuffer byteBuffer) {
            switch (b2) {
                case -128:
                    return AdRevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return AppMetricaConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return AppMetricaDeferredDeeplinkParametersPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return AppMetricaDeferredDeeplinkPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return ECommerceCartItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return ECommerceEventPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return ECommerceOrderPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return ECommerceReferrerPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return ECommerceScreenPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return ExternalAttributionPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -109:
                    return LocationPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -108:
                    return PreloadInfoPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -107:
                    return ReceiptPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -106:
                    return ReporterConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -105:
                    return RevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -104:
                    return StackTraceElementPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -103:
                    return StartupParamsItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -102:
                    return StartupParamsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -101:
                    return StartupParamsReasonPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -100:
                    return StartupParamsResultPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -99:
                    return UserProfileAttributePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -98:
                    return UserProfilePigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // ii.w
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AdRevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                writeValue(byteArrayOutputStream, ((AppMetricaConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkErrorPigeon) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkErrorPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkParametersPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkParametersPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkPigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof ECommerceAmountPigeon;
            if (z5) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceEventPigeon) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceOrderPigeon) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z10 = obj instanceof ECommercePricePigeon;
            if (z10) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            if (z10) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z11 = obj instanceof ECommerceProductPigeon;
            if (z11) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z11) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceScreenPigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z12 = obj instanceof ErrorDetailsPigeon;
            if (z12) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z12) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof ExternalAttributionPigeon) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((ExternalAttributionPigeon) obj).toList());
                return;
            }
            if (obj instanceof LocationPigeon) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((LocationPigeon) obj).toList());
                return;
            }
            if (obj instanceof PreloadInfoPigeon) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((PreloadInfoPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReceiptPigeon) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReporterConfigPigeon) {
                byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_TIMESTAMP);
                writeValue(byteArrayOutputStream, ((ReporterConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof RevenuePigeon) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof StackTraceElementPigeon) {
                byteArrayOutputStream.write(152);
                writeValue(byteArrayOutputStream, ((StackTraceElementPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsItemPigeon) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((StartupParamsItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsPigeon) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((StartupParamsPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsReasonPigeon) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                writeValue(byteArrayOutputStream, ((StartupParamsReasonPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsResultPigeon) {
                byteArrayOutputStream.write(156);
                writeValue(byteArrayOutputStream, ((StartupParamsResultPigeon) obj).toList());
            } else if (obj instanceof UserProfileAttributePigeon) {
                byteArrayOutputStream.write(157);
                writeValue(byteArrayOutputStream, ((UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(158);
                writeValue(byteArrayOutputStream, ((UserProfilePigeon) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceAmountPigeon {

        @NonNull
        private String amount;

        @NonNull
        private String currency;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String amount;
            private String currency;

            @NonNull
            public ECommerceAmountPigeon build() {
                ECommerceAmountPigeon eCommerceAmountPigeon = new ECommerceAmountPigeon();
                eCommerceAmountPigeon.setAmount(this.amount);
                eCommerceAmountPigeon.setCurrency(this.currency);
                return eCommerceAmountPigeon;
            }

            @NonNull
            public Builder setAmount(@NonNull String str) {
                this.amount = str;
                return this;
            }

            @NonNull
            public Builder setCurrency(@NonNull String str) {
                this.currency = str;
                return this;
            }
        }

        @NonNull
        public static ECommerceAmountPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceAmountPigeon eCommerceAmountPigeon = new ECommerceAmountPigeon();
            eCommerceAmountPigeon.setAmount((String) arrayList.get(0));
            eCommerceAmountPigeon.setCurrency((String) arrayList.get(1));
            return eCommerceAmountPigeon;
        }

        @NonNull
        public String getAmount() {
            return this.amount;
        }

        @NonNull
        public String getCurrency() {
            return this.currency;
        }

        public void setAmount(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"amount\" is null.");
            }
            this.amount = str;
        }

        public void setCurrency(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.amount);
            arrayList.add(this.currency);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceCartItemPigeon {

        @NonNull
        private ECommerceProductPigeon product;

        @NonNull
        private String quantity;
        private ECommerceReferrerPigeon referrer;

        @NonNull
        private ECommercePricePigeon revenue;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private ECommerceProductPigeon product;
            private String quantity;
            private ECommerceReferrerPigeon referrer;
            private ECommercePricePigeon revenue;

            @NonNull
            public ECommerceCartItemPigeon build() {
                ECommerceCartItemPigeon eCommerceCartItemPigeon = new ECommerceCartItemPigeon();
                eCommerceCartItemPigeon.setProduct(this.product);
                eCommerceCartItemPigeon.setQuantity(this.quantity);
                eCommerceCartItemPigeon.setRevenue(this.revenue);
                eCommerceCartItemPigeon.setReferrer(this.referrer);
                return eCommerceCartItemPigeon;
            }

            @NonNull
            public Builder setProduct(@NonNull ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            @NonNull
            public Builder setQuantity(@NonNull String str) {
                this.quantity = str;
                return this;
            }

            @NonNull
            public Builder setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            @NonNull
            public Builder setRevenue(@NonNull ECommercePricePigeon eCommercePricePigeon) {
                this.revenue = eCommercePricePigeon;
                return this;
            }
        }

        @NonNull
        public static ECommerceCartItemPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceCartItemPigeon eCommerceCartItemPigeon = new ECommerceCartItemPigeon();
            Object obj = arrayList.get(0);
            eCommerceCartItemPigeon.setProduct(obj == null ? null : ECommerceProductPigeon.fromList((ArrayList) obj));
            eCommerceCartItemPigeon.setQuantity((String) arrayList.get(1));
            Object obj2 = arrayList.get(2);
            eCommerceCartItemPigeon.setRevenue(obj2 == null ? null : ECommercePricePigeon.fromList((ArrayList) obj2));
            Object obj3 = arrayList.get(3);
            eCommerceCartItemPigeon.setReferrer(obj3 != null ? ECommerceReferrerPigeon.fromList((ArrayList) obj3) : null);
            return eCommerceCartItemPigeon;
        }

        @NonNull
        public ECommerceProductPigeon getProduct() {
            return this.product;
        }

        @NonNull
        public String getQuantity() {
            return this.quantity;
        }

        public ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        @NonNull
        public ECommercePricePigeon getRevenue() {
            return this.revenue;
        }

        public void setProduct(@NonNull ECommerceProductPigeon eCommerceProductPigeon) {
            if (eCommerceProductPigeon == null) {
                throw new IllegalStateException("Nonnull field \"product\" is null.");
            }
            this.product = eCommerceProductPigeon;
        }

        public void setQuantity(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"quantity\" is null.");
            }
            this.quantity = str;
        }

        public void setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setRevenue(@NonNull ECommercePricePigeon eCommercePricePigeon) {
            if (eCommercePricePigeon == null) {
                throw new IllegalStateException("Nonnull field \"revenue\" is null.");
            }
            this.revenue = eCommercePricePigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            arrayList.add(this.quantity);
            ECommercePricePigeon eCommercePricePigeon = this.revenue;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon != null ? eCommerceReferrerPigeon.toList() : null);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceEventPigeon {
        private ECommerceCartItemPigeon cartItem;

        @NonNull
        private String eventType;
        private ECommerceOrderPigeon order;
        private ECommerceProductPigeon product;
        private ECommerceReferrerPigeon referrer;
        private ECommerceScreenPigeon screen;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private ECommerceCartItemPigeon cartItem;
            private String eventType;
            private ECommerceOrderPigeon order;
            private ECommerceProductPigeon product;
            private ECommerceReferrerPigeon referrer;
            private ECommerceScreenPigeon screen;

            @NonNull
            public ECommerceEventPigeon build() {
                ECommerceEventPigeon eCommerceEventPigeon = new ECommerceEventPigeon();
                eCommerceEventPigeon.setEventType(this.eventType);
                eCommerceEventPigeon.setCartItem(this.cartItem);
                eCommerceEventPigeon.setOrder(this.order);
                eCommerceEventPigeon.setProduct(this.product);
                eCommerceEventPigeon.setReferrer(this.referrer);
                eCommerceEventPigeon.setScreen(this.screen);
                return eCommerceEventPigeon;
            }

            @NonNull
            public Builder setCartItem(ECommerceCartItemPigeon eCommerceCartItemPigeon) {
                this.cartItem = eCommerceCartItemPigeon;
                return this;
            }

            @NonNull
            public Builder setEventType(@NonNull String str) {
                this.eventType = str;
                return this;
            }

            @NonNull
            public Builder setOrder(ECommerceOrderPigeon eCommerceOrderPigeon) {
                this.order = eCommerceOrderPigeon;
                return this;
            }

            @NonNull
            public Builder setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            @NonNull
            public Builder setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            @NonNull
            public Builder setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }
        }

        @NonNull
        public static ECommerceEventPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceEventPigeon eCommerceEventPigeon = new ECommerceEventPigeon();
            eCommerceEventPigeon.setEventType((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            eCommerceEventPigeon.setCartItem(obj == null ? null : ECommerceCartItemPigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(2);
            eCommerceEventPigeon.setOrder(obj2 == null ? null : ECommerceOrderPigeon.fromList((ArrayList) obj2));
            Object obj3 = arrayList.get(3);
            eCommerceEventPigeon.setProduct(obj3 == null ? null : ECommerceProductPigeon.fromList((ArrayList) obj3));
            Object obj4 = arrayList.get(4);
            eCommerceEventPigeon.setReferrer(obj4 == null ? null : ECommerceReferrerPigeon.fromList((ArrayList) obj4));
            Object obj5 = arrayList.get(5);
            eCommerceEventPigeon.setScreen(obj5 != null ? ECommerceScreenPigeon.fromList((ArrayList) obj5) : null);
            return eCommerceEventPigeon;
        }

        public ECommerceCartItemPigeon getCartItem() {
            return this.cartItem;
        }

        @NonNull
        public String getEventType() {
            return this.eventType;
        }

        public ECommerceOrderPigeon getOrder() {
            return this.order;
        }

        public ECommerceProductPigeon getProduct() {
            return this.product;
        }

        public ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        public ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public void setCartItem(ECommerceCartItemPigeon eCommerceCartItemPigeon) {
            this.cartItem = eCommerceCartItemPigeon;
        }

        public void setEventType(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"eventType\" is null.");
            }
            this.eventType = str;
        }

        public void setOrder(ECommerceOrderPigeon eCommerceOrderPigeon) {
            this.order = eCommerceOrderPigeon;
        }

        public void setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
            this.product = eCommerceProductPigeon;
        }

        public void setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.eventType);
            ECommerceCartItemPigeon eCommerceCartItemPigeon = this.cartItem;
            arrayList.add(eCommerceCartItemPigeon == null ? null : eCommerceCartItemPigeon.toList());
            ECommerceOrderPigeon eCommerceOrderPigeon = this.order;
            arrayList.add(eCommerceOrderPigeon == null ? null : eCommerceOrderPigeon.toList());
            ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon == null ? null : eCommerceReferrerPigeon.toList());
            ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon != null ? eCommerceScreenPigeon.toList() : null);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceOrderPigeon {

        @NonNull
        private String identifier;

        @NonNull
        private List<ECommerceCartItemPigeon> items;
        private Map<String, String> payload;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String identifier;
            private List<ECommerceCartItemPigeon> items;
            private Map<String, String> payload;

            @NonNull
            public ECommerceOrderPigeon build() {
                ECommerceOrderPigeon eCommerceOrderPigeon = new ECommerceOrderPigeon();
                eCommerceOrderPigeon.setIdentifier(this.identifier);
                eCommerceOrderPigeon.setItems(this.items);
                eCommerceOrderPigeon.setPayload(this.payload);
                return eCommerceOrderPigeon;
            }

            @NonNull
            public Builder setIdentifier(@NonNull String str) {
                this.identifier = str;
                return this;
            }

            @NonNull
            public Builder setItems(@NonNull List<ECommerceCartItemPigeon> list) {
                this.items = list;
                return this;
            }

            @NonNull
            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }
        }

        @NonNull
        public static ECommerceOrderPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceOrderPigeon eCommerceOrderPigeon = new ECommerceOrderPigeon();
            eCommerceOrderPigeon.setIdentifier((String) arrayList.get(0));
            eCommerceOrderPigeon.setItems((List) arrayList.get(1));
            eCommerceOrderPigeon.setPayload((Map) arrayList.get(2));
            return eCommerceOrderPigeon;
        }

        @NonNull
        public String getIdentifier() {
            return this.identifier;
        }

        @NonNull
        public List<ECommerceCartItemPigeon> getItems() {
            return this.items;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public void setIdentifier(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"identifier\" is null.");
            }
            this.identifier = str;
        }

        public void setItems(@NonNull List<ECommerceCartItemPigeon> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"items\" is null.");
            }
            this.items = list;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.identifier);
            arrayList.add(this.items);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommercePricePigeon {

        @NonNull
        private ECommerceAmountPigeon fiat;
        private List<ECommerceAmountPigeon> internalComponents;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private ECommerceAmountPigeon fiat;
            private List<ECommerceAmountPigeon> internalComponents;

            @NonNull
            public ECommercePricePigeon build() {
                ECommercePricePigeon eCommercePricePigeon = new ECommercePricePigeon();
                eCommercePricePigeon.setFiat(this.fiat);
                eCommercePricePigeon.setInternalComponents(this.internalComponents);
                return eCommercePricePigeon;
            }

            @NonNull
            public Builder setFiat(@NonNull ECommerceAmountPigeon eCommerceAmountPigeon) {
                this.fiat = eCommerceAmountPigeon;
                return this;
            }

            @NonNull
            public Builder setInternalComponents(List<ECommerceAmountPigeon> list) {
                this.internalComponents = list;
                return this;
            }
        }

        @NonNull
        public static ECommercePricePigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommercePricePigeon eCommercePricePigeon = new ECommercePricePigeon();
            Object obj = arrayList.get(0);
            eCommercePricePigeon.setFiat(obj == null ? null : ECommerceAmountPigeon.fromList((ArrayList) obj));
            eCommercePricePigeon.setInternalComponents((List) arrayList.get(1));
            return eCommercePricePigeon;
        }

        @NonNull
        public ECommerceAmountPigeon getFiat() {
            return this.fiat;
        }

        public List<ECommerceAmountPigeon> getInternalComponents() {
            return this.internalComponents;
        }

        public void setFiat(@NonNull ECommerceAmountPigeon eCommerceAmountPigeon) {
            if (eCommerceAmountPigeon == null) {
                throw new IllegalStateException("Nonnull field \"fiat\" is null.");
            }
            this.fiat = eCommerceAmountPigeon;
        }

        public void setInternalComponents(List<ECommerceAmountPigeon> list) {
            this.internalComponents = list;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            ECommerceAmountPigeon eCommerceAmountPigeon = this.fiat;
            arrayList.add(eCommerceAmountPigeon == null ? null : eCommerceAmountPigeon.toList());
            arrayList.add(this.internalComponents);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceProductPigeon {
        private ECommercePricePigeon actualPrice;
        private List<String> categoriesPath;
        private String name;
        private ECommercePricePigeon originalPrice;
        private Map<String, String> payload;
        private List<String> promocodes;

        @NonNull
        private String sku;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private ECommercePricePigeon actualPrice;
            private List<String> categoriesPath;
            private String name;
            private ECommercePricePigeon originalPrice;
            private Map<String, String> payload;
            private List<String> promocodes;
            private String sku;

            @NonNull
            public ECommerceProductPigeon build() {
                ECommerceProductPigeon eCommerceProductPigeon = new ECommerceProductPigeon();
                eCommerceProductPigeon.setSku(this.sku);
                eCommerceProductPigeon.setName(this.name);
                eCommerceProductPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceProductPigeon.setPayload(this.payload);
                eCommerceProductPigeon.setActualPrice(this.actualPrice);
                eCommerceProductPigeon.setOriginalPrice(this.originalPrice);
                eCommerceProductPigeon.setPromocodes(this.promocodes);
                return eCommerceProductPigeon;
            }

            @NonNull
            public Builder setActualPrice(ECommercePricePigeon eCommercePricePigeon) {
                this.actualPrice = eCommercePricePigeon;
                return this;
            }

            @NonNull
            public Builder setCategoriesPath(List<String> list) {
                this.categoriesPath = list;
                return this;
            }

            @NonNull
            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            @NonNull
            public Builder setOriginalPrice(ECommercePricePigeon eCommercePricePigeon) {
                this.originalPrice = eCommercePricePigeon;
                return this;
            }

            @NonNull
            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            @NonNull
            public Builder setPromocodes(List<String> list) {
                this.promocodes = list;
                return this;
            }

            @NonNull
            public Builder setSku(@NonNull String str) {
                this.sku = str;
                return this;
            }
        }

        @NonNull
        public static ECommerceProductPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceProductPigeon eCommerceProductPigeon = new ECommerceProductPigeon();
            eCommerceProductPigeon.setSku((String) arrayList.get(0));
            eCommerceProductPigeon.setName((String) arrayList.get(1));
            eCommerceProductPigeon.setCategoriesPath((List) arrayList.get(2));
            eCommerceProductPigeon.setPayload((Map) arrayList.get(3));
            Object obj = arrayList.get(4);
            eCommerceProductPigeon.setActualPrice(obj == null ? null : ECommercePricePigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(5);
            eCommerceProductPigeon.setOriginalPrice(obj2 != null ? ECommercePricePigeon.fromList((ArrayList) obj2) : null);
            eCommerceProductPigeon.setPromocodes((List) arrayList.get(6));
            return eCommerceProductPigeon;
        }

        public ECommercePricePigeon getActualPrice() {
            return this.actualPrice;
        }

        public List<String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public String getName() {
            return this.name;
        }

        public ECommercePricePigeon getOriginalPrice() {
            return this.originalPrice;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public List<String> getPromocodes() {
            return this.promocodes;
        }

        @NonNull
        public String getSku() {
            return this.sku;
        }

        public void setActualPrice(ECommercePricePigeon eCommercePricePigeon) {
            this.actualPrice = eCommercePricePigeon;
        }

        public void setCategoriesPath(List<String> list) {
            this.categoriesPath = list;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setOriginalPrice(ECommercePricePigeon eCommercePricePigeon) {
            this.originalPrice = eCommercePricePigeon;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setPromocodes(List<String> list) {
            this.promocodes = list;
        }

        public void setSku(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"sku\" is null.");
            }
            this.sku = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.sku);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.payload);
            ECommercePricePigeon eCommercePricePigeon = this.actualPrice;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            ECommercePricePigeon eCommercePricePigeon2 = this.originalPrice;
            arrayList.add(eCommercePricePigeon2 != null ? eCommercePricePigeon2.toList() : null);
            arrayList.add(this.promocodes);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceReferrerPigeon {
        private String identifier;
        private ECommerceScreenPigeon screen;
        private String type;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String identifier;
            private ECommerceScreenPigeon screen;
            private String type;

            @NonNull
            public ECommerceReferrerPigeon build() {
                ECommerceReferrerPigeon eCommerceReferrerPigeon = new ECommerceReferrerPigeon();
                eCommerceReferrerPigeon.setType(this.type);
                eCommerceReferrerPigeon.setIdentifier(this.identifier);
                eCommerceReferrerPigeon.setScreen(this.screen);
                return eCommerceReferrerPigeon;
            }

            @NonNull
            public Builder setIdentifier(String str) {
                this.identifier = str;
                return this;
            }

            @NonNull
            public Builder setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }

            @NonNull
            public Builder setType(String str) {
                this.type = str;
                return this;
            }
        }

        @NonNull
        public static ECommerceReferrerPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceReferrerPigeon eCommerceReferrerPigeon = new ECommerceReferrerPigeon();
            eCommerceReferrerPigeon.setType((String) arrayList.get(0));
            eCommerceReferrerPigeon.setIdentifier((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            eCommerceReferrerPigeon.setScreen(obj == null ? null : ECommerceScreenPigeon.fromList((ArrayList) obj));
            return eCommerceReferrerPigeon;
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public String getType() {
            return this.type;
        }

        public void setIdentifier(String str) {
            this.identifier = str;
        }

        public void setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        public void setType(String str) {
            this.type = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.identifier);
            ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon == null ? null : eCommerceScreenPigeon.toList());
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ECommerceScreenPigeon {
        private List<String> categoriesPath;
        private String name;
        private Map<String, String> payload;
        private String searchQuery;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private List<String> categoriesPath;
            private String name;
            private Map<String, String> payload;
            private String searchQuery;

            @NonNull
            public ECommerceScreenPigeon build() {
                ECommerceScreenPigeon eCommerceScreenPigeon = new ECommerceScreenPigeon();
                eCommerceScreenPigeon.setName(this.name);
                eCommerceScreenPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceScreenPigeon.setSearchQuery(this.searchQuery);
                eCommerceScreenPigeon.setPayload(this.payload);
                return eCommerceScreenPigeon;
            }

            @NonNull
            public Builder setCategoriesPath(List<String> list) {
                this.categoriesPath = list;
                return this;
            }

            @NonNull
            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            @NonNull
            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            @NonNull
            public Builder setSearchQuery(String str) {
                this.searchQuery = str;
                return this;
            }
        }

        @NonNull
        public static ECommerceScreenPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ECommerceScreenPigeon eCommerceScreenPigeon = new ECommerceScreenPigeon();
            eCommerceScreenPigeon.setName((String) arrayList.get(0));
            eCommerceScreenPigeon.setCategoriesPath((List) arrayList.get(1));
            eCommerceScreenPigeon.setSearchQuery((String) arrayList.get(2));
            eCommerceScreenPigeon.setPayload((Map) arrayList.get(3));
            return eCommerceScreenPigeon;
        }

        public List<String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public String getName() {
            return this.name;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public String getSearchQuery() {
            return this.searchQuery;
        }

        public void setCategoriesPath(List<String> list) {
            this.categoriesPath = list;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setSearchQuery(String str) {
            this.searchQuery = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.searchQuery);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ErrorDetailsPigeon {
        private List<StackTraceElementPigeon> backtrace;

        @NonNull
        private String dartVersion;

        @NonNull
        private String exceptionClass;
        private String message;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private List<StackTraceElementPigeon> backtrace;
            private String dartVersion;
            private String exceptionClass;
            private String message;

            @NonNull
            public ErrorDetailsPigeon build() {
                ErrorDetailsPigeon errorDetailsPigeon = new ErrorDetailsPigeon();
                errorDetailsPigeon.setExceptionClass(this.exceptionClass);
                errorDetailsPigeon.setMessage(this.message);
                errorDetailsPigeon.setDartVersion(this.dartVersion);
                errorDetailsPigeon.setBacktrace(this.backtrace);
                return errorDetailsPigeon;
            }

            @NonNull
            public Builder setBacktrace(List<StackTraceElementPigeon> list) {
                this.backtrace = list;
                return this;
            }

            @NonNull
            public Builder setDartVersion(@NonNull String str) {
                this.dartVersion = str;
                return this;
            }

            @NonNull
            public Builder setExceptionClass(@NonNull String str) {
                this.exceptionClass = str;
                return this;
            }

            @NonNull
            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }
        }

        @NonNull
        public static ErrorDetailsPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ErrorDetailsPigeon errorDetailsPigeon = new ErrorDetailsPigeon();
            errorDetailsPigeon.setExceptionClass((String) arrayList.get(0));
            errorDetailsPigeon.setMessage((String) arrayList.get(1));
            errorDetailsPigeon.setDartVersion((String) arrayList.get(2));
            errorDetailsPigeon.setBacktrace((List) arrayList.get(3));
            return errorDetailsPigeon;
        }

        public List<StackTraceElementPigeon> getBacktrace() {
            return this.backtrace;
        }

        @NonNull
        public String getDartVersion() {
            return this.dartVersion;
        }

        @NonNull
        public String getExceptionClass() {
            return this.exceptionClass;
        }

        public String getMessage() {
            return this.message;
        }

        public void setBacktrace(List<StackTraceElementPigeon> list) {
            this.backtrace = list;
        }

        public void setDartVersion(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"dartVersion\" is null.");
            }
            this.dartVersion = str;
        }

        public void setExceptionClass(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"exceptionClass\" is null.");
            }
            this.exceptionClass = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.exceptionClass);
            arrayList.add(this.message);
            arrayList.add(this.dartVersion);
            arrayList.add(this.backtrace);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ExternalAttributionPigeon {

        @NonNull
        private Map<String, Object> data;

        @NonNull
        private String source;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private Map<String, Object> data;
            private String source;

            @NonNull
            public ExternalAttributionPigeon build() {
                ExternalAttributionPigeon externalAttributionPigeon = new ExternalAttributionPigeon();
                externalAttributionPigeon.setSource(this.source);
                externalAttributionPigeon.setData(this.data);
                return externalAttributionPigeon;
            }

            @NonNull
            public Builder setData(@NonNull Map<String, Object> map) {
                this.data = map;
                return this;
            }

            @NonNull
            public Builder setSource(@NonNull String str) {
                this.source = str;
                return this;
            }
        }

        @NonNull
        public static ExternalAttributionPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ExternalAttributionPigeon externalAttributionPigeon = new ExternalAttributionPigeon();
            externalAttributionPigeon.setSource((String) arrayList.get(0));
            externalAttributionPigeon.setData((Map) arrayList.get(1));
            return externalAttributionPigeon;
        }

        @NonNull
        public Map<String, Object> getData() {
            return this.data;
        }

        @NonNull
        public String getSource() {
            return this.source;
        }

        public void setData(@NonNull Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = map;
        }

        public void setSource(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.source = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.source);
            arrayList.add(this.data);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum GenderPigeon {
        MALE(0),
        FEMALE(1),
        OTHER(2),
        UNDEFINED(3);

        final int index;

        GenderPigeon(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface InitialDeepLinkHolderPigeon {
        @NonNull
        static m getCodec() {
            return new w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, initialDeepLinkHolderPigeon.getInitialDeeplink());
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        static void setup(@NonNull f fVar, InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon) {
            g gVar = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.InitialDeepLinkHolderPigeon.getInitialDeeplink", getCodec(), (Object) null);
            if (initialDeepLinkHolderPigeon != null) {
                gVar.L(new e(6, initialDeepLinkHolderPigeon));
            } else {
                gVar.L(null);
            }
        }

        String getInitialDeeplink();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class LocationPigeon {
        private Double accuracy;
        private Double altitude;
        private Double course;

        @NonNull
        private Double latitude;

        @NonNull
        private Double longitude;
        private String provider;
        private Double speed;
        private Long timestamp;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private Double accuracy;
            private Double altitude;
            private Double course;
            private Double latitude;
            private Double longitude;
            private String provider;
            private Double speed;
            private Long timestamp;

            @NonNull
            public LocationPigeon build() {
                LocationPigeon locationPigeon = new LocationPigeon();
                locationPigeon.setLatitude(this.latitude);
                locationPigeon.setLongitude(this.longitude);
                locationPigeon.setProvider(this.provider);
                locationPigeon.setAltitude(this.altitude);
                locationPigeon.setAccuracy(this.accuracy);
                locationPigeon.setCourse(this.course);
                locationPigeon.setSpeed(this.speed);
                locationPigeon.setTimestamp(this.timestamp);
                return locationPigeon;
            }

            @NonNull
            public Builder setAccuracy(Double d10) {
                this.accuracy = d10;
                return this;
            }

            @NonNull
            public Builder setAltitude(Double d10) {
                this.altitude = d10;
                return this;
            }

            @NonNull
            public Builder setCourse(Double d10) {
                this.course = d10;
                return this;
            }

            @NonNull
            public Builder setLatitude(@NonNull Double d10) {
                this.latitude = d10;
                return this;
            }

            @NonNull
            public Builder setLongitude(@NonNull Double d10) {
                this.longitude = d10;
                return this;
            }

            @NonNull
            public Builder setProvider(String str) {
                this.provider = str;
                return this;
            }

            @NonNull
            public Builder setSpeed(Double d10) {
                this.speed = d10;
                return this;
            }

            @NonNull
            public Builder setTimestamp(Long l10) {
                this.timestamp = l10;
                return this;
            }
        }

        @NonNull
        public static LocationPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            LocationPigeon locationPigeon = new LocationPigeon();
            locationPigeon.setLatitude((Double) arrayList.get(0));
            locationPigeon.setLongitude((Double) arrayList.get(1));
            locationPigeon.setProvider((String) arrayList.get(2));
            locationPigeon.setAltitude((Double) arrayList.get(3));
            locationPigeon.setAccuracy((Double) arrayList.get(4));
            locationPigeon.setCourse((Double) arrayList.get(5));
            locationPigeon.setSpeed((Double) arrayList.get(6));
            Object obj = arrayList.get(7);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            locationPigeon.setTimestamp(lValueOf);
            return locationPigeon;
        }

        public Double getAccuracy() {
            return this.accuracy;
        }

        public Double getAltitude() {
            return this.altitude;
        }

        public Double getCourse() {
            return this.course;
        }

        @NonNull
        public Double getLatitude() {
            return this.latitude;
        }

        @NonNull
        public Double getLongitude() {
            return this.longitude;
        }

        public String getProvider() {
            return this.provider;
        }

        public Double getSpeed() {
            return this.speed;
        }

        public Long getTimestamp() {
            return this.timestamp;
        }

        public void setAccuracy(Double d10) {
            this.accuracy = d10;
        }

        public void setAltitude(Double d10) {
            this.altitude = d10;
        }

        public void setCourse(Double d10) {
            this.course = d10;
        }

        public void setLatitude(@NonNull Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"latitude\" is null.");
            }
            this.latitude = d10;
        }

        public void setLongitude(@NonNull Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"longitude\" is null.");
            }
            this.longitude = d10;
        }

        public void setProvider(String str) {
            this.provider = str;
        }

        public void setSpeed(Double d10) {
            this.speed = d10;
        }

        public void setTimestamp(Long l10) {
            this.timestamp = l10;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(8);
            arrayList.add(this.latitude);
            arrayList.add(this.longitude);
            arrayList.add(this.provider);
            arrayList.add(this.altitude);
            arrayList.add(this.accuracy);
            arrayList.add(this.course);
            arrayList.add(this.speed);
            arrayList.add(this.timestamp);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class PreloadInfoPigeon {
        private Map<String, String> additionalInfo;

        @NonNull
        private String trackingId;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private Map<String, String> additionalInfo;
            private String trackingId;

            @NonNull
            public PreloadInfoPigeon build() {
                PreloadInfoPigeon preloadInfoPigeon = new PreloadInfoPigeon();
                preloadInfoPigeon.setTrackingId(this.trackingId);
                preloadInfoPigeon.setAdditionalInfo(this.additionalInfo);
                return preloadInfoPigeon;
            }

            @NonNull
            public Builder setAdditionalInfo(Map<String, String> map) {
                this.additionalInfo = map;
                return this;
            }

            @NonNull
            public Builder setTrackingId(@NonNull String str) {
                this.trackingId = str;
                return this;
            }
        }

        @NonNull
        public static PreloadInfoPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            PreloadInfoPigeon preloadInfoPigeon = new PreloadInfoPigeon();
            preloadInfoPigeon.setTrackingId((String) arrayList.get(0));
            preloadInfoPigeon.setAdditionalInfo((Map) arrayList.get(1));
            return preloadInfoPigeon;
        }

        public Map<String, String> getAdditionalInfo() {
            return this.additionalInfo;
        }

        @NonNull
        public String getTrackingId() {
            return this.trackingId;
        }

        public void setAdditionalInfo(Map<String, String> map) {
            this.additionalInfo = map;
        }

        public void setTrackingId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"trackingId\" is null.");
            }
            this.trackingId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.trackingId);
            arrayList.add(this.additionalInfo);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ReceiptPigeon {
        private String data;
        private String signature;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String data;
            private String signature;

            @NonNull
            public ReceiptPigeon build() {
                ReceiptPigeon receiptPigeon = new ReceiptPigeon();
                receiptPigeon.setData(this.data);
                receiptPigeon.setSignature(this.signature);
                return receiptPigeon;
            }

            @NonNull
            public Builder setData(String str) {
                this.data = str;
                return this;
            }

            @NonNull
            public Builder setSignature(String str) {
                this.signature = str;
                return this;
            }
        }

        @NonNull
        public static ReceiptPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            ReceiptPigeon receiptPigeon = new ReceiptPigeon();
            receiptPigeon.setData((String) arrayList.get(0));
            receiptPigeon.setSignature((String) arrayList.get(1));
            return receiptPigeon;
        }

        public String getData() {
            return this.data;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setSignature(String str) {
            this.signature = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.data);
            arrayList.add(this.signature);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ReporterConfigPigeon {

        @NonNull
        private String apiKey;
        private Map<String, String> appEnvironment;
        private Boolean dataSendingEnabled;
        private Long dispatchPeriodSeconds;
        private Boolean logs;
        private Long maxReportsCount;
        private Long maxReportsInDatabaseCount;
        private Long sessionTimeout;
        private String userProfileID;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String apiKey;
            private Map<String, String> appEnvironment;
            private Boolean dataSendingEnabled;
            private Long dispatchPeriodSeconds;
            private Boolean logs;
            private Long maxReportsCount;
            private Long maxReportsInDatabaseCount;
            private Long sessionTimeout;
            private String userProfileID;

            @NonNull
            public ReporterConfigPigeon build() {
                ReporterConfigPigeon reporterConfigPigeon = new ReporterConfigPigeon();
                reporterConfigPigeon.setApiKey(this.apiKey);
                reporterConfigPigeon.setAppEnvironment(this.appEnvironment);
                reporterConfigPigeon.setDataSendingEnabled(this.dataSendingEnabled);
                reporterConfigPigeon.setDispatchPeriodSeconds(this.dispatchPeriodSeconds);
                reporterConfigPigeon.setLogs(this.logs);
                reporterConfigPigeon.setMaxReportsCount(this.maxReportsCount);
                reporterConfigPigeon.setMaxReportsInDatabaseCount(this.maxReportsInDatabaseCount);
                reporterConfigPigeon.setSessionTimeout(this.sessionTimeout);
                reporterConfigPigeon.setUserProfileID(this.userProfileID);
                return reporterConfigPigeon;
            }

            @NonNull
            public Builder setApiKey(@NonNull String str) {
                this.apiKey = str;
                return this;
            }

            @NonNull
            public Builder setAppEnvironment(Map<String, String> map) {
                this.appEnvironment = map;
                return this;
            }

            @NonNull
            public Builder setDataSendingEnabled(Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setDispatchPeriodSeconds(Long l10) {
                this.dispatchPeriodSeconds = l10;
                return this;
            }

            @NonNull
            public Builder setLogs(Boolean bool) {
                this.logs = bool;
                return this;
            }

            @NonNull
            public Builder setMaxReportsCount(Long l10) {
                this.maxReportsCount = l10;
                return this;
            }

            @NonNull
            public Builder setMaxReportsInDatabaseCount(Long l10) {
                this.maxReportsInDatabaseCount = l10;
                return this;
            }

            @NonNull
            public Builder setSessionTimeout(Long l10) {
                this.sessionTimeout = l10;
                return this;
            }

            @NonNull
            public Builder setUserProfileID(String str) {
                this.userProfileID = str;
                return this;
            }
        }

        @NonNull
        public static ReporterConfigPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            ReporterConfigPigeon reporterConfigPigeon = new ReporterConfigPigeon();
            reporterConfigPigeon.setApiKey((String) arrayList.get(0));
            reporterConfigPigeon.setAppEnvironment((Map) arrayList.get(1));
            reporterConfigPigeon.setDataSendingEnabled((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            Long lValueOf4 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            reporterConfigPigeon.setDispatchPeriodSeconds(lValueOf);
            reporterConfigPigeon.setLogs((Boolean) arrayList.get(4));
            Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            reporterConfigPigeon.setMaxReportsCount(lValueOf2);
            Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            reporterConfigPigeon.setMaxReportsInDatabaseCount(lValueOf3);
            Object obj4 = arrayList.get(7);
            if (obj4 != null) {
                lValueOf4 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            reporterConfigPigeon.setSessionTimeout(lValueOf4);
            reporterConfigPigeon.setUserProfileID((String) arrayList.get(8));
            return reporterConfigPigeon;
        }

        @NonNull
        public String getApiKey() {
            return this.apiKey;
        }

        public Map<String, String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public Boolean getLogs() {
            return this.logs;
        }

        public Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public String getUserProfileID() {
            return this.userProfileID;
        }

        public void setApiKey(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppEnvironment(Map<String, String> map) {
            this.appEnvironment = map;
        }

        public void setDataSendingEnabled(Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDispatchPeriodSeconds(Long l10) {
            this.dispatchPeriodSeconds = l10;
        }

        public void setLogs(Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(Long l10) {
            this.maxReportsCount = l10;
        }

        public void setMaxReportsInDatabaseCount(Long l10) {
            this.maxReportsInDatabaseCount = l10;
        }

        public void setSessionTimeout(Long l10) {
            this.sessionTimeout = l10;
        }

        public void setUserProfileID(String str) {
            this.userProfileID = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(9);
            arrayList.add(this.apiKey);
            arrayList.add(this.appEnvironment);
            arrayList.add(this.dataSendingEnabled);
            arrayList.add(this.dispatchPeriodSeconds);
            arrayList.add(this.logs);
            arrayList.add(this.maxReportsCount);
            arrayList.add(this.maxReportsInDatabaseCount);
            arrayList.add(this.sessionTimeout);
            arrayList.add(this.userProfileID);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface ReporterPigeon {
        @NonNull
        static m getCodec() {
            return ReporterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.clearAppEnvironment((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.pauseSession((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportUnhandledException((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportUserProfile((String) arrayList2.get(0), (UserProfilePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.resumeSession((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.sendEventsBuffer((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.setDataSendingEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.setUserProfileID((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.putAppEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportAdRevenue((String) arrayList2.get(0), (AdRevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportECommerce((String) arrayList2.get(0), (ECommerceEventPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportError((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportErrorWithGroup((String) arrayList2.get(0), (String) arrayList2.get(1), (ErrorDetailsPigeon) arrayList2.get(2), (String) arrayList2.get(3));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportEvent((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportEventWithJson((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(ReporterPigeon reporterPigeon, Object obj, ii.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportRevenue((String) arrayList2.get(0), (RevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th2) {
                arrayList = Pigeon.wrapError(th2);
            }
            cVar.i(arrayList);
        }

        static void setup(@NonNull f fVar, final ReporterPigeon reporterPigeon) {
            Object obj = null;
            g gVar = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.clearAppEnvironment", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i = 0;
                gVar.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar.L(null);
            }
            g gVar2 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.pauseSession", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i10 = 13;
                gVar2.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i10) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar2.L(null);
            }
            g gVar3 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.putAppEnvironmentValue", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i11 = 14;
                gVar3.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i11) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar3.L(null);
            }
            g gVar4 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportAdRevenue", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i12 = 15;
                gVar4.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i12) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar4.L(null);
            }
            g gVar5 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportECommerce", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i13 = 1;
                gVar5.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i13) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar5.L(null);
            }
            g gVar6 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportError", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i14 = 2;
                gVar6.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i14) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar6.L(null);
            }
            g gVar7 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportErrorWithGroup", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i15 = 3;
                gVar7.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i15) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar7.L(null);
            }
            g gVar8 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEvent", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i16 = 4;
                gVar8.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i16) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar8.L(null);
            }
            g gVar9 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEventWithJson", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i17 = 5;
                gVar9.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i17) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar9.L(null);
            }
            g gVar10 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportRevenue", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i18 = 6;
                gVar10.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i18) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar10.L(null);
            }
            g gVar11 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUnhandledException", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i19 = 7;
                gVar11.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i19) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar11.L(null);
            }
            g gVar12 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUserProfile", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i20 = 8;
                gVar12.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i20) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar12.L(null);
            }
            g gVar13 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.resumeSession", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i21 = 9;
                gVar13.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i21) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar13.L(null);
            }
            g gVar14 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.sendEventsBuffer", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i22 = 10;
                gVar14.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i22) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar14.L(null);
            }
            g gVar15 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setDataSendingEnabled", getCodec(), obj);
            if (reporterPigeon != null) {
                final int i23 = 11;
                gVar15.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i23) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            } else {
                gVar15.L(null);
            }
            g gVar16 = new g(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setUserProfileID", getCodec(), obj);
            if (reporterPigeon == null) {
                gVar16.L(null);
            } else {
                final int i24 = 12;
                gVar16.L(new ii.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f21898c;

                    {
                        this.f21898c = reporterPigeon;
                    }

                    @Override // ii.b
                    public final void q(Object obj2, h3.e eVar) {
                        switch (i24) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f21898c, obj2, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f21898c, obj2, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f21898c, obj2, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f21898c, obj2, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f21898c, obj2, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f21898c, obj2, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f21898c, obj2, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f21898c, obj2, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f21898c, obj2, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f21898c, obj2, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f21898c, obj2, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f21898c, obj2, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f21898c, obj2, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f21898c, obj2, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f21898c, obj2, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f21898c, obj2, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void clearAppEnvironment(@NonNull String str);

        void pauseSession(@NonNull String str);

        void putAppEnvironmentValue(@NonNull String str, @NonNull String str2, String str3);

        void reportAdRevenue(@NonNull String str, @NonNull AdRevenuePigeon adRevenuePigeon);

        void reportECommerce(@NonNull String str, @NonNull ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(@NonNull String str, @NonNull ErrorDetailsPigeon errorDetailsPigeon, String str2);

        void reportErrorWithGroup(@NonNull String str, @NonNull String str2, ErrorDetailsPigeon errorDetailsPigeon, String str3);

        void reportEvent(@NonNull String str, @NonNull String str2);

        void reportEventWithJson(@NonNull String str, @NonNull String str2, String str3);

        void reportRevenue(@NonNull String str, @NonNull RevenuePigeon revenuePigeon);

        void reportUnhandledException(@NonNull String str, @NonNull ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(@NonNull String str, @NonNull UserProfilePigeon userProfilePigeon);

        void resumeSession(@NonNull String str);

        void sendEventsBuffer(@NonNull String str);

        void setDataSendingEnabled(@NonNull String str, @NonNull Boolean bool);

        void setUserProfileID(@NonNull String str, String str2);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ReporterPigeonCodec extends w {
        public static final ReporterPigeonCodec INSTANCE = new ReporterPigeonCodec();

        private ReporterPigeonCodec() {
        }

        @Override // ii.w
        public Object readValueOfType(byte b2, @NonNull ByteBuffer byteBuffer) {
            switch (b2) {
                case -128:
                    return AdRevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return ECommerceCartItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return ECommerceEventPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return ECommerceOrderPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return ECommerceReferrerPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return ECommerceScreenPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return ReceiptPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return RevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return StackTraceElementPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return UserProfileAttributePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return UserProfilePigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // ii.w
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AdRevenuePigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof ECommerceAmountPigeon;
            if (z5) {
                byteArrayOutputStream.write(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceEventPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceOrderPigeon) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z10 = obj instanceof ECommercePricePigeon;
            if (z10) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            if (z10) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z11 = obj instanceof ECommerceProductPigeon;
            if (z11) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z11) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceScreenPigeon) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z12 = obj instanceof ErrorDetailsPigeon;
            if (z12) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z12) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReceiptPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof RevenuePigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof StackTraceElementPigeon) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((StackTraceElementPigeon) obj).toList());
            } else if (obj instanceof UserProfileAttributePigeon) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((UserProfilePigeon) obj).toList());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Result<T> {
        void error(@NonNull Throwable th2);

        void success(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class RevenuePigeon {

        @NonNull
        private String currency;
        private String payload;

        @NonNull
        private String price;
        private String productId;
        private Long quantity;
        private ReceiptPigeon receipt;
        private String transactionId;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String currency;
            private String payload;
            private String price;
            private String productId;
            private Long quantity;
            private ReceiptPigeon receipt;
            private String transactionId;

            @NonNull
            public RevenuePigeon build() {
                RevenuePigeon revenuePigeon = new RevenuePigeon();
                revenuePigeon.setPrice(this.price);
                revenuePigeon.setCurrency(this.currency);
                revenuePigeon.setQuantity(this.quantity);
                revenuePigeon.setProductId(this.productId);
                revenuePigeon.setPayload(this.payload);
                revenuePigeon.setReceipt(this.receipt);
                revenuePigeon.setTransactionId(this.transactionId);
                return revenuePigeon;
            }

            @NonNull
            public Builder setCurrency(@NonNull String str) {
                this.currency = str;
                return this;
            }

            @NonNull
            public Builder setPayload(String str) {
                this.payload = str;
                return this;
            }

            @NonNull
            public Builder setPrice(@NonNull String str) {
                this.price = str;
                return this;
            }

            @NonNull
            public Builder setProductId(String str) {
                this.productId = str;
                return this;
            }

            @NonNull
            public Builder setQuantity(Long l10) {
                this.quantity = l10;
                return this;
            }

            @NonNull
            public Builder setReceipt(ReceiptPigeon receiptPigeon) {
                this.receipt = receiptPigeon;
                return this;
            }

            @NonNull
            public Builder setTransactionId(String str) {
                this.transactionId = str;
                return this;
            }
        }

        @NonNull
        public static RevenuePigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            RevenuePigeon revenuePigeon = new RevenuePigeon();
            revenuePigeon.setPrice((String) arrayList.get(0));
            revenuePigeon.setCurrency((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            revenuePigeon.setQuantity(lValueOf);
            revenuePigeon.setProductId((String) arrayList.get(3));
            revenuePigeon.setPayload((String) arrayList.get(4));
            Object obj2 = arrayList.get(5);
            revenuePigeon.setReceipt(obj2 != null ? ReceiptPigeon.fromList((ArrayList) obj2) : null);
            revenuePigeon.setTransactionId((String) arrayList.get(6));
            return revenuePigeon;
        }

        @NonNull
        public String getCurrency() {
            return this.currency;
        }

        public String getPayload() {
            return this.payload;
        }

        @NonNull
        public String getPrice() {
            return this.price;
        }

        public String getProductId() {
            return this.productId;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public ReceiptPigeon getReceipt() {
            return this.receipt;
        }

        public String getTransactionId() {
            return this.transactionId;
        }

        public void setCurrency(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(String str) {
            this.payload = str;
        }

        public void setPrice(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"price\" is null.");
            }
            this.price = str;
        }

        public void setProductId(String str) {
            this.productId = str;
        }

        public void setQuantity(Long l10) {
            this.quantity = l10;
        }

        public void setReceipt(ReceiptPigeon receiptPigeon) {
            this.receipt = receiptPigeon;
        }

        public void setTransactionId(String str) {
            this.transactionId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.price);
            arrayList.add(this.currency);
            arrayList.add(this.quantity);
            arrayList.add(this.productId);
            arrayList.add(this.payload);
            ReceiptPigeon receiptPigeon = this.receipt;
            arrayList.add(receiptPigeon == null ? null : receiptPigeon.toList());
            arrayList.add(this.transactionId);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StackTraceElementPigeon {

        @NonNull
        private String className;

        @NonNull
        private Long column;
        private String fileName;

        @NonNull
        private Long line;

        @NonNull
        private String methodName;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String className;
            private Long column;
            private String fileName;
            private Long line;
            private String methodName;

            @NonNull
            public StackTraceElementPigeon build() {
                StackTraceElementPigeon stackTraceElementPigeon = new StackTraceElementPigeon();
                stackTraceElementPigeon.setClassName(this.className);
                stackTraceElementPigeon.setFileName(this.fileName);
                stackTraceElementPigeon.setLine(this.line);
                stackTraceElementPigeon.setColumn(this.column);
                stackTraceElementPigeon.setMethodName(this.methodName);
                return stackTraceElementPigeon;
            }

            @NonNull
            public Builder setClassName(@NonNull String str) {
                this.className = str;
                return this;
            }

            @NonNull
            public Builder setColumn(@NonNull Long l10) {
                this.column = l10;
                return this;
            }

            @NonNull
            public Builder setFileName(String str) {
                this.fileName = str;
                return this;
            }

            @NonNull
            public Builder setLine(@NonNull Long l10) {
                this.line = l10;
                return this;
            }

            @NonNull
            public Builder setMethodName(@NonNull String str) {
                this.methodName = str;
                return this;
            }
        }

        @NonNull
        public static StackTraceElementPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            StackTraceElementPigeon stackTraceElementPigeon = new StackTraceElementPigeon();
            stackTraceElementPigeon.setClassName((String) arrayList.get(0));
            stackTraceElementPigeon.setFileName((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long lValueOf2 = null;
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            stackTraceElementPigeon.setLine(lValueOf);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            stackTraceElementPigeon.setColumn(lValueOf2);
            stackTraceElementPigeon.setMethodName((String) arrayList.get(4));
            return stackTraceElementPigeon;
        }

        @NonNull
        public String getClassName() {
            return this.className;
        }

        @NonNull
        public Long getColumn() {
            return this.column;
        }

        public String getFileName() {
            return this.fileName;
        }

        @NonNull
        public Long getLine() {
            return this.line;
        }

        @NonNull
        public String getMethodName() {
            return this.methodName;
        }

        public void setClassName(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"className\" is null.");
            }
            this.className = str;
        }

        public void setColumn(@NonNull Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"column\" is null.");
            }
            this.column = l10;
        }

        public void setFileName(String str) {
            this.fileName = str;
        }

        public void setLine(@NonNull Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"line\" is null.");
            }
            this.line = l10;
        }

        public void setMethodName(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"methodName\" is null.");
            }
            this.methodName = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.className);
            arrayList.add(this.fileName);
            arrayList.add(this.line);
            arrayList.add(this.column);
            arrayList.add(this.methodName);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StartupParamsItemPigeon {
        private String errorDetails;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private String f21891id;

        @NonNull
        private StartupParamsItemStatusPigeon status;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String errorDetails;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private String f21892id;
            private StartupParamsItemStatusPigeon status;

            @NonNull
            public StartupParamsItemPigeon build() {
                StartupParamsItemPigeon startupParamsItemPigeon = new StartupParamsItemPigeon();
                startupParamsItemPigeon.setId(this.f21892id);
                startupParamsItemPigeon.setStatus(this.status);
                startupParamsItemPigeon.setErrorDetails(this.errorDetails);
                return startupParamsItemPigeon;
            }

            @NonNull
            public Builder setErrorDetails(String str) {
                this.errorDetails = str;
                return this;
            }

            @NonNull
            public Builder setId(String str) {
                this.f21892id = str;
                return this;
            }

            @NonNull
            public Builder setStatus(@NonNull StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
                this.status = startupParamsItemStatusPigeon;
                return this;
            }
        }

        @NonNull
        public static StartupParamsItemPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            StartupParamsItemPigeon startupParamsItemPigeon = new StartupParamsItemPigeon();
            startupParamsItemPigeon.setId((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            startupParamsItemPigeon.setStatus(obj == null ? null : StartupParamsItemStatusPigeon.values()[((Integer) obj).intValue()]);
            startupParamsItemPigeon.setErrorDetails((String) arrayList.get(2));
            return startupParamsItemPigeon;
        }

        public String getErrorDetails() {
            return this.errorDetails;
        }

        public String getId() {
            return this.f21891id;
        }

        @NonNull
        public StartupParamsItemStatusPigeon getStatus() {
            return this.status;
        }

        public void setErrorDetails(String str) {
            this.errorDetails = str;
        }

        public void setId(String str) {
            this.f21891id = str;
        }

        public void setStatus(@NonNull StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
            if (startupParamsItemStatusPigeon == null) {
                throw new IllegalStateException("Nonnull field \"status\" is null.");
            }
            this.status = startupParamsItemStatusPigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f21891id);
            StartupParamsItemStatusPigeon startupParamsItemStatusPigeon = this.status;
            arrayList.add(startupParamsItemStatusPigeon == null ? null : Integer.valueOf(startupParamsItemStatusPigeon.index));
            arrayList.add(this.errorDetails);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum StartupParamsItemStatusPigeon {
        FEATURE_DISABLED(0),
        INVALID_VALUE_FROM_PROVIDER(1),
        NETWORK_ERROR(2),
        OK(3),
        PROVIDER_UNAVAILABLE(4),
        UNKNOWN_ERROR(5);

        final int index;

        StartupParamsItemStatusPigeon(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StartupParamsPigeon {
        private StartupParamsReasonPigeon reason;
        private StartupParamsResultPigeon result;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private StartupParamsReasonPigeon reason;
            private StartupParamsResultPigeon result;

            @NonNull
            public StartupParamsPigeon build() {
                StartupParamsPigeon startupParamsPigeon = new StartupParamsPigeon();
                startupParamsPigeon.setResult(this.result);
                startupParamsPigeon.setReason(this.reason);
                return startupParamsPigeon;
            }

            @NonNull
            public Builder setReason(StartupParamsReasonPigeon startupParamsReasonPigeon) {
                this.reason = startupParamsReasonPigeon;
                return this;
            }

            @NonNull
            public Builder setResult(StartupParamsResultPigeon startupParamsResultPigeon) {
                this.result = startupParamsResultPigeon;
                return this;
            }
        }

        @NonNull
        public static StartupParamsPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            StartupParamsPigeon startupParamsPigeon = new StartupParamsPigeon();
            Object obj = arrayList.get(0);
            startupParamsPigeon.setResult(obj == null ? null : StartupParamsResultPigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(1);
            startupParamsPigeon.setReason(obj2 != null ? StartupParamsReasonPigeon.fromList((ArrayList) obj2) : null);
            return startupParamsPigeon;
        }

        public StartupParamsReasonPigeon getReason() {
            return this.reason;
        }

        public StartupParamsResultPigeon getResult() {
            return this.result;
        }

        public void setReason(StartupParamsReasonPigeon startupParamsReasonPigeon) {
            this.reason = startupParamsReasonPigeon;
        }

        public void setResult(StartupParamsResultPigeon startupParamsResultPigeon) {
            this.result = startupParamsResultPigeon;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            StartupParamsResultPigeon startupParamsResultPigeon = this.result;
            arrayList.add(startupParamsResultPigeon == null ? null : startupParamsResultPigeon.toList());
            StartupParamsReasonPigeon startupParamsReasonPigeon = this.reason;
            arrayList.add(startupParamsReasonPigeon != null ? startupParamsReasonPigeon.toList() : null);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StartupParamsReasonPigeon {

        @NonNull
        private String value;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String value;

            @NonNull
            public StartupParamsReasonPigeon build() {
                StartupParamsReasonPigeon startupParamsReasonPigeon = new StartupParamsReasonPigeon();
                startupParamsReasonPigeon.setValue(this.value);
                return startupParamsReasonPigeon;
            }

            @NonNull
            public Builder setValue(@NonNull String str) {
                this.value = str;
                return this;
            }
        }

        @NonNull
        public static StartupParamsReasonPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            StartupParamsReasonPigeon startupParamsReasonPigeon = new StartupParamsReasonPigeon();
            startupParamsReasonPigeon.setValue((String) arrayList.get(0));
            return startupParamsReasonPigeon;
        }

        @NonNull
        public String getValue() {
            return this.value;
        }

        public void setValue(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"value\" is null.");
            }
            this.value = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.value);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StartupParamsResultPigeon {
        private String deviceId;
        private String deviceIdHash;
        private Map<String, StartupParamsItemPigeon> parameters;
        private String uuid;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private String deviceId;
            private String deviceIdHash;
            private Map<String, StartupParamsItemPigeon> parameters;
            private String uuid;

            @NonNull
            public StartupParamsResultPigeon build() {
                StartupParamsResultPigeon startupParamsResultPigeon = new StartupParamsResultPigeon();
                startupParamsResultPigeon.setDeviceId(this.deviceId);
                startupParamsResultPigeon.setDeviceIdHash(this.deviceIdHash);
                startupParamsResultPigeon.setParameters(this.parameters);
                startupParamsResultPigeon.setUuid(this.uuid);
                return startupParamsResultPigeon;
            }

            @NonNull
            public Builder setDeviceId(String str) {
                this.deviceId = str;
                return this;
            }

            @NonNull
            public Builder setDeviceIdHash(String str) {
                this.deviceIdHash = str;
                return this;
            }

            @NonNull
            public Builder setParameters(Map<String, StartupParamsItemPigeon> map) {
                this.parameters = map;
                return this;
            }

            @NonNull
            public Builder setUuid(String str) {
                this.uuid = str;
                return this;
            }
        }

        @NonNull
        public static StartupParamsResultPigeon fromList(@NonNull ArrayList<Object> arrayList) {
            StartupParamsResultPigeon startupParamsResultPigeon = new StartupParamsResultPigeon();
            startupParamsResultPigeon.setDeviceId((String) arrayList.get(0));
            startupParamsResultPigeon.setDeviceIdHash((String) arrayList.get(1));
            startupParamsResultPigeon.setParameters((Map) arrayList.get(2));
            startupParamsResultPigeon.setUuid((String) arrayList.get(3));
            return startupParamsResultPigeon;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        public Map<String, StartupParamsItemPigeon> getParameters() {
            return this.parameters;
        }

        public String getUuid() {
            return this.uuid;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setDeviceIdHash(String str) {
            this.deviceIdHash = str;
        }

        public void setParameters(Map<String, StartupParamsItemPigeon> map) {
            this.parameters = map;
        }

        public void setUuid(String str) {
            this.uuid = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.deviceId);
            arrayList.add(this.deviceIdHash);
            arrayList.add(this.parameters);
            arrayList.add(this.uuid);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UserProfileAttributePigeon {
        private Long age;
        private Boolean boolValue;
        private Long day;
        private Double doubleValue;
        private GenderPigeon genderValue;
        private Boolean ifUndefined;

        @NonNull
        private String key;
        private Long month;
        private Boolean reset;
        private String stringValue;
        private UserProfileAttributeType type;
        private Long year;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private Long age;
            private Boolean boolValue;
            private Long day;
            private Double doubleValue;
            private GenderPigeon genderValue;
            private Boolean ifUndefined;
            private String key;
            private Long month;
            private Boolean reset;
            private String stringValue;
            private UserProfileAttributeType type;
            private Long year;

            @NonNull
            public UserProfileAttributePigeon build() {
                UserProfileAttributePigeon userProfileAttributePigeon = new UserProfileAttributePigeon();
                userProfileAttributePigeon.setKey(this.key);
                userProfileAttributePigeon.setDoubleValue(this.doubleValue);
                userProfileAttributePigeon.setStringValue(this.stringValue);
                userProfileAttributePigeon.setBoolValue(this.boolValue);
                userProfileAttributePigeon.setYear(this.year);
                userProfileAttributePigeon.setMonth(this.month);
                userProfileAttributePigeon.setDay(this.day);
                userProfileAttributePigeon.setAge(this.age);
                userProfileAttributePigeon.setGenderValue(this.genderValue);
                userProfileAttributePigeon.setIfUndefined(this.ifUndefined);
                userProfileAttributePigeon.setReset(this.reset);
                userProfileAttributePigeon.setType(this.type);
                return userProfileAttributePigeon;
            }

            @NonNull
            public Builder setAge(Long l10) {
                this.age = l10;
                return this;
            }

            @NonNull
            public Builder setBoolValue(Boolean bool) {
                this.boolValue = bool;
                return this;
            }

            @NonNull
            public Builder setDay(Long l10) {
                this.day = l10;
                return this;
            }

            @NonNull
            public Builder setDoubleValue(Double d10) {
                this.doubleValue = d10;
                return this;
            }

            @NonNull
            public Builder setGenderValue(GenderPigeon genderPigeon) {
                this.genderValue = genderPigeon;
                return this;
            }

            @NonNull
            public Builder setIfUndefined(Boolean bool) {
                this.ifUndefined = bool;
                return this;
            }

            @NonNull
            public Builder setKey(@NonNull String str) {
                this.key = str;
                return this;
            }

            @NonNull
            public Builder setMonth(Long l10) {
                this.month = l10;
                return this;
            }

            @NonNull
            public Builder setReset(Boolean bool) {
                this.reset = bool;
                return this;
            }

            @NonNull
            public Builder setStringValue(String str) {
                this.stringValue = str;
                return this;
            }

            @NonNull
            public Builder setType(UserProfileAttributeType userProfileAttributeType) {
                this.type = userProfileAttributeType;
                return this;
            }

            @NonNull
            public Builder setYear(Long l10) {
                this.year = l10;
                return this;
            }
        }

        @NonNull
        public static UserProfileAttributePigeon fromList(@NonNull ArrayList<Object> arrayList) {
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            UserProfileAttributePigeon userProfileAttributePigeon = new UserProfileAttributePigeon();
            userProfileAttributePigeon.setKey((String) arrayList.get(0));
            userProfileAttributePigeon.setDoubleValue((Double) arrayList.get(1));
            userProfileAttributePigeon.setStringValue((String) arrayList.get(2));
            userProfileAttributePigeon.setBoolValue((Boolean) arrayList.get(3));
            Object obj = arrayList.get(4);
            if (obj == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            userProfileAttributePigeon.setYear(lValueOf);
            Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            userProfileAttributePigeon.setMonth(lValueOf2);
            Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            userProfileAttributePigeon.setDay(lValueOf3);
            Object obj4 = arrayList.get(7);
            if (obj4 == null) {
                lValueOf4 = null;
            } else {
                lValueOf4 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            userProfileAttributePigeon.setAge(lValueOf4);
            Object obj5 = arrayList.get(8);
            userProfileAttributePigeon.setGenderValue(obj5 == null ? null : GenderPigeon.values()[((Integer) obj5).intValue()]);
            userProfileAttributePigeon.setIfUndefined((Boolean) arrayList.get(9));
            userProfileAttributePigeon.setReset((Boolean) arrayList.get(10));
            Object obj6 = arrayList.get(11);
            userProfileAttributePigeon.setType(obj6 != null ? UserProfileAttributeType.values()[((Integer) obj6).intValue()] : null);
            return userProfileAttributePigeon;
        }

        public Long getAge() {
            return this.age;
        }

        public Boolean getBoolValue() {
            return this.boolValue;
        }

        public Long getDay() {
            return this.day;
        }

        public Double getDoubleValue() {
            return this.doubleValue;
        }

        public GenderPigeon getGenderValue() {
            return this.genderValue;
        }

        public Boolean getIfUndefined() {
            return this.ifUndefined;
        }

        @NonNull
        public String getKey() {
            return this.key;
        }

        public Long getMonth() {
            return this.month;
        }

        public Boolean getReset() {
            return this.reset;
        }

        public String getStringValue() {
            return this.stringValue;
        }

        public UserProfileAttributeType getType() {
            return this.type;
        }

        public Long getYear() {
            return this.year;
        }

        public void setAge(Long l10) {
            this.age = l10;
        }

        public void setBoolValue(Boolean bool) {
            this.boolValue = bool;
        }

        public void setDay(Long l10) {
            this.day = l10;
        }

        public void setDoubleValue(Double d10) {
            this.doubleValue = d10;
        }

        public void setGenderValue(GenderPigeon genderPigeon) {
            this.genderValue = genderPigeon;
        }

        public void setIfUndefined(Boolean bool) {
            this.ifUndefined = bool;
        }

        public void setKey(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"key\" is null.");
            }
            this.key = str;
        }

        public void setMonth(Long l10) {
            this.month = l10;
        }

        public void setReset(Boolean bool) {
            this.reset = bool;
        }

        public void setStringValue(String str) {
            this.stringValue = str;
        }

        public void setType(UserProfileAttributeType userProfileAttributeType) {
            this.type = userProfileAttributeType;
        }

        public void setYear(Long l10) {
            this.year = l10;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.key);
            arrayList.add(this.doubleValue);
            arrayList.add(this.stringValue);
            arrayList.add(this.boolValue);
            arrayList.add(this.year);
            arrayList.add(this.month);
            arrayList.add(this.day);
            arrayList.add(this.age);
            GenderPigeon genderPigeon = this.genderValue;
            arrayList.add(genderPigeon == null ? null : Integer.valueOf(genderPigeon.index));
            arrayList.add(this.ifUndefined);
            arrayList.add(this.reset);
            UserProfileAttributeType userProfileAttributeType = this.type;
            arrayList.add(userProfileAttributeType != null ? Integer.valueOf(userProfileAttributeType.index) : null);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum UserProfileAttributeType {
        BIRTH_DATE(0),
        BOOLEAN(1),
        COUNTER(2),
        GENDER(3),
        NAME(4),
        NOTIFICATION_ENABLED(5),
        NUMBER(6),
        STRING(7);

        final int index;

        UserProfileAttributeType(int i) {
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UserProfilePigeon {

        @NonNull
        private List<UserProfileAttributePigeon> attributes;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Builder {
            private List<UserProfileAttributePigeon> attributes;

            @NonNull
            public UserProfilePigeon build() {
                UserProfilePigeon userProfilePigeon = new UserProfilePigeon();
                userProfilePigeon.setAttributes(this.attributes);
                return userProfilePigeon;
            }

            @NonNull
            public Builder setAttributes(@NonNull List<UserProfileAttributePigeon> list) {
                this.attributes = list;
                return this;
            }
        }

        @NonNull
        public static UserProfilePigeon fromList(@NonNull ArrayList<Object> arrayList) {
            UserProfilePigeon userProfilePigeon = new UserProfilePigeon();
            userProfilePigeon.setAttributes((List) arrayList.get(0));
            return userProfilePigeon;
        }

        @NonNull
        public List<UserProfileAttributePigeon> getAttributes() {
            return this.attributes;
        }

        public void setAttributes(@NonNull List<UserProfileAttributePigeon> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"attributes\" is null.");
            }
            this.attributes = list;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.attributes);
            return arrayList;
        }
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }
}
