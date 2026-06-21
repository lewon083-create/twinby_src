package vi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f34863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f34864b;

    public b(Boolean bool, a aVar) {
        this.f34863a = bool;
        this.f34864b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f34863a, bVar.f34863a) && Objects.equals(this.f34864b, bVar.f34864b);
    }

    public final int hashCode() {
        return Objects.hash(this.f34863a, this.f34864b);
    }
}
