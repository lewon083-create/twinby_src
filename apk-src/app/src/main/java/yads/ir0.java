package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg1 f39620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr0 f39621b;

    public ir0(Context context) {
        this(wg1.a(context, "FalseClickDataStorage"));
    }

    public final void a(long j10) {
        ((vg1) this.f39620a).d(String.valueOf(j10));
    }

    public /* synthetic */ ir0(tg1 tg1Var) {
        this(tg1Var, new gr0());
    }

    public final void a(fr0 fr0Var) throws JSONException {
        String string;
        String strValueOf = String.valueOf(fr0Var.f38536b);
        gr0 gr0Var = this.f39621b;
        gr0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdRevenueScheme.AD_TYPE, fr0Var.f38535a.f37950b);
        jSONObject.put("start_time", fr0Var.f38536b);
        jSONObject.put("type", fr0Var.f38537c.f38975b);
        jr0 jr0Var = gr0Var.f38857a;
        er0 er0Var = fr0Var.f38538d;
        jr0Var.getClass();
        String string2 = null;
        if (er0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", er0Var.f38248c);
            jSONObject2.put("url", er0Var.f38247b);
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(fr0Var.f38539e));
        d dVar = gr0Var.f38858b;
        c cVar = fr0Var.f38540f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("experiments", cVar.f37229a);
            jSONObject3.put("test_ids", cVar.f37230b);
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        ((vg1) this.f39620a).a(strValueOf, jSONObject.toString());
    }

    public ir0(tg1 tg1Var, gr0 gr0Var) {
        this.f39620a = tg1Var;
        this.f39621b = gr0Var;
    }
}
