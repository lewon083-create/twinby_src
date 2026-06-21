package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0691w implements InterfaceC0678i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f25517b;

    public C0691w(@NotNull ClientContext clientContext, @NotNull U u4) {
        this.f25516a = clientContext;
        this.f25517b = u4;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0678i
    @NotNull
    public final List<T> a() {
        return kotlin.collections.s.f(new C0673d(this.f25516a, this.f25517b), new C0690v(this.f25516a, this.f25517b), new g0(this.f25516a, this.f25517b));
    }
}
