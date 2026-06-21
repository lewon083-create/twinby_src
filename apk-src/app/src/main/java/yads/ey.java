package yads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ey extends ua2 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f38282b;

    public ey(Comparator comparator) {
        this.f38282b = (Comparator) pg2.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f38282b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            return this.f38282b.equals(((ey) obj).f38282b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38282b.hashCode();
    }

    public final String toString() {
        return this.f38282b.toString();
    }
}
