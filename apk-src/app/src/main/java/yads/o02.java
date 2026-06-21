package yads;

import android.content.Context;
import io.sentry.protocol.Response;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o02 extends zn {
    public final q43 A;
    public final oz1 B;
    public final n02 C;
    public final c02 D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c12 f41422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x02 f41423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h12 f41424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k12 f41425z;

    public o02(Context context, nu2 nu2Var, c12 c12Var, d4 d4Var, x02 x02Var, w5 w5Var, hk.a0 a0Var, h12 h12Var, k12 k12Var, q43 q43Var, oz1 oz1Var) {
        super(context, w5Var, d4Var, nu2Var, a0Var);
        this.f41422w = c12Var;
        this.f41423x = x02Var;
        this.f41424y = h12Var;
        this.f41425z = k12Var;
        this.A = q43Var;
        this.B = oz1Var;
        this.C = new n02(this);
        this.D = new c02(context, nu2Var, this, this);
        x02Var.a(k12Var);
    }

    @Override // yads.zn
    public final pn a(String str, String str2) {
        JSONObject jSONObjectA;
        c02 c02Var = this.D;
        c12 c12Var = this.f41422w;
        ap2 ap2Var = c12Var.f37249c;
        d4 d4Var = this.f45468c;
        g9 g9Var = c12Var.f37247a;
        c02Var.getClass();
        b02 b02Var = new b02(c02Var.f37236a, d4Var, ((lu3) c02Var.f37237b).a(), str, str2, c02Var.f37238c, c02Var.f37239d, new w02(ap2Var), new e12());
        String str3 = g9Var.f38683h;
        c02Var.f37241f.getClass();
        String strOptString = (str3 == null || (jSONObjectA = ie1.a(str3)) == null || !jSONObjectA.has(Response.TYPE)) ? null : jSONObjectA.optString(Response.TYPE);
        String str4 = g9Var.i;
        if (strOptString == null) {
            strOptString = str4;
        }
        if (strOptString == null) {
            return b02Var;
        }
        jm2 jm2Var = c02Var.f37240e;
        jm2Var.getClass();
        synchronized (jm2.f39915c) {
            jm2Var.f39917a.put(b02Var, strOptString);
            Unit unit = Unit.f27471a;
        }
        return b02Var;
    }

    @Override // yads.zn
    public final l4 o() {
        return (l4) CollectionsKt.firstOrNull(this.f45474j.a());
    }

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f41423x.a(l4Var);
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        z22 wv2Var;
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.f45467b.a(v5.f43887s);
            this.f45485v = v9Var;
        }
        this.f41425z.f40046d = v9Var;
        if (this.f45482r == z5.f45250b) {
            return;
        }
        h12 h12Var = this.f41424y;
        h12Var.getClass();
        jq1 jq1Var = v9Var.f43945q;
        if (jq1Var != null) {
            wv2Var = new rp1(v9Var, jq1Var);
        } else {
            wv2Var = new wv2(h12Var.f38977a, h12Var.f38978b);
        }
        y22 y22VarA = wv2Var.a(this);
        Context contextA = j1.a();
        if (contextA == null) {
            contextA = this.f45466a;
        }
        y22VarA.a(contextA, v9Var);
    }
}
