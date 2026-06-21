package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2363b;

    public w(long j10, long j11) {
        this.f2362a = j10;
        this.f2363b = j11;
    }

    public final List a() {
        return kotlin.collections.s.f(Long.valueOf(this.f2362a), Long.valueOf(this.f2363b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((w) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return pe.a.h(gf.a.n("TexturePlayerIds(playerId=", ", textureId=", this.f2362a), this.f2363b, ")");
    }
}
