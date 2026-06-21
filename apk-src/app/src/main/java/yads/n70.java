package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41183b;

    public n70(String str) {
        super("Ad Units", 0);
        this.f41183b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n70) && Intrinsics.a(this.f41183b, ((n70) obj).f41183b);
    }

    public final int hashCode() {
        return this.f41183b.hashCode();
    }

    public final String toString() {
        return pe.a.f("AdUnit(unitId=", this.f41183b, ")");
    }
}
