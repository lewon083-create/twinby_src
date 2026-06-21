package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37665b;

    public d80(String str, String str2) {
        this.f37664a = str;
        this.f37665b = str2;
    }

    public final String a() {
        return this.f37664a;
    }

    public final String b() {
        return this.f37665b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return Intrinsics.a(this.f37664a, d80Var.f37664a) && Intrinsics.a(this.f37665b, d80Var.f37665b);
    }

    public final int hashCode() {
        return this.f37665b.hashCode() + (this.f37664a.hashCode() * 31);
    }

    public final String toString() {
        return t.z.f("DebugPanelMediationAdapterParameterData(name=", this.f37664a, ", value=", this.f37665b, ")");
    }
}
