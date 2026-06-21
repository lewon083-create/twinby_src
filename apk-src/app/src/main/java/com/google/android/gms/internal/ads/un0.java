package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11001h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f11002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f11008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11010r;

    public un0(boolean z5, boolean z10, String str, boolean z11, boolean z12, boolean z13, String str2, ArrayList arrayList, String str3, String str4, boolean z14, long j10, boolean z15, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f10994a = z5;
        this.f10995b = z10;
        this.f10996c = str;
        this.f10997d = z11;
        this.f10998e = z12;
        this.f10999f = z13;
        this.f11000g = str2;
        this.f11001h = str6;
        this.f11002j = arrayList;
        this.f11003k = str3;
        this.f11004l = str4;
        this.f11005m = z14;
        this.f11006n = j10;
        this.f11007o = z15;
        this.f11008p = str5;
        this.f11009q = i;
        this.f11010r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        String str;
        Bundle bundle = ((w50) obj).f11646a;
        bundle.putBoolean("cog", this.f10994a);
        bundle.putBoolean("coh", this.f10995b);
        bundle.putString("gl", this.f10996c);
        bundle.putBoolean(Device.JsonKeys.SIMULATOR, this.f10997d);
        bundle.putBoolean("is_latchsky", this.f10998e);
        bundle.putInt("build_api_level", this.f11009q);
        wk wkVar = al.f3112mc;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((Boolean) ykVar.a(wkVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f10999f);
        }
        bundle.putString("hl", this.f11000g);
        if (((Boolean) ykVar2.a(al.He)).booleanValue() || ((Boolean) ykVar2.a(al.Ie)).booleanValue()) {
            bundle.putString("dlc", this.f11001h);
        }
        ArrayList<String> arrayList = this.f11002j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f11003k);
        bundle.putString("submodel", Build.MODEL);
        Bundle bundleA = ix.a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleA);
        bundleA.putString(OperatingSystem.JsonKeys.BUILD, Build.FINGERPRINT);
        bundleA.putLong("remaining_data_partition_space", this.f11006n);
        Bundle bundleA2 = ix.a(bundleA, Browser.TYPE);
        bundleA.putBundle(Browser.TYPE, bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f11005m);
        String str3 = this.f11004l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle bundleA3 = ix.a(bundleA, "play_store");
            bundleA.putBundle("play_store", bundleA3);
            bundleA3.putString("package_version", str3);
        }
        if (((Boolean) ykVar2.a(al.Cc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f11007o);
        }
        String str4 = this.f11008p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) ykVar2.a(al.f3260wc)).booleanValue()) {
            ix.R(bundle, "gotmt_l", true, ((Boolean) ykVar2.a(al.f3216tc)).booleanValue());
            ix.R(bundle, "gotmt_i", true, ((Boolean) ykVar2.a(al.f3200sc)).booleanValue());
        }
        if (!((Boolean) ykVar2.a(al.f3293yf)).booleanValue() || (str = this.f11010r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        bundle.putBoolean(Device.JsonKeys.SIMULATOR, this.f10997d);
        bundle.putInt("build_api_level", this.f11009q);
        ArrayList<String> arrayList = this.f11002j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", Build.MODEL);
    }
}
