package yads;

import java.util.LinkedHashSet;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString("experiments"), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object objS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                ij.k kVar = ij.m.f21341c;
                objS = Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i))));
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = com.google.android.gms.internal.measurement.h5.s(th2);
            }
            if (ij.m.a(objS) != null) {
                new Pair(jSONArray.get(i), kotlin.jvm.internal.s.f27521a).toString();
            }
        }
        return linkedHashSet;
    }
}
