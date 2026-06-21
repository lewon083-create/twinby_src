package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26027d;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f26025b = i;
        this.f26026c = obj;
        this.f26027d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26025b) {
            case 0:
                ((Scopes) this.f26026c).lambda$close$2((ISentryExecutorService) this.f26027d);
                break;
            case 1:
                SentryWrapper.lambda$wrapRunnable$2((IScopes) this.f26026c, (Runnable) this.f26027d);
                break;
            case 2:
                ShutdownHookIntegration.lambda$register$0((IScopes) this.f26026c, (SentryOptions) this.f26027d);
                break;
            default:
                ((ShutdownHookIntegration) this.f26026c).lambda$register$1((SentryOptions) this.f26027d);
                break;
        }
    }
}
