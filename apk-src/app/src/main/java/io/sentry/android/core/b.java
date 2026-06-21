package io.sentry.android.core;

import android.app.Activity;
import io.sentry.ILogger;
import io.sentry.android.core.AppState;
import io.sentry.transport.ICurrentDateProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25889d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f25887b = i;
        this.f25888c = obj;
        this.f25889d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25887b) {
            case 0:
                ((ANRWatchDog) this.f25888c).lambda$new$1((ICurrentDateProvider) this.f25889d);
                break;
            case 1:
                ((AppState) this.f25888c).lambda$ensureLifecycleObserver$0((ILogger) this.f25889d);
                break;
            case 2:
                ((AppState) this.f25888c).lambda$unregisterLifecycleObserver$1((AppState.LifecycleObserver) this.f25889d);
                break;
            case 3:
                ((FeedbackShakeIntegration) this.f25888c).lambda$startShakeDetection$0((Runnable) this.f25889d);
                break;
            case 4:
                ((FeedbackShakeIntegration) this.f25888c).lambda$startShakeDetection$1((Activity) this.f25889d);
                break;
            default:
                ((SentryUserFeedbackForm) this.f25888c).lambda$shakeListener$0((Activity) this.f25889d);
                break;
        }
    }
}
