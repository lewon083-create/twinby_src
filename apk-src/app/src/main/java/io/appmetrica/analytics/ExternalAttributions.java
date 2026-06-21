package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bc;
import io.appmetrica.analytics.impl.C0132ee;
import io.appmetrica.analytics.impl.C0155fb;
import io.appmetrica.analytics.impl.C0236ie;
import io.appmetrica.analytics.impl.K9;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C0132ee(K9.ADJUST) : new C0236ie(K9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C0132ee(K9.AIRBRIDGE) : new Bc(K9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C0132ee(K9.APPSFLYER) : new Bc(K9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C0132ee(K9.KOCHAVA) : new C0155fb(K9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C0132ee(K9.SINGULAR) : new Bc(K9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C0132ee(K9.TENJIN) : new Bc(K9.TENJIN, map);
    }
}
