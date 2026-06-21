package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f84b;

    public g(Throwable th2, int i) {
        this.f83a = i;
        this.f84b = th2;
    }

    public final boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            Throwable th3 = gVar.f84b;
            if (this.f83a == gVar.f83a && ((th2 = this.f84b) != null ? th2.equals(th3) : th3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f83a ^ 1000003) * 1000003;
        Throwable th2 = this.f84b;
        return i ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f83a + ", cause=" + this.f84b + "}";
    }
}
