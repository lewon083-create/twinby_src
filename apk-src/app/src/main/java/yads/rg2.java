package yads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rg2 implements qg2, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42602b;

    public rg2(List list) {
        this.f42602b = list;
    }

    @Override // yads.qg2
    public final boolean apply(Object obj) {
        for (int i = 0; i < this.f42602b.size(); i++) {
            if (!((qg2) this.f42602b.get(i)).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rg2) {
            return this.f42602b.equals(((rg2) obj).f42602b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42602b.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.f42602b;
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z5 = true;
        for (Object obj : list) {
            if (!z5) {
                sb2.append(',');
            }
            sb2.append(obj);
            z5 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
