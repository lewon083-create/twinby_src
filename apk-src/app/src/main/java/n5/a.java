package n5;

import ad.j0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f29101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29104d;

    public a(long j10, long j11, List list) {
        this.f29101a = j0.r(list);
        this.f29102b = j10;
        this.f29103c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f29104d = j12;
    }
}
