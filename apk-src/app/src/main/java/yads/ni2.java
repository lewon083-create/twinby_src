package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b03 f41256b;

    public ni2(String str, b03 b03Var) {
        this.f41255a = str;
        this.f41256b = b03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni2)) {
            return false;
        }
        ni2 ni2Var = (ni2) obj;
        return Intrinsics.a(this.f41255a, ni2Var.f41255a) && Intrinsics.a(this.f41256b, ni2Var.f41256b);
    }

    public final int hashCode() {
        return this.f41256b.hashCode() + (this.f41255a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.f41255a + ", size=" + this.f41256b + ")";
    }
}
