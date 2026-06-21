package yads;

import android.content.Context;
import io.sentry.protocol.Feedback;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f40524a;

    public /* synthetic */ lf1(Context context, ko2 ko2Var) {
        this(new r0(context.getApplicationContext(), ko2Var));
    }

    public static String a(String str, JSONObject jSONObject) throws b12 {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || strOptString.equals("null")) {
            throw new b12("Native Ad json has not required attributes");
        }
        return strOptString;
    }

    public lf1(r0 r0Var) {
        this.f40524a = r0Var;
    }

    public final kf1 a(JSONObject jSONObject, kn knVar) {
        ArrayList arrayList;
        jj.e eVarA;
        Object objS;
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                r0 r0Var = this.f40524a;
                r0Var.getClass();
                String strOptString = jSONObject2.optString("type");
                if (strOptString != null && strOptString.length() != 0 && !strOptString.equals("null")) {
                    Map mapG = r0Var.f42434f;
                    if (mapG == null) {
                        Pair pair = new Pair("adtune", new tc(r0Var.f42430b, r0Var.f42431c));
                        Pair pair2 = new Pair("divkit_adtune", new uh0(r0Var.f42432d, r0Var.f42433e, r0Var.f42431c, knVar.f40278b));
                        Pair pair3 = new Pair("close", new bw());
                        Context context = r0Var.f42429a;
                        va3 va3Var = r0Var.f42430b;
                        jSONArray = jSONArrayOptJSONArray;
                        mapG = kotlin.collections.j0.g(pair, pair2, pair3, new Pair("deeplink", new za0(va3Var, new xg2(context, va3Var), new o83())), new Pair(Feedback.TYPE, new ju0(r0Var.f42430b)));
                        r0Var.f42434f = mapG;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                    }
                    q0 q0Var = (q0) mapG.get(strOptString);
                    if (q0Var != null) {
                        arrayList2.add(q0Var.a(jSONObject2));
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArray;
                } else {
                    throw new b12("Native Ad json has not required attributes");
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strA = a("falseClickUrl", jSONObject);
        er0 er0Var = strA != null ? new er0(strA, jSONObject.optLong("falseClickInterval", 0L)) : null;
        jj.n nVar = new jj.n();
        String strA2 = a("trackingUrl", jSONObject);
        if (strA2 != null) {
            nVar.add(strA2);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (jSONArrayOptJSONArray2 != null) {
            jj.e eVarB = kotlin.collections.r.b();
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i10 = 0; i10 < length2; i10++) {
                try {
                    ij.k kVar = ij.m.f21341c;
                    objS = jSONArrayOptJSONArray2.getString(i10);
                } catch (Throwable th2) {
                    ij.k kVar2 = ij.m.f21341c;
                    objS = com.google.android.gms.internal.measurement.h5.s(th2);
                }
                if (!(objS instanceof ij.l)) {
                    eVarB.add((String) objS);
                }
            }
            eVarA = kotlin.collections.r.a(eVarB);
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            nVar.addAll(eVarA);
        }
        return new kf1(arrayList, er0Var, CollectionsKt.R(kotlin.collections.o0.a(nVar)), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }
}
