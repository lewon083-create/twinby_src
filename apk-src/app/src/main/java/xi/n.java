package xi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f36247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f36248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f36249c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f36247a.equals(nVar.f36247a) && this.f36248b.equals(nVar.f36248b) && Objects.equals(this.f36249c, nVar.f36249c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36247a, this.f36248b, this.f36249c);
    }
}
