package f2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16567b;

    public b(Object obj, Object obj2) {
        this.f16566a = obj;
        this.f16567b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f16566a, this.f16566a) && Objects.equals(bVar.f16567b, this.f16567b);
    }

    public final int hashCode() {
        Object obj = this.f16566a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f16567b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f16566a + " " + this.f16567b + "}";
    }
}
