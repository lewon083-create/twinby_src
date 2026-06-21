package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0460re extends AbstractCallableC0588wh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Af f24687e;

    public C0460re(@NotNull C0397p0 c0397p0, @Nullable Yk yk2, @NotNull Af af2) {
        super(c0397p0, yk2);
        this.f24687e = af2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Af af2 = this.f24687e;
        synchronized (af2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", af2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
