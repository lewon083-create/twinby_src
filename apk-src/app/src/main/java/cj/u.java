package cj;

import com.google.android.gms.internal.measurement.d4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2360a;

    public u(p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2360a = state;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(kotlin.collections.r.c(this.f2360a), kotlin.collections.r.c(((u) obj).f2360a));
    }

    public final int hashCode() {
        return kotlin.collections.r.c(this.f2360a).hashCode();
    }

    public final String toString() {
        return "PlaybackStateChangeEvent(state=" + this.f2360a + ")";
    }
}
