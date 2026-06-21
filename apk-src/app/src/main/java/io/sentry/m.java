package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26052c;

    public /* synthetic */ m(int i, Object obj) {
        this.f26051b = i;
        this.f26052c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26051b) {
            case 0:
                Sentry.lambda$initConfigurations$5((File) this.f26052c);
                break;
            case 1:
                ((SentryExecutorService) this.f26052c).lambda$prewarm$1();
                break;
            default:
                ((ShutdownHookIntegration) this.f26052c).lambda$close$2();
                break;
        }
    }
}
