package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2359b;

    public t(long j10, long j11) {
        this.f2358a = j10;
        this.f2359b = j11;
    }

    public final List a() {
        return kotlin.collections.s.f(Long.valueOf(this.f2358a), Long.valueOf(this.f2359b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((t) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return pe.a.h(gf.a.n("PlaybackState(playPosition=", ", bufferPosition=", this.f2358a), this.f2359b, ")");
    }
}
