package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0362nf implements Ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ye f24438a;

    public C0362nf(@NotNull Ye ye2) {
        this.f24438a = ye2;
    }

    @Override // io.appmetrica.analytics.impl.Ri
    public final boolean a() {
        return this.f24438a.i();
    }

    @Override // io.appmetrica.analytics.impl.Ri
    public final void b() {
        this.f24438a.h().b();
    }

    public C0362nf() {
        this(C0382oa.k().y());
    }
}
