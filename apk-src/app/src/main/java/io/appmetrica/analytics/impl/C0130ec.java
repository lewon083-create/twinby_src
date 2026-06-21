package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0130ec implements InterfaceC0480s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0302l5 f23759a;

    public C0130ec(@NotNull InterfaceC0580w9 interfaceC0580w9, @NotNull M6 m62, @NotNull Pg pg, @NotNull C0401p4 c0401p4, @NotNull R4 r42, @NotNull Ve ve2) {
        C0105dc c0105dc = new C0105dc(m62, pg, this, c0401p4, ve2);
        this.f23759a = new C0302l5(interfaceC0580w9, c0105dc.a(), c0105dc.b(), r42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0480s9
    public final InterfaceC0455r9 a() {
        return this.f23759a;
    }

    @NotNull
    public final C0302l5 b() {
        return this.f23759a;
    }
}
