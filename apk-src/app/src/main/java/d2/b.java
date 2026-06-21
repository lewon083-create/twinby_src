package d2;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f15528c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f15526a, bVar.f15526a) && Objects.equals(this.f15527b, bVar.f15527b) && Objects.equals(this.f15528c, bVar.f15528c);
    }

    public final int hashCode() {
        return Objects.hash(this.f15526a, this.f15527b, this.f15528c);
    }
}
