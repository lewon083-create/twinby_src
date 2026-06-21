package io.appmetrica.analytics.screenshot.impl;

import com.google.android.gms.internal.ads.om1;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0685p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25508c;

    public C0685p(boolean z5, List list, long j10) {
        this.f25506a = z5;
        this.f25507b = list;
        this.f25508c = j10;
    }

    public final long a() {
        return this.f25508c;
    }

    public final boolean b() {
        return this.f25506a;
    }

    public final List c() {
        return this.f25507b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        sb2.append(this.f25506a);
        sb2.append(", mediaStoreColumnNames='");
        sb2.append(this.f25507b);
        sb2.append("', detectWindowSeconds=");
        return om1.m(sb2, this.f25508c, ')');
    }

    public C0685p() {
        this(new O().f25436a, kotlin.collections.p.v(new O().f25438c), new O().f25437b);
    }
}
