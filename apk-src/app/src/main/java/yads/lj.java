package yads;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj f40560a;

    public /* synthetic */ lj(Context context, ko2 ko2Var, lf1 lf1Var, int i) {
        this(new aj(context, ko2Var, (i & 4) != 0 ? new lf1(context, ko2Var) : lf1Var));
    }

    public final ArrayList a(JSONObject jSONObject, kn knVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            boolean z5 = jSONObject2.getBoolean("required");
            try {
                arrayList.add(this.f40560a.a(jSONObject2, knVar));
            } catch (Throwable th2) {
                if (z5) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public lj(aj ajVar) {
        this.f40560a = ajVar;
    }
}
