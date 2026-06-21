package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gn1 extends hn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OutputStream f5882g;

    public gn1(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f5879d = new byte[iMax];
        this.f5880e = iMax;
        this.f5882g = outputStream;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Q(int i, int i10) {
        f0((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void R(int i, int i10) {
        k0(20);
        m0(i << 3);
        if (i10 >= 0) {
            m0(i10);
        } else {
            n0(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void S(int i, int i10) {
        k0(20);
        m0(i << 3);
        m0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void T(int i, int i10) {
        k0(14);
        m0((i << 3) | 5);
        o0(i10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void U(int i, long j10) {
        k0(20);
        m0(i << 3);
        n0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final int V() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void W(int i, long j10) {
        k0(18);
        m0((i << 3) | 1);
        p0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void X(int i, boolean z5) {
        k0(11);
        m0(i << 3);
        int i10 = this.f5881f;
        this.f5879d[i10] = z5 ? (byte) 1 : (byte) 0;
        this.f5881f = i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Y(int i, String str) throws IOException {
        f0((i << 3) | 2);
        j0(str);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void Z(int i, bn1 bn1Var) {
        f0((i << 3) | 2);
        a0(bn1Var);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void a0(bn1 bn1Var) {
        f0(bn1Var.n());
        bn1Var.r(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void b0(int i, byte[] bArr) throws IOException {
        f0(i);
        q0(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void c0(pm1 pm1Var) {
        f0(((sn1) pm1Var).d(null));
        ((sn1) pm1Var).u(this);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void d0(byte b2) {
        if (this.f5881f == this.f5880e) {
            l0();
        }
        int i = this.f5881f;
        this.f5879d[i] = b2;
        this.f5881f = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void e0(int i) {
        if (i >= 0) {
            f0(i);
        } else {
            h0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void f0(int i) {
        k0(5);
        m0(i);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void g0(int i) {
        k0(4);
        o0(i);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void h0(long j10) {
        k0(10);
        n0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void i0(long j10) {
        k0(8);
        p0(j10);
    }

    @Override // com.google.android.gms.internal.ads.hn1
    public final void j0(String str) throws IOException {
        int length = str.length() * 3;
        int iN = hn1.N(length);
        int i = iN + length;
        int i10 = this.f5880e;
        if (i > i10) {
            byte[] bArr = new byte[length];
            int iC = lp1.c(0, length, str, bArr);
            f0(iC);
            q0(bArr, 0, iC);
            return;
        }
        if (i > i10 - this.f5881f) {
            l0();
        }
        int iN2 = hn1.N(str.length());
        int i11 = this.f5881f;
        byte[] bArr2 = this.f5879d;
        try {
            if (iN2 == iN) {
                int i12 = i11 + iN2;
                this.f5881f = i12;
                int iC2 = lp1.c(i12, i10 - i12, str, bArr2);
                this.f5881f = i11;
                m0((iC2 - i11) - iN2);
                this.f5881f = iC2;
            } else {
                int iB = lp1.b(str);
                m0(iB);
                this.f5881f = lp1.c(this.f5881f, iB, str, bArr2);
            }
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(e3);
        }
    }

    public final void k0(int i) {
        if (this.f5880e - this.f5881f < i) {
            l0();
        }
    }

    public final void l0() {
        this.f5882g.write(this.f5879d, 0, this.f5881f);
        this.f5881f = 0;
    }

    public final void m0(int i) {
        boolean z5 = hn1.f6201c;
        byte[] bArr = this.f5879d;
        if (z5) {
            while ((i & (-128)) != 0) {
                int i10 = this.f5881f;
                this.f5881f = i10 + 1;
                jp1.m(bArr, i10, (byte) (i | 128));
                i >>>= 7;
            }
            int i11 = this.f5881f;
            this.f5881f = i11 + 1;
            jp1.m(bArr, i11, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i12 = this.f5881f;
            this.f5881f = i12 + 1;
            bArr[i12] = (byte) (i | 128);
            i >>>= 7;
        }
        int i13 = this.f5881f;
        this.f5881f = i13 + 1;
        bArr[i13] = (byte) i;
    }

    public final void n0(long j10) {
        boolean z5 = hn1.f6201c;
        byte[] bArr = this.f5879d;
        if (z5) {
            while (true) {
                int i = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i10 = this.f5881f;
                    this.f5881f = i10 + 1;
                    jp1.m(bArr, i10, (byte) i);
                    return;
                } else {
                    int i11 = this.f5881f;
                    this.f5881f = i11 + 1;
                    jp1.m(bArr, i11, (byte) (i | 128));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i12 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i13 = this.f5881f;
                    this.f5881f = i13 + 1;
                    bArr[i13] = (byte) i12;
                    return;
                } else {
                    int i14 = this.f5881f;
                    this.f5881f = i14 + 1;
                    bArr[i14] = (byte) (i12 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vv
    public final void o(byte[] bArr, int i, int i10) throws IOException {
        q0(bArr, i, i10);
    }

    public final void o0(int i) {
        int i10 = this.f5881f;
        byte[] bArr = this.f5879d;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.f5881f = i10 + 4;
    }

    public final void p0(long j10) {
        int i = this.f5881f;
        byte[] bArr = this.f5879d;
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
        this.f5881f = i + 8;
    }

    public final void q0(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f5881f;
        int i12 = this.f5880e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f5879d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i, bArr2, i11, i10);
            this.f5881f += i10;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i11, i13);
        int i14 = i + i13;
        this.f5881f = i12;
        l0();
        int i15 = i10 - i13;
        if (i15 > i12) {
            this.f5882g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f5881f = i15;
        }
    }
}
