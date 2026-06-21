package d8;

import com.google.android.gms.internal.ads.c3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v7.f f15657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c3 f15659f;

    public n(JSONObject jSONObject) throws JSONException {
        this.f15654a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        c3 c3Var = null;
        this.f15655b = true == strOptString.isEmpty() ? null : strOptString;
        this.f15656c = jSONObject.getString("offerIdToken");
        this.f15657d = new v7.f(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            c3Var = new c3();
            c3Var.f4005a = jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
            c3Var.f4006b = jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        this.f15659f = c3Var;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString("title");
            jSONObjectOptJSONObject2.optString("name");
            jSONObjectOptJSONObject2.optString("description");
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        this.f15658e = arrayList;
    }
}
