package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public static String a(D d10) throws JSONException {
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", d10.f21936a);
        jSONObject.put("url", d10.f21938c);
        jSONObject.put("responseCode", d10.f21940e);
        byte[] bArr = d10.f21941f;
        try {
            strEncodeToString = new String(bArr, Charsets.UTF_8);
        } catch (Throwable unused) {
            strEncodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", strEncodeToString);
        Map map = d10.f21942g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
