package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ql implements NetworkResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xl f22898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2 f22899b;

    public Ql() {
        this(new Xl(), new W2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0089cm handle(@NonNull ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!ko.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f22899b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Xl xl2 = this.f22898a;
                xl2.getClass();
                C0089cm c0089cm = new C0089cm();
                try {
                    xl2.f23270h.getClass();
                    C0181gb c0181gb = new C0181gb(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c0181gb.optJSONObject(VKApiCodes.PARAM_DEVICE_ID);
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c0089cm.f23626h = strOptString2;
                    c0089cm.i = strOptString;
                    xl2.a(c0089cm, c0181gb);
                    c0089cm.f23619a = TextUtils.isEmpty(c0089cm.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0089cm = new C0089cm();
                    c0089cm.f23619a = 1;
                }
                if (2 == c0089cm.f23619a) {
                    return c0089cm;
                }
            }
        }
        return null;
    }

    public Ql(Xl xl2, W2 w22) {
        this.f22898a = xl2;
        this.f22899b = w22;
    }
}
