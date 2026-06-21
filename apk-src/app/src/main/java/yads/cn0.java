package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn0 f37441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37442b;

    public cn0(dn0 dn0Var, String str) {
        this.f37441a = dn0Var;
        this.f37442b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0Var = (cn0) obj;
        return this.f37441a == cn0Var.f37441a && Intrinsics.a(this.f37442b, cn0Var.f37442b);
    }

    public final int hashCode() {
        return this.f37442b.hashCode() + (this.f37441a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.f37441a + ", value=" + this.f37442b + ")";
    }
}
