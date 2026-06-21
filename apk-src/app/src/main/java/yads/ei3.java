package yads;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ei3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn f38139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb3 f38140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe3 f38141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd3 f38142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qj3 f38143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n41 f38144f;

    public /* synthetic */ ei3(Context context, ko2 ko2Var, kn knVar) {
        this(knVar, yb3.a(knVar.a()), new qe3(context, new r62()), new hd3(context, ko2Var), new qj3(), new n41());
    }

    public final Object a(JSONObject jSONObject) throws b12 {
        cc3 cc3VarA;
        pj3 pj3Var;
        Object objS;
        try {
            cc3VarA = this.f38142d.a(this.f38140b.a("vast", jSONObject), this.f38139a);
        } catch (Exception unused) {
            cc3VarA = null;
        }
        if (cc3VarA == null || cc3VarA.f37336b.isEmpty()) {
            throw new b12("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.f38143e.getClass();
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("volumeControlVisible", true);
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("isProgressBarHidden", false);
            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("alternativeFormatFallback", false);
            try {
                ij.k kVar = ij.m.f21341c;
                objS = Double.valueOf(jSONObjectOptJSONObject.getDouble("initialVolume"));
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = com.google.android.gms.internal.measurement.h5.s(th2);
            }
            if (objS instanceof ij.l) {
                objS = null;
            }
            pj3Var = new pj3(zOptBoolean, zOptBoolean2, zOptBoolean3, (Double) objS);
        } else {
            pj3Var = null;
        }
        ArrayList arrayListA = this.f38141c.a(cc3VarA.f37336b, pj3Var);
        if (arrayListA.isEmpty()) {
            throw new b12("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("preview");
        return new vd3(arrayListA, pj3Var, jSONObjectOptJSONObject2 != null ? this.f38144f.a(jSONObjectOptJSONObject2) : null);
    }

    public ei3(kn knVar, xb3 xb3Var, qe3 qe3Var, hd3 hd3Var, qj3 qj3Var, n41 n41Var) {
        this.f38139a = knVar;
        this.f38140b = xb3Var;
        this.f38141c = qe3Var;
        this.f38142d = hd3Var;
        this.f38143e = qj3Var;
        this.f38144f = n41Var;
    }
}
