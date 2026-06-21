package yads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44432d;

    public wm3(byte[] bArr) {
        this.f44429a = bArr;
        this.f44430b = bArr.length;
    }

    public final boolean a() {
        boolean z5 = (((this.f44429a[this.f44431c] & 255) >> this.f44432d) & 1) == 1;
        b(1);
        return z5;
    }

    public final void b(int i) {
        int i10 = i / 8;
        int i11 = this.f44431c + i10;
        this.f44431c = i11;
        int i12 = (i - (i10 * 8)) + this.f44432d;
        this.f44432d = i12;
        if (i12 > 7) {
            this.f44431c = i11 + 1;
            this.f44432d = i12 - 8;
        }
        int i13 = this.f44431c;
        if (i13 >= 0) {
            int i14 = this.f44430b;
            if (i13 < i14) {
                return;
            }
            if (i13 == i14 && this.f44432d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i) {
        int i10 = this.f44431c;
        int iMin = Math.min(i, 8 - this.f44432d);
        int i11 = i10 + 1;
        int i12 = ((this.f44429a[i10] & 255) >> this.f44432d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
        while (iMin < i) {
            i12 |= (this.f44429a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i));
        b(i);
        return i13;
    }
}
