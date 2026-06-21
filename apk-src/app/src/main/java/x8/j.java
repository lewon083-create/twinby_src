package x8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f36028a;

    public j(h hVar) {
        this.f36028a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f36045b;
        if (obj2.equals(obj2)) {
            return this.f36028a.equals(((j) qVar).f36028a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f36045b.hashCode() ^ 1000003) * 1000003) ^ this.f36028a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f36045b + ", androidClientInfo=" + this.f36028a + "}";
    }
}
