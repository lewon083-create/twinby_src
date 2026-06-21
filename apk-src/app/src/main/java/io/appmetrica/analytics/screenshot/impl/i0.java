package io.appmetrica.analytics.screenshot.impl;

import com.google.android.gms.internal.ads.om1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25485c;

    public i0(boolean z5, List list, long j10) {
        this.f25483a = z5;
        this.f25484b = list;
        this.f25485c = j10;
    }

    public final long a() {
        return this.f25485c;
    }

    public final boolean b() {
        return this.f25483a;
    }

    public final List c() {
        return this.f25484b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        sb2.append(this.f25483a);
        sb2.append(", mediaStoreColumnNames=");
        sb2.append(this.f25484b);
        sb2.append(", detectWindowSeconds=");
        return om1.m(sb2, this.f25485c, ')');
    }

    public i0(C0685p c0685p) {
        this(c0685p.b(), c0685p.c(), c0685p.a());
    }
}
