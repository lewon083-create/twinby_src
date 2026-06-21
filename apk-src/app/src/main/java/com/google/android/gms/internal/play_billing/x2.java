package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends d3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f14363g = Logger.getLogger(x2.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f14364h = o4.f14272e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t3 f14365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14368f;

    public x2(int i, byte[] bArr) {
        super(11);
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a0.u.j(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f14366d = bArr;
        this.f14368f = 0;
        this.f14367e = i;
    }

    public static int O(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int d0(String str) {
        int length;
        try {
            length = q4.c(str);
        } catch (p4 unused) {
            length = str.getBytes(l3.f14238a).length;
        }
        return e0(length) + length;
    }

    public static int e0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void P(int i, byte[] bArr) throws androidx.datastore.preferences.protobuf.m {
        try {
            System.arraycopy(bArr, 0, this.f14366d, this.f14368f, i);
            this.f14368f += i;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(this.f14368f, this.f14367e, i, e3, 6);
        }
    }

    public final void Q(int i, w2 w2Var) throws androidx.datastore.preferences.protobuf.m {
        a0((i << 3) | 2);
        a0(w2Var.e());
        P(w2Var.e(), w2Var.f14353c);
    }

    public final void R(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        a0((i << 3) | 5);
        S(i10);
    }

    public final void S(int i) throws androidx.datastore.preferences.protobuf.m {
        int i10 = this.f14368f;
        try {
            byte[] bArr = this.f14366d;
            bArr[i10] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 1] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 2] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i10 + 3] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f14368f = i10 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i10, this.f14367e, 4, e3, 6);
        }
    }

    public final void T(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        a0((i << 3) | 1);
        U(j10);
    }

    public final void U(long j10) throws androidx.datastore.preferences.protobuf.m {
        int i = this.f14368f;
        try {
            byte[] bArr = this.f14366d;
            bArr[i] = (byte) (((int) j10) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 1] = (byte) (((int) (j10 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 2] = (byte) (((int) (j10 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 3] = (byte) (((int) (j10 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 4] = (byte) (((int) (j10 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 5] = (byte) (((int) (j10 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 6] = (byte) (((int) (j10 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i + 7] = (byte) (((int) (j10 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f14368f = i + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new androidx.datastore.preferences.protobuf.m(i, this.f14367e, 8, e3, 6);
        }
    }

    public final void V(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        a0(i << 3);
        W(i10);
    }

    public final void W(int i) throws androidx.datastore.preferences.protobuf.m {
        if (i >= 0) {
            a0(i);
        } else {
            c0(i);
        }
    }

    public final void X(int i, String str) throws androidx.datastore.preferences.protobuf.m {
        a0((i << 3) | 2);
        int i10 = this.f14368f;
        try {
            int iE0 = e0(str.length() * 3);
            int iE02 = e0(str.length());
            int i11 = this.f14367e;
            byte[] bArr = this.f14366d;
            if (iE02 != iE0) {
                a0(q4.c(str));
                int i12 = this.f14368f;
                this.f14368f = q4.b(i12, i11 - i12, str, bArr);
            } else {
                int i13 = i10 + iE02;
                this.f14368f = i13;
                int iB = q4.b(i13, i11 - i13, str, bArr);
                this.f14368f = i10;
                a0((iB - i10) - iE02);
                this.f14368f = iB;
            }
        } catch (p4 e3) {
            this.f14368f = i10;
            f14363g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(l3.f14238a);
            try {
                int length = bytes.length;
                a0(length);
                P(length, bytes);
            } catch (IndexOutOfBoundsException e7) {
                throw new androidx.datastore.preferences.protobuf.m(e7);
            }
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.m(e10);
        }
    }

    public final void Y(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        a0((i << 3) | i10);
    }

    public final void Z(int i, int i10) throws androidx.datastore.preferences.protobuf.m {
        a0(i << 3);
        a0(i10);
    }

    public final void a0(int i) throws androidx.datastore.preferences.protobuf.m {
        while (true) {
            int i10 = i & (-128);
            byte[] bArr = this.f14366d;
            if (i10 == 0) {
                int i11 = this.f14368f;
                this.f14368f = i11 + 1;
                bArr[i11] = (byte) i;
                return;
            } else {
                try {
                    int i12 = this.f14368f;
                    this.f14368f = i12 + 1;
                    bArr[i12] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(this.f14368f, this.f14367e, 1, e3, 6);
                }
            }
            throw new androidx.datastore.preferences.protobuf.m(this.f14368f, this.f14367e, 1, e3, 6);
        }
    }

    public final void b0(int i, long j10) throws androidx.datastore.preferences.protobuf.m {
        a0(i << 3);
        c0(j10);
    }

    public final void c0(long j10) throws androidx.datastore.preferences.protobuf.m {
        boolean z5 = f14364h;
        int i = this.f14367e;
        byte[] bArr = this.f14366d;
        if (!z5 || i - this.f14368f < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                try {
                    int i10 = this.f14368f;
                    this.f14368f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j11) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(this.f14368f, i, 1, e3, 6);
                }
            }
            int i11 = this.f14368f;
            this.f14368f = i11 + 1;
            bArr[i11] = (byte) j11;
            return;
        }
        long j12 = j10;
        while (true) {
            int i12 = (int) j12;
            if ((j12 & (-128)) == 0) {
                int i13 = this.f14368f;
                this.f14368f = i13 + 1;
                o4.f14270c.d(bArr, o4.f14273f + ((long) i13), (byte) i12);
                return;
            }
            int i14 = this.f14368f;
            this.f14368f = i14 + 1;
            o4.f14270c.d(bArr, o4.f14273f + i14, (byte) ((i12 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j12 >>>= 7;
        }
    }
}
