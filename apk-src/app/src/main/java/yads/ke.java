package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f40171a;

    public ke(vd vdVar) {
        this.f40171a = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && Intrinsics.a(this.f40171a, ((ke) obj).f40171a);
    }

    public final int hashCode() {
        return this.f40171a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.f40171a + ")";
    }
}
