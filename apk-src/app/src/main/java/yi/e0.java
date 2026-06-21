package yi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f45653c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f45651a.equals(e0Var.f45651a) && Objects.equals(this.f45652b, e0Var.f45652b) && this.f45653c.equals(e0Var.f45653c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45651a, this.f45652b, this.f45653c);
    }
}
