package he;

import com.google.android.gms.internal.ads.dz1;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f20494h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f20496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f20497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f20498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f20499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f20501g;

    public d(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f20496b = jSONObject;
        this.f20497c = date;
        this.f20498d = jSONArray;
        this.f20499e = jSONObject2;
        this.f20500f = j10;
        this.f20501g = jSONArray2;
        this.f20495a = jSONObject3;
    }

    public static d a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new d(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static dz1 c() {
        dz1 dz1Var = new dz1();
        dz1Var.f4768b = new JSONObject();
        dz1Var.f4769c = f20494h;
        dz1Var.f4770d = new JSONArray();
        dz1Var.f4771e = new JSONObject();
        dz1Var.f4767a = 0L;
        dz1Var.f4772f = new JSONArray();
        return dz1Var;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f20501g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string3 = jSONArray2.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f20495a.toString().equals(((d) obj).f20495a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20495a.hashCode();
    }

    public final String toString() {
        return this.f20495a.toString();
    }
}
