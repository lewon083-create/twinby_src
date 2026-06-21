package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Ta extends Ua {
    @NonNull
    Ja a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0297l0 c0297l0);

    @Override // io.appmetrica.analytics.impl.Ua
    @NonNull
    /* synthetic */ Ta a();

    @NonNull
    Va a(@NonNull AppMetricaConfig appMetricaConfig);

    void a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    Ja b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, @NonNull C0297l0 c0297l0);

    @NonNull
    Sa b(@NonNull ReporterConfig reporterConfig);
}
