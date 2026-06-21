package ad;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends a1 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.a f890b;

    public w(d2.a aVar) {
        this.f890b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f890b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return this.f890b.equals(((w) obj).f890b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f890b.hashCode();
    }

    public final String toString() {
        return this.f890b.toString();
    }
}
