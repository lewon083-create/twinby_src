package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj3 f44003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w41 f44004c;

    public vd3(List list, pj3 pj3Var, w41 w41Var) {
        this.f44002a = list;
        this.f44003b = pj3Var;
        this.f44004c = w41Var;
    }

    public final me3 a() {
        return (me3) CollectionsKt.D(this.f44002a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd3)) {
            return false;
        }
        vd3 vd3Var = (vd3) obj;
        return Intrinsics.a(this.f44002a, vd3Var.f44002a) && Intrinsics.a(this.f44003b, vd3Var.f44003b) && Intrinsics.a(this.f44004c, vd3Var.f44004c);
    }

    public final int hashCode() {
        int iHashCode = this.f44002a.hashCode() * 31;
        pj3 pj3Var = this.f44003b;
        int iHashCode2 = (iHashCode + (pj3Var == null ? 0 : pj3Var.hashCode())) * 31;
        w41 w41Var = this.f44004c;
        return iHashCode2 + (w41Var != null ? w41Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f44002a + ", videoSettings=" + this.f44003b + ", preview=" + this.f44004c + ")";
    }
}
