package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fm0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5388b;

    public fm0(double d10, boolean z5) {
        this.f5387a = d10;
        this.f5388b = z5;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((w50) obj).f11646a;
        Bundle bundleA = ix.a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleA);
        Bundle bundleA2 = ix.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f5388b);
        bundleA2.putDouble(Device.JsonKeys.BATTERY_LEVEL, this.f5387a);
    }
}
