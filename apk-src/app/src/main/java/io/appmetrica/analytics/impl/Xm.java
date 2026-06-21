package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xm extends AbstractC0525u4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Kn f23273g;

    public Xm(@NonNull String str, @NonNull String str2, @NonNull Kn kn, @NonNull ro roVar, @NonNull K2 k22) {
        super(0, str, str2, roVar, k22);
        this.f23273g = kn;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0525u4
    public final void a(@NonNull C0142eo c0142eo) {
        String str = (String) this.f23273g.a((String) this.f24833f);
        c0142eo.f23820d.f23946a = str == null ? new byte[0] : str.getBytes();
    }

    public final Kn h() {
        return this.f23273g;
    }
}
