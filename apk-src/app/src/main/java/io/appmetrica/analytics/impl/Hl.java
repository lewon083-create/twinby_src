package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Hl extends AbstractC0402p5 {
    public Hl(Zl zl2, C0140em c0140em, Yl yl2) {
        super(zl2, c0140em, yl2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0402p5
    public final synchronized void a(@NonNull Yl yl2) {
        a(new M5(c(), C0382oa.I.v(), C0382oa.I.s(), ((Yl) b()).mergeFrom(yl2)));
        e();
    }
}
