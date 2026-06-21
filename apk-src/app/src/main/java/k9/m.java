package k9;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends la.m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f27274j;

    public m(int i, String str, String str2, la.m mVar, r rVar) {
        super(i, str, str2, mVar, 4);
        this.f27274j = rVar;
    }

    @Override // la.m
    public final JSONObject m() throws JSONException {
        JSONObject jSONObjectM = super.m();
        r rVar = this.f27274j;
        if (rVar == null) {
            jSONObjectM.put("Response Info", "null");
            return jSONObjectM;
        }
        jSONObjectM.put("Response Info", rVar.b());
        return jSONObjectM;
    }

    @Override // la.m
    public final String toString() {
        try {
            return m().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
