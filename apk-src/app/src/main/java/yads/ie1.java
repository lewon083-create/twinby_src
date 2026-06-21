package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vk.c f39520a = i0.o.a(he1.f39142b);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (Integer) objS;
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        jj.e eVarB = kotlin.collections.r.b();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (strOptString != null && strOptString.length() != 0 && !"null".equals(strOptString)) {
                eVarB.add(strOptString);
            }
        }
        return kotlin.collections.r.a(eVarB);
    }

    public static vk.c a() {
        return f39520a;
    }

    public static final JSONObject a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = new JSONObject(str);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (JSONObject) objS;
    }

    public static Map a(JSONObject jSONObject) {
        jj.i builder = new jj.i();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null && strOptString.length() != 0 && !"null".equals(strOptString)) {
                builder.put(next, strOptString);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
