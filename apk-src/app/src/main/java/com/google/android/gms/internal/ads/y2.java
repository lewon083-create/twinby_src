package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f12462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12465e;

    public y2(int i, int i10, int i11, byte[] bArr) {
        this.f12461a = i11;
        switch (i11) {
            case 3:
                this.f12462b = bArr;
                this.f12464d = i;
                this.f12463c = i10;
                this.f12465e = 0;
                a();
                break;
            default:
                this.f12462b = bArr;
                this.f12464d = i;
                this.f12463c = i10;
                this.f12465e = 0;
                G();
                break;
        }
    }

    public boolean A(int i) {
        int i10 = this.f12463c;
        int i11 = this.f12464d;
        int i12 = i / 8;
        int i13 = i11 + i12;
        int i14 = (this.f12465e + i) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= i10) {
                break;
            }
            if (F(i11)) {
                i13++;
                i11 += 2;
            }
        }
        if (i13 >= i10) {
            return i13 == i10 && i14 == 0;
        }
        return true;
    }

    public boolean B() {
        int i = this.f12462b[this.f12464d] & (128 >> this.f12465e);
        v();
        return i != 0;
    }

    public int C(int i) {
        int i10;
        byte[] bArr = this.f12462b;
        this.f12465e += i;
        int i11 = 0;
        while (true) {
            i10 = this.f12465e;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f12465e = i12;
            int i13 = this.f12464d;
            i11 |= (bArr[i13] & 255) << i12;
            if (true != F(i13 + 1)) {
                i = 1;
            }
            this.f12464d = i13 + i;
        }
        int i14 = this.f12464d;
        int i15 = ((bArr[i14] & 255) >> (8 - i10)) | i11;
        int i16 = 32 - i;
        if (i10 == 8) {
            this.f12465e = 0;
            this.f12464d = i14 + (true != F(i14 + 1) ? 1 : 2);
        }
        int i17 = ((-1) >>> i16) & i15;
        G();
        return i17;
    }

    public int D() {
        int iE = E();
        int i = iE % 2;
        return ((iE + 1) / 2) * (i == 0 ? -1 : 1);
    }

    public int E() {
        int i = 0;
        while (!B()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? C(i) : 0);
    }

    public boolean F(int i) {
        if (i < 2 || i >= this.f12463c) {
            return false;
        }
        byte[] bArr = this.f12462b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public void G() {
        int i;
        int i10 = this.f12464d;
        boolean z5 = false;
        if (i10 >= 0 && (i10 < (i = this.f12463c) || (i10 == i && this.f12465e == 0))) {
            z5 = true;
        }
        ix.k0(z5);
    }

    public void a() {
        int i;
        int i10;
        switch (this.f12461a) {
            case 2:
                int i11 = this.f12463c;
                com.google.android.gms.internal.measurement.h5.r(i11 >= 0 && (i11 < (i = this.f12465e) || (i11 == i && this.f12464d == 0)));
                break;
            default:
                int i12 = this.f12464d;
                com.google.android.gms.internal.measurement.h5.r(i12 >= 0 && (i12 < (i10 = this.f12463c) || (i12 == i10 && this.f12465e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f12465e - this.f12463c) * 8) - this.f12464d;
    }

    public void c() {
        if (this.f12464d == 0) {
            return;
        }
        this.f12464d = 0;
        this.f12463c++;
        a();
    }

    public boolean d(int i) {
        int i10 = this.f12464d;
        int i11 = i / 8;
        int i12 = i10 + i11;
        int i13 = (this.f12465e + i) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f12463c) {
                break;
            }
            if (r(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f12463c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i = this.f12464d;
        int i10 = this.f12465e;
        int i11 = 0;
        while (this.f12464d < this.f12463c && !h()) {
            i11++;
        }
        boolean z5 = this.f12464d == this.f12463c;
        this.f12464d = i;
        this.f12465e = i10;
        return !z5 && d((i11 * 2) + 1);
    }

    public int f() {
        com.google.android.gms.internal.measurement.h5.r(this.f12464d == 0);
        return this.f12463c;
    }

    public int g() {
        return (this.f12463c * 8) + this.f12464d;
    }

    public boolean h() {
        switch (this.f12461a) {
            case 2:
                boolean z5 = (this.f12462b[this.f12463c] & (128 >> this.f12464d)) != 0;
                s();
                return z5;
            case 3:
                boolean z10 = (this.f12462b[this.f12464d] & (128 >> this.f12465e)) != 0;
                s();
                return z10;
            default:
                boolean z11 = (((this.f12462b[this.f12464d] & 255) >> this.f12465e) & 1) == 1;
                t(1);
                return z11;
        }
    }

    public int i(int i) {
        switch (this.f12461a) {
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.f12464d += i;
                int i10 = 0;
                while (true) {
                    int i11 = this.f12464d;
                    if (i11 <= 8) {
                        byte[] bArr = this.f12462b;
                        int i12 = this.f12463c;
                        int i13 = ((-1) >>> (32 - i)) & (i10 | ((bArr[i12] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f12464d = 0;
                            this.f12463c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                    int i14 = i11 - 8;
                    this.f12464d = i14;
                    byte[] bArr2 = this.f12462b;
                    int i15 = this.f12463c;
                    this.f12463c = i15 + 1;
                    i10 |= (bArr2[i15] & 255) << i14;
                }
                break;
            case 3:
                this.f12465e += i;
                int i16 = 0;
                while (true) {
                    int i17 = this.f12465e;
                    if (i17 <= 8) {
                        byte[] bArr3 = this.f12462b;
                        int i18 = this.f12464d;
                        int i19 = ((-1) >>> (32 - i)) & (i16 | ((bArr3[i18] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f12465e = 0;
                            this.f12464d = i18 + (r(i18 + 1) ? 2 : 1);
                        }
                        a();
                        return i19;
                    }
                    int i20 = i17 - 8;
                    this.f12465e = i20;
                    byte[] bArr4 = this.f12462b;
                    int i21 = this.f12464d;
                    i16 |= (bArr4[i21] & 255) << i20;
                    if (!r(i21 + 1)) {
                        i = 1;
                    }
                    this.f12464d = i21 + i;
                }
                break;
            default:
                int i22 = this.f12464d;
                int iMin = Math.min(i, 8 - this.f12465e);
                byte[] bArr5 = this.f12462b;
                int i23 = i22 + 1;
                int i24 = ((bArr5[i22] & 255) >> this.f12465e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
                while (iMin < i) {
                    i24 |= (bArr5[i23] & 255) << iMin;
                    iMin += 8;
                    i23++;
                }
                int i25 = i24 & ((-1) >>> (32 - i));
                t(i);
                return i25;
        }
    }

    public void j(int i, byte[] bArr) {
        int i10 = i >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f12462b;
            int i12 = this.f12463c;
            int i13 = i12 + 1;
            this.f12463c = i13;
            byte b2 = bArr2[i12];
            int i14 = this.f12464d;
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
        int i16 = this.f12464d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f12462b;
            int i17 = this.f12463c;
            this.f12463c = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            this.f12464d = i16 - 8;
        }
        int i18 = this.f12464d + i15;
        this.f12464d = i18;
        byte[] bArr4 = this.f12462b;
        int i19 = this.f12463c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f12464d = 0;
            this.f12463c = i19 + 1;
        }
        a();
    }

    public long k(int i) {
        if (i <= 32) {
            int i10 = i(i);
            String str = m3.z.f28608a;
            return 4294967295L & ((long) i10);
        }
        int i11 = i(i - 32);
        int i12 = i(32);
        String str2 = m3.z.f28608a;
        return (4294967295L & ((long) i12)) | ((((long) i11) & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        com.google.android.gms.internal.measurement.h5.r(this.f12464d == 0);
        System.arraycopy(this.f12462b, this.f12463c, bArr, 0, i);
        this.f12463c += i;
        a();
    }

    public int m() {
        int i = 0;
        while (!h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(int i, byte[] bArr) {
        this.f12462b = bArr;
        this.f12463c = 0;
        this.f12464d = 0;
        this.f12465e = i;
    }

    public void p(m3.p pVar) {
        o(pVar.f28591c, pVar.f28589a);
        q(pVar.f28590b * 8);
    }

    public void q(int i) {
        int i10 = i / 8;
        this.f12463c = i10;
        this.f12464d = i - (i10 * 8);
        a();
    }

    public boolean r(int i) {
        if (2 > i || i >= this.f12463c) {
            return false;
        }
        byte[] bArr = this.f12462b;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public void s() {
        switch (this.f12461a) {
            case 2:
                int i = this.f12464d + 1;
                this.f12464d = i;
                if (i == 8) {
                    this.f12464d = 0;
                    this.f12463c++;
                }
                a();
                break;
            default:
                int i10 = this.f12465e + 1;
                this.f12465e = i10;
                if (i10 == 8) {
                    this.f12465e = 0;
                    int i11 = this.f12464d;
                    this.f12464d = i11 + (r(i11 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i) {
        int i10;
        switch (this.f12461a) {
            case 2:
                int i11 = i / 8;
                int i12 = this.f12463c + i11;
                this.f12463c = i12;
                int i13 = (i - (i11 * 8)) + this.f12464d;
                this.f12464d = i13;
                if (i13 > 7) {
                    this.f12463c = i12 + 1;
                    this.f12464d = i13 - 8;
                }
                a();
                break;
            case 3:
                int i14 = this.f12464d;
                int i15 = i / 8;
                int i16 = i14 + i15;
                this.f12464d = i16;
                int i17 = (i - (i15 * 8)) + this.f12465e;
                this.f12465e = i17;
                if (i17 > 7) {
                    this.f12464d = i16 + 1;
                    this.f12465e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.f12464d) {
                        a();
                        break;
                    } else if (r(i14)) {
                        this.f12464d++;
                        i14 += 2;
                    }
                }
                break;
            default:
                int i18 = i / 8;
                int i19 = this.f12464d + i18;
                this.f12464d = i19;
                int i20 = (i - (i18 * 8)) + this.f12465e;
                this.f12465e = i20;
                boolean z5 = true;
                if (i20 > 7) {
                    this.f12464d = i19 + 1;
                    this.f12465e = i20 - 8;
                }
                int i21 = this.f12464d;
                if (i21 < 0 || (i21 >= (i10 = this.f12463c) && (i21 != i10 || this.f12465e != 0))) {
                    z5 = false;
                }
                com.google.android.gms.internal.measurement.h5.r(z5);
                break;
        }
    }

    public void u(int i) {
        com.google.android.gms.internal.measurement.h5.r(this.f12464d == 0);
        this.f12463c += i;
        a();
    }

    public void v() {
        int i = this.f12465e + 1;
        this.f12465e = i;
        if (i == 8) {
            this.f12465e = 0;
            int i10 = this.f12464d;
            this.f12464d = i10 + (true == F(i10 + 1) ? 2 : 1);
        }
        G();
    }

    public boolean w() {
        int i = (this.f12462b[this.f12464d] & 255) >> this.f12465e;
        z(1);
        return 1 == (i & 1);
    }

    public int x(int i) {
        int i10 = this.f12464d;
        int i11 = 8 - this.f12465e;
        int i12 = i10 + 1;
        byte[] bArr = this.f12462b;
        int iMin = Math.min(i, i11);
        int i13 = ((bArr[i10] & 255) >> this.f12465e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
        while (iMin < i) {
            i13 |= (bArr[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i));
        z(i);
        return i14;
    }

    public void y(int i) {
        int i10 = this.f12464d;
        int i11 = i / 8;
        int i12 = i10 + i11;
        this.f12464d = i12;
        int i13 = (i - (i11 * 8)) + this.f12465e;
        this.f12465e = i13;
        if (i13 > 7) {
            this.f12464d = i12 + 1;
            this.f12465e = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.f12464d) {
                G();
                return;
            } else if (F(i10)) {
                this.f12464d++;
                i10 += 2;
            }
        }
    }

    public void z(int i) {
        int i10;
        int i11 = i / 8;
        int i12 = this.f12464d + i11;
        this.f12464d = i12;
        int i13 = (i - (i11 * 8)) + this.f12465e;
        this.f12465e = i13;
        if (i13 > 7) {
            i12++;
            this.f12464d = i12;
            i13 -= 8;
            this.f12465e = i13;
        }
        boolean z5 = false;
        if (i12 >= 0 && (i12 < (i10 = this.f12463c) || (i12 == i10 && i13 == 0))) {
            z5 = true;
        }
        ix.k0(z5);
    }

    public y2(byte[] bArr, int i, byte b2) {
        this.f12461a = i;
        switch (i) {
            case 5:
                this.f12462b = bArr;
                this.f12463c = bArr.length;
                break;
            default:
                this.f12462b = bArr;
                this.f12463c = bArr.length;
                break;
        }
    }

    public y2() {
        this.f12461a = 2;
        this.f12462b = m3.z.f28609b;
    }

    public y2(int i, byte[] bArr) {
        this.f12461a = 2;
        this.f12462b = bArr;
        this.f12465e = i;
    }

    public y2(int i, int i10) {
        this.f12461a = 4;
        this.f12463c = i;
        this.f12464d = i10;
        this.f12462b = new byte[(i10 * 2) - 1];
        this.f12465e = 0;
    }
}
