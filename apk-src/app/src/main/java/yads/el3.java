package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class el3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3 f38173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf1 f38174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lj1 f38175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f38176d;

    public el3(dl3 dl3Var, cf1 cf1Var, lj1 lj1Var, Map map) {
        this.f38173a = dl3Var;
        this.f38174b = cf1Var;
        this.f38175c = lj1Var;
        this.f38176d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el3)) {
            return false;
        }
        el3 el3Var = (el3) obj;
        return Intrinsics.a(this.f38173a, el3Var.f38173a) && Intrinsics.a(this.f38174b, el3Var.f38174b) && Intrinsics.a(this.f38175c, el3Var.f38175c) && Intrinsics.a(this.f38176d, el3Var.f38176d);
    }

    public final int hashCode() {
        return this.f38176d.hashCode() + ((this.f38175c.hashCode() + ((this.f38174b.hashCode() + (this.f38173a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f38173a + ", layoutParams=" + this.f38174b + ", measured=" + this.f38175c + ", additionalInfo=" + this.f38176d + ")";
    }
}
