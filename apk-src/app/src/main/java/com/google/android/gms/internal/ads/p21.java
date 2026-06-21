package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f8891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte f8897g;

    public final q21 a() {
        IBinder iBinder;
        if (this.f8897g == 31 && (iBinder = this.f8891a) != null) {
            return new q21(iBinder, this.f8892b, this.f8893c, this.f8894d, this.f8895e, this.f8896f);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8891a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f8897g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f8897g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f8897g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f8897g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.f8897g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
