package c7;

import a0.u;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2228d;

    public b(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        this.f2225a = i;
        this.f2226b = i10;
        this.f2227c = i11;
        this.f2228d = i12;
        if (i > i11) {
            throw new IllegalArgumentException(u.j(i, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(u.j(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f2225a, this.f2226b, this.f2227c, this.f2228d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f2225a == bVar.f2225a && this.f2226b == bVar.f2226b && this.f2227c == bVar.f2227c && this.f2228d == bVar.f2228d;
    }

    public final int hashCode() {
        return (((((this.f2225a * 31) + this.f2226b) * 31) + this.f2227c) * 31) + this.f2228d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f2225a);
        sb2.append(',');
        sb2.append(this.f2226b);
        sb2.append(',');
        sb2.append(this.f2227c);
        sb2.append(',');
        return z.d(this.f2228d, "] }", sb2);
    }
}
