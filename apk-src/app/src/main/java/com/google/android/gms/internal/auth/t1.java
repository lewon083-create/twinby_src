package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends v1 {
    @Override // com.google.android.gms.internal.auth.v1
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f13292a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.v1
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f13292a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.v1
    public final void c(Object obj, long j10, boolean z5) {
        if (w1.f13301f) {
            w1.f(obj, j10, z5);
        } else {
            w1.g(obj, j10, z5);
        }
    }

    @Override // com.google.android.gms.internal.auth.v1
    public final void d(Object obj, long j10, double d10) {
        this.f13292a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.v1
    public final void e(Object obj, long j10, float f10) {
        this.f13292a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.v1
    public final boolean f(long j10, Object obj) {
        return w1.f13301f ? w1.k(j10, obj) : w1.l(j10, obj);
    }
}
