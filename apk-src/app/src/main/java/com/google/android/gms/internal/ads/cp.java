package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cp implements dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4277a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jx f4278b;

    public cp(so soVar, jx jxVar) {
        this.f4278b = jxVar;
        Objects.requireNonNull(soVar);
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void w(String str) {
        switch (this.f4277a) {
            case 0:
                this.f4278b.d(new c7.k(str));
                break;
            default:
                jx jxVar = this.f4278b;
                try {
                    if (str == null) {
                        jxVar.d(new c7.k());
                    } else {
                        jxVar.d(new c7.k(str));
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final void x(JSONObject jSONObject) {
        switch (this.f4277a) {
            case 0:
                this.f4278b.b(jSONObject);
                break;
            default:
                jx jxVar = this.f4278b;
                try {
                    jxVar.b(jSONObject);
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e3) {
                    jxVar.d(e3);
                }
                break;
        }
    }

    public cp(cr crVar, jx jxVar) {
        this.f4278b = jxVar;
    }
}
