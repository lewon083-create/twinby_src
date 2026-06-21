package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryOptions f26050c;

    public /* synthetic */ l(SentryOptions sentryOptions, int i) {
        this.f26049b = i;
        this.f26050c = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26049b) {
            case 0:
                Sentry.lambda$handleAppStartProfilingConfig$3(this.f26050c);
                break;
            case 1:
                Sentry.lambda$notifyOptionsObservers$4(this.f26050c);
                break;
            default:
                this.f26050c.loadLazyFields();
                break;
        }
    }
}
