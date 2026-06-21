package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0657zb implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f25115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f25116b = ij.h.b(new C0632yb(this));

    public C0657zb(@NotNull Y4 y42) {
        this.f25115a = y42;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0264jh getConfig() {
        return (C0264jh) this.f25116b.getValue();
    }
}
