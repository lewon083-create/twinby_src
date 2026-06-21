package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z41 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n41 f45248a;

    public /* synthetic */ z41() {
        this(new n41());
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, b12 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new b12("Native Ad json has not required attributes");
        }
        return this.f45248a.a(jSONObject.getJSONObject("value"));
    }

    public z41(n41 n41Var) {
        this.f45248a = n41Var;
    }
}
