package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jq implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qq f6930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq f6931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rq f6932e;

    public jq(rq rqVar, long j10, qq qqVar, hq hqVar) {
        this.f6929b = j10;
        this.f6930c = qqVar;
        this.f6931d = hqVar;
        this.f6932e = rqVar;
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        p9.k.C.f31304k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f6929b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb2.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms.");
        t9.c0.m(sb2.toString());
        t9.c0.m("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        rq rqVar = this.f6932e;
        synchronized (rqVar.f10020b) {
            t9.c0.m("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            qq qqVar = this.f6930c;
            if (((AtomicInteger) qqVar.f2254c).get() != -1 && ((AtomicInteger) qqVar.f2254c).get() != 1) {
                rqVar.f10019a = 0;
                hq hqVar = this.f6931d;
                hqVar.j("/log", uo.f11013c);
                hqVar.j("/result", uo.f11019j);
                ((jx) qqVar.f2253b).b(hqVar);
                rqVar.f10025g = qqVar;
                t9.c0.m("Successfully loaded JS Engine.");
                t9.c0.m("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            t9.c0.m("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
