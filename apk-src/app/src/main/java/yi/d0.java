package yi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f45648c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (Objects.equals(this.f45646a, d0Var.f45646a) && this.f45647b.equals(d0Var.f45647b) && this.f45648c.equals(d0Var.f45648c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45646a, this.f45647b, this.f45648c);
    }
}
