package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f21706a;

    public InterruptionSafeThread() {
        this.f21706a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f21706a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f21706a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f21706a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f21706a = true;
    }

    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f21706a = true;
    }
}
