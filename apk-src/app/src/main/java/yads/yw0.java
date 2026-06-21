package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yw0 {
    public static ww0 a(JSONObject jSONObject) {
        Object objS;
        vk.p pVarA = i0.o.a(xw0.f44820b);
        try {
            ij.k kVar = ij.m.f21341c;
            objS = (ww0) pVarA.a(jSONObject.toString(), ww0.Companion.serializer());
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (ww0) objS;
    }
}
