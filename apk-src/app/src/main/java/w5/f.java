package w5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f35156c;

    public f(int i, b bVar) {
        this.f35155b = i;
        this.f35156c = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f35155b, ((f) obj).f35155b);
    }
}
