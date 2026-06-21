package ad;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a1 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.e f849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f850c;

    public p(zc.e eVar, a1 a1Var) {
        this.f849b = eVar;
        this.f850c = a1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zc.e eVar = this.f849b;
        return this.f850c.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f849b.equals(pVar.f849b) && this.f850c.equals(pVar.f850c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f849b, this.f850c);
    }

    public final String toString() {
        return this.f850c + ".onResultOf(" + this.f849b + ")";
    }
}
