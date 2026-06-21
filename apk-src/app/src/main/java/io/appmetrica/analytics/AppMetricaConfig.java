package io.appmetrica.analytics;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0196h0;
import io.appmetrica.analytics.impl.C0377o5;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.H3;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import io.sentry.protocol.Message;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Builder {
        private static final Dn D = new Dn(new C0196h0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0377o5 f21399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f21401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f21402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f21403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f21404f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Location f21405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f21406h;
        private Boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f21407j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private PreloadInfo f21408k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f21409l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Boolean f21410m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f21411n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f21412o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f21413p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Boolean f21414q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f21415r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f21416s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f21417t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f21418u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f21419v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f21420w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f21421x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ICrashTransformer f21422y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f21423z;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z5) {
            this.f21409l = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, Object obj) {
            this.C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z5) {
            this.i = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z5) {
            this.f21423z = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i) {
            this.A = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f21418u = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, String str2) {
            this.f21421x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z5) {
            this.f21416s = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withAppVersion(String str) {
            this.f21401c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z5) {
            this.f21403e = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f21422y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z5) {
            this.f21410m = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withDeviceType(String str) {
            this.f21417t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f21419v = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, String str2) {
            this.f21412o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(Location location) {
            this.f21405g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z5) {
            this.f21406h = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f21407j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.f21420w = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f21411n = Integer.valueOf(this.f21399a.a(i));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z5) {
            this.f21404f = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f21408k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z5) {
            this.f21414q = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f21402d = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z5) {
            this.f21415r = Boolean.valueOf(z5);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(String str) {
            this.f21413p = str;
            return this;
        }

        private Builder(String str) {
            this.f21412o = new LinkedHashMap();
            this.f21421x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f21399a = new C0377o5(str);
            this.f21400b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder builderA = new H3().a(str);
        if (builderA == null) {
            return null;
        }
        return builderA.build();
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new D7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put(App.JsonKeys.APP_VERSION, this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", H3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put(Message.JsonKeys.PARAMS, additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                    string = null;
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!ko.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f21400b;
        this.appVersion = builder.f21401c;
        this.sessionTimeout = builder.f21402d;
        this.crashReporting = builder.f21403e;
        this.nativeCrashReporting = builder.f21404f;
        this.location = builder.f21405g;
        this.locationTracking = builder.f21406h;
        this.advIdentifiersTracking = builder.i;
        this.logs = builder.f21407j;
        this.preloadInfo = builder.f21408k;
        this.firstActivationAsUpdate = builder.f21409l;
        this.dataSendingEnabled = builder.f21410m;
        this.maxReportsInDatabaseCount = builder.f21411n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f21412o);
        this.userProfileID = builder.f21413p;
        this.revenueAutoTrackingEnabled = builder.f21414q;
        this.sessionsAutoTrackingEnabled = builder.f21415r;
        this.appOpenTrackingEnabled = builder.f21416s;
        this.deviceType = builder.f21417t;
        this.appBuildNumber = builder.f21418u;
        this.dispatchPeriodSeconds = builder.f21419v;
        this.maxReportsCount = builder.f21420w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f21421x);
        this.crashTransformer = builder.f21422y;
        this.anrMonitoring = builder.f21423z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    public AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
