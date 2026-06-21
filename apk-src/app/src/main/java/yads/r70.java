package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r70 extends s70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42506b;

    public r70(String str) {
        super(str, 0);
        this.f42506b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && Intrinsics.a(this.f42506b, ((r70) obj).f42506b);
    }

    public final int hashCode() {
        return this.f42506b.hashCode();
    }

    public final String toString() {
        return pe.a.f("MediationNetwork(network=", this.f42506b, ")");
    }
}
