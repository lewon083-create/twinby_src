package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f6518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6521d;

    public ik0(int i, byte[] bArr) {
        this.f6518a = bArr;
        this.f6521d = i;
    }

    public final void a(tk0 tk0Var) {
        byte[] bArr = tk0Var.f10641a;
        int i = tk0Var.f10643c;
        this.f6518a = bArr;
        this.f6519b = 0;
        this.f6520c = 0;
        this.f6521d = i;
        d(tk0Var.f10642b * 8);
    }

    public final int b() {
        return ((this.f6521d - this.f6519b) * 8) - this.f6520c;
    }

    public final int c() {
        ix.k0(this.f6520c == 0);
        return this.f6519b;
    }

    public final void d(int i) {
        int i10 = i / 8;
        this.f6519b = i10;
        this.f6520c = i - (i10 * 8);
        m();
    }

    public final void e() {
        int i = this.f6520c + 1;
        this.f6520c = i;
        if (i == 8) {
            this.f6520c = 0;
            this.f6519b++;
        }
        m();
    }

    public final void f(int i) {
        int i10 = i / 8;
        int i11 = this.f6519b + i10;
        this.f6519b = i11;
        int i12 = (i - (i10 * 8)) + this.f6520c;
        this.f6520c = i12;
        if (i12 > 7) {
            this.f6519b = i11 + 1;
            this.f6520c = i12 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f6518a[this.f6519b] & (128 >> this.f6520c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.f6520c += i;
        int i11 = 0;
        while (true) {
            i10 = this.f6520c;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f6520c = i12;
            byte[] bArr = this.f6518a;
            int i13 = this.f6519b;
            this.f6519b = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.f6518a;
        int i14 = this.f6519b;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i;
        if (i10 == 8) {
            this.f6520c = 0;
            this.f6519b = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        m();
        return i17;
    }

    public final long i(int i) {
        if (i <= 32) {
            int iH = h(i);
            String str = cq0.f4293a;
            return 4294967295L & ((long) iH);
        }
        int iH2 = h(i - 32);
        int iH3 = h(32);
        String str2 = cq0.f4293a;
        return (4294967295L & ((long) iH3)) | ((((long) iH2) & 4294967295L) << 32);
    }

    public final void j(int i, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i >> 3;
            if (i11 >= i10) {
                break;
            }
            byte[] bArr2 = this.f6518a;
            int i12 = this.f6519b;
            int i13 = i12 + 1;
            this.f6519b = i13;
            byte b2 = bArr2[i12];
            int i14 = this.f6520c;
            byte b10 = (byte) (b2 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((bArr2[i13] & 255) >> (8 - i14)) | b10);
            i11++;
        }
        int i15 = i & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (KotlinVersion.MAX_COMPONENT_VALUE >> i15));
        bArr[i10] = b11;
        int i16 = this.f6520c;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f6518a;
            int i17 = this.f6519b;
            this.f6519b = i17 + 1;
            b11 = (byte) (b11 | ((bArr3[i17] & 255) << i16));
            bArr[i10] = b11;
            i16 -= 8;
        }
        int i18 = i16 + i15;
        this.f6520c = i18;
        byte[] bArr4 = this.f6518a;
        int i19 = this.f6519b;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | b11);
        if (i18 == 8) {
            this.f6520c = 0;
            this.f6519b = i19 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f6520c == 0) {
            return;
        }
        this.f6520c = 0;
        this.f6519b++;
        m();
    }

    public final void l(int i) {
        ix.k0(this.f6520c == 0);
        this.f6519b += i;
        m();
    }

    public final void m() {
        int i;
        int i10 = this.f6519b;
        boolean z5 = false;
        if (i10 >= 0 && (i10 < (i = this.f6521d) || (i10 == i && this.f6520c == 0))) {
            z5 = true;
        }
        ix.k0(z5);
    }

    public ik0() {
        this.f6518a = cq0.f4294b;
    }
}
