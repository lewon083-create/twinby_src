package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0182gc extends Vn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f23934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182gc(@NonNull Ua ua2, @NonNull AppMetricaConfig appMetricaConfig) {
        super(ua2);
        String str = appMetricaConfig.apiKey;
        this.f23934b = appMetricaConfig;
    }

    @NonNull
    public final Va a() {
        return this.f23178a.a().a(this.f23934b);
    }
}
