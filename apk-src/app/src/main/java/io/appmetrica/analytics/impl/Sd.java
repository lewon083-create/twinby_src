package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Sd implements ServiceNetworkContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0175g5 f22957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22958b = new C0065bo().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0467rl f22959c = new C0467rl();

    public Sd(@NotNull Context context) {
        this.f22957a = new C0175g5(new C0427q5(context), new C0390oi(C0382oa.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f22957a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SimpleNetworkApi getNetworkApi() {
        return this.f22959c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C0382oa.I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final String getUserAgent() {
        return this.f22958b;
    }
}
