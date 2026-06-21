package zc;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46224b;

    public h(List list) {
        this.f46224b = list;
    }

    @Override // zc.g
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f46224b;
            if (i >= list.size()) {
                return true;
            }
            if (!((g) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f46224b.equals(((h) obj).f46224b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46224b.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z5 = true;
        for (Object obj : this.f46224b) {
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
