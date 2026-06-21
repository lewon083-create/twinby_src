package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.ScopeCallback;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements ScopeCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f25909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ITransaction f25910d;

    public /* synthetic */ h(ActivityLifecycleIntegration activityLifecycleIntegration, ITransaction iTransaction, int i) {
        this.f25908b = i;
        this.f25909c = activityLifecycleIntegration;
        this.f25910d = iTransaction;
    }

    @Override // io.sentry.ScopeCallback
    public final void run(IScope iScope) {
        switch (this.f25908b) {
            case 0:
                this.f25909c.lambda$startTracing$2(this.f25910d, iScope);
                break;
            default:
                this.f25909c.lambda$finishTransaction$5(this.f25910d, iScope);
                break;
        }
    }
}
