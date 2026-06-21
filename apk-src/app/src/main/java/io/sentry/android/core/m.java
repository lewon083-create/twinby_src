package io.sentry.android.core;

import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISentryExecutorService;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25932b;

    public /* synthetic */ m(int i, Object obj) {
        this.f25931a = i;
        this.f25932b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f25931a) {
            case 0:
                return AndroidTransactionProfiler.lambda$new$1((ISentryExecutorService) this.f25932b);
            default:
                return ActivityFramesTracker.lambda$new$1((FrameMetricsAggregator) this.f25932b);
        }
    }
}
