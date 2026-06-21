package ye;

import java.util.Collection;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JSONObject f45616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JSONArray f45617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JSONArray f45618c;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        f45616a = jSONObject;
        f45617b = new JSONArray((Collection) a.f45614a);
        f45618c = new JSONArray((Collection) a.f45615b);
    }

    public static JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", f45618c);
        jSONObject2.put("allowedCardNetworks", f45617b);
        jSONObject2.put("billingAddressRequired", true);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("format", "FULL");
        Unit unit = Unit.f27471a;
        jSONObject2.put("billingAddressParameters", jSONObject3);
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public static JSONObject b(String str) throws JSONException {
        JSONObject jSONObjectA = a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "PAYMENT_GATEWAY");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("gateway", "cloudpayments");
        jSONObject2.put("gatewayMerchantId", str);
        Unit unit = Unit.f27471a;
        jSONObject.put("parameters", jSONObject2);
        jSONObjectA.put("tokenizationSpecification", jSONObject);
        return jSONObjectA;
    }
}
