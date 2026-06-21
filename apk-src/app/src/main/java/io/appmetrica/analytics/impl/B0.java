package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class B0 implements InterfaceC0608xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f22097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f22098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f22099c;

    public B0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f22097a = c02;
        this.f22098b = appMetricaConfig;
        this.f22099c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0608xc
    @NotNull
    public final C0234ic a() {
        C0 c02 = this.f22097a;
        C0239ii c0239ii = c02.f22170g;
        AppMetricaConfig appMetricaConfig = this.f22098b;
        PublicLogger publicLogger = this.f22099c;
        E7 e7 = c02.i;
        return c0239ii.b(appMetricaConfig, publicLogger, new C0297l0(e7.f22281j, e7.f22280h));
    }
}
