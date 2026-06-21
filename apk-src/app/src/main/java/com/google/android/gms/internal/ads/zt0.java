package com.google.android.gms.internal.ads;

import io.sentry.MeasurementUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum zt0 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(MeasurementUnit.NONE);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13121b;

    zt0(String str) {
        this.f13121b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13121b;
    }
}
