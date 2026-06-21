package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0376o4 extends C0044b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24464b;

    public C0376o4(int i, int i10) {
        super(i10);
        this.f24464b = i;
    }

    @Override // io.appmetrica.analytics.impl.C0044b3
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb2.append(this.f24464b);
        sb2.append(", bytesTruncated=");
        return om1.l(sb2, this.f23478a, '}');
    }
}
