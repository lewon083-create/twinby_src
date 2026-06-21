package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0212hg implements Pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f23988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f23989b;

    public C0212hg(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.f23988a = iCommonExecutor;
        this.f23989b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0462rg interfaceC0462rg, Throwable th2) {
        interfaceC0462rg.a(th2);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NotNull InterfaceC0462rg interfaceC0462rg) {
        this.f23989b.startConnection(new C0186gg(this, interfaceC0462rg));
    }

    public final void a(InterfaceC0462rg interfaceC0462rg, Throwable th2) {
        this.f23988a.execute(new cp(3, interfaceC0462rg, th2));
    }
}
