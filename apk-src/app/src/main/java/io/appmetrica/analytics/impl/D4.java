package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class D4 extends Ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4 f22243a;

    public D4(C0625y4 c0625y4) {
        this.f22243a = new C4(c0625y4);
    }

    @Override // io.appmetrica.analytics.impl.Ef
    public final X8 a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC0078cb.a(i).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f22243a.f22187a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f22243a.f22188b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f22243a.f22189c);
        }
        return new W8(arrayList);
    }
}
