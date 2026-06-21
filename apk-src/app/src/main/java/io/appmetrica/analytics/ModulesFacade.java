package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC0340mi;
import io.appmetrica.analytics.impl.C0157fd;
import io.appmetrica.analytics.impl.C0209hd;
import io.appmetrica.analytics.impl.C0235id;
import io.appmetrica.analytics.impl.C0260jd;
import io.appmetrica.analytics.impl.C0285kd;
import io.appmetrica.analytics.impl.C0310ld;
import io.appmetrica.analytics.impl.C0335md;
import io.appmetrica.analytics.impl.C0360nd;
import io.appmetrica.analytics.impl.C0646z0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C0360nd f21447a = new C0360nd();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C0360nd c0360nd = f21447a;
        C0157fd c0157fd = c0360nd.f24430b;
        c0157fd.f23877b.a(context);
        c0157fd.f23879d.a(str);
        c0360nd.f24431c.f24846a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0340mi.f24376a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.getClass();
        c0360nd.f24431c.getClass();
        c0360nd.f24429a.getClass();
        return C0646z0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.f23876a.a(null);
        c0360nd.f24431c.getClass();
        c0360nd.f24432d.execute(new C0235id(c0360nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i, @NonNull String str) {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.getClass();
        c0360nd.f24431c.getClass();
        c0360nd.f24432d.execute(new C0260jd(c0360nd, i, str));
    }

    public static void sendEventsBuffer() {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.getClass();
        c0360nd.f24431c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.getClass();
        c0360nd.f24431c.getClass();
        c0360nd.f24432d.execute(new C0285kd(c0360nd, z5));
    }

    public static void setProxy(@NonNull C0360nd c0360nd) {
        f21447a = c0360nd;
    }

    public static void setSessionExtra(@NonNull String str, byte[] bArr) {
        C0360nd c0360nd = f21447a;
        c0360nd.f24430b.f23878c.a(str);
        c0360nd.f24431c.getClass();
        c0360nd.f24432d.execute(new C0310ld(c0360nd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C0360nd c0360nd = f21447a;
        C0157fd c0157fd = c0360nd.f24430b;
        c0157fd.f23877b.a(context);
        c0157fd.f23879d.a(str);
        c0360nd.f24431c.f24846a.a(context.getApplicationContext());
        c0360nd.f24432d.execute(new C0335md(str));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C0360nd c0360nd = f21447a;
        boolean zBooleanValue = bool.booleanValue();
        c0360nd.f24430b.getClass();
        c0360nd.f24431c.getClass();
        c0360nd.f24432d.execute(new C0209hd(c0360nd, adRevenue, zBooleanValue));
    }
}
