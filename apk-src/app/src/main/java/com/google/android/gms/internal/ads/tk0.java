package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f10637d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f10638e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d51 f10639f = d51.w(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f10640g = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f10641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10643c;

    public tk0(int i, byte[] bArr) {
        this.f10641a = bArr;
        this.f10643c = i;
    }

    public static int u(Charset charset) {
        ix.e0(f10639f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b2) {
        return (b2 & 192) == 128;
    }

    public static int x(int i, int i10, int i11, int i12) {
        return gr.R((byte) 0, fs1.a(((i & 7) << 2) | ((i10 & 48) >> 4)), fs1.a(((i11 & 60) >> 2) | ((i10 & 15) << 4)), fs1.a((i12 & 63) | ((i11 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.f10641a;
        if (i > bArr.length) {
            this.f10641a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.f10643c - this.f10642b, 0);
    }

    public final void C(int i) {
        boolean z5 = false;
        if (i >= 0 && i <= this.f10641a.length) {
            z5 = true;
        }
        ix.o(z5);
        this.f10643c = i;
    }

    public final int D() {
        return this.f10642b;
    }

    public final void E(int i) {
        boolean z5 = false;
        if (i >= 0 && i <= this.f10643c) {
            z5 = true;
        }
        ix.o(z5);
        this.f10642b = i;
    }

    public final byte[] F() {
        return this.f10641a;
    }

    public final void G(int i) {
        E(this.f10642b + i);
    }

    public final void H(byte[] bArr, int i, int i10) {
        v(i10);
        System.arraycopy(this.f10641a, this.f10642b, bArr, i, i10);
        this.f10642b += i10;
    }

    public final int I() {
        v(1);
        return this.f10641a[this.f10642b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f10642b -= 4;
            return b();
        }
        int i = this.f10642b;
        int i10 = this.f10643c;
        throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i10).length()), i, "position=", i10, ", limit="));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        this.f10642b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        this.f10642b = i + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        this.f10642b = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        this.f10642b = i + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f10642b = i12;
        int i13 = bArr[i10] & 255;
        this.f10642b = i + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f10642b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f10642b = i12;
        long j12 = bArr[i11];
        this.f10642b = i + 4;
        return (((long) bArr[i12]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f10642b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f10642b = i12;
        long j12 = bArr[i11];
        this.f10642b = i + 4;
        return ((((long) bArr[i12]) & 255) << 24) | (255 & j10) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f10642b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.f10642b = i14;
        int i15 = bArr[i12] & 255;
        this.f10642b = i + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        int i12 = i + 2;
        this.f10642b = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i + 3;
        this.f10642b = i14;
        int i15 = bArr[i12] & 255;
        this.f10642b = i + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f10642b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f10642b = i12;
        long j12 = bArr[i11];
        int i13 = i + 4;
        this.f10642b = i13;
        long j13 = bArr[i12];
        int i14 = i + 5;
        this.f10642b = i14;
        long j14 = bArr[i13];
        int i15 = i + 6;
        this.f10642b = i15;
        long j15 = bArr[i14];
        int i16 = i + 7;
        this.f10642b = i16;
        long j16 = bArr[i15];
        this.f10642b = i + 8;
        return ((j16 & 255) << 8) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | (((long) bArr[i16]) & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        long j10 = bArr[i];
        int i11 = i + 2;
        this.f10642b = i11;
        long j11 = bArr[i10];
        int i12 = i + 3;
        this.f10642b = i12;
        long j12 = bArr[i11];
        int i13 = i + 4;
        this.f10642b = i13;
        long j13 = bArr[i12];
        int i14 = i + 5;
        this.f10642b = i14;
        long j14 = bArr[i13];
        int i15 = i + 6;
        this.f10642b = i15;
        long j15 = bArr[i14];
        int i16 = i + 7;
        this.f10642b = i16;
        long j16 = bArr[i15];
        this.f10642b = i + 8;
        return ((j16 & 255) << 48) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((j15 & 255) << 40) | ((((long) bArr[i16]) & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f10641a;
        int i = this.f10642b;
        int i10 = i + 1;
        this.f10642b = i10;
        int i11 = bArr[i] & 255;
        this.f10642b = i + 2;
        int i12 = bArr[i10] & 255;
        this.f10642b = i + 4;
        return (i11 << 8) | i12;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(l7.o.j(iB, "Top bit not zero: ", new StringBuilder(String.valueOf(iB).length() + 18)));
    }

    public final int i() {
        int iC = c();
        if (iC >= 0) {
            return iC;
        }
        throw new IllegalStateException(l7.o.j(iC, "Top bit not zero: ", new StringBuilder(String.valueOf(iC).length() + 18)));
    }

    public final long j() {
        long jD = d();
        if (jD >= 0) {
            return jD;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(jD).length() + 18);
        sb2.append("Top bit not zero: ");
        sb2.append(jD);
        throw new IllegalStateException(sb2.toString());
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.f10641a;
        int i10 = this.f10642b;
        String str = new String(bArr, i10, i, charset);
        this.f10642b = i10 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i10 = this.f10642b;
        int i11 = (i10 + i) - 1;
        int i12 = (i11 >= this.f10643c || this.f10641a[i11] != 0) ? i : i - 1;
        byte[] bArr = this.f10641a;
        String str = cq0.f4293a;
        String str2 = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.f10642b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.f10642b;
        while (i < this.f10643c && this.f10641a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f10641a;
        int i10 = this.f10642b;
        String str = cq0.f4293a;
        String str2 = new String(bArr, i10, i - i10, StandardCharsets.UTF_8);
        this.f10642b = i;
        if (i < this.f10643c) {
            this.f10642b = i + 1;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String n(java.nio.charset.Charset r7) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tk0.n(java.nio.charset.Charset):java.lang.String");
    }

    public final long o() {
        int i;
        v(1);
        long j10 = this.f10641a[this.f10642b];
        int i10 = 7;
        while (true) {
            i = 0;
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
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("Invalid UTF-8 sequence first byte: ");
            sb2.append(j10);
            throw new NumberFormatException(sb2.toString());
        }
        v(i);
        for (int i12 = 1; i12 < i; i12++) {
            byte b2 = this.f10641a[this.f10642b + i12];
            if ((b2 & 192) != 128) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 42);
                sb3.append("Invalid UTF-8 sequence continuation byte: ");
                sb3.append(j10);
                throw new NumberFormatException(sb3.toString());
            }
            j10 = (j10 << 6) | ((long) (b2 & 63));
        }
        this.f10642b += i;
        return j10;
    }

    public final long p() {
        long j10 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f10642b == this.f10643c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jK = K();
            j10 |= (127 & jK) << (i * 7);
            if ((jK & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f10641a;
            int i = this.f10642b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f10642b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f10641a;
        int i10 = this.f10642b;
        byte b2 = bArr2[i10];
        if (b2 == -2) {
            if (bArr2[i10 + 1] != -1) {
                return null;
            }
            this.f10642b = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f10642b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b2;
        byte b10;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f10641a;
            int i10 = this.f10642b + i;
            b2 = bArr[i10];
            b10 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f10641a;
            int i11 = this.f10642b + i;
            b2 = bArr2[i11 + 1];
            b10 = bArr2[i11];
        }
        return (char) ((b2 << 8) | (b10 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int iT;
        if (B() >= u(charset) && (iT = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j10 = i;
                char c8 = (char) j10;
                ix.Z("Out of range: %s", j10, ((long) c8) == j10);
                for (char c9 : cArr) {
                    if (c9 == c8) {
                        this.f10642b = gr.e(iT & KotlinVersion.MAX_COMPONENT_VALUE) + this.f10642b;
                        return c8;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int codePoint;
        int i;
        int iX;
        ix.e0(f10639f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i10 = this.f10642b;
            int i11 = this.f10643c;
            throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length()), i10, "position=", i11, ", limit="));
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.f10641a[this.f10642b];
            if ((b2 & 128) == 0) {
                codePoint = b2 & 255;
                return (codePoint << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.f10641a[this.f10642b];
            if ((b10 & 128) == 0) {
                i = 1;
            } else if ((b10 & 224) == 192 && B() >= 2 && w(this.f10641a[this.f10642b + 1])) {
                i = 2;
            } else {
                if ((this.f10641a[this.f10642b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.f10641a;
                    int i13 = this.f10642b;
                    if (w(bArr[i13 + 1]) && w(bArr[i13 + 2])) {
                        i = 3;
                    }
                }
                if ((this.f10641a[this.f10642b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.f10641a;
                    int i14 = this.f10642b;
                    if (w(bArr2[i14 + 1]) && w(bArr2[i14 + 2]) && w(bArr2[i14 + 3])) {
                        i = 4;
                    }
                }
                i = 0;
            }
            if (i == 1) {
                iX = this.f10641a[this.f10642b] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.f10641a;
                int i15 = this.f10642b;
                iX = x(0, 0, bArr3[i15], bArr3[i15 + 1]);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        byte[] bArr4 = this.f10641a;
                        int i16 = this.f10642b;
                        iX = x(bArr4[i16], bArr4[i16 + 1], bArr4[i16 + 2], bArr4[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f10641a;
                int i17 = this.f10642b;
                iX = x(0, bArr5[i17] & 15, bArr5[i17 + 1], bArr5[i17 + 2]);
            }
            i12 = i;
            codePoint = iX;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cR = r(0, byteOrder);
            if (!Character.isHighSurrogate(cR) || B() < 4) {
                codePoint = cR;
                i12 = 2;
            } else {
                codePoint = Character.toCodePoint(cR, r(2, byteOrder));
                i12 = 4;
            }
        }
        return (codePoint << 8) | i12;
    }

    public final void v(int i) {
        if (!f10640g.get() || B() >= i) {
            return;
        }
        int iB = B();
        throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(iB).length()), i, "bytesNeeded= ", iB, ", bytesLeft="));
    }

    public final void y(int i) {
        byte[] bArr = this.f10641a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.f10641a = bArr;
        this.f10643c = i;
        this.f10642b = 0;
    }

    public tk0() {
        this.f10641a = cq0.f4294b;
    }

    public tk0(int i) {
        this.f10641a = new byte[i];
        this.f10643c = i;
    }

    public tk0(byte[] bArr) {
        this.f10641a = bArr;
        this.f10643c = bArr.length;
    }
}
