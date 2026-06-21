package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f9097b;

    public /* synthetic */ pl0(int i, Bundle bundle) {
        this.f9096a = i;
        this.f9097b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        switch (this.f9096a) {
            case 0:
                w50 w50Var = (w50) obj;
                Bundle bundle = this.f9097b;
                if (!bundle.isEmpty()) {
                    w50Var.f11646a.putBundle("installed_adapter_data", bundle);
                }
                break;
            case 1:
                Bundle bundle2 = ((w50) obj).f11646a;
                Bundle bundleA = ix.a(bundle2, Device.TYPE);
                bundleA.putBundle("android_mem_info", this.f9097b);
                bundle2.putBundle(Device.TYPE, bundleA);
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle3 = this.f9097b;
                if (bundle3 != null) {
                    try {
                        com.google.android.gms.internal.measurement.b4.U("play_store", com.google.android.gms.internal.measurement.b4.U(Device.TYPE, jSONObject)).put("parental_controls", q9.r.f31959g.f31960a.l(bundle3));
                    } catch (JSONException unused) {
                        t9.c0.m("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}
