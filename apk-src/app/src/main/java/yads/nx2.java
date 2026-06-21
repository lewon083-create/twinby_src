package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nx2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u30 f41390c;

    public nx2(long j10, u30 u30Var) {
        this.f41389b = j10;
        this.f41390c = u30Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f41389b;
        long j11 = ((nx2) obj).f41389b;
        int i = lb3.f40466a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
