package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12196c;

    public /* synthetic */ xl0(String str, int i, int i10) {
        this.f12194a = i10;
        this.f12195b = str;
        this.f12196c = i;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        int i;
        int i10;
        switch (this.f12194a) {
            case 0:
                Bundle bundle = ((w50) obj).f11646a;
                String str = this.f12195b;
                if (!TextUtils.isEmpty(str) && (i = this.f12196c) != -1) {
                    Bundle bundleA = ix.a(bundle, "pii");
                    bundle.putBundle("pii", bundleA);
                    bundleA.putString("pvid", str);
                    bundleA.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((w50) obj).f11646a;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Fb)).booleanValue()) {
                    String str2 = this.f12195b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i11 = this.f12196c;
                    if (i11 != -1) {
                        bundle2.putInt("atps", i11);
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f12195b;
                if (!TextUtils.isEmpty(str3) && (i10 = this.f12196c) != -1) {
                    try {
                        JSONObject jSONObjectU = com.google.android.gms.internal.measurement.b4.U("pii", jSONObject);
                        jSONObjectU.put("pvid", str3);
                        jSONObjectU.put("pvid_s", i10);
                    } catch (JSONException e3) {
                        t9.c0.n("Failed putting gms core app set ID info.", e3);
                    }
                    break;
                }
                break;
        }
    }
}
