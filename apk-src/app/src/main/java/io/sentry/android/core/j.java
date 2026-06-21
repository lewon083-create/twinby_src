package io.sentry.android.core;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryAndroidOptions f25928b;

    public /* synthetic */ j(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.f25927a = i;
        this.f25928b = sentryAndroidOptions;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f25927a) {
            case 0:
                return this.f25928b.getExecutorService();
            case 1:
                return AndroidOptionsInitializer.lambda$installDefaultIntegrations$1(this.f25928b);
            default:
                return this.f25928b.getExecutorService();
        }
    }
}
