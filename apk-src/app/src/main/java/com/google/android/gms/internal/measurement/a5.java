package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends a.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f13652g = Logger.getLogger(a5.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f13653h = v6.f14020e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5 f13654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13657f;

    public a5(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.u.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f13655d = bArr;
        this.f13657f = 0;
        this.f13656e = i;
    }

    public static int M(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int u(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int v(String str) {
        int length;
        try {
            length = x6.b(str);
        } catch (w6 unused) {
            length = str.getBytes(r5.f13944a).length;
        }
        return M(length) + length;
    }

    public final void A(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        G(i << 3);
        I(j10);
    }

    public final void B(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        G((i << 3) | 1);
        J(j10);
    }

    public final void C(int i, z4 z4Var) throws androidx.datastore.preferences.protobuf.m {
        G((i << 3) | 2);
        D(z4Var);
    }

    public final void D(z4 z4Var) throws androidx.datastore.preferences.protobuf.m {
        G(z4Var.e());
        K(z4Var.e(), z4Var.f14116c);
    }

    public final void E(byte b2) throws androidx.datastore.preferences.protobuf.m {
        int i;
        int i10 = this.f13657f;
        try {
            i = i10 + 1;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
        try {
            this.f13655d[i10] = b2;
            this.f13657f = i;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            i10 = i;
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f13656e, 1, e, 5);
        }
    }

    public final void F(int i) throws androidx.datastore.preferences.protobuf.m {
        if (i >= 0) {
            G(i);
        } else {
            I(i);
        }
    }

    public final void G(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10;
        int i11 = this.f13657f;
        while (true) {
            int i12 = i & (-128);
            byte[] bArr = this.f13655d;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i;
                this.f13657f = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i | 128);
                    i >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(i10, this.f13656e, 1, e3, 5);
                }
            }
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f13656e, 1, e3, 5);
        }
    }

    public final void H(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f13657f;
        try {
            byte[] bArr = this.f13655d;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.f13657f = i10 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f13656e, 4, e3, 5);
        }
    }

    public final void I(long j10) throws androidx.datastore.preferences.protobuf.m {
        int i;
        int i10 = this.f13657f;
        int i11 = this.f13656e;
        byte[] bArr = this.f13655d;
        if (!f13653h || i11 - i10 < 10) {
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
                    throw new androidx.datastore.preferences.protobuf.m(i, i11, 1, e, 5);
                }
            }
            i = i10 + 1;
            try {
                bArr[i10] = (byte) j11;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                throw new androidx.datastore.preferences.protobuf.m(i, i11, 1, e, 5);
            }
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                v6.f14018c.a(bArr, v6.f14021f + ((long) i10), (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i10++;
            }
            i = i10 + 1;
            v6.f14018c.a(bArr, v6.f14021f + ((long) i10), (byte) j12);
        }
        this.f13657f = i;
    }

    public final void J(long j10) throws androidx.datastore.preferences.protobuf.m {
        int i = this.f13657f;
        try {
            byte[] bArr = this.f13655d;
            bArr[i] = (byte) j10;
            bArr[i + 1] = (byte) (j10 >> 8);
            bArr[i + 2] = (byte) (j10 >> 16);
            bArr[i + 3] = (byte) (j10 >> 24);
            bArr[i + 4] = (byte) (j10 >> 32);
            bArr[i + 5] = (byte) (j10 >> 40);
            bArr[i + 6] = (byte) (j10 >> 48);
            bArr[i + 7] = (byte) (j10 >> 56);
            this.f13657f = i + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i, this.f13656e, 8, e3, 5);
        }
    }

    public final void K(int i, byte[] bArr) throws androidx.datastore.preferences.protobuf.m {
        try {
            System.arraycopy(bArr, 0, this.f13655d, this.f13657f, i);
            this.f13657f += i;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(this.f13657f, this.f13656e, i, e3, 5);
        }
    }

    public final void L(String str) throws androidx.datastore.preferences.protobuf.m {
        int i = this.f13657f;
        try {
            int iM = M(str.length() * 3);
            int iM2 = M(str.length());
            int i10 = this.f13656e;
            byte[] bArr = this.f13655d;
            if (iM2 != iM) {
                G(x6.b(str));
                int i11 = this.f13657f;
                this.f13657f = x6.c(i11, i10 - i11, str, bArr);
            } else {
                int i12 = i + iM2;
                this.f13657f = i12;
                int iC = x6.c(i12, i10 - i12, str, bArr);
                this.f13657f = i;
                G((iC - i) - iM2);
                this.f13657f = iC;
            }
        } catch (w6 e3) {
            this.f13657f = i;
            f13652g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(r5.f13944a);
            try {
                int length = bytes.length;
                G(length);
                K(length, bytes);
            } catch (IndexOutOfBoundsException e7) {
                throw new androidx.datastore.preferences.protobuf.m(e7);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.m(e10);
        }
    }

    public final void w(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        G((i << 3) | i10);
    }

    public final void x(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        G(i << 3);
        F(i10);
    }

    public final void y(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        G(i << 3);
        G(i10);
    }

    public final void z(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        G((i << 3) | 5);
        H(i10);
    }
}
