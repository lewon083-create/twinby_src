package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.C0015a0;
import io.appmetrica.analytics.impl.C0041b0;
import io.appmetrica.analytics.impl.C0071c4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppMetricaLibraryAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static F0 f21424a = new F0();

    public static void activate(@NonNull Context context) {
        F0 f02 = f21424a;
        if (!f02.f22310a.f22199a.a(context).f24595a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Db db2 = f02.f22311b;
        Context applicationContext = context.getApplicationContext();
        db2.getClass();
        C0071c4.l().f23541g.a(applicationContext);
        C0071c4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f21424a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        F0 f02 = f21424a;
        if (f02.f22310a.f22201c.a((Void) null).f24595a) {
            f02.f22311b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z5);
        }
    }

    public static void setProxy(@NonNull F0 f02) {
        f21424a = f02;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        F0 f02 = f21424a;
        f02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Cb cb2 = f02.f22310a;
        if (cb2.f22205g.a(str).f24595a && cb2.f22199a.a(context).f24595a) {
            f02.f22311b.getClass();
            C0071c4.l().f23541g.a(context);
            C0041b0 c0041b0B = C0071c4.l().b();
            c0041b0B.f23468c.a().executeDelayed(new C0015a0(c0041b0B, context), c0041b0B.f23469d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f02 = f21424a;
        Cb cb2 = f02.f22310a;
        if (cb2.f22199a.a(context).f24595a && cb2.f22200b.a(appMetricaLibraryAdapterConfig).f24595a) {
            Db db2 = f02.f22311b;
            Context applicationContext = context.getApplicationContext();
            db2.getClass();
            C0071c4.l().f23541g.a(applicationContext);
            C0071c4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
