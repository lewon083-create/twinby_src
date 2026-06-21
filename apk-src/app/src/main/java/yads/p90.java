package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p90 f41842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70 f41843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41845d;

    public p90(p90 p90Var, s70 s70Var, boolean z5, List list) {
        this.f41842a = p90Var;
        this.f41843b = s70Var;
        this.f41844c = z5;
        this.f41845d = list;
    }

    public static p90 a(p90 p90Var, p90 p90Var2, s70 s70Var, boolean z5, List list, int i) {
        if ((i & 1) != 0) {
            p90Var2 = p90Var.f41842a;
        }
        if ((i & 2) != 0) {
            s70Var = p90Var.f41843b;
        }
        if ((i & 4) != 0) {
            z5 = p90Var.f41844c;
        }
        if ((i & 8) != 0) {
            list = p90Var.f41845d;
        }
        p90Var.getClass();
        return new p90(p90Var2, s70Var, z5, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return Intrinsics.a(this.f41842a, p90Var.f41842a) && Intrinsics.a(this.f41843b, p90Var.f41843b) && this.f41844c == p90Var.f41844c && Intrinsics.a(this.f41845d, p90Var.f41845d);
    }

    public final int hashCode() {
        p90 p90Var = this.f41842a;
        return this.f41845d.hashCode() + ((Boolean.hashCode(this.f41844c) + ((this.f41843b.hashCode() + ((p90Var == null ? 0 : p90Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f41842a + ", destination=" + this.f41843b + ", isLoading=" + this.f41844c + ", uiData=" + this.f41845d + ")";
    }
}
