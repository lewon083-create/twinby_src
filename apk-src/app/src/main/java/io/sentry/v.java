package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements ScopeCallback, SpanFinishedCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryTracer f26114c;

    public /* synthetic */ v(SentryTracer sentryTracer, int i) {
        this.f26113b = i;
        this.f26114c = sentryTracer;
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        this.f26114c.lambda$createChild$3(span);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f26113b) {
            case 0:
                this.f26114c.lambda$finish$2(iScope);
                break;
            default:
                this.f26114c.lambda$makeCurrent$5(iScope);
                break;
        }
    }
}
