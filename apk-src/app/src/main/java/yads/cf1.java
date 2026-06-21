package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f37363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f37364b;

    public cf1(Integer num, Integer num2) {
        this.f37363a = num;
        this.f37364b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf1)) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        return Intrinsics.a(this.f37363a, cf1Var.f37363a) && Intrinsics.a(this.f37364b, cf1Var.f37364b);
    }

    public final int hashCode() {
        Integer num = this.f37363a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f37364b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f37363a + ", height=" + this.f37364b + ")";
    }
}
