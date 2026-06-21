package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class E7 implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f22273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f22274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f22275c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f22277e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22280h;
    public String i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0564vi f22283l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f22276d = Boolean.FALSE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f22278f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f22279g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public List<String> f22281j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        this.f22274b = boolValueOf;
        C0564vi c0564vi = this.f22283l;
        if (c0564vi != null) {
            c0564vi.a(boolValueOf, this.f22277e, this.f22275c, this.f22276d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void clearAppEnvironment() {
        this.f22280h = true;
        this.f22278f.clear();
    }

    public final C0297l0 j() {
        return new C0297l0(this.f22281j, this.f22280h);
    }

    public final Location k() {
        return this.f22273a;
    }

    public final Boolean l() {
        return this.f22275c;
    }

    public final Boolean m() {
        return this.f22277e;
    }

    public final Boolean n() {
        return this.f22274b;
    }

    public final boolean o() {
        return this.f22280h;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f22278f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setDataSendingEnabled(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        this.f22277e = boolValueOf;
        C0564vi c0564vi = this.f22283l;
        if (c0564vi != null) {
            c0564vi.a(this.f22274b, boolValueOf, this.f22275c, this.f22276d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setUserProfileID(String str) {
        this.i = str;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5, boolean z10) {
        boolean z11 = this.f22275c == null;
        boolean zBooleanValue = this.f22276d.booleanValue();
        if (z10 || z11 || !zBooleanValue) {
            this.f22275c = Boolean.valueOf(z5);
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f22276d = boolValueOf;
            C0564vi c0564vi = this.f22283l;
            if (c0564vi != null) {
                c0564vi.a(this.f22274b, this.f22277e, this.f22275c, boolValueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Location location) {
        this.f22273a = location;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        this.f22279g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f22282k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (ko.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (ko.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (ko.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (ko.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (ko.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (ko.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (ko.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (ko.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (ko.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (ko.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (ko.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (ko.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (ko.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (ko.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (ko.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (ko.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (ko.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (ko.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (ko.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (ko.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (ko.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f22278f;
        if (!ko.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!ko.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f22279g;
        if (!ko.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!ko.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!ko.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f22274b;
        if (appMetricaConfig.locationTracking == null && ko.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f22273a;
        if (appMetricaConfig.location == null && ko.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f22277e;
        if (appMetricaConfig.dataSendingEnabled == null && ko.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!ko.a(appMetricaConfig.userProfileID) && ko.a(this.i)) {
            builderNewConfigBuilder.withUserProfileID(this.i);
        }
        Boolean bool3 = this.f22275c;
        if (appMetricaConfig.advIdentifiersTracking == null && ko.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f22282k = true;
        this.f22273a = null;
        this.f22274b = null;
        this.f22275c = null;
        this.f22276d = Boolean.FALSE;
        this.f22277e = null;
        this.f22278f.clear();
        this.f22279g.clear();
        this.f22280h = false;
        this.i = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f22281j.add(str);
    }

    public final void a(C0564vi c0564vi) {
        Boolean bool = this.f22274b;
        if (bool != null || this.f22277e != null || this.f22275c != null) {
            c0564vi.a(bool, this.f22277e, this.f22275c, this.f22276d);
        }
        this.f22283l = c0564vi;
    }
}
