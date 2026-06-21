package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22921b;

    public Rj(String str, String str2) {
        this.f22920a = str;
        this.f22921b = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb2.append(this.f22920a);
        sb2.append("', eventValue='");
        return a0.u.o(sb2, this.f22921b, "')");
    }
}
