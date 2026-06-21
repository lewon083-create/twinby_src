package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class en1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5015d;

    public static cn1 d(byte[] bArr, int i, int i10) {
        cn1 cn1Var = new cn1(bArr, i, i10);
        try {
            cn1Var.D(i10);
            return cn1Var;
        } catch (co1 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long g(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract int D(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract int c();

    public void e() {
        int iH;
        do {
            iH = h();
            if (iH == 0) {
                return;
            }
            int i = this.f5013b;
            int i10 = this.f5014c;
            if (i + i10 >= 100) {
                throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f5014c = i10 + 1;
            this.f5014c--;
        } while (k(iH));
    }

    public abstract int h();

    public abstract void i(int i);

    public abstract boolean k(int i);

    public abstract double l();

    public abstract float m();

    public abstract long n();

    public abstract long o();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract boolean t();

    public abstract String u();

    public abstract String v();

    public abstract zm1 w();

    public abstract int x();

    public abstract int y();

    public abstract int z();
}
