package f0;

import a0.r1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f16491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f16492b;

    public d(o oVar, r1 r1Var) {
        if (oVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f16491a = oVar;
        this.f16492b = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f16491a.equals(dVar.f16491a) && this.f16492b.equals(dVar.f16492b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16491a.hashCode() ^ 1000003) * 1000003) ^ this.f16492b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f16491a + ", imageProxy=" + this.f16492b + "}";
    }
}
