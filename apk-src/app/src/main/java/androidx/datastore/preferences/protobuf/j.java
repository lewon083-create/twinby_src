package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f1419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1424h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1425j = Integer.MAX_VALUE;

    public j(FileInputStream fileInputStream) {
        Charset charset = c0.f1368a;
        this.f1419c = fileInputStream;
        this.f1420d = new byte[4096];
        this.f1421e = 0;
        this.f1423g = 0;
        this.i = 0;
    }

    public final byte[] D(int i) throws IOException {
        byte[] bArrE = E(i);
        if (bArrE != null) {
            return bArrE;
        }
        int i10 = this.f1423g;
        int i11 = this.f1421e;
        int length = i11 - i10;
        this.i += i11;
        this.f1423g = 0;
        this.f1421e = 0;
        ArrayList<byte[]> arrayListF = F(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1420d, i10, bArr, 0, length);
        for (byte[] bArr2 : arrayListF) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] E(int i) throws IOException {
        if (i == 0) {
            return c0.f1369b;
        }
        if (i < 0) {
            throw e0.d();
        }
        int i10 = this.i;
        int i11 = this.f1423g;
        int i12 = i10 + i11 + i;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f1425j;
        if (i12 > i13) {
            N((i13 - i10) - i11);
            throw e0.e();
        }
        int i14 = this.f1421e - i11;
        int i15 = i - i14;
        FileInputStream fileInputStream = this.f1419c;
        if (i15 >= 4096) {
            try {
                if (i15 > fileInputStream.available()) {
                    return null;
                }
            } catch (e0 e3) {
                e3.f1377b = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f1420d, this.f1423g, bArr, 0, i14);
        this.i += this.f1421e;
        this.f1423g = 0;
        this.f1421e = 0;
        while (i14 < i) {
            try {
                int i16 = fileInputStream.read(bArr, i14, i - i14);
                if (i16 == -1) {
                    throw e0.e();
                }
                this.i += i16;
                i14 += i16;
            } catch (e0 e7) {
                e7.f1377b = true;
                throw e7;
            }
        }
        return bArr;
    }

    public final ArrayList F(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f1419c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw e0.e();
                }
                this.i += i11;
                i10 += i11;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int G() throws e0 {
        int i = this.f1423g;
        if (this.f1421e - i < 4) {
            M(4);
            i = this.f1423g;
        }
        this.f1423g = i + 4;
        byte[] bArr = this.f1420d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long H() throws e0 {
        int i = this.f1423g;
        if (this.f1421e - i < 8) {
            M(8);
            i = this.f1423g;
        }
        this.f1423g = i + 8;
        byte[] bArr = this.f1420d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int I() {
        int i;
        int i10 = this.f1423g;
        int i11 = this.f1421e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1420d;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f1423g = i12;
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
                this.f1423g = i13;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i = this.f1423g;
        int i10 = this.f1421e;
        if (i10 != i) {
            int i11 = i + 1;
            byte[] bArr = this.f1420d;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f1423g = i11;
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
                        i12 = i14;
                    } else {
                        int i16 = i + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j13 = (-2080896) ^ i17;
                        } else {
                            long j14 = i17;
                            i12 = i + 5;
                            long j15 = j14 ^ (((long) bArr[i16]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i16 = i + 6;
                                long j16 = j15 ^ (((long) bArr[i12]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j15 = j16 ^ (((long) bArr[i16]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j16 = j15 ^ (((long) bArr[i12]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            long j17 = (j16 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i18 = i + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i12 = i16;
                        j10 = j13;
                    }
                }
                this.f1423g = i12;
                return j10;
            }
        }
        return K();
    }

    public final long K() throws e0 {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f1423g == this.f1421e) {
                M(1);
            }
            int i10 = this.f1423g;
            this.f1423g = i10 + 1;
            byte b2 = this.f1420d[i10];
            j10 |= ((long) (b2 & 127)) << i;
            if ((b2 & 128) == 0) {
                return j10;
            }
        }
        throw e0.c();
    }

    public final void L() {
        int i = this.f1421e + this.f1422f;
        this.f1421e = i;
        int i10 = this.i + i;
        int i11 = this.f1425j;
        if (i10 <= i11) {
            this.f1422f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f1422f = i12;
        this.f1421e = i - i12;
    }

    public final void M(int i) throws e0 {
        if (O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f1423g) {
            throw e0.e();
        }
        throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void N(int i) throws e0 {
        int i10 = this.f1421e;
        int i11 = this.f1423g;
        int i12 = i10 - i11;
        if (i <= i12 && i >= 0) {
            this.f1423g = i11 + i;
            return;
        }
        FileInputStream fileInputStream = this.f1419c;
        if (i < 0) {
            throw e0.d();
        }
        int i13 = this.i;
        int i14 = i13 + i11;
        int i15 = i14 + i;
        int i16 = this.f1425j;
        if (i15 > i16) {
            N((i16 - i13) - i11);
            throw e0.e();
        }
        this.i = i14;
        this.f1421e = 0;
        this.f1423g = 0;
        while (i12 < i) {
            long j10 = i - i12;
            try {
                try {
                    long jSkip = fileInputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (e0 e3) {
                    e3.f1377b = true;
                    throw e3;
                }
            } catch (Throwable th2) {
                this.i += i12;
                L();
                throw th2;
            }
        }
        this.i += i12;
        L();
        if (i12 >= i) {
            return;
        }
        int i17 = this.f1421e;
        int i18 = i17 - this.f1423g;
        this.f1423g = i17;
        M(1);
        while (true) {
            int i19 = i - i18;
            int i20 = this.f1421e;
            if (i19 <= i20) {
                this.f1423g = i19;
                return;
            } else {
                i18 += i20;
                this.f1423g = i20;
                M(1);
            }
        }
    }

    public final boolean O(int i) throws IOException {
        FileInputStream fileInputStream = this.f1419c;
        int i10 = this.f1423g;
        int i11 = i10 + i;
        int i12 = this.f1421e;
        if (i11 <= i12) {
            throw new IllegalStateException(a0.u.k(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.i;
        if (i <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i <= this.f1425j) {
            byte[] bArr = this.f1420d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.i += i10;
                this.f1421e -= i10;
                this.f1423g = 0;
            }
            int i14 = this.f1421e;
            try {
                int i15 = fileInputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.i) - i14));
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f1421e += i15;
                    L();
                    if (this.f1421e >= i) {
                        return true;
                    }
                    return O(i);
                }
            } catch (e0 e3) {
                e3.f1377b = true;
                throw e3;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void a(int i) throws e0 {
        if (this.f1424h != i) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int b() {
        return this.i + this.f1423g;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean c() {
        return this.f1423g == this.f1421e && !O(1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void d(int i) {
        this.f1425j = i;
        L();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int e(int i) throws e0 {
        if (i < 0) {
            throw e0.d();
        }
        int i10 = this.i + this.f1423g + i;
        if (i10 < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i11 = this.f1425j;
        if (i10 > i11) {
            throw e0.e();
        }
        this.f1425j = i10;
        L();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean f() {
        return J() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final h g() throws IOException {
        int I = I();
        int i = this.f1421e;
        int i10 = this.f1423g;
        int i11 = i - i10;
        byte[] bArr = this.f1420d;
        if (I <= i11 && I > 0) {
            h hVarE = h.e(bArr, i10, I);
            this.f1423g += I;
            return hVarE;
        }
        if (I == 0) {
            return h.f1405d;
        }
        if (I < 0) {
            throw e0.d();
        }
        byte[] bArrE = E(I);
        if (bArrE != null) {
            return h.e(bArrE, 0, bArrE.length);
        }
        int i12 = this.f1423g;
        int i13 = this.f1421e;
        int length = i13 - i12;
        this.i += i13;
        this.f1423g = 0;
        this.f1421e = 0;
        ArrayList<byte[]> arrayListF = F(I - length);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        for (byte[] bArr3 : arrayListF) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        h hVar = h.f1405d;
        return new h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final double h() {
        return Double.longBitsToDouble(H());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int i() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int j() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long k() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final float l() {
        return Float.intBitsToFloat(G());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int m() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long n() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int o() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long p() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int q() {
        int I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long r() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String s() throws e0 {
        int I = I();
        byte[] bArr = this.f1420d;
        if (I > 0) {
            int i = this.f1421e;
            int i10 = this.f1423g;
            if (I <= i - i10) {
                String str = new String(bArr, i10, I, c0.f1368a);
                this.f1423g += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I < 0) {
            throw e0.d();
        }
        if (I > this.f1421e) {
            return new String(D(I), c0.f1368a);
        }
        M(I);
        String str2 = new String(bArr, this.f1423g, I, c0.f1368a);
        this.f1423g += I;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final String t() throws IOException {
        int I = I();
        int i = this.f1423g;
        int i10 = this.f1421e;
        int i11 = i10 - i;
        byte[] bArrD = this.f1420d;
        if (I <= i11 && I > 0) {
            this.f1423g = i + I;
        } else {
            if (I == 0) {
                return "";
            }
            if (I < 0) {
                throw e0.d();
            }
            i = 0;
            if (I <= i10) {
                M(I);
                this.f1423g = I;
            } else {
                bArrD = D(I);
            }
        }
        return s1.f1472a.d(bArrD, i, I);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int u() throws e0 {
        if (c()) {
            this.f1424h = 0;
            return 0;
        }
        int I = I();
        this.f1424h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int v() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final long w() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean y(int i) throws e0 {
        int i10 = i & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                N(8);
                return true;
            }
            if (i10 == 2) {
                N(I());
                return true;
            }
            if (i10 == 3) {
                z();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw e0.b();
            }
            N(4);
            return true;
        }
        int i12 = this.f1421e - this.f1423g;
        byte[] bArr = this.f1420d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f1423g;
                this.f1423g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw e0.c();
        }
        while (i11 < 10) {
            if (this.f1423g == this.f1421e) {
                M(1);
            }
            int i14 = this.f1423g;
            this.f1423g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw e0.c();
        return true;
    }
}
