package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ix2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39666b;

    public ix2(long j10, long j11) {
        this.f39665a = j10;
        this.f39666b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ix2.class == obj.getClass()) {
            ix2 ix2Var = (ix2) obj;
            if (this.f39665a == ix2Var.f39665a && this.f39666b == ix2Var.f39666b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f39665a) * 31) + ((int) this.f39666b);
    }
}
