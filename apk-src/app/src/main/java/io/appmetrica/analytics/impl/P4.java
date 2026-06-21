package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class P4 implements InterfaceC0480s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0302l5 f22828a;

    public P4(@NotNull InterfaceC0580w9 interfaceC0580w9, @NotNull M6 m62, @NotNull Pg pg, @NotNull R4 r42) {
        O4 o42 = new O4(m62, pg);
        this.f22828a = new C0302l5(interfaceC0580w9, o42.a(), o42.b(), r42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0480s9
    public final InterfaceC0455r9 a() {
        return this.f22828a;
    }

    @NotNull
    public final C0302l5 b() {
        return this.f22828a;
    }
}
