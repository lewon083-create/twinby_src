package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12981g;

    public ze0(String str, String str2, String str3, int i, String str4, int i10, boolean z5) {
        this.f12975a = str;
        this.f12976b = str2;
        this.f12977c = str3;
        this.f12978d = i;
        this.f12979e = str4;
        this.f12980f = i10;
        this.f12981g = z5;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f12975a);
        jSONObject.put("version", this.f12977c);
        wk wkVar = al.Ba;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f12976b);
        }
        jSONObject.put("status", this.f12978d);
        jSONObject.put("description", this.f12979e);
        jSONObject.put("initializationLatencyMillis", this.f12980f);
        if (((Boolean) sVar.f31970c.a(al.Ca)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f12981g);
        }
        return jSONObject;
    }
}
