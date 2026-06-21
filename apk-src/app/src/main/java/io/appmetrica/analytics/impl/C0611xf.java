package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0611xf extends C0456ra {
    public C0611xf(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C0456ra
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z5) {
        if (z5 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z5.f23361b) + 12;
    }
}
