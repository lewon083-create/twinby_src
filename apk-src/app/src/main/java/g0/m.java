package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f19653a;

    public m(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f19653a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f19653a.equals(((m) obj).f19653a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19653a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f19653a + "}";
    }
}
