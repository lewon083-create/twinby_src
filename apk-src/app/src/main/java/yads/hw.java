package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hw implements bj {
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws b12 {
        if (jSONObject.has("value") && jSONObject.isNull("value")) {
            return new gw(fw.f38563c, null);
        }
        fw fwVar = fw.f38562b;
        String strOptString = jSONObject.optString("value");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        return new gw(fwVar, strOptString);
    }
}
