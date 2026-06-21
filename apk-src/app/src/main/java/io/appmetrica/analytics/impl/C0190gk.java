package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0190gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23941a;

    public C0190gk(String str) {
        this.f23941a = str;
    }

    public final String toString() {
        return "ServiceDescription(packageName='" + this.f23941a + "', serviceScheme='appmetrica', serviceClass=" + AppMetricaService.class + ')';
    }
}
