package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0467rl implements SimpleNetworkApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheControlHttpsConnectionPerformer f24691a = new CacheControlHttpsConnectionPerformer(((C0667zl) C0382oa.k().z()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(@NotNull String str, @NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f24691a.performConnection(str, new C0147f3(networkClientWithCacheControl));
    }
}
