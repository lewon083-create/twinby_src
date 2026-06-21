package io.appmetrica.analytics.impl;

import com.google.android.gms.internal.ads.om1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22928g;

    public Rk(JSONObject jSONObject) {
        this.f22922a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f22923b = jSONObject.optString("kitBuildNumber", "");
        this.f22924c = jSONObject.optString("appVer", "");
        this.f22925d = jSONObject.optString("appBuild", "");
        this.f22926e = jSONObject.optString("osVer", "");
        this.f22927f = jSONObject.optInt("osApiLev", -1);
        this.f22928g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionRequestParams(kitVersionName='");
        sb2.append(this.f22922a);
        sb2.append("', kitBuildNumber='");
        sb2.append(this.f22923b);
        sb2.append("', appVersion='");
        sb2.append(this.f22924c);
        sb2.append("', appBuild='");
        sb2.append(this.f22925d);
        sb2.append("', osVersion='");
        sb2.append(this.f22926e);
        sb2.append("', apiLevel=");
        sb2.append(this.f22927f);
        sb2.append(", attributionId=");
        return om1.l(sb2, this.f22928g, ')');
    }
}
