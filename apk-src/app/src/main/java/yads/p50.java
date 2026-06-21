package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p50 {

    @NotNull
    public static final o50 Companion = new o50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41820b;

    public /* synthetic */ p50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, n50.f41174a.getDescriptor());
            throw null;
        }
        this.f41819a = str;
        this.f41820b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return Intrinsics.a(this.f41819a, p50Var.f41819a) && Intrinsics.a(this.f41820b, p50Var.f41820b);
    }

    public final int hashCode() {
        return this.f41820b.hashCode() + (this.f41819a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("DebugPanelBiddingParameter(name=", this.f41819a, ", value=", this.f41820b, ")");
    }
}
