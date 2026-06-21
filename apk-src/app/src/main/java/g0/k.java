package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19631a;

    public k(Object obj) {
        this.f19631a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f19631a.equals(((k) obj).f19631a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19631a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f19631a + "}";
    }
}
