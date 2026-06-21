package yi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f45642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f45643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f45644f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f45639a.equals(c0Var.f45639a) && Objects.equals(this.f45640b, c0Var.f45640b) && this.f45641c.equals(c0Var.f45641c) && this.f45642d.equals(c0Var.f45642d) && this.f45643e.equals(c0Var.f45643e) && Objects.equals(this.f45644f, c0Var.f45644f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45639a, this.f45640b, this.f45641c, this.f45642d, this.f45643e, this.f45644f);
    }
}
