package yads;

import io.sentry.rrweb.RRWebVideoEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kv implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va3 f40347a;

    public kv(va3 va3Var) {
        this.f40347a = va3Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, b12 {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            throw new b12("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", RRWebVideoEvent.JsonKeys.SIZE};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                throw new b12("Native Ad json has not required attributes");
            }
        }
        this.f40347a.getClass();
        return new jv(jSONObject2.optInt(RRWebVideoEvent.JsonKeys.SIZE), va3.a("url", jSONObject2));
    }
}
