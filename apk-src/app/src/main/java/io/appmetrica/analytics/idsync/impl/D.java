package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f21941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f21942g;

    public D(String str, boolean z5, String str2, boolean z10, int i, byte[] bArr, Map map) {
        this.f21936a = str;
        this.f21937b = z5;
        this.f21938c = str2;
        this.f21939d = z10;
        this.f21940e = i;
        this.f21941f = bArr;
        this.f21942g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f21936a + "', isCompleted=" + this.f21937b + ", url=" + this.f21938c + ", responseCodeIsValid=" + this.f21939d + ", responseCode=" + this.f21940e + ", responseBody=" + this.f21941f + ", responseHeaders=" + this.f21942g + ')';
    }
}
