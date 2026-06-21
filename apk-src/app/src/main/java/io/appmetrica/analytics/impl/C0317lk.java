package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0317lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f24315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24316b;

    public C0317lk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f24315a = systemTimeProvider;
        this.f24316b = systemTimeProvider.currentTimeMillis();
    }
}
