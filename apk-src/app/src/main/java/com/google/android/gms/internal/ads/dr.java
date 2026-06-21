package com.google.android.gms.internal.ads;

import io.sentry.ProfilingTraceData;
import io.sentry.SentryLockReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4633c;

    public dr(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f4631a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        fp fpVar = p9.k.C.f31315v;
        fp.f("clickurl", jSONObject);
        fp.f("imp_urls", jSONObject);
        fp.f("downloaded_imp_urls", jSONObject);
        fp.f("fill_urls", jSONObject);
        fp.f("video_start_urls", jSONObject);
        fp.f("video_complete_urls", jSONObject);
        fp.f("video_reward_urls", jSONObject);
        jSONObject.optString(ProfilingTraceData.JsonKeys.TRANSACTION_ID);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            fp.f("manual_impression_urls", jSONObjectOptJSONObject);
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f4632b = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString(SentryLockReason.JsonKeys.CLASS_NAME);
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        fp.f("template_ids", jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f4633c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
