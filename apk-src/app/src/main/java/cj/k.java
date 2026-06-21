package cj;

import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2342a;

    public k(boolean z5) {
        this.f2342a = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(kotlin.collections.r.c(Boolean.valueOf(this.f2342a)), kotlin.collections.r.c(Boolean.valueOf(((k) obj).f2342a)));
    }

    public final int hashCode() {
        return kotlin.collections.r.c(Boolean.valueOf(this.f2342a)).hashCode();
    }

    public final String toString() {
        return "IsPlayingStateEvent(isPlaying=" + this.f2342a + ")";
    }
}
