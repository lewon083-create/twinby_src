package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y90 f37671a;

    public d90(y90 y90Var) {
        this.f37671a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d90) && Intrinsics.a(this.f37671a, ((d90) obj).f37671a);
    }

    public final int hashCode() {
        return this.f37671a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.f37671a + ")";
    }
}
