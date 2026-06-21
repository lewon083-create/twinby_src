package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rq f7996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq f7997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq f7998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8000g;

    public /* synthetic */ mq(rq rqVar, qq qqVar, hq hqVar, ArrayList arrayList, long j10, int i) {
        this.f7995b = i;
        this.f7997d = qqVar;
        this.f7998e = hqVar;
        this.f7999f = arrayList;
        this.f8000g = j10;
        this.f7996c = rqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.f7995b) {
            case 0:
                t9.c0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                rq rqVar = this.f7996c;
                synchronized (rqVar.f10020b) {
                    try {
                        t9.c0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        qq qqVar = this.f7997d;
                        if (((AtomicInteger) qqVar.f2254c).get() != -1 && ((AtomicInteger) qqVar.f2254c).get() != 1) {
                            wk wkVar = al.B8;
                            q9.s sVar = q9.s.f31967e;
                            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                                qqVar.g("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                qqVar.f();
                            }
                            hx.f6284f.execute(new lq(this.f7998e, 0));
                            String strValueOf = String.valueOf(sVar.f31970c.a(al.f2979e));
                            int i = ((AtomicInteger) qqVar.f2254c).get();
                            int i10 = rqVar.f10019a;
                            ArrayList arrayList = this.f7999f;
                            if (arrayList.isEmpty()) {
                                string = ". Still waiting for the engine to be loaded";
                            } else {
                                String strValueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(strValueOf2);
                                string = sb2.toString();
                            }
                            p9.k.C.f31304k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.f8000g;
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i10).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(strValueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i10);
                            sb3.append(string);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(jCurrentTimeMillis);
                            sb3.append(" ms at timeout. Rejecting.");
                            t9.c0.m(sb3.toString());
                            t9.c0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        t9.c0.m("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                rq rqVar2 = this.f7996c;
                qq qqVar2 = this.f7997d;
                hq hqVar = this.f7998e;
                ArrayList arrayList2 = this.f7999f;
                long j10 = this.f8000g;
                t9.c0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (rqVar2.f10020b) {
                    try {
                        t9.c0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) qqVar2.f2254c).get() != -1 && ((AtomicInteger) qqVar2.f2254c).get() != 1) {
                            wk wkVar2 = al.B8;
                            q9.s sVar2 = q9.s.f31967e;
                            if (((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue()) {
                                qqVar2.g("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                qqVar2.f();
                            }
                            hx.f6284f.execute(new lq(hqVar, 1));
                            String strValueOf3 = String.valueOf(sVar2.f31970c.a(al.f2962d));
                            int i11 = ((AtomicInteger) qqVar2.f2254c).get();
                            int i12 = rqVar2.f10019a;
                            String strValueOf4 = String.valueOf(arrayList2.get(0));
                            p9.k.C.f31304k.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
                            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 94 + String.valueOf(i11).length() + 39 + String.valueOf(i12).length() + 57 + strValueOf4.length() + 42 + String.valueOf(jCurrentTimeMillis2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(strValueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i11);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i12);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(strValueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(jCurrentTimeMillis2);
                            sb4.append(" ms. Rejecting.");
                            t9.c0.m(sb4.toString());
                            t9.c0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        t9.c0.m("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
