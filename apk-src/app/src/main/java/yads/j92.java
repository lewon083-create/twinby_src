package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f83 f39784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb3 f39785b;

    public j92(f83 f83Var, tb3 tb3Var) {
        this.f39784a = f83Var;
        this.f39785b = tb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j92)) {
            return false;
        }
        j92 j92Var = (j92) obj;
        return Intrinsics.a(this.f39784a, j92Var.f39784a) && Intrinsics.a(this.f39785b, j92Var.f39785b);
    }

    public final int hashCode() {
        return this.f39785b.hashCode() + (this.f39784a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.f39784a + ", validationResult=" + this.f39785b + ")";
    }
}
