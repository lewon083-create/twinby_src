package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b03 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36893c;

    public b03(int i, int i10) {
        this.f36892b = i;
        this.f36893c = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b03 b03Var = (b03) obj;
        return Intrinsics.d(this.f36892b * this.f36893c, b03Var.f36892b * b03Var.f36893c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b03)) {
            return false;
        }
        b03 b03Var = (b03) obj;
        return this.f36892b == b03Var.f36892b && this.f36893c == b03Var.f36893c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36893c) + (Integer.hashCode(this.f36892b) * 31);
    }

    public final String toString() {
        return com.google.android.gms.internal.ads.om1.j("Size(width=", this.f36892b, ", height=", this.f36893c, ")");
    }
}
