package ni;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29413b;

    public j(String str, String str2) {
        this.f29412a = str;
        this.f29413b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Objects.equals(jVar.f29412a, this.f29412a) && Objects.equals(jVar.f29413b, this.f29413b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f29412a, this.f29413b);
    }
}
