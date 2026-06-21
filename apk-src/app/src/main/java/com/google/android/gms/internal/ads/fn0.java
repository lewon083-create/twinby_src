package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5401b;

    public fn0(String str, int i) {
        this.f5400a = str;
        this.f5401b = i;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        bundle.putString(CommonUrlParts.REQUEST_ID, this.f5400a);
        if (this.f5401b == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        ((w50) obj).f11647b.putString(CommonUrlParts.REQUEST_ID, this.f5400a);
    }
}
