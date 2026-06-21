package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va3 f41168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s13 f41169b;

    public /* synthetic */ n41() {
        this(new va3(), new s13());
    }

    public final w41 a(JSONObject jSONObject) throws JSONException, b12 {
        int i = jSONObject.getInt("w");
        int i10 = jSONObject.getInt("h");
        this.f41168a.getClass();
        String strA = va3.a("url", jSONObject);
        r13 r13VarA = jSONObject.has("smartCenterSettings") ? this.f41169b.a(jSONObject.getJSONObject("smartCenterSettings")) : null;
        String strOptString = jSONObject.optString("sizeType");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("preload", true);
        String strOptString2 = jSONObject.optString("preview");
        return new w41(i, i10, strA, strOptString, r13VarA, zOptBoolean, strOptString2.length() > 0 ? strOptString2 : null);
    }

    public n41(va3 va3Var, s13 s13Var) {
        this.f41168a = va3Var;
        this.f41169b = s13Var;
    }
}
