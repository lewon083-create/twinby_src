package r0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.b f32137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.b f32138b;

    public a(s0.b bVar, s0.b bVar2) {
        this.f32137a = bVar;
        this.f32138b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f32137a.equals(aVar.f32137a) && this.f32138b.equals(aVar.f32138b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32137a.hashCode() ^ 1000003) * 1000003) ^ this.f32138b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f32137a + ", secondaryOutConfig=" + this.f32138b + "}";
    }
}
