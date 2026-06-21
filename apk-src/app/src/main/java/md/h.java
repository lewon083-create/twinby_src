package md;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f28851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28852b;

    public h(q qVar, boolean z5) {
        this.f28851a = qVar;
        this.f28852b = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f28851a.equals(this.f28851a) && hVar.f28852b == this.f28852b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28851a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f28852b).hashCode();
    }
}
