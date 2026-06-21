package qi;

import java.util.List;
import kotlin.collections.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32131b;

    public h(long j10, long j11) {
        this.f32130a = j10;
        this.f32131b = j11;
    }

    public final List a() {
        return s.f(Long.valueOf(this.f32130a), Long.valueOf(this.f32131b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return rl.b.i(a(), ((h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return pe.a.h(gf.a.n("RemoteConfigPigeonSettings(fetchTimeoutSeconds=", ", minimumFetchIntervalSeconds=", this.f32130a), this.f32131b, ")");
    }
}
