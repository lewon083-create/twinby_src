package pi;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f31496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f31497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f31498d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f31495a.equals(fVar.f31495a) && this.f31496b.equals(fVar.f31496b) && Objects.equals(this.f31497c, fVar.f31497c) && this.f31498d.equals(fVar.f31498d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f31495a, this.f31496b, this.f31497c, this.f31498d);
    }
}
