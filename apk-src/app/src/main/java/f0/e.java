package f0;

import a0.l1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f16494b;

    public e(int i, l1 l1Var) {
        this.f16493a = i;
        this.f16494b = l1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f16493a == eVar.f16493a && this.f16494b.equals(eVar.f16494b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16493a ^ 1000003) * 1000003) ^ this.f16494b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f16493a + ", imageCaptureException=" + this.f16494b + "}";
    }
}
