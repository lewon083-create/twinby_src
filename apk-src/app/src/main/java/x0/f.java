package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f35581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35582b;

    public f(g gVar, int i) {
        if (gVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f35581a = gVar;
        this.f35582b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f35581a.equals(fVar.f35581a) && this.f35582b == fVar.f35582b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35581a.hashCode() ^ 1000003) * 1000003) ^ this.f35582b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityRatio{quality=");
        sb2.append(this.f35581a);
        sb2.append(", aspectRatio=");
        return t.z.d(this.f35582b, "}", sb2);
    }
}
