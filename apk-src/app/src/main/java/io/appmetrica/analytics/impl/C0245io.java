package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0245io implements InterfaceC0269jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f24118a;

    public C0245io(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f24118a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0269jm
    public final void a(@NotNull C0140em c0140em) {
        this.f24118a.updateConfiguration(new UtilityServiceConfiguration(c0140em.f23805v, c0140em.f23804u));
    }
}
