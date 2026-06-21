package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0008b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f21954a;

    public C0008b(@NotNull ServiceContext serviceContext) {
        this.f21954a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f21954a.getActiveNetworkTypeProvider().getNetworkType(this.f21954a.getContext()) == NetworkType.CELL;
    }
}
