package nd;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f29304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f29305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f29306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f29307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f29308g;

    public /* synthetic */ c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i) {
        this.f29303b = i;
        this.f29304c = fVar;
        this.f29305d = runnable;
        this.f29306e = j10;
        this.f29307f = j11;
        this.f29308g = timeUnit;
    }

    @Override // nd.g
    public final ScheduledFuture a(m4.d dVar) {
        switch (this.f29303b) {
            case 0:
                f fVar = this.f29304c;
                return fVar.f29318c.scheduleAtFixedRate(new d(fVar, this.f29305d, dVar, 0), this.f29306e, this.f29307f, this.f29308g);
            default:
                f fVar2 = this.f29304c;
                return fVar2.f29318c.scheduleWithFixedDelay(new d(fVar2, this.f29305d, dVar, 2), this.f29306e, this.f29307f, this.f29308g);
        }
    }
}
