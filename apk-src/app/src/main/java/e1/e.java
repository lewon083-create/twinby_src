package e1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15952d = new e(0, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f15953e = new e(1, 3, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f15954f = new e(1, 3, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f15955g = new e(6, 7, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f15956h = new e(6, 6, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15959c;

    public e(int i, int i10, int i11) {
        this.f15957a = i;
        this.f15958b = i10;
        this.f15959c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f15957a == eVar.f15957a && this.f15958b == eVar.f15958b && this.f15959c == eVar.f15959c;
    }

    public final int hashCode() {
        return ((((this.f15957a ^ 1000003) * 1000003) ^ this.f15958b) * 1000003) ^ this.f15959c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb2.append(this.f15957a);
        sb2.append(", transfer=");
        sb2.append(this.f15958b);
        sb2.append(", range=");
        return t.z.d(this.f15959c, "}", sb2);
    }
}
