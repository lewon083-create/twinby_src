package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0297l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24257b;

    public C0297l0(List list, boolean z5) {
        this.f24256a = list;
        this.f24257b = z5;
    }

    public final String toString() {
        return "AppMetricaConfigExtension(autoCollectedDataSubscribers=" + this.f24256a + ", needClearEnvironment=" + this.f24257b + ')';
    }
}
