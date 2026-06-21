package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x80 f44625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q50 f44626c;

    public x90(String str, String str2) {
        this(str, new x80(str2, 0, null, 0, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return Intrinsics.a(this.f44624a, x90Var.f44624a) && Intrinsics.a(this.f44625b, x90Var.f44625b) && Intrinsics.a(this.f44626c, x90Var.f44626c);
    }

    public final int hashCode() {
        String str = this.f44624a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x80 x80Var = this.f44625b;
        int iHashCode2 = (iHashCode + (x80Var == null ? 0 : x80Var.hashCode())) * 31;
        q50 q50Var = this.f44626c;
        return iHashCode2 + (q50Var != null ? q50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.f44624a + ", subtitle=" + this.f44625b + ", text=" + this.f44626c + ")";
    }

    public /* synthetic */ x90(String str, x80 x80Var) {
        this(str, x80Var, null);
    }

    public x90(String str, x80 x80Var, q50 q50Var) {
        super(0);
        this.f44624a = str;
        this.f44625b = x80Var;
        this.f44626c = q50Var;
    }
}
