package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m40 {

    @NotNull
    public static final l40 Companion = new l40();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qk.a[] f40786c = {new uk.c(s40.f42800a), new uk.c(f40.f38367a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40788b;

    public /* synthetic */ m40(int i, List list, List list2) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, k40.f40060a.getDescriptor());
            throw null;
        }
        this.f40787a = list;
        this.f40788b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return Intrinsics.a(this.f40787a, m40Var.f40787a) && Intrinsics.a(this.f40788b, m40Var.f40788b);
    }

    public final int hashCode() {
        return this.f40788b.hashCode() + (this.f40787a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f40787a + ", bidding=" + this.f40788b + ")";
    }
}
