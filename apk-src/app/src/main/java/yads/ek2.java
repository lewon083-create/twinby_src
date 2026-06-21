package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ek2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38159b;

    public ek2(boolean z5, int i) {
        this.f38158a = i;
        this.f38159b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ek2.class == obj.getClass()) {
            ek2 ek2Var = (ek2) obj;
            if (this.f38158a == ek2Var.f38158a && this.f38159b == ek2Var.f38159b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38158a * 31) + (this.f38159b ? 1 : 0);
    }
}
