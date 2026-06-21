package yads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ck0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk0 f37412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f37413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm3 f37414c;

    public ck0(bk0 bk0Var, Drawable drawable, lm3 lm3Var) {
        this.f37412a = bk0Var;
        this.f37413b = drawable;
        this.f37414c = lm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return Intrinsics.a(this.f37412a, ck0Var.f37412a) && Intrinsics.a(this.f37413b, ck0Var.f37413b) && Intrinsics.a(this.f37414c, ck0Var.f37414c);
    }

    public final int hashCode() {
        int iHashCode = this.f37412a.hashCode() * 31;
        Drawable drawable = this.f37413b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        lm3 lm3Var = this.f37414c;
        return iHashCode2 + (lm3Var != null ? lm3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.f37412a + ", drawable=" + this.f37413b + ", error=" + this.f37414c + ")";
    }
}
