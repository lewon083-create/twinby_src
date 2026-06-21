package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0389oh extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0489si f24522b;

    public C0389oh(Y4 y42) {
        super(y42);
        this.f24522b = new C0489si(new C0331m9(y42), y42);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        return this.f24522b.a(q5, new C0464ri());
    }
}
