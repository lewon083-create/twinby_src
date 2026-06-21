package yads;

import io.sentry.protocol.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f39872a = kotlin.collections.s.f("native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button");

    public static void a(JSONArray jSONArray, yh0 yh0Var, ii0 ii0Var) {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, yh0Var, ii0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, yh0Var, ii0Var);
            }
        }
    }

    public static void a(JSONObject jSONObject, yh0 yh0Var, ii0 ii0Var) {
        Object obj;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("extensions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (Intrinsics.a((jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(Message.JsonKeys.PARAMS)) == null) ? null : jSONObjectOptJSONObject.optString("view_name"), "native_ad_view")) {
                    yh0Var = yh0.f45057c;
                    break;
                }
                i++;
            }
        }
        ii0Var.invoke(jSONObject, yh0Var);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                obj = jSONObject.get(itKeys.next());
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                a((JSONObject) obj, yh0Var, ii0Var);
            } else if (obj instanceof JSONArray) {
                a((JSONArray) obj, yh0Var, ii0Var);
            }
        }
    }

    public final Set a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        a(jSONObject, yh0.f45056b, new ii0(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!f39872a.contains(((xh0) obj).f44693b)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.V(arrayList2);
    }
}
