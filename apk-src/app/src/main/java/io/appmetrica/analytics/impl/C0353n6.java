package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0353n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0564vi f24401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eh f24402b;

    public C0353n6(Af af2, E8 e82, C0564vi c0564vi, AppMetricaConfig appMetricaConfig) {
        this.f24401a = c0564vi;
        this.f24402b = new Eh(af2, new CounterConfiguration(appMetricaConfig, CounterConfigurationReporterType.CRASH), e82, appMetricaConfig.userProfileID);
    }

    public final Eh a() {
        return this.f24402b;
    }
}
