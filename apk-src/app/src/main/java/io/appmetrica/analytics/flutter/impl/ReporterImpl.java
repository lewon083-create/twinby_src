package io.appmetrica.analytics.flutter.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.flutter.utils.Converter;
import io.appmetrica.analytics.flutter.utils.ECommerceConverter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ReporterImpl implements Pigeon.ReporterPigeon {

    @NonNull
    final Context context;

    public ReporterImpl(@NonNull Context context) {
        this.context = context;
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void clearAppEnvironment(@NonNull String str) {
        AppMetrica.getReporter(this.context, str).clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void pauseSession(@NonNull String str) {
        AppMetrica.getReporter(this.context, str).pauseSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void putAppEnvironmentValue(@NonNull String str, @NonNull String str2, String str3) {
        AppMetrica.getReporter(this.context, str).putAppEnvironmentValue(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportAdRevenue(@NonNull String str, @NonNull Pigeon.AdRevenuePigeon adRevenuePigeon) {
        AppMetrica.getReporter(this.context, str).reportAdRevenue(Converter.toNative(adRevenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportECommerce(@NonNull String str, @NonNull Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        ECommerceEvent eCommerceEvent = ECommerceConverter.toNative(eCommerceEventPigeon);
        if (eCommerceEvent != null) {
            AppMetrica.getReporter(this.context, str).reportECommerce(eCommerceEvent);
        }
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportError(@NonNull String str, @NonNull Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str2) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(Converter.toNative(errorDetailsPigeon), str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportErrorWithGroup(@NonNull String str, @NonNull String str2, Pigeon.ErrorDetailsPigeon errorDetailsPigeon, String str3) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportError(str2, str3, errorDetailsPigeon != null ? Converter.toNative(errorDetailsPigeon) : null);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEvent(@NonNull String str, @NonNull String str2) {
        AppMetrica.getReporter(this.context, str).reportEvent(str2);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportEventWithJson(@NonNull String str, @NonNull String str2, String str3) {
        AppMetrica.getReporter(this.context, str).reportEvent(str2, str3);
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportRevenue(@NonNull String str, @NonNull Pigeon.RevenuePigeon revenuePigeon) {
        AppMetrica.getReporter(this.context, str).reportRevenue(Converter.toNative(revenuePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUnhandledException(@NonNull String str, @NonNull Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        AppMetrica.getReporter(this.context, str).getPluginExtension().reportUnhandledException(Converter.toNative(errorDetailsPigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void reportUserProfile(@NonNull String str, @NonNull Pigeon.UserProfilePigeon userProfilePigeon) {
        AppMetrica.getReporter(this.context, str).reportUserProfile(Converter.toNative(userProfilePigeon));
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void resumeSession(@NonNull String str) {
        AppMetrica.getReporter(this.context, str).resumeSession();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void sendEventsBuffer(@NonNull String str) {
        AppMetrica.getReporter(this.context, str).sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setDataSendingEnabled(@NonNull String str, @NonNull Boolean bool) {
        AppMetrica.getReporter(this.context, str).setDataSendingEnabled(bool.booleanValue());
    }

    @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon
    public void setUserProfileID(@NonNull String str, String str2) {
        AppMetrica.getReporter(this.context, str).setUserProfileID(str2);
    }
}
