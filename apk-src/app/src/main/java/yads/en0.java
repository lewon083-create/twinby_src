package yads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class en0 {
    public static Set a(JSONArray jSONArray) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            jj.n nVar = new jj.n();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                nVar.add(new cn0(dn0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            objS = kotlin.collections.o0.a(nVar);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            Objects.toString(jSONArray);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (Set) objS;
    }

    public static String a(Set set) throws JSONException {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cn0 cn0Var = (cn0) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", cn0Var.f37441a.name());
            jSONObject.put("value", cn0Var.f37442b);
            jSONArray = jSONArray.put(jSONObject);
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }

    public static Set a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = a(new JSONArray(str));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (Set) objS;
    }
}
