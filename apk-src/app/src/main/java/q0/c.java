package q0;

import java.util.List;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f31557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31558b;

    public c(m mVar, List list) {
        if (mVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f31557a = mVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f31558b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f31557a.equals(cVar.f31557a) && this.f31558b.equals(cVar.f31558b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f31557a.hashCode() ^ 1000003) * 1000003) ^ this.f31558b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{surfaceEdge=");
        sb2.append(this.f31557a);
        sb2.append(", outConfigs=");
        return z.h(sb2, this.f31558b, "}");
    }
}
