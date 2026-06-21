package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f7270e;

    public kn0(String str, String str2, String str3, String str4, Long l10) {
        this.f7266a = str;
        this.f7267b = str2;
        this.f7268c = str3;
        this.f7269d = str4;
        this.f7270e = l10;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        ix.a0("gmp_app_id", this.f7266a, bundle);
        ix.a0("fbs_aiid", this.f7267b, bundle);
        ix.a0("fbs_aeid", this.f7268c, bundle);
        ix.a0("apm_id_origin", this.f7269d, bundle);
        Long l10 = this.f7270e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        ix.a0("fbs_aeid", this.f7268c, ((w50) obj).f11647b);
    }
}
