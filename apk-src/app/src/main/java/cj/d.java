package cj;

import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2307a;

    public d(String str) {
        this.f2307a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(kotlin.collections.r.c(this.f2307a), kotlin.collections.r.c(((d) obj).f2307a));
    }

    public final int hashCode() {
        return kotlin.collections.r.c(this.f2307a).hashCode();
    }

    public final String toString() {
        return pe.a.f("AudioTrackChangedEvent(selectedTrackId=", this.f2307a, ")");
    }
}
