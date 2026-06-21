package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb2 f44257a = new lb2(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44258b;

    public final long a(ld0 ld0Var) {
        int i = 0;
        ld0Var.b(this.f44257a.f40463a, 0, 1, false);
        int i10 = this.f44257a.f40463a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        ld0Var.b(this.f44257a.f40463a, 1, i12, false);
        while (i < i12) {
            i++;
            i13 = (this.f44257a.f40463a[i] & 255) + (i13 << 8);
        }
        this.f44258b = i12 + 1 + this.f44258b;
        return i13;
    }
}
