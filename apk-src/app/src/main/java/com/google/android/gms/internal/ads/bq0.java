package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f3854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f3855d;

    public bq0(JsonReader jsonReader) {
        JSONObject jSONObjectQ = com.google.android.gms.internal.measurement.b4.Q(jsonReader);
        this.f3855d = jSONObjectQ;
        this.f3852a = jSONObjectQ.optString("ad_html", null);
        this.f3853b = jSONObjectQ.optString("ad_base_url", null);
        this.f3854c = jSONObjectQ.optJSONObject("ad_json");
    }
}
