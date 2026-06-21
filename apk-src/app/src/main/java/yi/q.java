package yi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f45700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f45701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f45702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45705f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f45700a.equals(qVar.f45700a) && this.f45701b.equals(qVar.f45701b) && this.f45702c.equals(qVar.f45702c) && this.f45703d.equals(qVar.f45703d) && this.f45704e.equals(qVar.f45704e) && this.f45705f.equals(qVar.f45705f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f45700a, this.f45701b, this.f45702c, this.f45703d, this.f45704e, this.f45705f);
    }
}
