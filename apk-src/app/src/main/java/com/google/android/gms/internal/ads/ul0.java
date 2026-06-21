package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10977b;

    public /* synthetic */ ul0(int i, Object obj) {
        this.f10976a = i;
        this.f10977b = obj;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        boolean z5;
        boolean z10;
        switch (this.f10976a) {
            case 0:
                ix.g0(((w50) obj).f11646a, "android_permissions", (ArrayList) this.f10977b);
                return;
            case 1:
                w50 w50Var = (w50) obj;
                wp0 wp0Var = (wp0) this.f10977b;
                if (wp0Var != null) {
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3022gd)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = w50Var.f11646a;
                    synchronized (wp0Var.f11870c) {
                        wp0Var.b();
                        z5 = wp0Var.f11872e == 2;
                        break;
                    }
                    bundle.putBoolean("render_in_browser", z5);
                    synchronized (wp0Var.f11870c) {
                        wp0Var.b();
                        z10 = wp0Var.f11872e == 3;
                        break;
                    }
                    bundle.putBoolean("disable_ml", z10);
                    return;
                }
                return;
            case 2:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f10977b);
                    return;
                } catch (JSONException unused) {
                    t9.c0.m("Unable to get cache_state");
                    return;
                }
            case 3:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((co0) this.f10977b).f4275a);
                    return;
                } catch (JSONException unused2) {
                    t9.c0.m("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(StringUtils.COMMA, (List) this.f10977b));
                    return;
                } catch (JSONException unused3) {
                    t9.c0.m("Failed putting experiment ids.");
                    return;
                }
        }
    }
}
