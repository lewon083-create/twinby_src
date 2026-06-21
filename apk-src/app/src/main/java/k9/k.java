package k9;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import q9.i3;
import q9.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la.m f27272b;

    public k(i3 i3Var) {
        this.f27271a = i3Var;
        x1 x1Var = i3Var.f31904d;
        this.f27272b = x1Var == null ? null : x1Var.c();
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        i3 i3Var = this.f27271a;
        jSONObject.put("Adapter", i3Var.f31902b);
        jSONObject.put("Latency", i3Var.f31903c);
        String str = i3Var.f31906f;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = i3Var.f31907g;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = i3Var.f31908h;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = i3Var.i;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = i3Var.f31905e;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        la.m mVar = this.f27272b;
        if (mVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", mVar.m());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
