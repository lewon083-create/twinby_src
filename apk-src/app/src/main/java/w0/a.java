package w0;

import a0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f34943b;

    public a(int i, v vVar) {
        this.f34942a = i;
        if (vVar == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f34943b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f34942a == aVar.f34942a && this.f34943b.equals(aVar.f34943b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34942a ^ 1000003) * 1000003) ^ this.f34943b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f34942a + ", cameraIdentifier=" + this.f34943b + "}";
    }
}
