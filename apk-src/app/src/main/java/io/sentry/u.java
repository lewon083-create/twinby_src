package io.sentry;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26105b;

    public /* synthetic */ u(int i, Object obj) {
        this.f26104a = i;
        this.f26105b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f26104a) {
            case 0:
                return ((SentryOptions) this.f26105b).lambda$new$0();
            case 1:
                return ((SentryOptions) this.f26105b).lambda$new$1();
            case 2:
                return ((SentryOptions) this.f26105b).lambda$new$2();
            default:
                return SpanId.lambda$new$0((String) this.f26105b);
        }
    }
}
