package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l92 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq2 f40456a;

    public l92(nq2 nq2Var) {
        this.f40456a = nq2Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws b12 {
        String strOptString = jSONObject.optString("name");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("value");
        if (strOptString2 == null || strOptString2.length() == 0 || strOptString2.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        return "review_count".equals(strOptString) ? this.f40456a.a(strOptString2) : strOptString2;
    }
}
