package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ty implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f10754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10755h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ az f10757k;

    public ty(az azVar, String str, String str2, int i, int i10, long j10, long j11, boolean z5, int i11, int i12) {
        this.f10749b = str;
        this.f10750c = str2;
        this.f10751d = i;
        this.f10752e = i10;
        this.f10753f = j10;
        this.f10754g = j11;
        this.f10755h = z5;
        this.i = i11;
        this.f10756j = i12;
        this.f10757k = azVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f10749b);
        map.put("cachedSrc", this.f10750c);
        map.put("bytesLoaded", Integer.toString(this.f10751d));
        map.put("totalBytes", Integer.toString(this.f10752e));
        map.put("bufferedDuration", Long.toString(this.f10753f));
        map.put("totalDuration", Long.toString(this.f10754g));
        map.put("cacheReady", true != this.f10755h ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        map.put("playerCount", Integer.toString(this.i));
        map.put("playerPreparedCount", Integer.toString(this.f10756j));
        this.f10757k.n(map);
    }
}
