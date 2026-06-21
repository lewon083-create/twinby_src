package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0265ji implements Ta {
    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.Ua
    @NonNull
    public final Ta a() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Ja b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0297l0 c0297l0) {
        return new C0633yc();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Sa b(@NonNull ReporterConfig reporterConfig) {
        return new C0188gi();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Ja a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0297l0 c0297l0) {
        return new C0633yc();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    @NonNull
    public final Va a(@NonNull AppMetricaConfig appMetricaConfig) {
        return new C0188gi();
    }
}
