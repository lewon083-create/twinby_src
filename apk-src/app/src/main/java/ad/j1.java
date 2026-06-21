package ad;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends a1 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f819b;

    public j1(a1 a1Var) {
        this.f819b = a1Var;
    }

    @Override // ad.a1
    public final a1 a() {
        return this.f819b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f819b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            return this.f819b.equals(((j1) obj).f819b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f819b.hashCode();
    }

    public final String toString() {
        return this.f819b + ".reverse()";
    }
}
