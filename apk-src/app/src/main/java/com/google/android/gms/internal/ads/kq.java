package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kq implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7285b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7288e;

    public kq(rq rqVar, hq hqVar, k6.t0 t0Var) {
        this.f7286c = hqVar;
        this.f7287d = t0Var;
        this.f7288e = rqVar;
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f7285b) {
            case 0:
                t9.c0.m("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                rq rqVar = (rq) this.f7288e;
                synchronized (rqVar.f10020b) {
                    try {
                        t9.c0.m("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        u9.i.g("JS Engine is requesting an update");
                        if (rqVar.f10019a == 0) {
                            u9.i.g("Starting reload.");
                            rqVar.f10019a = 2;
                            rqVar.m();
                        }
                        ((hq) this.f7286c).i("/requestReload", (kq) ((k6.t0) this.f7287d).f27180c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                t9.c0.m("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((un) this.f7286c).Q1((qn) ((js1) this.f7288e).j(), str);
                    return;
                } catch (RemoteException e3) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
                    sb2.append("Failed to call onCustomClick for asset ");
                    sb2.append(str);
                    sb2.append(".");
                    u9.i.i(sb2.toString(), e3);
                    return;
                }
        }
    }

    public kq(na0 na0Var, ja0 ja0Var, kc0 kc0Var, js1 js1Var) {
        this.f7286c = (un) na0Var.f8257g.get(ja0Var.g());
        this.f7287d = kc0Var;
        this.f7288e = js1Var;
    }
}
