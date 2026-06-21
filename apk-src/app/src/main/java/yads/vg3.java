package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vg3 extends xg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee3 f44033a;

    public vg3(ee3 ee3Var) {
        super(0);
        this.f44033a = ee3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg3) && Intrinsics.a(this.f44033a, ((vg3) obj).f44033a);
    }

    public final int hashCode() {
        return this.f44033a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f44033a + ")";
    }
}
