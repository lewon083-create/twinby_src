package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f25477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f25478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f25479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C0683n f25480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f25481f = new d0(this);

    public g0(@NotNull ClientContext clientContext, @NotNull U u4) {
        this.f25476a = clientContext;
        this.f25477b = u4;
        this.f25478c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0682m c0682m) {
        this.f25480e = c0682m != null ? c0682m.f25500b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f25476a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
