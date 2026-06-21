package yads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40465c;

    public lb2() {
        this.f40463a = lb3.f40471f;
    }

    public final void a(int i) {
        byte[] bArr = this.f40463a;
        if (i > bArr.length) {
            this.f40463a = Arrays.copyOf(bArr, i);
        }
    }

    public final int b() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i11 = i + 3;
        int i12 = i10 | ((bArr[i + 2] & 255) << 8);
        this.f40464b = i + 4;
        return (bArr[i11] & 255) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c() {
        /*
            r8 = this;
            int r0 = r8.f40465c
            int r1 = r8.f40464b
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = r8.f40465c
            r2 = 13
            r3 = 10
            if (r1 >= r0) goto L1f
            byte[] r0 = r8.f40463a
            r0 = r0[r1]
            int r4 = yads.lb3.f40466a
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L9
        L1f:
            int r0 = r8.f40464b
            int r4 = r1 - r0
            r5 = 3
            if (r4 < r5) goto L41
            byte[] r4 = r8.f40463a
            r6 = r4[r0]
            r7 = -17
            if (r6 != r7) goto L41
            int r6 = r0 + 1
            r6 = r4[r6]
            r7 = -69
            if (r6 != r7) goto L41
            int r6 = r0 + 2
            r4 = r4[r6]
            r6 = -65
            if (r4 != r6) goto L41
            int r0 = r0 + r5
            r8.f40464b = r0
        L41:
            byte[] r0 = r8.f40463a
            int r4 = r8.f40464b
            int r5 = r1 - r4
            java.lang.String r0 = yads.lb3.a(r0, r4, r5)
            r8.f40464b = r1
            int r4 = r8.f40465c
            if (r1 != r4) goto L52
            goto L69
        L52:
            byte[] r5 = r8.f40463a
            r6 = r5[r1]
            if (r6 != r2) goto L5f
            int r1 = r1 + 1
            r8.f40464b = r1
            if (r1 != r4) goto L5f
            goto L69
        L5f:
            int r1 = r8.f40464b
            r2 = r5[r1]
            if (r2 != r3) goto L69
            int r1 = r1 + 1
            r8.f40464b = r1
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lb2.c():java.lang.String");
    }

    public final int d() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i11 = i + 3;
        int i12 = i10 | ((bArr[i + 2] & 255) << 16);
        this.f40464b = i + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    public final long e() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 7;
        long j10 = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        this.f40464b = i + 8;
        return ((((long) bArr[i10]) & 255) << 56) | j10;
    }

    public final short f() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 1;
        int i11 = bArr[i] & 255;
        this.f40464b = i + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long g() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 3;
        long j10 = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16);
        this.f40464b = i + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j10;
    }

    public final int h() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 1;
        int i11 = bArr[i] & 255;
        this.f40464b = i + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long i() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 7;
        long j10 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        this.f40464b = i + 8;
        return (((long) bArr[i10]) & 255) | j10;
    }

    public final String j() {
        int i = this.f40465c;
        int i10 = this.f40464b;
        if (i - i10 == 0) {
            return null;
        }
        while (i10 < this.f40465c && this.f40463a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f40463a;
        int i11 = this.f40464b;
        String strA = lb3.a(bArr, i11, i10 - i11);
        this.f40464b = i10;
        if (i10 < this.f40465c) {
            this.f40464b = i10 + 1;
        }
        return strA;
    }

    public final short k() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 1;
        int i11 = (bArr[i] & 255) << 8;
        this.f40464b = i + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final int l() {
        return (m() << 21) | (m() << 14) | (m() << 7) | m();
    }

    public final int m() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        this.f40464b = i + 1;
        return bArr[i] & 255;
    }

    public final long n() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 3;
        long j10 = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 16) | ((((long) bArr[i + 2]) & 255) << 8);
        this.f40464b = i + 4;
        return (((long) bArr[i10]) & 255) | j10;
    }

    public final int o() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 2;
        int i11 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.f40464b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final int p() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(og2.a("Top bit not zero: ", iB));
    }

    public final long q() {
        long jI = i();
        if (jI >= 0) {
            return jI;
        }
        throw new IllegalStateException(pe.a.d(jI, "Top bit not zero: "));
    }

    public final int r() {
        byte[] bArr = this.f40463a;
        int i = this.f40464b;
        int i10 = i + 1;
        int i11 = (bArr[i] & 255) << 8;
        this.f40464b = i + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long s() {
        int i;
        int i10;
        long j10 = this.f40463a[this.f40464b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j10) != 0) {
                i11--;
            } else if (i11 < 6) {
                j10 &= (long) (i12 - 1);
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(pe.a.d(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i10; i++) {
            byte b2 = this.f40463a[this.f40464b + i];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(pe.a.d(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b2 & 63));
        }
        this.f40464b += i10;
        return j10;
    }

    public final String b(int i) {
        if (i == 0) {
            return "";
        }
        int i10 = this.f40464b;
        int i11 = (i10 + i) - 1;
        String strA = lb3.a(this.f40463a, i10, (i11 >= this.f40465c || this.f40463a[i11] != 0) ? i : i - 1);
        this.f40464b += i;
        return strA;
    }

    public final void d(int i) {
        if (i < 0 || i > this.f40463a.length) {
            throw new IllegalArgumentException();
        }
        this.f40465c = i;
    }

    public final void e(int i) {
        if (i < 0 || i > this.f40465c) {
            throw new IllegalArgumentException();
        }
        this.f40464b = i;
    }

    public lb2(int i) {
        this.f40463a = new byte[i];
        this.f40465c = i;
    }

    public final byte[] a() {
        return this.f40463a;
    }

    public final void a(byte[] bArr, int i, int i10) {
        System.arraycopy(this.f40463a, this.f40464b, bArr, i, i10);
        this.f40464b += i10;
    }

    public lb2(int i, byte[] bArr) {
        this.f40463a = bArr;
        this.f40465c = i;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        this.f40463a = bArr;
        this.f40465c = length;
        this.f40464b = 0;
    }

    public lb2(byte[] bArr) {
        this.f40463a = bArr;
        this.f40465c = bArr.length;
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.f40463a, this.f40464b, i, charset);
        this.f40464b += i;
        return str;
    }

    public final void c(int i) {
        byte[] bArr = this.f40463a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.f40463a = bArr;
        this.f40465c = i;
        this.f40464b = 0;
    }
}
