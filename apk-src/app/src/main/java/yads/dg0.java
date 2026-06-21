package yads;

import io.sentry.protocol.DebugMeta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c51 f37759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f37760b;

    public /* synthetic */ dg0() {
        this(new c51(), new bf());
    }

    public final xf0 a(JSONObject jSONObject) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("target");
        String strOptString3 = jSONObject.optString("layout");
        if (strOptString == null || strOptString.length() == 0 || strOptString2 == null || strOptString2.length() == 0 || strOptString3 == null || strOptString3.length() == 0) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        if (jSONArrayOptJSONArray != null) {
            c51 c51Var = this.f37759a;
            c51Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(c51Var.f37296a.a(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("analyticsParameters");
        if (jSONObjectOptJSONObject != null) {
            this.f37760b.getClass();
            ek.a aVarA = ek.q.a(jSONObjectOptJSONObject.keys());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : aVarA) {
                linkedHashMap2.put(obj, jSONObjectOptJSONObject.get((String) obj));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        return new xf0(strOptString, strOptString2, strOptString3, arrayList, linkedHashMap);
    }

    public dg0(c51 c51Var, bf bfVar) {
        this.f37759a = c51Var;
        this.f37760b = bfVar;
    }
}
