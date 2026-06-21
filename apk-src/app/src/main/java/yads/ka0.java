package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ka0 {

    @NotNull
    public static final ja0 Companion = new ja0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40133b;

    public /* synthetic */ ka0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, ia0.f39477a.getDescriptor());
            throw null;
        }
        this.f40132a = str;
        this.f40133b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return Intrinsics.a(this.f40132a, ka0Var.f40132a) && Intrinsics.a(this.f40133b, ka0Var.f40133b);
    }

    public final int hashCode() {
        return this.f40133b.hashCode() + (this.f40132a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("DebugPanelWaterfallCurrency(name=", this.f40132a, ", symbol=", this.f40133b, ")");
    }
}
