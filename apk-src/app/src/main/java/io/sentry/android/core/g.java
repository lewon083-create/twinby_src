package io.sentry.android.core;

import io.sentry.ISpan;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f25905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ISpan f25906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ISpan f25907e;

    public /* synthetic */ g(ActivityLifecycleIntegration activityLifecycleIntegration, ISpan iSpan, ISpan iSpan2, int i) {
        this.f25904b = i;
        this.f25905c = activityLifecycleIntegration;
        this.f25906d = iSpan;
        this.f25907e = iSpan2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25904b) {
            case 0:
                this.f25905c.lambda$startTracing$1(this.f25906d, this.f25907e);
                break;
            case 1:
                this.f25905c.lambda$onActivityResumed$8(this.f25906d, this.f25907e);
                break;
            default:
                this.f25905c.lambda$onActivityResumed$9(this.f25906d, this.f25907e);
                break;
        }
    }
}
