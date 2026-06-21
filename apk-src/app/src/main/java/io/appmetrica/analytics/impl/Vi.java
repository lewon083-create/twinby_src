package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vi extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0486sf f23154b;

    public Vi(@NonNull Y4 y42) {
        this(y42, C0382oa.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        JSONObject jSONObjectOptJSONObject;
        try {
            jSONObjectOptJSONObject = new JSONObject(q5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        this.f23154b.b(C0412pf.a(jSONObjectOptJSONObject));
        return false;
    }

    public Vi(Y4 y42, C0486sf c0486sf) {
        super(y42);
        this.f23154b = c0486sf;
    }
}
