package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f3327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3331f;

    public an0(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f3326a = str;
        this.f3327b = num;
        this.f3328c = str2;
        this.f3329d = str3;
        this.f3330e = str4;
        this.f3331f = str5;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        ix.a0("pn", this.f3326a, bundle);
        Integer num = this.f3327b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        ix.a0("vnm", this.f3328c, bundle);
        ix.a0("dl", this.f3329d, bundle);
        ix.a0("ins_pn", this.f3330e, bundle);
        ix.a0("ini_pn", this.f3331f, bundle);
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Bundle bundle = ((w50) obj).f11647b;
        ix.a0("pn", this.f3326a, bundle);
        ix.a0("dl", this.f3329d, bundle);
    }
}
