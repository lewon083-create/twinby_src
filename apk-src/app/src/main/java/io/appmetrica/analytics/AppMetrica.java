package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC0547v1;
import io.appmetrica.analytics.impl.C0522u1;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC0547v1.f24864a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC0547v1.f24864a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC0547v1.f24864a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC0547v1.f24864a.a(application);
    }

    public static String getDeviceId(@NonNull Context context) {
        return AbstractC0547v1.f24864a.b();
    }

    public static int getLibraryApiLevel() {
        return 116;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.14.2";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return K0.f22544a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC0547v1.f24864a.a(context, str);
    }

    public static String getUuid(@NonNull Context context) {
        return AbstractC0547v1.f24864a.a(context).f25138id;
    }

    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC0547v1.f24864a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC0547v1.f24864a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, String str2) {
        AbstractC0547v1.f24864a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, String str2) {
        AbstractC0547v1.f24864a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC0547v1.f24864a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC0547v1.f24864a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC0547v1.f24864a.a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC0547v1.f24864a.b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC0547v1.f24864a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, String str2) {
        AbstractC0547v1.f24864a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC0547v1.f24864a.b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC0547v1.f24864a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC0547v1.f24864a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC0547v1.f24864a.d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC0547v1.f24864a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th2) {
        AbstractC0547v1.f24864a.a(th2);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC0547v1.f24864a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC0547v1.f24864a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC0547v1.f24864a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C0522u1 c0522u1 = AbstractC0547v1.f24864a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c0522u1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC0547v1.f24864a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC0547v1.f24864a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        AbstractC0547v1.f24864a.a(z5);
    }

    public static void setDataSendingEnabled(boolean z5) {
        AbstractC0547v1.f24864a.b(z5);
    }

    public static void setLocation(Location location) {
        AbstractC0547v1.f24864a.a(location);
    }

    public static void setLocationTracking(boolean z5) {
        AbstractC0547v1.f24864a.c(z5);
    }

    public static void setUserProfileID(String str) {
        AbstractC0547v1.f24864a.e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC0547v1.f24864a.a(intent);
    }

    public static void reportError(@NonNull String str, String str2, Throwable th2) {
        AbstractC0547v1.f24864a.a(str, str2, th2);
    }

    public static void reportEvent(@NonNull String str, String str2) {
        AbstractC0547v1.f24864a.c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC0547v1.f24864a.a(str);
    }

    public static void reportError(@NonNull String str, Throwable th2) {
        AbstractC0547v1.f24864a.a(str, th2);
    }

    public static void reportEvent(@NonNull String str, Map<String, Object> map) {
        AbstractC0547v1.f24864a.a(str, map);
    }
}
