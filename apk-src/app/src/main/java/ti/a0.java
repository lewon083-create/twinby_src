package ti;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f33795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Number f33797c;

    public a0(z zVar, String str, Number number) {
        this.f33795a = zVar;
        this.f33796b = str;
        this.f33797c = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f33795a == a0Var.f33795a && this.f33796b.equals(a0Var.f33796b)) {
            return this.f33797c.equals(a0Var.f33797c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33797c.hashCode() + gf.a.e(this.f33795a.hashCode() * 31, 31, this.f33796b);
    }

    public a0(o9.a aVar) {
        int iM = t.z.m(aVar.a());
        if (iM == 0) {
            this.f33795a = z.f33917b;
        } else if (iM == 1) {
            this.f33795a = z.f33918c;
        } else {
            int iA = aVar.a();
            throw new IllegalArgumentException("Unable to handle state: ".concat(iA != 1 ? iA != 2 ? "null" : "READY" : "NOT_READY"));
        }
        this.f33796b = aVar.getDescription();
        this.f33797c = Integer.valueOf(aVar.b());
    }
}
