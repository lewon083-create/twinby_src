package m3;

import ad.o0;
import com.google.android.gms.internal.measurement.h5;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f28585d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f28586e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o0 f28587f = o0.q(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f28588g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f28589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28591c;

    public p() {
        this.f28589a = z.f28609b;
    }

    public static int b(int i, int i10, int i11, int i12) {
        byte b2 = (byte) i11;
        return k3.f.m((byte) 0, wa.a.f(((i & 7) << 2) | ((i10 & 48) >> 4)), wa.a.f(((((byte) i10) & 15) << 4) | ((b2 & 60) >> 2)), wa.a.f(((b2 & 3) << 6) | (((byte) i12) & 63)));
    }

    public static int d(Charset charset) {
        h5.j(f28587f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b2) {
        return (b2 & 192) == 128;
    }

    public final int A() {
        f(4);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = (bArr[i] & 255) << 8;
        this.f28590b = i + 2;
        int i12 = (bArr[i10] & 255) | i11;
        this.f28590b = i + 4;
        return i12;
    }

    public final long B() {
        f(4);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        long j10 = (((long) bArr[i]) & 255) << 24;
        int i11 = i + 2;
        this.f28590b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 16);
        int i12 = i + 3;
        this.f28590b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 8);
        this.f28590b = i + 4;
        return (((long) bArr[i12]) & 255) | j12;
    }

    public final int C() {
        f(3);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = (bArr[i] & 255) << 16;
        int i12 = i + 2;
        this.f28590b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.f28590b = i + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int D() {
        int iM = m();
        if (iM >= 0) {
            return iM;
        }
        throw new IllegalStateException(l7.o.i(iM, "Top bit not zero: "));
    }

    public final int E() {
        long j10 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f28590b == this.f28591c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZ = z();
            j10 |= (127 & jZ) << (i * 7);
            if ((jZ & 128) == 0) {
                break;
            }
        }
        return k3.f.d(j10);
    }

    public final long F() {
        long jT = t();
        if (jT >= 0) {
            return jT;
        }
        throw new IllegalStateException(pe.a.d(jT, "Top bit not zero: "));
    }

    public final int G() {
        f(2);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = (bArr[i] & 255) << 8;
        this.f28590b = i + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long H() {
        int i;
        f(1);
        long j10 = this.f28589a[this.f28590b];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            int i11 = 1 << i10;
            if ((((long) i11) & j10) != 0) {
                i10--;
            } else if (i10 < 6) {
                j10 &= (long) (i11 - 1);
                i = 7 - i10;
            } else if (i10 == 7) {
                i = 1;
            }
        }
        i = 0;
        if (i == 0) {
            throw new NumberFormatException(pe.a.d(j10, "Invalid UTF-8 sequence first byte: "));
        }
        f(i);
        for (int i12 = 1; i12 < i; i12++) {
            byte b2 = this.f28589a[this.f28590b + i12];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(pe.a.d(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b2 & 63));
        }
        this.f28590b += i;
        return j10;
    }

    public final Charset I() {
        if (a() >= 3) {
            byte[] bArr = this.f28589a;
            int i = this.f28590b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f28590b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f28589a;
        int i10 = this.f28590b;
        byte b2 = bArr2[i10];
        if (b2 == -2 && bArr2[i10 + 1] == -1) {
            this.f28590b = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f28590b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void J(int i) {
        byte[] bArr = this.f28589a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        K(i, bArr);
    }

    public final void K(int i, byte[] bArr) {
        this.f28589a = bArr;
        this.f28591c = i;
        this.f28590b = 0;
    }

    public final void L(int i) {
        h5.h(i >= 0 && i <= this.f28589a.length);
        this.f28591c = i;
    }

    public final void M(int i) {
        h5.h(i >= 0 && i <= this.f28591c);
        this.f28590b = i;
    }

    public final void N(int i) {
        M(this.f28590b + i);
    }

    public final int a() {
        return Math.max(this.f28591c - this.f28590b, 0);
    }

    public final void c(int i) {
        byte[] bArr = this.f28589a;
        if (i > bArr.length) {
            this.f28589a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(int i) {
        if (!f28588g.get() || a() >= i) {
            return;
        }
        StringBuilder sbM = l7.o.m(i, "bytesNeeded= ", ", bytesLeft=");
        sbM.append(a());
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public final char g(int i, ByteOrder byteOrder) {
        byte b2;
        byte b10;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f28589a;
            int i10 = this.f28590b + i;
            b2 = bArr[i10];
            b10 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f28589a;
            int i11 = this.f28590b + i;
            b2 = bArr2[i11 + 1];
            b10 = bArr2[i11];
        }
        return (char) ((b2 << 8) | (b10 & 255));
    }

    public final int h(Charset charset) {
        int codePoint;
        int iB;
        h5.j(f28587f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f28590b + ", limit=" + this.f28591c);
        }
        int i = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.f28589a[this.f28590b];
            if ((b2 & 128) != 0) {
                return 0;
            }
            codePoint = b2 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.f28589a[this.f28590b];
            int i10 = (b10 & 128) == 0 ? 1 : ((b10 & 224) == 192 && a() >= 2 && e(this.f28589a[this.f28590b + 1])) ? 2 : ((this.f28589a[this.f28590b] & 240) == 224 && a() >= 3 && e(this.f28589a[this.f28590b + 1]) && e(this.f28589a[this.f28590b + 2])) ? 3 : ((this.f28589a[this.f28590b] & 248) == 240 && a() >= 4 && e(this.f28589a[this.f28590b + 1]) && e(this.f28589a[this.f28590b + 2]) && e(this.f28589a[this.f28590b + 3])) ? 4 : 0;
            if (i10 == 1) {
                iB = this.f28589a[this.f28590b] & 255;
            } else if (i10 == 2) {
                byte[] bArr = this.f28589a;
                int i11 = this.f28590b;
                iB = b(0, 0, bArr[i11], bArr[i11 + 1]);
            } else if (i10 == 3) {
                byte[] bArr2 = this.f28589a;
                int i12 = this.f28590b;
                iB = b(0, bArr2[i12] & 15, bArr2[i12 + 1], bArr2[i12 + 2]);
            } else {
                if (i10 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f28589a;
                int i13 = this.f28590b;
                iB = b(bArr3[i13], bArr3[i13 + 1], bArr3[i13 + 2], bArr3[i13 + 3]);
            }
            i = i10;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cG = g(0, byteOrder);
            if (!Character.isHighSurrogate(cG) || a() < 4) {
                codePoint = cG;
                i = 2;
            } else {
                codePoint = Character.toCodePoint(cG, g(2, byteOrder));
                i = 4;
            }
        }
        return (codePoint << 8) | i;
    }

    public final int i() {
        if (a() >= 4) {
            int iM = m();
            this.f28590b -= 4;
            return iM;
        }
        throw new IndexOutOfBoundsException("position=" + this.f28590b + ", limit=" + this.f28591c);
    }

    public final int j() {
        f(1);
        return this.f28589a[this.f28590b] & 255;
    }

    public final void k(byte[] bArr, int i, int i10) {
        f(i10);
        System.arraycopy(this.f28589a, this.f28590b, bArr, i, i10);
        this.f28590b += i10;
    }

    public final char l(Charset charset, char[] cArr) {
        int iH;
        if (a() >= d(charset) && (iH = h(charset)) != 0) {
            long j10 = iH >>> 8;
            h5.f("out of range: %s", j10, (j10 >> 32) == 0);
            int i = (int) j10;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j11 = i;
                char c8 = (char) j11;
                h5.f("Out of range: %s", j11, ((long) c8) == j11);
                for (char c9 : cArr) {
                    if (c9 == c8) {
                        this.f28590b = k3.f.d(iH & KotlinVersion.MAX_COMPONENT_VALUE) + this.f28590b;
                        return c8;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = (bArr[i] & 255) << 24;
        int i12 = i + 2;
        this.f28590b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i + 3;
        this.f28590b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f28590b = i + 4;
        return (bArr[i14] & 255) | i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n(java.nio.charset.Charset r5) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.p.n(java.nio.charset.Charset):java.lang.String");
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f28590b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i + 3;
        this.f28590b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f28590b = i + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        long j10 = ((long) bArr[i]) & 255;
        int i11 = i + 2;
        this.f28590b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 8);
        int i12 = i + 3;
        this.f28590b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i + 4;
        this.f28590b = i13;
        long j13 = j12 | ((((long) bArr[i12]) & 255) << 24);
        int i14 = i + 5;
        this.f28590b = i14;
        long j14 = j13 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i + 6;
        this.f28590b = i15;
        long j15 = j14 | ((((long) bArr[i14]) & 255) << 40);
        int i16 = i + 7;
        this.f28590b = i16;
        long j16 = j15 | ((((long) bArr[i15]) & 255) << 48);
        this.f28590b = i + 8;
        return ((((long) bArr[i16]) & 255) << 56) | j16;
    }

    public final long q() {
        f(4);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        long j10 = ((long) bArr[i]) & 255;
        int i11 = i + 2;
        this.f28590b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 8);
        int i12 = i + 3;
        this.f28590b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 16);
        this.f28590b = i + 4;
        return ((((long) bArr[i12]) & 255) << 24) | j12;
    }

    public final int r() {
        int iO = o();
        if (iO >= 0) {
            return iO;
        }
        throw new IllegalStateException(l7.o.i(iO, "Top bit not zero: "));
    }

    public final int s() {
        f(2);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = bArr[i] & 255;
        this.f28590b = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long t() {
        f(8);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        long j10 = (((long) bArr[i]) & 255) << 56;
        int i11 = i + 2;
        this.f28590b = i11;
        long j11 = j10 | ((((long) bArr[i10]) & 255) << 48);
        int i12 = i + 3;
        this.f28590b = i12;
        long j12 = j11 | ((((long) bArr[i11]) & 255) << 40);
        int i13 = i + 4;
        this.f28590b = i13;
        long j13 = j12 | ((((long) bArr[i12]) & 255) << 32);
        int i14 = i + 5;
        this.f28590b = i14;
        long j14 = j13 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i + 6;
        this.f28590b = i15;
        long j15 = j14 | ((((long) bArr[i14]) & 255) << 16);
        int i16 = i + 7;
        this.f28590b = i16;
        long j16 = j15 | ((((long) bArr[i15]) & 255) << 8);
        this.f28590b = i + 8;
        return (((long) bArr[i16]) & 255) | j16;
    }

    public final String u() {
        if (a() == 0) {
            return null;
        }
        int i = this.f28590b;
        while (i < this.f28591c && this.f28589a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f28589a;
        int i10 = this.f28590b;
        String str = z.f28608a;
        String str2 = new String(bArr, i10, i - i10, StandardCharsets.UTF_8);
        this.f28590b = i;
        if (i < this.f28591c) {
            this.f28590b = i + 1;
        }
        return str2;
    }

    public final String v(int i) {
        f(i);
        if (i == 0) {
            return "";
        }
        int i10 = this.f28590b;
        int i11 = (i10 + i) - 1;
        int i12 = (i11 >= this.f28591c || this.f28589a[i11] != 0) ? i : i - 1;
        byte[] bArr = this.f28589a;
        String str = z.f28608a;
        String str2 = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.f28590b += i;
        return str2;
    }

    public final short w() {
        f(2);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        int i10 = i + 1;
        this.f28590b = i10;
        int i11 = (bArr[i] & 255) << 8;
        this.f28590b = i + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String x(int i, Charset charset) {
        f(i);
        String str = new String(this.f28589a, this.f28590b, i, charset);
        this.f28590b += i;
        return str;
    }

    public final int y() {
        return (z() << 21) | (z() << 14) | (z() << 7) | z();
    }

    public final int z() {
        f(1);
        byte[] bArr = this.f28589a;
        int i = this.f28590b;
        this.f28590b = i + 1;
        return bArr[i] & 255;
    }

    public p(int i) {
        this.f28589a = new byte[i];
        this.f28591c = i;
    }

    public p(byte[] bArr) {
        this.f28589a = bArr;
        this.f28591c = bArr.length;
    }

    public p(int i, byte[] bArr) {
        this.f28589a = bArr;
        this.f28591c = i;
    }
}
