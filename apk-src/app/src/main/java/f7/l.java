package f7;

import android.graphics.Rect;
import g2.x1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.b f16691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f16692b;

    public l(c7.b _bounds, x1 _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.f16691a = _bounds;
        this.f16692b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return Intrinsics.a(this.f16691a, lVar.f16691a) && Intrinsics.a(this.f16692b, lVar.f16692b);
    }

    public final int hashCode() {
        return this.f16692b.hashCode() + (this.f16691a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f16691a + ", windowInsetsCompat=" + this.f16692b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect bounds, x1 insets) {
        this(new c7.b(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
