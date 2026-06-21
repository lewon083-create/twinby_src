package yads;

import android.content.Context;
import io.sentry.protocol.Feedback;
import io.sentry.rrweb.RRWebVideoEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f36725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lf1 f36726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f36727c;

    public aj(Context context, ko2 ko2Var, lf1 lf1Var) {
        this.f36725a = ko2Var;
        this.f36726b = lf1Var;
        this.f36727c = context.getApplicationContext();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final oi a(JSONObject jSONObject, kn knVar) throws b12 {
        bj l92Var;
        if (!d42.a(jSONObject, "name", "type", "clickable", "required")) {
            throw new b12("Native Ad json has not required attributes");
        }
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("name");
        if (strOptString2 == null || strOptString2.length() == 0 || strOptString2.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("link");
        kf1 kf1VarA = jSONObjectOptJSONObject == null ? null : this.f36726b.a(jSONObjectOptJSONObject, knVar);
        Context context = this.f36727c;
        ko2 ko2Var = this.f36725a;
        if (strOptString2.equals("close_button")) {
            l92Var = new hw();
        } else {
            if (!strOptString2.equals(Feedback.TYPE)) {
                switch (strOptString.hashCode()) {
                    case -1034364087:
                        if (strOptString.equals("number")) {
                            l92Var = new l92(new nq2());
                        }
                        break;
                    case -951532658:
                        if (strOptString.equals("qrcode")) {
                            l92Var = new kv(new va3());
                        }
                        break;
                    case -891985903:
                        if (strOptString.equals("string")) {
                            l92Var = new m43();
                        }
                        break;
                    case -410956671:
                        if (strOptString.equals(RRWebVideoEvent.JsonKeys.CONTAINER)) {
                            l92Var = new zl0();
                        }
                        break;
                    case 100313435:
                        if (strOptString.equals("image")) {
                            l92Var = new z41();
                        }
                        break;
                    case 103772132:
                        if (strOptString.equals("media")) {
                            l92Var = new rn1(new pm1(yb3.a(knVar.f40277a)), new ei3(context, ko2Var, knVar), new n41(), new c51());
                        }
                        break;
                }
                throw new b12("Native Ad json has not required attributes");
            }
            l92Var = new tu0(new z41());
        }
        return new oi(strOptString2, strOptString, l92Var.a(jSONObject), kf1VarA, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }
}
