package e9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f16299c;

    public b(long j10, long j11, Set set) {
        this.f16297a = j10;
        this.f16298b = j11;
        this.f16299c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f16297a == bVar.f16297a && this.f16298b == bVar.f16298b && this.f16299c.equals(bVar.f16299c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16297a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f16298b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16299c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f16297a + ", maxAllowedDelay=" + this.f16298b + ", flags=" + this.f16299c + "}";
    }
}
