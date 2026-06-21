package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ha0 {

    @NotNull
    public static final ga0 Companion = new ga0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f39117b;

    public /* synthetic */ ha0(int i, String str, double d10) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, fa0.f38410a.getDescriptor());
            throw null;
        }
        this.f39116a = str;
        this.f39117b = d10;
    }

    public final double a() {
        return this.f39117b;
    }

    public final String b() {
        return this.f39116a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return Intrinsics.a(this.f39116a, ha0Var.f39116a) && Double.compare(this.f39117b, ha0Var.f39117b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f39117b) + (this.f39116a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f39116a + ", minCpm=" + this.f39117b + ")";
    }
}
