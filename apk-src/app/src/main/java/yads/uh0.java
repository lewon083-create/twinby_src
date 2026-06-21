package yads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uh0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg0 f43662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mi0 f43663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p83 f43664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43665d;

    public uh0(dg0 dg0Var, mi0 mi0Var, p83 p83Var, boolean z5) {
        this.f43662a = dg0Var;
        this.f43663b = mi0Var;
        this.f43664c = p83Var;
        this.f43665d = z5;
    }

    @Override // yads.q0
    public final m0 a(JSONObject jSONObject) throws JSONException, b12 {
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        this.f43664c.getClass();
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("design");
        xf0 xf0VarA = jSONObjectOptJSONObject != null ? this.f43662a.a(jSONObjectOptJSONObject) : null;
        hi0 hi0VarA = xf0VarA != null ? this.f43663b.a(xf0VarA, this.f43665d) : null;
        if (hi0VarA != null) {
            return new sh0(strOptString, hi0VarA, arrayList);
        }
        throw new b12("Native Ad json has not required attributes");
    }
}
