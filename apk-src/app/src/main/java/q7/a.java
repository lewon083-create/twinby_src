package q7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31782d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f31779a == aVar.f31779a && this.f31780b == aVar.f31780b && this.f31781c == aVar.f31781c && this.f31782d == aVar.f31782d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r02 = this.f31779a;
        int i = r02;
        if (this.f31780b) {
            i = r02 + 16;
        }
        int i10 = i;
        if (this.f31781c) {
            i10 = i + 256;
        }
        return this.f31782d ? i10 + 4096 : i10;
    }

    public final String toString() {
        return "[ Connected=" + this.f31779a + " Validated=" + this.f31780b + " Metered=" + this.f31781c + " NotRoaming=" + this.f31782d + " ]";
    }
}
