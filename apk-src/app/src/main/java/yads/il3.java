package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class il3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39582b;

    public il3(int i, String str) {
        this.f39581a = str;
        this.f39582b = i;
    }

    public final String a() {
        return this.f39581a;
    }

    public final int b() {
        return this.f39582b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il3)) {
            return false;
        }
        il3 il3Var = (il3) obj;
        return Intrinsics.a(this.f39581a, il3Var.f39581a) && this.f39582b == il3Var.f39582b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39582b) + (this.f39581a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f39581a + ", screenOrientation=" + this.f39582b + ")";
    }
}
