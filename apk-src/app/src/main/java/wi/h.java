package wi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35277f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (Objects.equals(this.f35272a, hVar.f35272a) && this.f35273b.equals(hVar.f35273b) && this.f35274c.equals(hVar.f35274c) && Objects.equals(this.f35275d, hVar.f35275d) && Objects.equals(this.f35276e, hVar.f35276e) && Objects.equals(this.f35277f, hVar.f35277f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35272a, this.f35273b, this.f35274c, this.f35275d, this.f35276e, this.f35277f);
    }
}
