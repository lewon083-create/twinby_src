package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37907a;

    public dx(boolean z5) {
        super(0);
        this.f37907a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && this.f37907a == ((dx) obj).f37907a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37907a);
    }

    public final String toString() {
        return "CmpPresent(value=" + this.f37907a + ")";
    }
}
