package f0;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0.b f16485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16486b;

    public b(q0.b bVar, int i) {
        if (bVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f16485a = bVar;
        this.f16486b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f16485a.equals(bVar.f16485a) && this.f16486b == bVar.f16486b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16485a.hashCode() ^ 1000003) * 1000003) ^ this.f16486b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f16485a);
        sb2.append(", jpegQuality=");
        return z.d(this.f16486b, "}", sb2);
    }
}
