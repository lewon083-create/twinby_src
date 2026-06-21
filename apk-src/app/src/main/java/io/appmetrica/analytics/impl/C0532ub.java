package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0532ub implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f24841a;

    public C0532ub(Ia ia2) {
        this.f24841a = ia2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, String str2) {
        this.f24841a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        this.f24841a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z5) {
        return this.f24841a.getBoolean(str, z5);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i) {
        return this.f24841a.getInt(str, i);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        return this.f24841a.getLong(str, j10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        return this.f24841a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        this.f24841a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        this.f24841a.a(str, j10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(int i, String str) {
        this.f24841a.a(i, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z5) {
        this.f24841a.a(str, z5);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        this.f24841a.a(str, f10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        return this.f24841a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        return this.f24841a.a();
    }
}
