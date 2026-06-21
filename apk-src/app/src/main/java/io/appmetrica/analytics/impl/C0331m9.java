package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0331m9 extends Ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0314lh f24357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0364nh f24358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zg f24359c;

    public C0331m9(Y4 y42) {
        this.f24357a = new C0314lh(y42);
        this.f24358b = new C0364nh(y42);
        this.f24359c = new Zg(y42);
    }

    @Override // io.appmetrica.analytics.impl.Ef
    public final X8 a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC0078cb.a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f24357a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f24359c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f24358b);
            linkedList.add(this.f24357a);
        }
        return new W8(linkedList);
    }
}
