package o5;

import n5.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f29770l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (c(4) != gVar.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j10 = this.f32194h - gVar.f32194h;
        if (j10 == 0) {
            j10 = this.f29770l - gVar.f29770l;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
