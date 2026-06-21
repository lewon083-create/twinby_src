package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21018b;

    public u0(int i, boolean z5) {
        this.f21017a = i;
        this.f21018b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f21017a == u0Var.f21017a && this.f21018b == u0Var.f21018b;
    }

    public final int hashCode() {
        return (this.f21017a * 31) + (this.f21018b ? 1 : 0);
    }
}
