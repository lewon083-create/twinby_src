package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45588d;

    public zx1(int i, int i10, int i11, int i12) {
        this.f45585a = i;
        this.f45586b = i10;
        this.f45587c = i11;
        this.f45588d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return this.f45585a == zx1Var.f45585a && this.f45586b == zx1Var.f45586b && this.f45587c == zx1Var.f45587c && this.f45588d == zx1Var.f45588d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45588d) + qd3.a(this.f45587c, qd3.a(this.f45586b, Integer.hashCode(this.f45585a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.f45585a;
        int i10 = this.f45586b;
        int i11 = this.f45587c;
        int i12 = this.f45588d;
        StringBuilder sbI = t.z.i("MuteControlResources(mutedResourceId=", i, ", unmutedResourceId=", i10, ", mutedContentDescriptionId=");
        sbI.append(i11);
        sbI.append(", unmutedContentDescriptionId=");
        sbI.append(i12);
        sbI.append(")");
        return sbI.toString();
    }
}
