package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class na0 {

    @NotNull
    public static final ma0 Companion = new ma0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41204b;

    public /* synthetic */ na0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, la0.f40459a.getDescriptor());
            throw null;
        }
        this.f41203a = str;
        this.f41204b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return Intrinsics.a(this.f41203a, na0Var.f41203a) && Intrinsics.a(this.f41204b, na0Var.f41204b);
    }

    public final int hashCode() {
        return this.f41204b.hashCode() + (this.f41203a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("DebugPanelWaterfallParameter(name=", this.f41203a, ", value=", this.f41204b, ")");
    }
}
