package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar implements c31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3359c;

    public /* synthetic */ ar(int i, Object obj, Object obj2) {
        this.f3357a = i;
        this.f3358b = obj;
        this.f3359c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f3357a) {
            case 0:
                sq sqVar = (sq) obj;
                sqVar.i((String) this.f3358b, (vo) this.f3359c);
                return sqVar;
            default:
                qb0 qb0Var = (qb0) this.f3358b;
                JSONObject jSONObject = (JSONObject) this.f3359c;
                List list = (List) obj;
                qb0Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = qb0.c("bg_color", jSONObject);
                Integer numC2 = qb0.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new sm(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, qb0Var.f9422h.f11848f);
        }
    }
}
