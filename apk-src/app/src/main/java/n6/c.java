package n6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29153e;

    public c(int i, int i10, String str, String str2) {
        this.f29150b = i;
        this.f29151c = i10;
        this.f29152d = str;
        this.f29153e = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i = this.f29150b - cVar.f29150b;
        return i == 0 ? this.f29151c - cVar.f29151c : i;
    }
}
