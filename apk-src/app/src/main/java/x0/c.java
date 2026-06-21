package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f35563c = new c(g.f35589k, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f35564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35565b;

    public c(g gVar, int i) {
        if (gVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f35564a = gVar;
        this.f35565b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f35564a.equals(cVar.f35564a) && this.f35565b == cVar.f35565b;
    }

    public final int hashCode() {
        return ((this.f35564a.hashCode() ^ 1000003) * 1000003) ^ this.f35565b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb2.append(this.f35564a);
        sb2.append(", fallbackRule=");
        return t.z.d(this.f35565b, "}", sb2);
    }
}
