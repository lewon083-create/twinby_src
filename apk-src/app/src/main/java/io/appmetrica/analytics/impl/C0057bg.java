package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0057bg implements InterfaceC0462rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0109dg f23505a;

    public C0057bg(C0109dg c0109dg) {
        this.f23505a = c0109dg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0462rg
    public final void a(@Nullable C0338mg c0338mg) {
        C0109dg c0109dg = this.f23505a;
        C0109dg.a(c0109dg, c0338mg, (Vf) c0109dg.f23694e.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0462rg
    public final void a(@NotNull Throwable th2) {
        C0109dg c0109dg = this.f23505a;
        C0109dg.a(c0109dg, null, (Vf) c0109dg.f23694e.getValue());
    }
}
