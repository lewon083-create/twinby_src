package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f76b;

    public f(int i, g gVar) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.f75a = i;
        this.f76b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        g gVar = fVar.f76b;
        if (!t.z.a(this.f75a, fVar.f75a)) {
            return false;
        }
        g gVar2 = this.f76b;
        return gVar2 == null ? gVar == null : gVar2.equals(gVar);
    }

    public final int hashCode() {
        int iM = (t.z.m(this.f75a) ^ 1000003) * 1000003;
        g gVar = this.f76b;
        return iM ^ (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + u.v(this.f75a) + ", error=" + this.f76b + "}";
    }
}
