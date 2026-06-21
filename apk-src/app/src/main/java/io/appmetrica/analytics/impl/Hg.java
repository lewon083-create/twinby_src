package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hg implements Jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0668zm f22423a;

    public Hg(@NonNull C0668zm c0668zm) {
        this.f22423a = c0668zm;
    }

    @Override // io.appmetrica.analytics.impl.Jl
    public final void a() throws Throwable {
        NetworkTask networkTaskC = this.f22423a.c();
        if (networkTaskC != null) {
            C0382oa.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
