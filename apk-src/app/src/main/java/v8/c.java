package v8;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34805a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f34805a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f34805a.equals(((c) obj).f34805a);
    }

    public final int hashCode() {
        return this.f34805a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return u.o(new StringBuilder("Encoding{name=\""), this.f34805a, "\"}");
    }
}
