package u0;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f33980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f33981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f33982c;

    public a(Rect cropRectBeforeScaling, Size childSizeToScale, Size originalSelectedChildSize) {
        Intrinsics.checkNotNullParameter(cropRectBeforeScaling, "cropRectBeforeScaling");
        Intrinsics.checkNotNullParameter(childSizeToScale, "childSizeToScale");
        Intrinsics.checkNotNullParameter(originalSelectedChildSize, "originalSelectedChildSize");
        this.f33980a = cropRectBeforeScaling;
        this.f33981b = childSizeToScale;
        this.f33982c = originalSelectedChildSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f33980a, aVar.f33980a) && Intrinsics.a(this.f33981b, aVar.f33981b) && Intrinsics.a(this.f33982c, aVar.f33982c);
    }

    public final int hashCode() {
        return this.f33982c.hashCode() + ((this.f33981b.hashCode() + (this.f33980a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f33980a + ", childSizeToScale=" + this.f33981b + ", originalSelectedChildSize=" + this.f33982c + ')';
    }
}
