package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10 f41427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41428b;

    public o10(n10 n10Var, String str) {
        this.f41427a = n10Var;
        this.f41428b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.f41427a == o10Var.f41427a && Intrinsics.a(this.f41428b, o10Var.f41428b);
    }

    public final int hashCode() {
        int iHashCode = this.f41427a.hashCode() * 31;
        String str = this.f41428b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.f41427a + ", text=" + this.f41428b + ")";
    }
}
