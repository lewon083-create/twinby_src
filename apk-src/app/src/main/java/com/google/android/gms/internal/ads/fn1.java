package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fn1 extends hn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5404f;

    public fn1(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.u.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f5402d = bArr;
        this.f5404f = 0;
        this.f5403e = i;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Q(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        f0((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void R(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        f0(i << 3);
        e0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void S(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        f0(i << 3);
        f0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void T(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        f0((i << 3) | 5);
        g0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void U(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        f0(i << 3);
        h0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final int V() {
        return this.f5403e - this.f5404f;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void W(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        f0((i << 3) | 1);
        i0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void X(int i, boolean z5) throws androidx.datastore.preferences.protobuf.m {
        f0(i << 3);
        d0(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Y(int i, String str) throws androidx.datastore.preferences.protobuf.m {
        f0((i << 3) | 2);
        j0(str);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Z(int i, bn1 bn1Var) throws androidx.datastore.preferences.protobuf.m {
        f0((i << 3) | 2);
        a0(bn1Var);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void a0(bn1 bn1Var) throws androidx.datastore.preferences.protobuf.m {
        f0(bn1Var.n());
        bn1Var.r(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void b0(int i, byte[] bArr) throws androidx.datastore.preferences.protobuf.m {
        f0(i);
        k0(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void c0(pm1 pm1Var) throws androidx.datastore.preferences.protobuf.m {
        f0(((sn1) pm1Var).d(null));
        ((sn1) pm1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void d0(byte b2) throws androidx.datastore.preferences.protobuf.m {
        int i;
        int i10 = this.f5404f;
        try {
            i = i10 + 1;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
        try {
            this.f5402d[i10] = b2;
            this.f5404f = i;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            i10 = i;
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f5403e, 1, e, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void e0(int i) throws androidx.datastore.preferences.protobuf.m {
        if (i >= 0) {
            f0(i);
        } else {
            h0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void f0(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        int i11 = this.f5404f;
        while (true) {
            int i12 = i & (-128);
            byte[] bArr = this.f5402d;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i;
                this.f5404f = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i | 128);
                    i >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(i10, this.f5403e, 1, e3, 2);
                }
            }
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f5403e, 1, e3, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void g0(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f5404f;
        try {
            byte[] bArr = this.f5402d;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.f5404f = i10 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f5403e, 4, e3, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void h0(long j10) throws androidx.datastore.preferences.protobuf.m {
        int i;
        int i10 = this.f5404f;
        int i11 = this.f5403e;
        byte[] bArr = this.f5402d;
        if (!hn1.f6201c || i11 - i10 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                int i12 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i10 = i12;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i = i12;
                    throw new androidx.datastore.preferences.protobuf.m(i, i11, 1, e, 2);
                }
            }
            i = i10 + 1;
            try {
                bArr[i10] = (byte) j11;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                throw new androidx.datastore.preferences.protobuf.m(i, i11, 1, e, 2);
            }
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                jp1.m(bArr, i10, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i10++;
            }
            i = i10 + 1;
            jp1.m(bArr, i10, (byte) j12);
        }
        this.f5404f = i;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void i0(long j10) throws androidx.datastore.preferences.protobuf.m {
        int i = this.f5404f;
        try {
            byte[] bArr = this.f5402d;
            bArr[i] = (byte) j10;
            bArr[i + 1] = (byte) (j10 >> 8);
            bArr[i + 2] = (byte) (j10 >> 16);
            bArr[i + 3] = (byte) (j10 >> 24);
            bArr[i + 4] = (byte) (j10 >> 32);
            bArr[i + 5] = (byte) (j10 >> 40);
            bArr[i + 6] = (byte) (j10 >> 48);
            bArr[i + 7] = (byte) (j10 >> 56);
            this.f5404f = i + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i, this.f5403e, 8, e3, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void j0(String str) throws androidx.datastore.preferences.protobuf.m {
        int i = this.f5404f;
        try {
            int iN = hn1.N(str.length() * 3);
            int iN2 = hn1.N(str.length());
            int i10 = this.f5403e;
            byte[] bArr = this.f5402d;
            if (iN2 != iN) {
                f0(lp1.b(str));
                int i11 = this.f5404f;
                this.f5404f = lp1.c(i11, i10 - i11, str, bArr);
            } else {
                int i12 = i + iN2;
                this.f5404f = i12;
                int iC = lp1.c(i12, i10 - i12, str, bArr);
                this.f5404f = i;
                f0((iC - i) - iN2);
                this.f5404f = iC;
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public final void k0(byte[] bArr, int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        try {
            System.arraycopy(bArr, i, this.f5402d, this.f5404f, i10);
            this.f5404f += i10;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(this.f5404f, this.f5403e, i10, e3, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final void o(byte[] bArr, int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        k0(bArr, i, i10);
    }
}
