package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sy implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f10441h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ xy f10444l;

    public sy(xy xyVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z5, int i, int i10) {
        this.f10435b = str;
        this.f10436c = str2;
        this.f10437d = j10;
        this.f10438e = j11;
        this.f10439f = j12;
        this.f10440g = j13;
        this.f10441h = j14;
        this.i = z5;
        this.f10442j = i;
        this.f10443k = i10;
        this.f10444l = xyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f10435b);
        map.put("cachedSrc", this.f10436c);
        map.put("bufferedDuration", Long.toString(this.f10437d));
        map.put("totalDuration", Long.toString(this.f10438e));
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3118n2)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f10439f));
            map.put("qoeCachedBytes", Long.toString(this.f10440g));
            map.put("totalBytes", Long.toString(this.f10441h));
            p9.k.C.f31304k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.i ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        map.put("playerCount", Integer.toString(this.f10442j));
        map.put("playerPreparedCount", Integer.toString(this.f10443k));
        this.f10444l.n(map);
    }
}
