package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0148f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f23829a;

    public C0148f4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f23829a.elapsedRealtime();
    }

    public C0148f4(SystemTimeProvider systemTimeProvider) {
        this.f23829a = systemTimeProvider;
    }
}
