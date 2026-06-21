package f7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.b f16673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f16675c;

    public c(c7.b bounds, b type, b state) {
        int i = bounds.f2226b;
        Intrinsics.checkNotNullParameter(bounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f16673a = bounds;
        this.f16674b = type;
        this.f16675c = state;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i10 = bounds.f2227c;
        int i11 = bounds.f2225a;
        if (i10 - i11 == 0 && bounds.f2228d - i == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i11 != 0 && i != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return Intrinsics.a(this.f16673a, cVar.f16673a) && Intrinsics.a(this.f16674b, cVar.f16674b) && Intrinsics.a(this.f16675c, cVar.f16675c);
    }

    public final int hashCode() {
        return this.f16675c.hashCode() + ((this.f16674b.hashCode() + (this.f16673a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f16673a + ", type=" + this.f16674b + ", state=" + this.f16675c + " }";
    }
}
