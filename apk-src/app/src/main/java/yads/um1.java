package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class um1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an1 f43715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43722h;
    public final boolean i;

    public um1(an1 an1Var, long j10, long j11, long j12, long j13, boolean z5, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        ni.a(!z12 || z10);
        ni.a(!z11 || z10);
        if (z5 && (z10 || z11 || z12)) {
            z13 = false;
        }
        ni.a(z13);
        this.f43715a = an1Var;
        this.f43716b = j10;
        this.f43717c = j11;
        this.f43718d = j12;
        this.f43719e = j13;
        this.f43720f = z5;
        this.f43721g = z10;
        this.f43722h = z11;
        this.i = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && um1.class == obj.getClass()) {
            um1 um1Var = (um1) obj;
            if (this.f43716b == um1Var.f43716b && this.f43717c == um1Var.f43717c && this.f43718d == um1Var.f43718d && this.f43719e == um1Var.f43719e && this.f43720f == um1Var.f43720f && this.f43721g == um1Var.f43721g && this.f43722h == um1Var.f43722h && this.i == um1Var.i && lb3.a(this.f43715a, um1Var.f43715a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f43715a.hashCode() + 527) * 31) + ((int) this.f43716b)) * 31) + ((int) this.f43717c)) * 31) + ((int) this.f43718d)) * 31) + ((int) this.f43719e)) * 31) + (this.f43720f ? 1 : 0)) * 31) + (this.f43721g ? 1 : 0)) * 31) + (this.f43722h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
