package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0538uh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q5 f24847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f24850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eh f24851e;

    public C0538uh(Q5 q5, boolean z5, int i, HashMap map, Eh eh2) {
        this.f24847a = q5;
        this.f24848b = z5;
        this.f24849c = i;
        this.f24850d = map;
        this.f24851e = eh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f24847a + ", serviceDataReporterType=" + this.f24849c + ", environment=" + this.f24851e + ", isCrashReport=" + this.f24848b + ", trimmedFields=" + this.f24850d + ')';
    }
}
