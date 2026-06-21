package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ii2 {

    @NotNull
    public static final hi2 Companion = new hi2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39551a;

    public /* synthetic */ ii2(int i, double d10) {
        if (1 == (i & 1)) {
            this.f39551a = d10;
        } else {
            uk.o0.e(i, 1, gi2.f38766a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii2) && Double.compare(this.f39551a, ((ii2) obj).f39551a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f39551a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f39551a + ")";
    }
}
