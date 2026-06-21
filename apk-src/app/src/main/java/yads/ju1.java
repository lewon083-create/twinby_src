package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ju1 {

    @NotNull
    public static final iu1 Companion = new iu1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ou1 f39985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru1 f39986b;

    public /* synthetic */ ju1(int i, ou1 ou1Var, ru1 ru1Var) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, hu1.f39330a.getDescriptor());
            throw null;
        }
        this.f39985a = ou1Var;
        this.f39986b = ru1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju1)) {
            return false;
        }
        ju1 ju1Var = (ju1) obj;
        return Intrinsics.a(this.f39985a, ju1Var.f39985a) && Intrinsics.a(this.f39986b, ju1Var.f39986b);
    }

    public final int hashCode() {
        int iHashCode = this.f39985a.hashCode() * 31;
        ru1 ru1Var = this.f39986b;
        return iHashCode + (ru1Var == null ? 0 : ru1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f39985a + ", response=" + this.f39986b + ")";
    }

    public ju1(ou1 ou1Var, ru1 ru1Var) {
        this.f39985a = ou1Var;
        this.f39986b = ru1Var;
    }
}
