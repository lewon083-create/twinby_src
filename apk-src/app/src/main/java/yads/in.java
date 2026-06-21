package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class in implements xb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f39583a;

    public in(hn hnVar) {
        this.f39583a = hnVar;
    }

    @Override // yads.xb3
    public final String a(String str, JSONObject jSONObject) throws b12 {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        this.f39583a.getClass();
        String strB = hn.b(strOptString);
        if (strB == null || strB.length() == 0) {
            throw new b12("Native Ad json has attribute with broken base64 encoding");
        }
        return strB;
    }
}
