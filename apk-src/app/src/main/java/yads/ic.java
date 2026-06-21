package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f39491a;

    public ic(ct1 ct1Var) {
        this.f39491a = ct1Var;
    }

    public static jk a(JSONObject jSONObject) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("attributes"));
            objS = new jk(jSONObject2.getString("campaignId"), jSONObject2.getString("bannerId"), jSONObject2.getString("placeId"));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (jk) objS;
    }
}
