package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0041b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f23466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f23467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f23468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23469d = TimeUnit.SECONDS.toMillis(10);

    public C0041b0(C0646z0 c0646z0, Vk vk2, S3 s32) {
        this.f23466a = c0646z0;
        this.f23467b = vk2;
        this.f23468c = s32;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f23466a.getClass();
        if (C0646z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f23467b.a();
        this.f23466a.getClass();
        C0621y0 c0621y0A = C0621y0.a(context);
        c0621y0A.f25061d.a(null, c0621y0A);
        IHandlerExecutor iHandlerExecutorA = this.f23468c.a();
        ((A9) iHandlerExecutorA).f22059b.post(new a1.c(this, context, appMetricaLibraryAdapterConfig, 19));
        this.f23466a.getClass();
        C0646z0.b();
    }

    public static final void a(C0041b0 c0041b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0041b0.f23466a.getClass();
        C0621y0 c0621y0A = C0621y0.a(context);
        c0621y0A.f().a(appMetricaLibraryAdapterConfig);
        C0071c4.l().f23537c.a().execute(new RunnableC0597x1(c0621y0A.f25058a));
    }
}
