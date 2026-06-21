package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xq implements dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq f12276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx f12277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yq f12278c;

    public xq(yq yqVar, pq pqVar, jx jxVar) {
        Objects.requireNonNull(yqVar);
        this.f12278c = yqVar;
        this.f12276a = pqVar;
        this.f12277b = jxVar;
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void w(String str) {
        pq pqVar = this.f12276a;
        jx jxVar = this.f12277b;
        try {
            if (str == null) {
                jxVar.d(new c7.k());
            } else {
                jxVar.d(new c7.k(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            pqVar.h();
            throw th2;
        }
        pqVar.h();
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void x(JSONObject jSONObject) {
        pq pqVar = this.f12276a;
        jx jxVar = this.f12277b;
        try {
            try {
                jxVar.b(((uq) this.f12278c.f12684c).x(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e3) {
                jxVar.d(e3);
            }
        } finally {
            pqVar.h();
        }
    }
}
