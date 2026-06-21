package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0259jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24149a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0117e f24150b;

    public C0259jc(InterfaceC0170g0 interfaceC0170g0) {
        this.f24150b = new C0117e(new Eb(interfaceC0170g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0117e c0117e = this.f24150b;
        c0117e.f23712a.add(new InterfaceC0066c() { // from class: io.appmetrica.analytics.impl.kp
            @Override // io.appmetrica.analytics.impl.InterfaceC0066c
            public final void onAppNotResponding() {
                C0259jc.b(anrListener);
            }
        });
    }
}
