package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh0 f44692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44693b;

    public xh0(yh0 yh0Var, String str) {
        this.f44692a = yh0Var;
        this.f44693b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        return this.f44692a == xh0Var.f44692a && Intrinsics.a(this.f44693b, xh0Var.f44693b);
    }

    public final int hashCode() {
        return this.f44693b.hashCode() + (this.f44692a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f44692a + ", assetName=" + this.f44693b + ")";
    }
}
