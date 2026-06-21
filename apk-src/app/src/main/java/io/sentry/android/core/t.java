package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.core.SentryShakeDetector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements ScopeCallback, SentryShakeDetector.Listener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25948c;

    public /* synthetic */ t(int i, Object obj) {
        this.f25947b = i;
        this.f25948c = obj;
    }

    @Override // io.sentry.android.core.SentryShakeDetector.Listener
    public void onShake() {
        ((FeedbackShakeIntegration) this.f25948c).lambda$startShakeDetection$2();
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f25947b) {
            case 0:
                ((LifecycleWatcher) this.f25948c).lambda$startSession$1(iScope);
                break;
            case 1:
                iScope.setScreen((String) this.f25948c);
                break;
            case 2:
            default:
                SentryAndroid.lambda$init$2((AtomicBoolean) this.f25948c, iScope);
                break;
            case 3:
                InternalSentrySdk.lambda$getCurrentScope$0((AtomicReference) this.f25948c, iScope);
                break;
        }
    }
}
