package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44026d;

    public vf1(int i, int i10, int i11, int i12) {
        this.f44023a = i;
        this.f44024b = i10;
        this.f44025c = i11;
        this.f44026d = i12;
    }

    public final boolean a(int i) {
        if (i == 1) {
            if (this.f44023a - this.f44024b <= 1) {
                return false;
            }
        } else if (this.f44025c - this.f44026d <= 1) {
            return false;
        }
        return true;
    }
}
