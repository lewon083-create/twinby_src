package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.protocol.Device;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11429f;

    public vn0(String str, int i, int i10, int i11, boolean z5, int i12) {
        this.f11424a = str;
        this.f11425b = i;
        this.f11426c = i10;
        this.f11427d = i11;
        this.f11428e = z5;
        this.f11429f = i12;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        ix.x(bundle, "carrier", this.f11424a, !TextUtils.isEmpty(r0));
        int i = this.f11425b;
        ix.M(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f11426c);
        bundle.putInt("pt", this.f11427d);
        Bundle bundleA = ix.a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleA);
        Bundle bundleA2 = ix.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f11429f);
        bundleA2.putBoolean("active_network_metered", this.f11428e);
    }
}
