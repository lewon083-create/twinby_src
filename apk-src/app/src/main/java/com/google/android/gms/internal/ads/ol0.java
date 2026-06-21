package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ol0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9.g3 f8723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8730h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f8731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x1.b f8732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nl0 f8733l;

    public ol0(q9.g3 g3Var, String str, boolean z5, String str2, float f10, int i, int i10, String str3, int i11, boolean z10, x1.b bVar, nl0 nl0Var) {
        pa.c0.j(g3Var, "the adSize must not be null");
        this.f8723a = g3Var;
        this.f8724b = str;
        this.f8725c = z5;
        this.f8726d = str2;
        this.f8727e = f10;
        this.f8728f = i;
        this.f8729g = i10;
        this.f8730h = str3;
        this.i = i11;
        this.f8731j = z10;
        this.f8732k = bVar;
        this.f8733l = nl0Var;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* synthetic */ void a(Object obj) {
        b(((w50) obj).f11646a);
    }

    public final void b(Bundle bundle) {
        q9.g3 g3Var = this.f8723a;
        int i = g3Var.f31879f;
        boolean z5 = g3Var.f31888p;
        ix.x(bundle, "smart_w", "full", i == -1);
        int i10 = g3Var.f31876c;
        ix.x(bundle, "smart_h", "auto", i10 == -2);
        ix.R(bundle, "ene", true, g3Var.f31883k);
        ix.x(bundle, "rafmt", "102", g3Var.f31886n);
        ix.x(bundle, "rafmt", "103", g3Var.f31887o);
        ix.x(bundle, "rafmt", "105", z5);
        ix.R(bundle, "inline_adaptive_slot", true, this.f8731j);
        ix.R(bundle, "interscroller_slot", true, z5);
        ix.a0("format", this.f8724b, bundle);
        ix.x(bundle, "fluid", "height", this.f8725c);
        ix.x(bundle, "sz", this.f8726d, !TextUtils.isEmpty(r2));
        bundle.putFloat("u_sd", this.f8727e);
        bundle.putInt("sw", this.f8728f);
        bundle.putInt("sh", this.f8729g);
        String str = this.f8730h;
        ix.x(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i11 = this.i;
        if (i11 != -1) {
            bundle.putInt("u_mso", i11);
        }
        x1.b bVar = this.f8732k;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.f35690b);
            bundle.putInt("sam_b", bVar.f35692d);
            bundle.putInt("sam_l", bVar.f35689a);
            bundle.putInt("sam_r", bVar.f35691c);
        }
        nl0 nl0Var = this.f8733l;
        if (nl0Var != null) {
            bundle.putInt("rc_tl", nl0Var.f8356a);
            bundle.putInt("rc_tr", nl0Var.f8357b);
            bundle.putInt("rc_bl", nl0Var.f8358c);
            bundle.putInt("rc_br", nl0Var.f8359d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        q9.g3[] g3VarArr = g3Var.f31881h;
        if (g3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i10);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", g3Var.f31882j);
            arrayList.add(bundle2);
        } else {
            for (q9.g3 g3Var2 : g3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", g3Var2.f31882j);
                bundle3.putInt("height", g3Var2.f31876c);
                bundle3.putInt("width", g3Var2.f31879f);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* synthetic */ void i(Object obj) {
        b(((w50) obj).f11647b);
    }
}
