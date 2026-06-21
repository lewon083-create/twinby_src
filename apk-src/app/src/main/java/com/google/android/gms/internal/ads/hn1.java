package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn1 extends vv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6201c = jp1.f6925e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pp0 f6202b;

    public static int N(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int O(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void P() {
        if (V() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void Q(int i, int i10);

    public abstract void R(int i, int i10);

    public abstract void S(int i, int i10);

    public abstract void T(int i, int i10);

    public abstract void U(int i, long j10);

    public abstract int V();

    public abstract void W(int i, long j10);

    public abstract void X(int i, boolean z5);

    public abstract void Y(int i, String str);

    public abstract void Z(int i, bn1 bn1Var);

    public abstract void a0(bn1 bn1Var);

    public abstract void b0(int i, byte[] bArr);

    public abstract void c0(pm1 pm1Var);

    public abstract void d0(byte b2);

    public abstract void e0(int i);

    public abstract void f0(int i);

    public abstract void g0(int i);

    public abstract void h0(long j10);

    public abstract void i0(long j10);

    public abstract void j0(String str);
}
