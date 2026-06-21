package yads;

import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40147d;

    public kb2() {
        this.f40144a = lb3.f40471f;
    }

    public final void a() {
        int i = this.f40145b;
        if (i >= 0) {
            int i10 = this.f40147d;
            if (i < i10) {
                return;
            }
            if (i == i10 && this.f40146c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int b() {
        return ((this.f40147d - this.f40145b) * 8) - this.f40146c;
    }

    public final int c() {
        if (this.f40146c == 0) {
            return this.f40145b;
        }
        throw new IllegalStateException();
    }

    public final int d() {
        return (this.f40145b * 8) + this.f40146c;
    }

    public final boolean e() {
        boolean z5 = (this.f40144a[this.f40145b] & (128 >> this.f40146c)) != 0;
        g();
        return z5;
    }

    public final long f() {
        int iA = a(4);
        int iA2 = a(32);
        int i = lb3.f40466a;
        return ((((long) iA) & 4294967295L) << 32) | (((long) iA2) & 4294967295L);
    }

    public final void g() {
        int i = this.f40146c + 1;
        this.f40146c = i;
        if (i == 8) {
            this.f40146c = 0;
            this.f40145b++;
        }
        a();
    }

    public final void b(int i) {
        int i10 = i / 8;
        this.f40145b = i10;
        this.f40146c = i - (i10 * 8);
        a();
    }

    public final void d(int i) {
        if (this.f40146c != 0) {
            throw new IllegalStateException();
        }
        this.f40145b += i;
        a();
    }

    public kb2(int i, byte[] bArr) {
        this.f40144a = bArr;
        this.f40147d = i;
    }

    public final int a(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.f40146c += i;
        int i11 = 0;
        while (true) {
            i10 = this.f40146c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f40146c = i12;
            byte[] bArr = this.f40144a;
            int i13 = this.f40145b;
            this.f40145b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f40144a;
        int i14 = this.f40145b;
        int i15 = ((-1) >>> (32 - i)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f40146c = 0;
            this.f40145b = i14 + 1;
        }
        a();
        return i15;
    }

    public final void c(int i) {
        int i10 = i / 8;
        int i11 = this.f40145b + i10;
        this.f40145b = i11;
        int i12 = (i - (i10 * 8)) + this.f40146c;
        this.f40146c = i12;
        if (i12 > 7) {
            this.f40145b = i11 + 1;
            this.f40146c = i12 - 8;
        }
        a();
    }

    public kb2(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final void a(byte[] bArr, int i) {
        int i10 = i >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f40144a;
            int i12 = this.f40145b;
            int i13 = i12 + 1;
            this.f40145b = i13;
            byte b2 = bArr2[i12];
            int i14 = this.f40146c;
            byte b10 = (byte) (b2 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (KotlinVersion.MAX_COMPONENT_VALUE >> i15));
        bArr[i10] = b11;
        int i16 = this.f40146c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f40144a;
            int i17 = this.f40145b;
            this.f40145b = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f40146c = i16 - 8;
        }
        int i18 = this.f40146c + i15;
        this.f40146c = i18;
        byte[] bArr4 = this.f40144a;
        int i19 = this.f40145b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f40146c = 0;
            this.f40145b = i19 + 1;
        }
        a();
    }

    public final String a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        if (this.f40146c == 0) {
            System.arraycopy(this.f40144a, this.f40145b, bArr, 0, i);
            this.f40145b += i;
            a();
            return new String(bArr, charset);
        }
        throw new IllegalStateException();
    }

    public final void a(int i, byte[] bArr) {
        this.f40144a = bArr;
        this.f40145b = 0;
        this.f40146c = 0;
        this.f40147d = i;
    }
}
