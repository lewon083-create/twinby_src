package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ju0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va3 f39984a;

    public ju0(va3 va3Var) {
        this.f39984a = va3Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, b12 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String strOptString2 = jSONObject2.optString("title");
            if (strOptString2 == null || strOptString2.length() == 0 || strOptString2.equals("null")) {
                throw new b12("Native Ad json has not required attributes");
            }
            this.f39984a.getClass();
            arrayList.add(new gu0(strOptString2, va3.a("url", jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new b12("Native Ad json has not required attributes");
        }
        return new hu0(strOptString, arrayList);
    }
}
