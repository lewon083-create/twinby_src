package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f44064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u41 f44065b;

    public vj0(Drawable drawable, u41 u41Var) {
        this.f44064a = drawable;
        this.f44065b = u41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        return Intrinsics.a(this.f44064a, vj0Var.f44064a) && this.f44065b == vj0Var.f44065b;
    }

    public final int hashCode() {
        return this.f44065b.hashCode() + (this.f44064a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.f44064a + ", imageType=" + this.f44065b + ")";
    }
}
