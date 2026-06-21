package yi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f45671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45676g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f45670a.equals(jVar.f45670a) && this.f45671b.equals(jVar.f45671b) && Objects.equals(this.f45672c, jVar.f45672c) && Objects.equals(this.f45673d, jVar.f45673d) && Objects.equals(this.f45674e, jVar.f45674e) && Objects.equals(this.f45675f, jVar.f45675f) && Objects.equals(this.f45676g, jVar.f45676g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45670a, this.f45671b, this.f45672c, this.f45673d, this.f45674e, this.f45675f, this.f45676g);
    }
}
