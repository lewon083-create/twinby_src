package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC0647z1 extends IAppMetricaService.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1 f25107a;

    public BinderC0647z1(@NotNull B1 b12) {
        this.f25107a = b12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(@NotNull Bundle bundle) {
        ((C1) this.f25107a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i, @NotNull Bundle bundle) {
        ((C1) this.f25107a).reportData(i, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(@NotNull Bundle bundle) {
        ((C1) this.f25107a).resumeUserSession(bundle);
    }
}
