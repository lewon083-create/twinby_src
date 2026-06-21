package yads;

import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s33 {
    public static Map a(JSONObject jSONObject) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = ie1.a(jSONObject);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            Objects.toString(jSONObject);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (Map) objS;
    }

    public static String a(Map map) {
        Object objS;
        vk.l qVar;
        try {
            ij.k kVar = ij.m.f21341c;
            vk.x xVar = new vk.x();
            for (Map.Entry entry : map.entrySet()) {
                String key = (String) entry.getKey();
                String str = (String) entry.getValue();
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                uk.a0 a0Var = vk.m.f34887a;
                if (str == null) {
                    qVar = vk.t.INSTANCE;
                } else {
                    qVar = new vk.q(str, true);
                }
                xVar.a(key, qVar);
            }
            objS = new vk.w(xVar.f34898a).toString();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        ij.k kVar3 = ij.m.f21341c;
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (String) objS;
    }

    public static Map a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = a(new JSONObject(str));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (Map) objS;
    }
}
