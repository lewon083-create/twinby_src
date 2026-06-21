package yi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f45732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f45733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f45738g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f45732a.equals(vVar.f45732a) && this.f45733b.equals(vVar.f45733b) && Objects.equals(this.f45734c, vVar.f45734c) && this.f45735d.equals(vVar.f45735d) && this.f45736e.equals(vVar.f45736e) && this.f45737f.equals(vVar.f45737f) && this.f45738g.equals(vVar.f45738g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45732a, this.f45733b, this.f45734c, this.f45735d, this.f45736e, this.f45737f, this.f45738g);
    }
}
