package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9552b;

    public qm0(String str, boolean z5) {
        this.f9551a = str;
        this.f9552b = z5;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        bundle.putString("gct", this.f9551a);
        if (this.f9552b) {
            bundle.putString("de", "1");
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        ((w50) obj).f11647b.putString("gct", this.f9551a);
    }
}
