package io.appmetrica.analytics.coreutils.internal.executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class SynchronizedBlockingExecutor extends BlockingExecutor {
    @Override // io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
