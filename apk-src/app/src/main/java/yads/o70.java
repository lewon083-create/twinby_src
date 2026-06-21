package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y90 f41477b;

    public o70(y90 y90Var) {
        super(y90Var.c(), 0);
        this.f41477b = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o70) && Intrinsics.a(this.f41477b, ((o70) obj).f41477b);
    }

    public final int hashCode() {
        return this.f41477b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.f41477b + ")";
    }
}
