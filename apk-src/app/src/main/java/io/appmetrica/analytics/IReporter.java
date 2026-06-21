package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IReporter {
    void clearAppEnvironment();

    @NonNull
    IPluginReporter getPluginExtension();

    void pauseSession();

    void putAppEnvironmentValue(@NonNull String str, String str2);

    void reportAdRevenue(@NonNull AdRevenue adRevenue);

    void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map);

    void reportECommerce(@NonNull ECommerceEvent eCommerceEvent);

    void reportError(@NonNull String str, String str2);

    void reportError(@NonNull String str, String str2, Throwable th2);

    void reportError(@NonNull String str, Throwable th2);

    void reportEvent(@NonNull String str);

    void reportEvent(@NonNull String str, String str2);

    void reportEvent(@NonNull String str, Map<String, Object> map);

    void reportRevenue(@NonNull Revenue revenue);

    void reportUnhandledException(@NonNull Throwable th2);

    void reportUserProfile(@NonNull UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setDataSendingEnabled(boolean z5);

    void setUserProfileID(String str);
}
