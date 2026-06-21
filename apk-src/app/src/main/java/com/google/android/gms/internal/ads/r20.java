package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 implements k20 {
    @Override // com.google.android.gms.internal.ads.k20
    public final void a(HashMap map) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.Fb)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p9.k.C.f31302h.g().u(Boolean.parseBoolean(str));
    }
}
