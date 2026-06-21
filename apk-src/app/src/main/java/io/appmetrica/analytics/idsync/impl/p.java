package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22013b = "id_sync";

    public p(@NotNull ServiceContext serviceContext) {
        this.f22012a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(@NotNull String str, @NotNull SdkIdentifiers sdkIdentifiers) {
        this.f22012a.getSelfReporter().reportEvent(this.f22013b, str);
    }
}
