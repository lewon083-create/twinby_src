package wi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f35262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f35263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f35267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35268g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f35262a.equals(eVar.f35262a) && this.f35263b.equals(eVar.f35263b) && Objects.equals(this.f35264c, eVar.f35264c) && Objects.equals(this.f35265d, eVar.f35265d) && Objects.equals(this.f35266e, eVar.f35266e) && this.f35267f.equals(eVar.f35267f) && Objects.equals(this.f35268g, eVar.f35268g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35262a, this.f35263b, this.f35264c, this.f35265d, this.f35266e, this.f35267f, this.f35268g);
    }
}
