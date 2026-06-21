package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 extends z6 {
    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f13642a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f13642a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final void c(Object obj, long j10, boolean z5) {
        if (a7.f13331g) {
            a7.c(obj, j10, z5 ? (byte) 1 : (byte) 0);
        } else {
            a7.d(obj, j10, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final void d(Object obj, long j10, byte b2) {
        if (a7.f13331g) {
            a7.c(obj, j10, b2);
        } else {
            a7.d(obj, j10, b2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final void e(Object obj, long j10, double d10) {
        this.f13642a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final void f(Object obj, long j10, float f10) {
        this.f13642a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final boolean g(long j10, Object obj) {
        return a7.f13331g ? a7.m(j10, obj) : a7.n(j10, obj);
    }
}
