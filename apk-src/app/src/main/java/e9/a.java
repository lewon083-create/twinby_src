package e9;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f16295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16296b;

    public a(h9.a aVar, HashMap map) {
        this.f16295a = aVar;
        this.f16296b = map;
    }

    public final long a(v8.d dVar, long j10, int i) {
        long jB = j10 - this.f16295a.b();
        b bVar = (b) this.f16296b.get(dVar);
        long j11 = bVar.f16297a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) r12)))), jB), bVar.f16298b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16295a.equals(aVar.f16295a) && this.f16296b.equals(aVar.f16296b);
    }

    public final int hashCode() {
        return ((this.f16295a.hashCode() ^ 1000003) * 1000003) ^ this.f16296b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f16295a + ", values=" + this.f16296b + "}";
    }
}
