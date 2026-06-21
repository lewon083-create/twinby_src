package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb3 f41959a;

    public pm1(xb3 xb3Var) {
        this.f41959a = xb3Var;
    }

    public final Object a(JSONObject jSONObject) {
        String strA = this.f41959a.a("html", jSONObject);
        float f10 = (float) jSONObject.getDouble("aspectRatio");
        if (f10 == 0.0f) {
            f10 = 1.7777778f;
        }
        return new qj1(strA, f10);
    }
}
