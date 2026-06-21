package nd;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j1.g implements ScheduledFuture {
    public final ScheduledFuture i;

    public h(g gVar) {
        this.i = gVar.a(new m4.d(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.i.compareTo(delayed);
    }

    @Override // j1.g
    public final void d() {
        ScheduledFuture scheduledFuture = this.i;
        Object obj = this.f26165b;
        scheduledFuture.cancel((obj instanceof j1.a) && ((j1.a) obj).f26146a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.i.getDelay(timeUnit);
    }
}
