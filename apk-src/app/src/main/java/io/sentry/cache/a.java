package io.sentry.cache;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26011b;

    public /* synthetic */ a(int i, Object obj) {
        this.f26010a = i;
        this.f26011b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f26010a) {
            case 0:
                return ((CacheStrategy) this.f26011b).lambda$new$0();
            default:
                return ((PersistingScopeObserver) this.f26011b).lambda$new$0();
        }
    }
}
