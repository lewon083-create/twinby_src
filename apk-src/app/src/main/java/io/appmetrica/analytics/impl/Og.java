package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Og extends AbstractCallableC0588wh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0538uh f22805e;

    public Og(@NotNull C0397p0 c0397p0, @Nullable Yk yk2, @NotNull C0538uh c0538uh) {
        super(c0397p0, yk2);
        this.f22805e = c0538uh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh
    public final void a(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0588wh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        C0538uh c0538uh = this.f22805e;
        iAppMetricaService.reportData(c0538uh.f24849c, c0538uh.f24847a.d(c0538uh.f24851e.c()));
    }
}
