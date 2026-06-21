package a0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110c;

    public i(Size size, Rect rect, int i) {
        this.f108a = size;
        this.f109b = rect;
        this.f110c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f108a.equals(iVar.f108a) && this.f109b.equals(iVar.f109b) && this.f110c == iVar.f110c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f108a.hashCode() ^ 1000003) * 1000003) ^ this.f109b.hashCode()) * 1000003) ^ this.f110c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResolutionInfoInternal{resolution=");
        sb2.append(this.f108a);
        sb2.append(", cropRect=");
        sb2.append(this.f109b);
        sb2.append(", rotationDegrees=");
        return t.z.d(this.f110c, "}", sb2);
    }
}
