package yads;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class za0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va3 f45302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg2 f45303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o83 f45304c;

    public za0(va3 va3Var, xg2 xg2Var, o83 o83Var) {
        this.f45302a = va3Var;
        this.f45303b = xg2Var;
        this.f45304c = o83Var;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, b12 {
        List listA;
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        this.f45302a.getClass();
        String strA = va3.a("fallbackUrl", jSONObject);
        this.f45304c.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fallbackTrackingUrls");
        JSONArray jSONArray = null;
        List listA2 = jSONArrayOptJSONArray == null ? null : o83.a(jSONArrayOptJSONArray);
        if (jSONObject.has("preferredPackages")) {
            jSONArray = jSONObject.getJSONArray("preferredPackages");
        } else if (jSONObject.has("preferredLinks")) {
            jSONArray = jSONObject.getJSONArray("preferredLinks");
        }
        xg2 xg2Var = this.f45303b;
        xg2Var.getClass();
        if (jSONArray == null) {
            listA = kotlin.collections.b0.f27475b;
        } else {
            jj.e eVarB = kotlin.collections.r.b();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    eVarB.add(xg2Var.f44689a.a(jSONObjectOptJSONObject));
                }
            }
            listA = kotlin.collections.r.a(eVarB);
        }
        return new wa0(strOptString, strA, listA2, listA);
    }
}
