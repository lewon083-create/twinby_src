package n3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29094c = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29093b = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f29094c, ((q) obj).f29094c);
    }
}
