package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ry implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy f10095f;

    public ry(yy yyVar, String str, String str2, int i, int i10) {
        this.f10091b = str;
        this.f10092c = str2;
        this.f10093d = i;
        this.f10094e = i10;
        this.f10095f = yyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f10091b);
        map.put("cachedSrc", this.f10092c);
        map.put("bytesLoaded", Integer.toString(this.f10093d));
        map.put("totalBytes", Integer.toString(this.f10094e));
        map.put("cacheReady", CommonUrlParts.Values.FALSE_INTEGER);
        this.f10095f.n(map);
    }
}
