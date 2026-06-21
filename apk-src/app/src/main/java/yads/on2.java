package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class on2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final on2 f41656b = new on2(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41657a;

    public on2(boolean z5) {
        this.f41657a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && on2.class == obj.getClass() && this.f41657a == ((on2) obj).f41657a;
    }

    public final int hashCode() {
        return !this.f41657a ? 1 : 0;
    }
}
