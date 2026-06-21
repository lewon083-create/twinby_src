package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryOptions;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoadClass f26107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26109d;

    public /* synthetic */ a(LoadClass loadClass, String str, Object obj, int i) {
        this.f26106a = i;
        this.f26107b = loadClass;
        this.f26108c = str;
        this.f26109d = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        switch (this.f26106a) {
            case 0:
                return this.f26107b.lambda$isClassAvailableLazy$0(this.f26108c, (ILogger) this.f26109d);
            default:
                return this.f26107b.lambda$isClassAvailableLazy$1(this.f26108c, (SentryOptions) this.f26109d);
        }
    }
}
