package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ww0 {

    @NotNull
    public static final vw0 Companion = new vw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ex0 f44508a;

    public /* synthetic */ ww0(int i, ex0 ex0Var) {
        if (1 == (i & 1)) {
            this.f44508a = ex0Var;
        } else {
            uk.o0.e(i, 1, uw0.f43795a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww0) && Intrinsics.a(this.f44508a, ((ww0) obj).f44508a);
    }

    public final int hashCode() {
        ex0 ex0Var = this.f44508a;
        if (ex0Var == null) {
            return 0;
        }
        return ex0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.f44508a + ")";
    }
}
