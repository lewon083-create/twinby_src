package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ub1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43621a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43622b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43623c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f43624d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43625e = 15;

    public final void a(int i) {
        int i10 = this.f43623c;
        int[] iArr = this.f43624d;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.f43621a;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy(this.f43624d, 0, iArr2, i12, i11);
            this.f43621a = 0;
            this.f43622b = this.f43623c - 1;
            this.f43624d = iArr2;
            this.f43625e = length - 1;
        }
        int i13 = (this.f43622b + 1) & this.f43625e;
        this.f43622b = i13;
        this.f43624d[i13] = i;
        this.f43623c++;
    }
}
