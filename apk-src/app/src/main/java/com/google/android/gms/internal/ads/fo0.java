package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5406b;

    public fo0(String str, String str2) {
        this.f5405a = str;
        this.f5406b = str2;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject jSONObjectU = com.google.android.gms.internal.measurement.b4.U("pii", (JSONObject) obj);
            jSONObjectU.put("doritos", this.f5405a);
            jSONObjectU.put("doritos_v2", this.f5406b);
        } catch (JSONException unused) {
            t9.c0.m("Failed putting doritos string.");
        }
    }
}
