package cj;

import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2357a;

    public s(long j10) {
        this.f2357a = j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(kotlin.collections.r.c(Long.valueOf(this.f2357a)), kotlin.collections.r.c(Long.valueOf(((s) obj).f2357a)));
    }

    public final int hashCode() {
        return kotlin.collections.r.c(Long.valueOf(this.f2357a)).hashCode();
    }

    public final String toString() {
        return "PlatformVideoViewCreationParams(playerId=" + this.f2357a + ")";
    }
}
