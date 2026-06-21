package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0690v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f25513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C0680k f25514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z f25515d;

    public C0690v(@NotNull ClientContext clientContext, @NotNull U u4) {
        this.f25512a = clientContext;
        this.f25513b = u4;
        this.f25515d = new Z(clientContext, new C0687s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0682m c0682m) {
        this.f25514c = c0682m != null ? c0682m.f25501c : null;
        this.f25515d.f25462c = this.f25514c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f25512a.getActivityLifecycleRegistry().registerListener(new C0689u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
