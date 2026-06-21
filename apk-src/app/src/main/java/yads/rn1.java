package yads;

import io.sentry.protocol.DebugMeta;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rn1 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f42638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei3 f42639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n41 f42640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c51 f42641d;

    public rn1(pm1 pm1Var, ei3 ei3Var, n41 n41Var, c51 c51Var) {
        this.f42638a = pm1Var;
        this.f42639b = ei3Var;
        this.f42640c = n41Var;
        this.f42641d = c51Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, b12 {
        ArrayList arrayListG;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new b12("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        qj1 qj1Var = (qj1) ((!jSONObject2.has("media") || jSONObject2.isNull("media")) ? null : this.f42638a.a(jSONObject2.getJSONObject("media")));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(DebugMeta.JsonKeys.IMAGES);
        if (jSONArrayOptJSONArray != null) {
            c51 c51Var = this.f42641d;
            c51Var.getClass();
            arrayListG = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayListG.add(c51Var.f37296a.a(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        } else {
            arrayListG = null;
        }
        w41 w41VarA = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.f42640c.a(jSONObject2.getJSONObject("image"));
        if ((arrayListG == null || arrayListG.isEmpty()) && w41VarA != null) {
            arrayListG = kotlin.collections.s.g(w41VarA);
        }
        vd3 vd3Var = (vd3) ((!jSONObject2.has(RRWebVideoEvent.EVENT_TAG) || jSONObject2.isNull(RRWebVideoEvent.EVENT_TAG)) ? null : this.f42639b.a(jSONObject2.getJSONObject(RRWebVideoEvent.EVENT_TAG)));
        if (qj1Var == null && ((arrayListG == null || arrayListG.isEmpty()) && vd3Var == null)) {
            throw new b12("Native Ad json has not required attributes");
        }
        return new qn1(qj1Var, vd3Var, arrayListG != null ? CollectionsKt.T(arrayListG) : null);
    }
}
