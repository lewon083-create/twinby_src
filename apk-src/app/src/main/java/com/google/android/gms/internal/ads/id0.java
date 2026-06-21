package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class id0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f6465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f6468e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f6464a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f6469f = new AtomicBoolean(false);

    public id0(gx gxVar) {
        this.f6466c = gxVar;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f6467d = true;
            yw ywVarN = p9.k.C.f31302h.g().n();
            if (ywVarN != null && (jSONObject = ywVarN.f12772g) != null) {
                this.f6465b = ((Boolean) q9.s.f31967e.f31970c.a(al.N4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f6468e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f6464a;
                                if (concurrentHashMap.containsKey(strOptString2)) {
                                    map = (Map) concurrentHashMap.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(strOptString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
