package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0473s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f24723a;

    public C0473s2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C0473s2(LocationManager locationManager) {
        this.f24723a = locationManager;
    }
}
