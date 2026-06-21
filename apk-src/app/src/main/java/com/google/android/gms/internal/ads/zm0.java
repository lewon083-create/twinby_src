package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13043b;

    public /* synthetic */ zm0(HashMap map, int i) {
        this.f13042a = i;
        this.f13043b = map;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        switch (this.f13042a) {
            case 0:
                w50 w50Var = (w50) obj;
                HashMap map = this.f13043b;
                if (!map.isEmpty()) {
                    Bundle bundle = w50Var.f11646a;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : map.entrySet()) {
                        ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                        if (!arrayDeque.isEmpty()) {
                            ce0 ce0Var = (ce0) entry.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", ce0Var.f4190a);
                                jSONObject.put("event_type", ce0Var.f4191b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                    break;
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException e3) {
                                t9.c0.n("Failed putting the on-device storage record.", e3);
                            }
                        }
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("on_device_storage_records", jSONArray.toString());
                    }
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", q9.r.f31959g.f31960a.k(this.f13043b));
                } catch (JSONException e7) {
                    t9.c0.m("Could not encode video decoder properties: ".concat(String.valueOf(e7.getMessage())));
                }
                break;
        }
    }
}
