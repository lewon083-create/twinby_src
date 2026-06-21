package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tb3 implements wb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb3 f43260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43262c;

    public tb3(sb3 sb3Var, String str, String str2) {
        this.f43260a = sb3Var;
        this.f43261b = str;
        this.f43262c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb3)) {
            return false;
        }
        tb3 tb3Var = (tb3) obj;
        return this.f43260a == tb3Var.f43260a && Intrinsics.a(this.f43261b, tb3Var.f43261b) && Intrinsics.a(this.f43262c, tb3Var.f43262c);
    }

    public final int hashCode() {
        int iHashCode = this.f43260a.hashCode() * 31;
        String str = this.f43261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43262c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        sb3 sb3Var = this.f43260a;
        String str = this.f43261b;
        String str2 = this.f43262c;
        StringBuilder sb2 = new StringBuilder("Failure(status=");
        sb2.append(sb3Var);
        sb2.append(", assetName=");
        sb2.append(str);
        sb2.append(", description=");
        return a0.u.o(sb2, str2, ")");
    }
}
