package xi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f36239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f36240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f36241c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f36239a.equals(kVar.f36239a) && Objects.equals(this.f36240b, kVar.f36240b) && this.f36241c.equals(kVar.f36241c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36239a, this.f36240b, this.f36241c);
    }
}
