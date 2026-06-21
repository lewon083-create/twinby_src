package yads;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kq1 implements fq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j82 f40308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr1 f40309b;

    public /* synthetic */ kq1() {
        this(new k82(), new kr1());
    }

    @Override // yads.fq2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jq1 a(yp2 yp2Var) {
        String strA = ((k82) this.f40308a).a(yp2Var);
        if (strA == null || strA.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            try {
                vk.c cVar = ie1.f39520a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                jj.i builder = new jj.i();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    builder.put(next, jSONObject2.getString(next));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                jj.i iVarB = builder.b();
                if (iVarB.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("networks");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    sq1 sq1VarA = this.f40309b.a(jSONArray.getJSONObject(i));
                    if (sq1VarA != null) {
                        arrayList.add(sq1VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new jq1(arrayList, iVarB);
            } catch (JSONException e3) {
                throw new JSONException(e3.getMessage());
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    public kq1(j82 j82Var, kr1 kr1Var) {
        this.f40308a = j82Var;
        this.f40309b = kr1Var;
    }
}
