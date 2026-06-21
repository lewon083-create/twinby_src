package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.android.core.SentryShakeDetector;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Scope.IWithTransaction, SentryShakeDetector.Listener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25900c;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f25899b = obj;
        this.f25900c = obj2;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ActivityLifecycleIntegration.lambda$clearScope$4((ITransaction) this.f25899b, (IScope) this.f25900c, iTransaction);
    }

    @Override // io.sentry.android.core.SentryShakeDetector.Listener
    public void onShake() {
        ((SentryUserFeedbackForm) this.f25899b).lambda$shakeListener$1((WeakReference) this.f25900c);
    }
}
