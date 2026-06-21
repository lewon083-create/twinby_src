package io.sentry;

import io.sentry.Scope;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Scope.IWithSession, HintUtils.SentryConsumer, SpanFinishedCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26055d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3) {
        this.f26053b = obj;
        this.f26054c = obj2;
        this.f26055d = obj3;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(Session session) {
        ((SentryClient) this.f26053b).lambda$updateSessionData$1((SentryEvent) this.f26054c, (Hint) this.f26055d, session);
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        ((SentryTracer) this.f26053b).lambda$finish$0((SpanFinishedCallback) this.f26054c, (AtomicReference) this.f26055d, span);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((EnvelopeSender) this.f26053b).lambda$processFile$1((Throwable) this.f26054c, (File) this.f26055d, (Retryable) obj);
    }
}
