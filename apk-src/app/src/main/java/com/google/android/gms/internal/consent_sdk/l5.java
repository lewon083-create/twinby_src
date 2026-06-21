package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f13457g = Logger.getLogger(l5.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f13458h = a7.f13329e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d6 f13459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OutputStream f13463f;

    public l5(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f13460c = new byte[iMax];
        this.f13461d = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f13463f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = c7.b(str);
        } catch (b7 unused) {
            length = str.getBytes(x5.f13606a).length;
        }
        return i(length) + length;
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void A(int i, int i10) throws IOException {
        l(20);
        o(i << 3);
        o(i10);
    }

    public final void B(int i) {
        l(5);
        o(i);
    }

    public final void C(int i, long j10) throws IOException {
        l(20);
        o(i << 3);
        p(j10);
    }

    public final void D(long j10) throws IOException {
        l(10);
        p(j10);
    }

    public final void E(int i, byte[] bArr) throws IOException {
        int i10 = this.f13462e;
        int i11 = this.f13461d;
        int i12 = i11 - i10;
        byte[] bArr2 = this.f13460c;
        if (i12 >= i) {
            System.arraycopy(bArr, 0, bArr2, i10, i);
            this.f13462e += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        this.f13462e = i11;
        k();
        int i13 = i - i12;
        if (i13 > i11) {
            this.f13463f.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f13462e = i13;
        }
    }

    public final void k() throws IOException {
        this.f13463f.write(this.f13460c, 0, this.f13462e);
        this.f13462e = 0;
    }

    public final void l(int i) throws IOException {
        if (this.f13461d - this.f13462e < i) {
            k();
        }
    }

    public final void m(int i) {
        int i10 = this.f13462e;
        byte[] bArr = this.f13460c;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.f13462e = i10 + 4;
    }

    public final void n(long j10) {
        int i = this.f13462e;
        byte[] bArr = this.f13460c;
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
        this.f13462e = i + 8;
    }

    public final void o(int i) {
        boolean z5 = f13458h;
        byte[] bArr = this.f13460c;
        if (!z5) {
            while ((i & (-128)) != 0) {
                int i10 = this.f13462e;
                this.f13462e = i10 + 1;
                bArr[i10] = (byte) (i | 128);
                i >>>= 7;
            }
            int i11 = this.f13462e;
            this.f13462e = i11 + 1;
            bArr[i11] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            int i12 = this.f13462e;
            this.f13462e = i12 + 1;
            a7.f13327c.d(bArr, a7.f13330f + ((long) i12), (byte) (i | 128));
            i >>>= 7;
        }
        int i13 = this.f13462e;
        this.f13462e = i13 + 1;
        a7.f13327c.d(bArr, a7.f13330f + i13, (byte) i);
    }

    public final void p(long j10) {
        boolean z5 = f13458h;
        byte[] bArr = this.f13460c;
        if (z5) {
            while (true) {
                int i = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i10 = this.f13462e;
                    this.f13462e = i10 + 1;
                    a7.f13327c.d(bArr, a7.f13330f + ((long) i10), (byte) i);
                    return;
                }
                int i11 = this.f13462e;
                this.f13462e = i11 + 1;
                a7.f13327c.d(bArr, a7.f13330f + i11, (byte) (i | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i13 = this.f13462e;
                    this.f13462e = i13 + 1;
                    bArr[i13] = (byte) i12;
                    return;
                } else {
                    int i14 = this.f13462e;
                    this.f13462e = i14 + 1;
                    bArr[i14] = (byte) (i12 | 128);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void q(int i, k5 k5Var) throws IOException {
        B((i << 3) | 2);
        r(k5Var);
    }

    public final void r(k5 k5Var) throws IOException {
        B(k5Var.e());
        E(k5Var.e(), k5Var.f13448c);
    }

    public final void s(int i, int i10) throws IOException {
        l(14);
        o((i << 3) | 5);
        m(i10);
    }

    public final void t(int i) throws IOException {
        l(4);
        m(i);
    }

    public final void u(int i, long j10) throws IOException {
        l(18);
        o((i << 3) | 1);
        n(j10);
    }

    public final void v(long j10) throws IOException {
        l(8);
        n(j10);
    }

    public final void w(int i, int i10) throws IOException {
        l(20);
        o(i << 3);
        if (i10 >= 0) {
            o(i10);
        } else {
            p(i10);
        }
    }

    public final void x(int i) throws IOException {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    public final void y(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int i = i(length);
            int i10 = i + length;
            int i11 = this.f13461d;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iA = c7.a(0, length, str, bArr);
                B(iA);
                E(iA, bArr);
                return;
            }
            if (i10 > i11 - this.f13462e) {
                k();
            }
            int i12 = i(str.length());
            int i13 = this.f13462e;
            byte[] bArr2 = this.f13460c;
            try {
                if (i12 == i) {
                    int i14 = i13 + i12;
                    this.f13462e = i14;
                    int iA2 = c7.a(i14, i11 - i14, str, bArr2);
                    this.f13462e = i13;
                    o((iA2 - i13) - i12);
                    this.f13462e = iA2;
                } else {
                    int iB = c7.b(str);
                    o(iB);
                    this.f13462e = c7.a(this.f13462e, iB, str, bArr2);
                }
            } catch (b7 e3) {
                this.f13462e = i13;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new androidx.datastore.preferences.protobuf.m(e7);
            }
        } catch (b7 e10) {
            f13457g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(x5.f13606a);
            try {
                int length2 = bytes.length;
                B(length2);
                E(length2, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new androidx.datastore.preferences.protobuf.m(e11);
            }
        }
    }

    public final void z(int i, int i10) {
        B((i << 3) | i10);
    }
}
