package yads;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q13 f42787a = new q13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em f42788b = new em();

    public final r13 a(JSONObject jSONObject) {
        j13 j13Var;
        dm dmVarA;
        ArrayList arrayList;
        s13 s13Var = this;
        Object objOpt = jSONObject.opt("ColorWizButton");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            s13Var.f42787a.getClass();
            j13Var = new j13(jSONObjectOptJSONObject2.getInt("x"), jSONObjectOptJSONObject2.getInt("y"), jSONObjectOptJSONObject2.getInt("w"), jSONObjectOptJSONObject2.getInt("h"));
        } else {
            j13Var = null;
        }
        if (jSONObjectOptJSONObject != null) {
            s13Var.f42788b.getClass();
            dmVarA = em.a(jSONObjectOptJSONObject);
        } else {
            dmVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeE = ck.o.e(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(intRangeE, 10));
            ck.g gVarA = intRangeE.iterator();
            while (gVarA.f2383d) {
                int iNextInt = gVarA.nextInt();
                q13 q13Var = s13Var.f42787a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                q13Var.getClass();
                arrayList2.add(new j13(jSONObjectOptJSONObject3.getInt("x"), jSONObjectOptJSONObject3.getInt("y"), jSONObjectOptJSONObject3.getInt("w"), jSONObjectOptJSONObject3.getInt("h")));
                s13Var = this;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                dmVarA = dmVarA;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new r13(str, str2, str3, str4, dmVarA, j13Var, arrayList);
    }
}
