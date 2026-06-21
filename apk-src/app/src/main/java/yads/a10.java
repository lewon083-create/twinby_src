package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f36605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36608d;

    public a10(h02 h02Var, String str, int i, int i10) {
        this.f36605a = h02Var;
        this.f36606b = str;
        this.f36607c = i;
        this.f36608d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return Intrinsics.a(this.f36605a, a10Var.f36605a) && Intrinsics.a(this.f36606b, a10Var.f36606b) && this.f36607c == a10Var.f36607c && this.f36608d == a10Var.f36608d;
    }

    public final int hashCode() {
        int iHashCode = this.f36605a.hashCode() * 31;
        String str = this.f36606b;
        return Integer.hashCode(this.f36608d) + qd3.a(this.f36607c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f36605a + ", sizeType=" + this.f36606b + ", width=" + this.f36607c + ", height=" + this.f36608d + ")";
    }
}
