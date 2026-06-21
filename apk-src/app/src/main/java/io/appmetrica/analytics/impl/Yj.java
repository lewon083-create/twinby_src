package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yj implements ServiceComponentModuleConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0401p4 f23353a;

    public Yj(@NotNull C0401p4 c0401p4) {
        this.f23353a = c0401p4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f23353a.f24558m, Boolean.TRUE)).booleanValue();
    }
}
