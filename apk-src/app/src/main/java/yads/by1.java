package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class by1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f37171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37172e;

    public by1(int i) {
        this.f37168a = i;
        byte[] bArr = new byte[131];
        this.f37171d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f37169b) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f37171d;
            int length = bArr2.length;
            int i12 = this.f37172e + i11;
            if (length < i12) {
                this.f37171d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f37171d, this.f37172e, i11);
            this.f37172e += i11;
        }
    }

    public final void b(int i) {
        if (this.f37169b) {
            throw new IllegalStateException();
        }
        boolean z5 = i == this.f37168a;
        this.f37169b = z5;
        if (z5) {
            this.f37172e = 3;
            this.f37170c = false;
        }
    }

    public final boolean a(int i) {
        if (!this.f37169b) {
            return false;
        }
        this.f37172e -= i;
        this.f37169b = false;
        this.f37170c = true;
        return true;
    }
}
