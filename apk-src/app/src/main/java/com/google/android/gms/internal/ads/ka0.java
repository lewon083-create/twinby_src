package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ka0 extends la0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f7165h;

    public ka0(xp0 xp0Var, JSONObject jSONObject) {
        super(xp0Var);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject jSONObjectY = com.google.android.gms.internal.measurement.b4.Y(jSONObject, strArr);
        this.f7159b = jSONObjectY == null ? null : jSONObjectY.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject jSONObjectY2 = com.google.android.gms.internal.measurement.b4.Y(jSONObject, strArr2);
        this.f7160c = jSONObjectY2 == null ? false : jSONObjectY2.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject jSONObjectY3 = com.google.android.gms.internal.measurement.b4.Y(jSONObject, strArr3);
        this.f7161d = jSONObjectY3 == null ? false : jSONObjectY3.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject jSONObjectY4 = com.google.android.gms.internal.measurement.b4.Y(jSONObject, strArr4);
        this.f7162e = jSONObjectY4 == null ? false : jSONObjectY4.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject jSONObjectY5 = com.google.android.gms.internal.measurement.b4.Y(jSONObject, strArr5);
        this.f7164g = jSONObjectY5 != null ? jSONObjectY5.optString(strArr5[0], "") : "";
        this.f7163f = jSONObject.optJSONObject("overlay") != null;
        this.f7165h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final boolean a() {
        return this.f7163f;
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final boolean b() {
        return this.f7160c;
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final boolean c() {
        return this.f7162e;
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final boolean d() {
        return this.f7161d;
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final String e() {
        return this.f7164g;
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final kx0 f() {
        JSONObject jSONObject = this.f7165h;
        return jSONObject != null ? new kx0(27, jSONObject) : this.f7468a.V;
    }
}
