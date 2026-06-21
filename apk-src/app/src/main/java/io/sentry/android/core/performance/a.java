package io.sentry.android.core.performance;

import io.sentry.android.core.performance.AppStartMetrics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25939c;

    public /* synthetic */ a(int i, Object obj) {
        this.f25938b = i;
        this.f25939c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25938b) {
            case 0:
                ((AppStartMetrics) this.f25939c).lambda$onActivityStarted$0();
                break;
            case 1:
                ((AppStartMetrics) this.f25939c).lambda$onActivityStarted$1();
                break;
            default:
                ((AppStartMetrics.AnonymousClass3) this.f25939c).lambda$run$0();
                break;
        }
    }
}
