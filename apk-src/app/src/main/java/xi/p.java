package xi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f36252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f36253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f36254c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (Objects.equals(this.f36252a, pVar.f36252a) && Objects.equals(this.f36253b, pVar.f36253b) && this.f36254c.equals(pVar.f36254c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36252a, this.f36253b, this.f36254c);
    }
}
