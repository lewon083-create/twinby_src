package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7256b;

    public /* synthetic */ kl0(String str, int i) {
        this.f7255a = i;
        this.f7256b = str;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f7255a) {
            case 0:
                w50 w50Var = (w50) obj;
                String str = this.f7256b;
                if (str != null) {
                    w50Var.f11646a.putString("arek", str);
                }
                break;
            case 1:
                ((w50) obj).f11646a.putString("ms", this.f7256b);
                break;
            case 2:
                ix.a0("key_schema", this.f7256b, ((w50) obj).f11646a);
                break;
            case 3:
                ix.a0("omid_v", this.f7256b, ((w50) obj).f11646a);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f7256b);
                } catch (JSONException e3) {
                    t9.c0.n("Failed putting Ad ID.", e3);
                    return;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    String str2 = this.f7256b;
                    if (!TextUtils.isEmpty(str2)) {
                        com.google.android.gms.internal.measurement.b4.U("pii", jSONObject).put("adsid", str2);
                    }
                } catch (JSONException e7) {
                    u9.i.i("Failed putting trustless token.", e7);
                }
                break;
        }
    }
}
