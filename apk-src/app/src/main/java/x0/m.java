package x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f35648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f35649b;

    public m(d dVar) {
        this.f35648a = dVar;
        this.f35649b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f35649b.equals(((m) obj).f35649b);
    }

    public final int hashCode() {
        return this.f35649b.hashCode();
    }

    public final String toString() {
        return this.f35649b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
