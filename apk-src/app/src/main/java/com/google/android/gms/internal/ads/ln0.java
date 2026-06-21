package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ln0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7585h;

    public ln0(boolean z5, boolean z10, String str, boolean z11, int i, int i10, int i11, String str2) {
        this.f7578a = z5;
        this.f7579b = z10;
        this.f7580c = str;
        this.f7581d = z11;
        this.f7582e = i;
        this.f7583f = i10;
        this.f7584g = i11;
        this.f7585h = str2;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        bundle.putString("js", this.f7580c);
        bundle.putBoolean("is_nonagon", true);
        wk wkVar = al.u4;
        q9.s sVar = q9.s.f31967e;
        bundle.putString("extra_caps", (String) sVar.f31970c.a(wkVar));
        bundle.putInt("target_api", this.f7582e);
        bundle.putInt("dv", this.f7583f);
        bundle.putInt("lv", this.f7584g);
        if (((Boolean) sVar.f31970c.a(al.J6)).booleanValue()) {
            String str = this.f7585h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleA = ix.a(bundle, "sdk_env");
        bundleA.putBoolean("mf", ((Boolean) bm.f3823g.r()).booleanValue());
        bundleA.putBoolean("instant_app", this.f7578a);
        bundleA.putBoolean("lite", this.f7579b);
        bundleA.putBoolean("is_privileged_process", this.f7581d);
        bundle.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = ix.a(bundleA, "build_meta");
        bundleA2.putString("cl", "839961582");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        bundle.putString("js", this.f7580c);
        bundle.putInt("target_api", this.f7582e);
    }
}
