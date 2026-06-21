package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F1 implements InterfaceC0087ck {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final E1 f22313b = new E1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22314c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0471s0 f22315a;

    public F1(@NotNull InterfaceC0471s0 interfaceC0471s0) {
        this.f22315a = interfaceC0471s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0087ck
    public final void reportData(int i, @NotNull Bundle bundle) {
        ((C1) this.f22315a).a(bundle);
    }
}
