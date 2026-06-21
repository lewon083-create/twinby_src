package yi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f45694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45696c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f45694a.equals(nVar.f45694a) && this.f45695b.equals(nVar.f45695b) && this.f45696c.equals(nVar.f45696c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45694a, this.f45695b, this.f45696c);
    }
}
