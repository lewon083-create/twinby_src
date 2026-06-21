package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f7575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7576b;

    public lm0(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f7575a = jSONObject;
        this.f7576b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        JSONObject jSONObject = this.f7575a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f7576b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        w50 w50Var = (w50) obj;
        JSONObject jSONObject = this.f7576b;
        if (jSONObject != null) {
            w50Var.f11647b.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
