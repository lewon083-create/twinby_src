package bj;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f2166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f2167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f2168c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2166a.equals(eVar.f2166a) && this.f2167b.equals(eVar.f2167b) && this.f2168c.equals(eVar.f2168c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2166a, this.f2167b, this.f2168c);
    }
}
