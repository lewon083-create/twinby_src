package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tu0 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z41 f43438a;

    public tu0(z41 z41Var) {
        this.f43438a = z41Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, b12 {
        w41 w41VarA;
        if (!jSONObject.has("value")) {
            throw new b12("Native Ad json has not required attributes");
        }
        if (jSONObject.isNull("value")) {
            w41VarA = null;
        } else {
            z41 z41Var = this.f43438a;
            z41Var.getClass();
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                throw new b12("Native Ad json has not required attributes");
            }
            w41VarA = z41Var.f45248a.a(jSONObject.getJSONObject("value"));
        }
        return new ru0(w41VarA);
    }
}
