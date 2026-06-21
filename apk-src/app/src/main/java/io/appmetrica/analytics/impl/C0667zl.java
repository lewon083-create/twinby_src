package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0667zl implements L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25128a;

    public C0667zl(@NotNull Context context) {
        this.f25128a = context;
    }

    @NotNull
    public final Context b() {
        return this.f25128a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.impl.InterfaceC0269jm
    public final void a(@NotNull C0140em c0140em) {
    }
}
