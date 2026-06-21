package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42372b;

    public qq1(String str, String str2) {
        this.f42371a = str;
        this.f42372b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq1)) {
            return false;
        }
        qq1 qq1Var = (qq1) obj;
        return Intrinsics.a(this.f42371a, qq1Var.f42371a) && Intrinsics.a(this.f42372b, qq1Var.f42372b);
    }

    public final int hashCode() {
        return this.f42372b.hashCode() + (this.f42371a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("MediationAdapterSignature(format=", this.f42371a, ", className=", this.f42372b, ")");
    }
}
