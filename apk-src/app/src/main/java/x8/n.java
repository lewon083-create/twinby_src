package x8;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f36043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f36044b;

    public n(u uVar, t tVar) {
        this.f36043a = uVar;
        this.f36044b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f36043a;
            if (uVar != null ? uVar.equals(((n) vVar).f36043a) : ((n) vVar).f36043a == null) {
                t tVar = this.f36044b;
                if (tVar != null ? tVar.equals(((n) vVar).f36044b) : ((n) vVar).f36044b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f36043a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f36044b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f36043a + ", mobileSubtype=" + this.f36044b + "}";
    }
}
