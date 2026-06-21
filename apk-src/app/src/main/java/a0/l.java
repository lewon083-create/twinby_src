package a0;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f154b;

    public l(int i, Surface surface) {
        this.f153a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f154b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f153a == lVar.f153a && this.f154b.equals(lVar.f154b);
    }

    public final int hashCode() {
        return ((this.f153a ^ 1000003) * 1000003) ^ this.f154b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f153a + ", surface=" + this.f154b + "}";
    }
}
