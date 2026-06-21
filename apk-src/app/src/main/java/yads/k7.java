package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s03 f40088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03 f40089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40090c;

    public k7(s03 s03Var, u03 u03Var, long j10) {
        this.f40088a = s03Var;
        this.f40089b = u03Var;
        this.f40090c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.f40088a == k7Var.f40088a && this.f40089b == k7Var.f40089b && this.f40090c == k7Var.f40090c;
    }

    public final int hashCode() {
        s03 s03Var = this.f40088a;
        int iHashCode = (s03Var == null ? 0 : s03Var.hashCode()) * 31;
        u03 u03Var = this.f40089b;
        return Long.hashCode(this.f40090c) + ((iHashCode + (u03Var != null ? u03Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        s03 s03Var = this.f40088a;
        u03 u03Var = this.f40089b;
        long j10 = this.f40090c;
        StringBuilder sb2 = new StringBuilder("AdPodSkip(transitionStrategy=");
        sb2.append(s03Var);
        sb2.append(", visibility=");
        sb2.append(u03Var);
        sb2.append(", delay=");
        return pe.a.h(sb2, j10, ")");
    }
}
