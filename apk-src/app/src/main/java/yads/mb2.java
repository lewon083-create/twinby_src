package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40856d;

    public mb2(byte[] bArr, int i, int i10) {
        a(bArr, i, i10);
    }

    public final void a() {
        int i = this.f40855c;
        if (i >= 0) {
            int i10 = this.f40854b;
            if (i < i10) {
                return;
            }
            if (i == i10 && this.f40856d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i = this.f40855c;
        int i10 = this.f40856d;
        int i11 = 0;
        while (this.f40855c < this.f40854b && !c()) {
            i11++;
        }
        boolean z5 = this.f40855c == this.f40854b;
        this.f40855c = i;
        this.f40856d = i10;
        return !z5 && a((i11 * 2) + 1);
    }

    public final boolean c() {
        boolean z5 = (this.f40853a[this.f40855c] & (128 >> this.f40856d)) != 0;
        f();
        return z5;
    }

    public final int d() {
        int i = 0;
        while (!c()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    public final int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public final void f() {
        int i = this.f40856d + 1;
        this.f40856d = i;
        if (i == 8) {
            this.f40856d = 0;
            int i10 = this.f40855c;
            this.f40855c = i10 + (c(i10 + 1) ? 2 : 1);
        }
        a();
    }

    public final boolean a(int i) {
        int i10 = this.f40855c;
        int i11 = i / 8;
        int i12 = i10 + i11;
        int i13 = (this.f40856d + i) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i14 > i12 || i12 >= this.f40854b) {
                break;
            }
            if (c(i14)) {
                i12++;
                i10 += 3;
            } else {
                i10 = i14;
            }
        }
        int i15 = this.f40854b;
        if (i12 >= i15) {
            return i12 == i15 && i13 == 0;
        }
        return true;
    }

    public final boolean c(int i) {
        if (2 > i || i >= this.f40854b) {
            return false;
        }
        byte[] bArr = this.f40853a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public final void d(int i) {
        int i10 = this.f40855c;
        int i11 = i / 8;
        int i12 = i10 + i11;
        this.f40855c = i12;
        int i13 = (i - (i11 * 8)) + this.f40856d;
        this.f40856d = i13;
        if (i13 > 7) {
            this.f40855c = i12 + 1;
            this.f40856d = i13 - 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i14 <= this.f40855c) {
                if (c(i14)) {
                    this.f40855c++;
                    i10 += 3;
                } else {
                    i10 = i14;
                }
            } else {
                a();
                return;
            }
        }
    }

    public final int b(int i) {
        int i10;
        this.f40856d += i;
        int i11 = 0;
        while (true) {
            i10 = this.f40856d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.f40856d = i12;
            byte[] bArr = this.f40853a;
            int i13 = this.f40855c;
            i11 |= (bArr[i13] & 255) << i12;
            if (!c(i13 + 1)) {
                i = 1;
            }
            this.f40855c = i13 + i;
        }
        byte[] bArr2 = this.f40853a;
        int i14 = this.f40855c;
        int i15 = ((-1) >>> (32 - i)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.f40856d = 0;
            this.f40855c = i14 + (c(i14 + 1) ? 2 : 1);
        }
        a();
        return i15;
    }

    public final void a(byte[] bArr, int i, int i10) {
        this.f40853a = bArr;
        this.f40855c = i;
        this.f40854b = i10;
        this.f40856d = 0;
        a();
    }
}
