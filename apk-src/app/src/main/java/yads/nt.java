package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nt extends z43 implements Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41348k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nt ntVar = (nt) obj;
        if (b(4) != ntVar.b(4)) {
            return b(4) ? 1 : -1;
        }
        long j10 = this.f42866f - ntVar.f42866f;
        if (j10 == 0) {
            j10 = this.f41348k - ntVar.f41348k;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
