package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f37247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x42 f37248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap2 f37249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37250d;

    public c12(g9 g9Var, x42 x42Var, d12 d12Var, int i) {
        this.f37247a = g9Var;
        this.f37248b = x42Var;
        this.f37249c = d12Var;
        this.f37250d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c12)) {
            return false;
        }
        c12 c12Var = (c12) obj;
        return Intrinsics.a(this.f37247a, c12Var.f37247a) && this.f37248b == c12Var.f37248b && Intrinsics.a(this.f37249c, c12Var.f37249c) && this.f37250d == c12Var.f37250d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37250d) + ((this.f37249c.hashCode() + ((this.f37248b.hashCode() + (this.f37247a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f37247a + ", nativeResponseType=" + this.f37248b + ", requestPolicy=" + this.f37249c + ", adsCount=" + this.f37250d + ")";
    }
}
