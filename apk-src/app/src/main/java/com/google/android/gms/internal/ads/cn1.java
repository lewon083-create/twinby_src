package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 extends en1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4272h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4274k = Integer.MAX_VALUE;

    public /* synthetic */ cn1(byte[] bArr, int i, int i10) {
        this.f4269e = bArr;
        this.f4270f = i10 + i;
        this.f4272h = i;
        this.i = i;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long A() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int B() {
        return en1.f(G());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long C() {
        return en1.g(H());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int D(int i) throws co1 {
        if (i < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = (this.f4272h - this.i) + i;
        if (i10 < 0) {
            throw new co1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f4274k;
        if (i10 > i11) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f4274k = i10;
        F();
        return i11;
    }

    public final void E(int i) throws co1 {
        if (i >= 0) {
            int i10 = this.f4270f;
            int i11 = this.f4272h;
            if (i <= i10 - i11) {
                this.f4272h = i11 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void F() {
        int i = this.f4270f + this.f4271g;
        this.f4270f = i;
        int i10 = i - this.i;
        int i11 = this.f4274k;
        if (i10 <= i11) {
            this.f4271g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f4271g = i12;
        this.f4270f = i - i12;
    }

    public final int G() {
        int i;
        int i10 = this.f4272h;
        int i11 = this.f4270f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4269e;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f4272h = i12;
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
                this.f4272h = i13;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j10;
        long j11;
        long j12;
        int i = this.f4272h;
        int i10 = this.f4270f;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f4269e;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f4272h = i11;
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
                this.f4272h = i12;
                return j10;
            }
        }
        return I();
    }

    public final long I() throws co1 {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i10 = this.f4272h;
            if (i10 == this.f4270f) {
                throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f4272h = i10 + 1;
            byte b2 = this.f4269e[i10];
            j10 |= ((long) (b2 & 127)) << i;
            if ((b2 & 128) == 0) {
                return j10;
            }
        }
        throw new co1("CodedInputStream encountered a malformed varint.");
    }

    public final int J() throws co1 {
        int i = this.f4272h;
        if (this.f4270f - i < 4) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f4272h = i + 4;
        byte[] bArr = this.f4269e;
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long K() throws co1 {
        int i = this.f4272h;
        if (this.f4270f - i < 8) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f4272h = i + 8;
        byte[] bArr = this.f4269e;
        long j10 = bArr[i];
        long j11 = (((long) bArr[i + 1]) & 255) << 8;
        long j12 = bArr[i + 2];
        long j13 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void a(int i) {
        this.f4274k = i;
        F();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean b() {
        return this.f4272h == this.f4270f;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int c() {
        return this.f4272h - this.i;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int h() throws co1 {
        if (b()) {
            this.f4273j = 0;
            return 0;
        }
        int iG = G();
        this.f4273j = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new co1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final void i(int i) throws co1 {
        if (this.f4273j != i) {
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
                E(G());
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
        int i12 = this.f4270f - this.f4272h;
        byte[] bArr = this.f4269e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f4272h;
                this.f4272h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw new co1("CodedInputStream encountered a malformed varint.");
        }
        while (i11 < 10) {
            int i14 = this.f4272h;
            if (i14 == this.f4270f) {
                throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f4272h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw new co1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final double l() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final float m() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long n() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long o() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int q() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final long r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int s() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final boolean t() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String u() throws co1 {
        int iG = G();
        if (iG > 0) {
            int i = this.f4270f;
            int i10 = this.f4272h;
            if (iG <= i - i10) {
                String str = new String(this.f4269e, i10, iG, ao1.f3341a);
                this.f4272h += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final String v() throws co1 {
        int iG = G();
        if (iG > 0) {
            int i = this.f4270f;
            int i10 = this.f4272h;
            if (iG <= i - i10) {
                String strD = lp1.d(this.f4269e, i10, iG);
                this.f4272h += iG;
                return strD;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG <= 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final zm1 w() throws co1 {
        int iG = G();
        byte[] bArr = this.f4269e;
        if (iG > 0) {
            int i = this.f4270f;
            int i10 = this.f4272h;
            if (iG <= i - i10) {
                zm1 zm1VarB = bn1.B(bArr, i10, iG);
                this.f4272h += iG;
                return zm1VarB;
            }
        }
        if (iG == 0) {
            return bn1.f3837c;
        }
        if (iG > 0) {
            int i11 = this.f4270f;
            int i12 = this.f4272h;
            if (iG <= i11 - i12) {
                int i13 = iG + i12;
                this.f4272h = i13;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, i13);
                zm1 zm1Var = bn1.f3837c;
                return new zm1(bArrCopyOfRange);
            }
        }
        if (iG <= 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int x() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int y() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.en1
    public final int z() {
        return J();
    }
}
