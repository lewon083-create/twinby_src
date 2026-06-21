package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Xc extends E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23249b;

    public Xc(@NotNull String str, @NotNull InterfaceC0517tl interfaceC0517tl) {
        super(interfaceC0517tl);
        this.f23249b = str;
    }

    @Override // io.appmetrica.analytics.impl.E2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.f23249b;
    }
}
