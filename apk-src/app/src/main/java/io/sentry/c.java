package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26009b;

    public /* synthetic */ c(int i) {
        this.f26009b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26009b) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return NoOpSentryExecutorService.lambda$schedule$2();
            case 2:
                return NoOpSentryExecutorService.lambda$submit$1();
            case 3:
                return NoOpSentryExecutorService.lambda$submit$0();
            default:
                return ProfilingTraceData.lambda$new$0();
        }
    }
}
