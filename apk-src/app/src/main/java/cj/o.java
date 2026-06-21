package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2346a;

    public o(List list) {
        this.f2346a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(kotlin.collections.r.c(this.f2346a), kotlin.collections.r.c(((o) obj).f2346a));
    }

    public final int hashCode() {
        return kotlin.collections.r.c(this.f2346a).hashCode();
    }

    public final String toString() {
        return "NativeAudioTrackData(exoPlayerTracks=" + this.f2346a + ")";
    }
}
