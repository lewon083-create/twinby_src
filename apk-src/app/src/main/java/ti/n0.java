package ti;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33859b;

    public n0(Integer num, String str) {
        this.f33858a = num;
        this.f33859b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f33858a.equals(n0Var.f33858a)) {
            return this.f33859b.equals(n0Var.f33859b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33859b.hashCode() + (this.f33858a.hashCode() * 31);
    }
}
