package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l30 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7381b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sz f7382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7383d;

    public /* synthetic */ l30(sz szVar, JSONObject jSONObject) {
        this.f7382c = szVar;
        this.f7383d = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f7381b;
        JSONObject jSONObject = this.f7383d;
        sz szVar = this.f7382c;
        switch (i) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 31);
                sb2.append("Calling AFMA_updateActiveView(");
                sb2.append(string);
                sb2.append(")");
                u9.i.c(sb2.toString());
                szVar.a("AFMA_updateActiveView", jSONObject);
                break;
            default:
                r51 r51Var = fa0.J;
                szVar.h("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ l30(JSONObject jSONObject, sz szVar) {
        this.f7383d = jSONObject;
        this.f7382c = szVar;
    }
}
