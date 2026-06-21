package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t50 {

    @NotNull
    public static final s50 Companion = new s50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f43183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f43184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43185d;

    public /* synthetic */ t50(int i, boolean z5, Boolean bool, Boolean bool2, boolean z10) {
        if (15 != (i & 15)) {
            uk.o0.e(i, 15, r50.f42496a.getDescriptor());
            throw null;
        }
        this.f43182a = z5;
        this.f43183b = bool;
        this.f43184c = bool2;
        this.f43185d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return this.f43182a == t50Var.f43182a && Intrinsics.a(this.f43183b, t50Var.f43183b) && Intrinsics.a(this.f43184c, t50Var.f43184c) && this.f43185d == t50Var.f43185d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f43182a) * 31;
        Boolean bool = this.f43183b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f43184c;
        return Boolean.hashCode(this.f43185d) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f43182a + ", ageRestrictedUser=" + this.f43183b + ", hasUserConsent=" + this.f43184c + ", hasCmpValue=" + this.f43185d + ")";
    }

    public t50(boolean z5, Boolean bool, Boolean bool2, boolean z10) {
        this.f43182a = z5;
        this.f43183b = bool;
        this.f43184c = bool2;
        this.f43185d = z10;
    }
}
