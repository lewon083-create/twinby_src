package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0510te implements T8, InterfaceC0535ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f24785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f24786b;

    public C0510te(@NotNull M6 m62) {
        this.f24785a = m62;
        this.f24786b = new AtomicLong(m62.a());
        m62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(@NotNull List<Integer> list) {
        this.f24786b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(@NotNull List<Integer> list) {
        this.f24786b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f24786b.set(this.f24785a.a());
    }

    public final long b() {
        return this.f24786b.get();
    }
}
