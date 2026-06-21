package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends en1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f4612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f4613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4615h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4618l = Integer.MAX_VALUE;

    public /* synthetic */ dn1(InputStream inputStream) {
        Charset charset = ao1.f3341a;
        this.f4612e = inputStream;
        this.f4613f = new byte[4096];
        this.f4614g = 0;
        this.i = 0;
        this.f4617k = 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long A() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int B() {
        return en1.f(L());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long C() {
        return en1.g(M());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int D(int i) throws co1 {
        if (i < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f4617k + this.i + i;
        if (i10 < 0) {
            throw new co1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f4618l;
        if (i10 > i11) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f4618l = i10;
        F();
        return i11;
    }

    public final void E(int i) throws co1 {
        InputStream inputStream = this.f4612e;
        int i10 = this.f4614g;
        int i11 = this.i;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.i = i11 + i;
            return;
        }
        if (i < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.f4617k;
        int i14 = i13 + i11;
        int i15 = this.f4618l;
        if (i14 + i > i15) {
            E((i15 - i13) - i11);
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f4617k = i14;
        this.f4614g = 0;
        this.i = 0;
        while (i12 < i) {
            long j10 = i - i12;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (co1 e3) {
                    e3.f4276b = true;
                    throw e3;
                }
            } catch (Throwable th2) {
                this.f4617k += i12;
                F();
                throw th2;
            }
        }
        this.f4617k += i12;
        F();
        if (i12 >= i) {
            return;
        }
        int i16 = this.f4614g;
        int i17 = i16 - this.i;
        this.i = i16;
        G(1);
        while (true) {
            int i18 = i - i17;
            int i19 = this.f4614g;
            if (i18 <= i19) {
                this.i = i18;
                return;
            } else {
                i17 += i19;
                this.i = i19;
                G(1);
            }
        }
    }

    public final void F() {
        int i = this.f4614g + this.f4615h;
        this.f4614g = i;
        int i10 = this.f4617k + i;
        int i11 = this.f4618l;
        if (i10 <= i11) {
            this.f4615h = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f4615h = i12;
        this.f4614g = i - i12;
    }

    public final void G(int i) throws co1 {
        if (H(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f4617k) - this.i) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new co1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean H(int i) throws IOException {
        InputStream inputStream = this.f4612e;
        int i10 = this.i;
        int i11 = i10 + i;
        int i12 = this.f4614g;
        if (i11 <= i12) {
            throw new IllegalStateException(l7.o.l(new StringBuilder(String.valueOf(i).length() + 66), "refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i13 = this.f4617k;
        if (i > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i > this.f4618l) {
            return false;
        }
        byte[] bArr = this.f4613f;
        if (i10 > 0) {
            if (i12 > i10) {
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.f4617k + i10;
            this.f4617k = i13;
            i12 = this.f4614g - i10;
            this.f4614g = i12;
            this.i = 0;
        }
        try {
            int i14 = inputStream.read(bArr, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
            if (i14 != 0 && i14 >= -1 && i14 <= 4096) {
                if (i14 <= 0) {
                    return false;
                }
                this.f4614g += i14;
                F();
                return this.f4614g >= i || H(i);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i14);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (co1 e3) {
            e3.f4276b = true;
            throw e3;
        }
    }

    public final byte[] I(int i) throws IOException {
        byte[] bArrJ = J(i);
        if (bArrJ != null) {
            return bArrJ;
        }
        int i10 = this.i;
        int i11 = this.f4614g;
        int i12 = i11 - i10;
        this.f4617k += i11;
        this.i = 0;
        this.f4614g = 0;
        ArrayList<byte[]> arrayListK = K(i - i12);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4613f, i10, bArr, 0, i12);
        for (byte[] bArr2 : arrayListK) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    public final byte[] J(int i) throws IOException {
        if (i == 0) {
            return ao1.f3342b;
        }
        int i10 = this.f4617k;
        int i11 = this.i;
        int i12 = i10 + i11 + i;
        if ((-2147483647) + i12 > 0) {
            throw new co1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i13 = this.f4618l;
        if (i12 > i13) {
            E((i13 - i10) - i11);
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.f4614g - i11;
        int i15 = i - i14;
        InputStream inputStream = this.f4612e;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (co1 e3) {
                e3.f4276b = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f4613f, this.i, bArr, 0, i14);
        this.f4617k += this.f4614g;
        this.i = 0;
        this.f4614g = 0;
        while (i14 < i) {
            try {
                int i16 = inputStream.read(bArr, i14, i - i14);
                if (i16 == -1) {
                    throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f4617k += i16;
                i14 += i16;
            } catch (co1 e7) {
                e7.f4276b = true;
                throw e7;
            }
        }
        return bArr;
    }

    public final ArrayList K(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f4612e.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f4617k += i11;
                i10 += i11;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() {
        int i;
        int i10 = this.i;
        int i11 = this.f4614g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4613f;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.i = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    i = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i19;
                            }
                            i = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.i = i13;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j10;
        long j11;
        long j12;
        int i = this.i;
        int i10 = this.f4614g;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f4613f;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.i = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    j10 = i13 ^ (-128);
                } else {
                    int i14 = i + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j10 = i15 ^ 16256;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j13 = (-2080896) ^ i17;
                            i12 = i16;
                            j10 = j13;
                        } else {
                            i14 = i + 5;
                            long j14 = ((long) i17) ^ (((long) bArr[i16]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i18 = i + 6;
                                long j15 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i + 7;
                                    j14 = j15 ^ (((long) bArr[i18]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i18 = i + 8;
                                        j15 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i + 9;
                                            j14 = j15 ^ (((long) bArr[i18]) << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                int i19 = i + 10;
                                                long j16 = j14 ^ (((long) bArr[i14]) << 63);
                                                if (j16 >= 0) {
                                                    j10 = j16 ^ (-9151873028817141888L);
                                                    i12 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j15 ^ j12;
                                i12 = i18;
                            }
                            j10 = j14 ^ j11;
                        }
                    }
                    i12 = i14;
                }
                this.i = i12;
                return j10;
            }
        }
        return N();
    }

    public final long N() throws co1 {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i == this.f4614g) {
                G(1);
            }
            int i10 = this.i;
            this.i = i10 + 1;
            byte b2 = this.f4613f[i10];
            j10 |= ((long) (b2 & 127)) << i;
            if ((b2 & 128) == 0) {
                return j10;
            }
        }
        throw new co1("CodedInputStream encountered a malformed varint.");
    }

    public final int O() throws co1 {
        int i = this.i;
        if (this.f4614g - i < 4) {
            G(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f4613f;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long P() throws co1 {
        int i = this.i;
        if (this.f4614g - i < 8) {
            G(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f4613f;
        long j10 = bArr[i];
        long j11 = (((long) bArr[i + 1]) & 255) << 8;
        long j12 = bArr[i + 2];
        long j13 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void a(int i) {
        this.f4618l = i;
        F();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean b() {
        return this.i == this.f4614g && !H(1);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int c() {
        return this.f4617k + this.i;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int h() throws co1 {
        if (b()) {
            this.f4616j = 0;
            return 0;
        }
        int iL = L();
        this.f4616j = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw new co1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void i(int i) {
        if (this.f4616j != i) {
            throw new co1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean k(int i) throws co1 {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                E(8);
                return true;
            }
            if (i10 == 2) {
                E(L());
                return true;
            }
            if (i10 == 3) {
                e();
                i(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                if (this.f5014c == 0) {
                    i(0);
                }
                return false;
            }
            if (i10 != 5) {
                throw new bo1();
            }
            E(4);
            return true;
        }
        int i12 = this.f4614g - this.i;
        byte[] bArr = this.f4613f;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.i;
                this.i = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw new co1("CodedInputStream encountered a malformed varint.");
        }
        while (i11 < 10) {
            if (this.i == this.f4614g) {
                G(1);
            }
            int i14 = this.i;
            this.i = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw new co1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final double l() {
        return Double.longBitsToDouble(P());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final float m() {
        return Float.intBitsToFloat(O());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long n() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long o() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int q() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long r() {
        return P();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int s() {
        return O();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean t() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String u() throws co1 {
        int iL = L();
        byte[] bArr = this.f4613f;
        if (iL > 0) {
            int i = this.f4614g;
            int i10 = this.i;
            if (iL <= i - i10) {
                String str = new String(bArr, i10, iL, ao1.f3341a);
                this.i += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iL > this.f4614g) {
            return new String(I(iL), ao1.f3341a);
        }
        G(iL);
        String str2 = new String(bArr, this.i, iL, ao1.f3341a);
        this.i += iL;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String v() throws IOException {
        int iL = L();
        int i = this.i;
        int i10 = this.f4614g;
        int i11 = i10 - i;
        byte[] bArrI = this.f4613f;
        if (iL <= i11 && iL > 0) {
            this.i = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iL <= i10) {
                G(iL);
                this.i = iL;
            } else {
                bArrI = I(iL);
            }
        }
        return lp1.d(bArrI, i, iL);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final zm1 w() throws IOException {
        int iL = L();
        int i = this.f4614g;
        int i10 = this.i;
        int i11 = i - i10;
        byte[] bArr = this.f4613f;
        if (iL <= i11 && iL > 0) {
            zm1 zm1VarB = bn1.B(bArr, i10, iL);
            this.i += iL;
            return zm1VarB;
        }
        if (iL == 0) {
            return bn1.f3837c;
        }
        if (iL < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrJ = J(iL);
        if (bArrJ != null) {
            return bn1.B(bArrJ, 0, bArrJ.length);
        }
        int i12 = this.i;
        int i13 = this.f4614g;
        int i14 = i13 - i12;
        this.f4617k += i13;
        this.i = 0;
        this.f4614g = 0;
        ArrayList<byte[]> arrayListK = K(iL - i14);
        byte[] bArr2 = new byte[iL];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        for (byte[] bArr3 : arrayListK) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i14, length);
            i14 += length;
        }
        zm1 zm1Var = bn1.f3837c;
        try {
            return new zm1(bArr2);
        } catch (co1 e3) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int x() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int y() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int z() {
        return O();
    }
}
