package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39066b;

    public h8(boolean z5, int i) {
        this.f39065a = i;
        this.f39066b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f39065a == h8Var.f39065a && this.f39066b == h8Var.f39066b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39066b) + (Integer.hashCode(this.f39065a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f39065a + ", disabled=" + this.f39066b + ")";
    }
}
