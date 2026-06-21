package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f21829b;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ActivationBarrierHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21830a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f21831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f21832c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f21831b = new a(this, runnable);
            this.f21832c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j10, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f21830a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f21832c.subscribe(j10, iCommonExecutor, this.f21831b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f21828a = this.f21829b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j10 - (this.f21829b.currentTimeMillis() - this.f21828a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f21829b = systemTimeProvider;
    }
}
