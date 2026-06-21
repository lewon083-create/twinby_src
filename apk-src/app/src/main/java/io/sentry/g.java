package io.sentry;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26024a;

    public /* synthetic */ g(int i) {
        this.f26024a = i;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f26024a) {
            case 0:
                return SentryOptions.empty();
            case 1:
                return SentryOptions.empty();
            case 2:
                return SentryOptions.lambda$new$3();
            default:
                return SentryUUID.generateSpanId();
        }
    }
}
