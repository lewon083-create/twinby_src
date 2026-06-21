package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ao0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f3338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx0 f3340c;

    public ao0(AdvertisingIdClient.Info info, String str, jx0 jx0Var) {
        this.f3338a = info;
        this.f3339b = str;
        this.f3340c = jx0Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        try {
            JSONObject jSONObjectU = com.google.android.gms.internal.measurement.b4.U("pii", (JSONObject) obj);
            AdvertisingIdClient.Info info = this.f3338a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f3339b;
                if (str != null) {
                    jSONObjectU.put("pdid", str);
                    jSONObjectU.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectU.put("rdid", info.getId());
            jSONObjectU.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectU.put("idtype", "adid");
            jx0 jx0Var = this.f3340c;
            long j10 = jx0Var.f6963b;
            String str2 = jx0Var.f6962a;
            if (str2 != null && j10 > 0) {
                jSONObjectU.put("paidv1_id_android_3p", str2);
                jSONObjectU.put("paidv1_creation_time_android_3p", j10);
            }
        } catch (JSONException e3) {
            t9.c0.n("Failed putting Ad ID.", e3);
        }
    }
}
