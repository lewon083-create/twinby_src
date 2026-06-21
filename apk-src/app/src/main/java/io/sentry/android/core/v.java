package io.sentry.android.core;

import io.sentry.SentryExecutorService;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryExecutorService f25954b;

    public /* synthetic */ v(SentryExecutorService sentryExecutorService, int i) {
        this.f25953a = i;
        this.f25954b = sentryExecutorService;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f25953a) {
            case 0:
                return SentryPerformanceProvider.lambda$createAndStartTransactionProfiler$1(this.f25954b);
            default:
                return SentryPerformanceProvider.lambda$createAndStartContinuousProfiler$0(this.f25954b);
        }
    }
}
