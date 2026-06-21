package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39702e;

    public j13(int i, int i10, int i11, int i12) {
        this.f39698a = i;
        this.f39699b = i10;
        this.f39700c = i11;
        this.f39701d = i12;
        this.f39702e = i11 * i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j13)) {
            return false;
        }
        j13 j13Var = (j13) obj;
        return this.f39698a == j13Var.f39698a && this.f39699b == j13Var.f39699b && this.f39700c == j13Var.f39700c && this.f39701d == j13Var.f39701d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39701d) + qd3.a(this.f39700c, qd3.a(this.f39699b, Integer.hashCode(this.f39698a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.f39698a;
        int i10 = this.f39699b;
        int i11 = this.f39700c;
        int i12 = this.f39701d;
        StringBuilder sbI = t.z.i("SmartCenter(x=", i, ", y=", i10, ", width=");
        sbI.append(i11);
        sbI.append(", height=");
        sbI.append(i12);
        sbI.append(")");
        return sbI.toString();
    }
}
