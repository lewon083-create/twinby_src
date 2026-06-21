package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iu2 implements ku2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm3 f39645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f39646b;

    public iu2(lm3 lm3Var, xy xyVar) {
        this.f39645a = lm3Var;
        this.f39646b = xyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu2)) {
            return false;
        }
        iu2 iu2Var = (iu2) obj;
        return Intrinsics.a(this.f39645a, iu2Var.f39645a) && this.f39646b == iu2Var.f39646b;
    }

    public final int hashCode() {
        return this.f39646b.hashCode() + (this.f39645a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.f39645a + ", configurationSource=" + this.f39646b + ")";
    }
}
