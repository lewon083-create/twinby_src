package s3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f32448c = new a1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32450b;

    public a1(int i, boolean z5) {
        this.f32449a = i;
        this.f32450b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f32449a == a1Var.f32449a && this.f32450b == a1Var.f32450b;
    }

    public final int hashCode() {
        return (this.f32449a << 1) + (this.f32450b ? 1 : 0);
    }
}
