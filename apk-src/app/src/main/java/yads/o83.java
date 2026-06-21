package yads;

import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o83 {
    public static List a(JSONArray jSONArray) {
        Object objS;
        jj.e eVarB = kotlin.collections.r.b();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                ij.k kVar = ij.m.f21341c;
                objS = jSONArray.getString(i);
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = com.google.android.gms.internal.measurement.h5.s(th2);
            }
            if (!(objS instanceof ij.l)) {
                eVarB.add((String) objS);
            }
        }
        return kotlin.collections.r.a(eVarB);
    }
}
