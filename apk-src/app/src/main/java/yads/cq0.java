package yads;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f37475b;

    public cq0(int i, RectF rectF) {
        this.f37474a = i;
        this.f37475b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq0)) {
            return false;
        }
        cq0 cq0Var = (cq0) obj;
        return this.f37474a == cq0Var.f37474a && Intrinsics.a(this.f37475b, cq0Var.f37475b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37474a) * 31;
        RectF rectF = this.f37475b;
        return iHashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f37474a + ", visibleRectangle=" + this.f37475b + ")";
    }
}
