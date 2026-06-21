package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gb f22055a;

    public A4() {
        this(C0382oa.k().l());
    }

    public static F4 a(C0625y4 c0625y4) {
        return new F4(new D4(c0625y4), c0625y4);
    }

    public A4(Gb gb2) {
        this.f22055a = gb2;
    }

    public final C0295kn a(C0625y4 c0625y4, C0668zm c0668zm) {
        C0295kn c0295kn = new C0295kn(c0625y4, new Hg(c0668zm));
        Gb gb2 = this.f22055a;
        synchronized (gb2) {
            gb2.f22377c.add(c0295kn);
        }
        return c0295kn;
    }
}
