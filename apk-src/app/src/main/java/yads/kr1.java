package yads;

import android.text.Html;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq1 f40312a;

    public /* synthetic */ kr1() {
        this(new mq1());
    }

    public final sq1 a(JSONObject jSONObject) {
        j5 j5Var;
        try {
            vk.c cVar = ie1.f39520a;
            String string = jSONObject.getString("adapter");
            if (string == null || string.length() == 0 || "null".equals(string)) {
                throw new JSONException("Json value can not be null or empty");
            }
            String strValueOf = String.valueOf(Html.fromHtml(string));
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
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
            List listB = ie1.b("click_tracking_urls", jSONObject);
            List listB2 = ie1.b("impression_tracking_urls", jSONObject);
            List listB3 = ie1.b("ad_response_tracking_urls", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bidding_info");
            Map mapA = jSONObjectOptJSONObject != null ? ie1.a(jSONObjectOptJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                this.f40312a.getClass();
                try {
                    String string2 = jSONObject.getString("impression_data");
                    if (string2.length() == 0 || "null".equals(string2)) {
                        throw new JSONException("Json has not required attributes");
                    }
                    j5Var = new j5(string2);
                } catch (Exception unused) {
                    j5Var = null;
                }
            } else {
                j5Var = null;
            }
            return new sq1(strValueOf, iVarB, listB2, listB, listB3, j5Var, mapA);
        } catch (JSONException unused2) {
            return null;
        }
    }

    public kr1(mq1 mq1Var) {
        this.f40312a = mq1Var;
    }
}
