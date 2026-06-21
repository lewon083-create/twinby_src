package yi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f45709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f45711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f45712g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f45706a.equals(rVar.f45706a) && this.f45707b.equals(rVar.f45707b) && this.f45708c.equals(rVar.f45708c) && this.f45709d.equals(rVar.f45709d) && this.f45710e.equals(rVar.f45710e) && Objects.equals(this.f45711f, rVar.f45711f) && Objects.equals(this.f45712g, rVar.f45712g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45706a, this.f45707b, this.f45708c, this.f45709d, this.f45710e, this.f45711f, this.f45712g);
    }
}
