package io.appmetrica.analytics.impl;

import android.app.Service;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0521u0 implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f24822a;

    public C0521u0(@NotNull Service service) {
        this.f24822a = service;
    }

    public final void a(int i) {
        this.f24822a.stopSelf(i);
    }
}
