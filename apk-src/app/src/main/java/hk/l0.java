package hk;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f20689b;

    public l0(ScheduledFuture scheduledFuture) {
        this.f20689b = scheduledFuture;
    }

    @Override // hk.m0
    public final void a() {
        this.f20689b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f20689b + ']';
    }
}
