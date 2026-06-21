package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx0 f43976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nx0 f43977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43979e;

    public va0(String str, nx0 nx0Var, nx0 nx0Var2, int i, int i10) {
        ni.a(i == 0 || i10 == 0);
        this.f43975a = ni.a(str);
        this.f43976b = (nx0) ni.a(nx0Var);
        this.f43977c = (nx0) ni.a(nx0Var2);
        this.f43978d = i;
        this.f43979e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && va0.class == obj.getClass()) {
            va0 va0Var = (va0) obj;
            if (this.f43978d == va0Var.f43978d && this.f43979e == va0Var.f43979e && this.f43975a.equals(va0Var.f43975a) && this.f43976b.equals(va0Var.f43976b) && this.f43977c.equals(va0Var.f43977c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43977c.hashCode() + ((this.f43976b.hashCode() + k4.a(this.f43975a, (((this.f43978d + 527) * 31) + this.f43979e) * 31, 31)) * 31);
    }
}
