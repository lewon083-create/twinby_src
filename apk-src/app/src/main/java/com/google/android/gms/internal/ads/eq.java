package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface eq extends iq, dq {
    @Override // com.google.android.gms.internal.ads.iq
    void b(String str);

    @Override // com.google.android.gms.internal.ads.dq
    default void c(String str, Map map) {
        try {
            h("openIntentAsync", q9.r.f31959g.f31960a.k(map));
        } catch (JSONException unused) {
            u9.i.h("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.iq
    default void g(String str, String str2) {
        b(om1.n(new StringBuilder(pe.a.b(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.dq
    default void h(String str, JSONObject jSONObject) {
        StringBuilder sbP = om1.p("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        u9.i.c("Dispatching AFMA event: ".concat(sbP.toString()));
        b(sbP.toString());
    }
}
