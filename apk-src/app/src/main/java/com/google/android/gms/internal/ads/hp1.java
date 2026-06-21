package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 extends ip1 {
    @Override // com.google.android.gms.internal.ads.ip1
    public final void P(Object obj, long j10, byte b2) {
        if (jp1.f6928h) {
            jp1.d(obj, j10, b2);
        } else {
            jp1.e(obj, j10, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final boolean T(long j10, Object obj) {
        return jp1.f6928h ? jp1.q(j10, obj) : jp1.r(j10, obj);
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final void W(Object obj, long j10, boolean z5) {
        if (jp1.f6928h) {
            jp1.d(obj, j10, z5 ? (byte) 1 : (byte) 0);
        } else {
            jp1.e(obj, j10, z5 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final float X(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f6568b).getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final void Y(Object obj, long j10, float f10) {
        ((Unsafe) this.f6568b).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final double Z(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f6568b).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final void a0(Object obj, long j10, double d10) {
        ((Unsafe) this.f6568b).putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.ip1
    public final byte b0(long j10) {
        return Memory.peekByte(j10);
    }
}
