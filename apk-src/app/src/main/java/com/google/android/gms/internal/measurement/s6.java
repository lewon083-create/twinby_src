package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 extends u6 {
    @Override // com.google.android.gms.internal.measurement.u6
    public final void a(Object obj, long j10, byte b2) {
        if (v6.f14022g) {
            v6.c(obj, j10, b2);
        } else {
            v6.d(obj, j10, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final boolean b(long j10, Object obj) {
        return v6.f14022g ? v6.n(j10, obj) : v6.o(j10, obj);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final void c(Object obj, long j10, boolean z5) {
        if (v6.f14022g) {
            v6.c(obj, j10, z5 ? (byte) 1 : (byte) 0);
        } else {
            v6.d(obj, j10, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final float d(long j10, Object obj) {
        return Float.intBitsToFloat(this.f14005a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final void e(Object obj, long j10, float f10) {
        this.f14005a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final double f(long j10, Object obj) {
        return Double.longBitsToDouble(this.f14005a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    public final void g(Object obj, long j10, double d10) {
        this.f14005a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
