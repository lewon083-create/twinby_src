package n3;

import j3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29039a;

    public b(int i) {
        this.f29039a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f29039a == ((b) obj).f29039a;
    }

    public final int hashCode() {
        return this.f29039a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f29039a;
    }
}
