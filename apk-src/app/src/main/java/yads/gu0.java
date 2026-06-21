package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38873b;

    public gu0(String str, String str2) {
        this.f38872a = str;
        this.f38873b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return Intrinsics.a(this.f38872a, gu0Var.f38872a) && Intrinsics.a(this.f38873b, gu0Var.f38873b);
    }

    public final int hashCode() {
        return this.f38873b.hashCode() + (this.f38872a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("Item(title=", this.f38872a, ", url=", this.f38873b, ")");
    }
}
