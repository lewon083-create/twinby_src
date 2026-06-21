package yads;

import android.text.Html;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr1 f39600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk.c f39601b;

    public /* synthetic */ ip() {
        this(new kr1(), ie1.a());
    }

    public final gb a(JSONObject jSONObject) {
        String strValueOf;
        String string;
        try {
            try {
                vk.c cVar = ie1.f39520a;
                string = jSONObject.getString("ad_unit_id");
            } catch (JSONException unused) {
                vk.c cVar2 = ie1.f39520a;
                String string2 = jSONObject.getString("block_id");
                if (string2 == null || string2.length() == 0 || "null".equals(string2)) {
                    throw new JSONException("Json value can not be null or empty");
                }
                strValueOf = String.valueOf(Html.fromHtml(string2));
            }
        } catch (JSONException unused2) {
        }
        if (string == null || string.length() == 0 || "null".equals(string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        strValueOf = String.valueOf(Html.fromHtml(string));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("networks");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                sq1 sq1VarA = this.f39600a.a(jSONArrayOptJSONArray.getJSONObject(i));
                if (sq1VarA != null) {
                    arrayList.add(sq1VarA);
                }
            }
            if (!arrayList.isEmpty()) {
                return new gb(strValueOf, jSONObject.toString(), arrayList);
            }
        }
        return null;
    }

    public final hp b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        is1 is1Var;
        String string;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    gb gbVarA = a(jSONArrayOptJSONArray.getJSONObject(i));
                    if (gbVarA != null) {
                        arrayList.add(gbVarA);
                    }
                }
            }
            if (jSONObject2 == null || (string = jSONObject2.toString()) == null) {
                is1Var = null;
            } else {
                vk.c cVar = this.f39601b;
                cVar.getClass();
                is1Var = (is1) cVar.a(string, com.google.android.gms.internal.auth.g.q(is1.Companion.serializer()));
            }
            if (arrayList.isEmpty() && is1Var == null) {
                return null;
            }
            return new hp(arrayList, is1Var);
        } catch (JSONException unused2) {
            return null;
        }
    }

    public ip(kr1 kr1Var, vk.c cVar) {
        this.f39600a = kr1Var;
        this.f39601b = cVar;
    }
}
