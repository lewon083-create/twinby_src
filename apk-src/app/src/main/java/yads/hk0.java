package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f39227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u41 f39228b;

    public hk0(Drawable drawable, u41 u41Var) {
        this.f39227a = drawable;
        this.f39228b = u41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return Intrinsics.a(this.f39227a, hk0Var.f39227a) && this.f39228b == hk0Var.f39228b;
    }

    public final int hashCode() {
        return this.f39228b.hashCode() + (this.f39227a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.f39227a + ", imageType=" + this.f39228b + ")";
    }
}
