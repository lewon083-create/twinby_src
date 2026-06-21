package io.sentry.android.core;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25937a;

    public /* synthetic */ p(int i) {
        this.f25937a = i;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f25937a) {
            case 0:
                return DefaultAndroidEventProcessor.lambda$new$0();
            case 1:
                return LifecycleWatcher.lambda$new$0();
            default:
                return ActivityFramesTracker.lambda$new$0();
        }
    }
}
