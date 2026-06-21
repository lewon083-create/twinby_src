package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class R5 extends AbstractC0525u4 {
    public R5(@NonNull String str, double d10) {
        super(2, str, Double.valueOf(d10), new C0457rb(), new C0500t4(new Hb(new C0351n4(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0525u4
    public final void a(@NonNull C0142eo c0142eo) {
        C0194go c0194go = c0142eo.f23820d;
        c0194go.f23948c = ((Double) this.f24833f).doubleValue() + c0194go.f23948c;
    }
}
