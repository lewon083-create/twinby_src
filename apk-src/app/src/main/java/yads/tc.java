package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tc implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va3 f43263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p83 f43264b;

    public tc(va3 va3Var, p83 p83Var) {
        this.f43263a = va3Var;
        this.f43264b = p83Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, b12 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        this.f43263a.getClass();
        String strA = va3.a("url", jSONObject);
        String strA2 = je1.a("optOutUrl", jSONObject);
        if (strA2 == null) {
            strA2 = "";
        }
        this.f43264b.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return new rc(strOptString, strA, strA2, arrayList);
    }
}
