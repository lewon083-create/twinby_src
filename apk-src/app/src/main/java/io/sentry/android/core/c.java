package io.sentry.android.core;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityFramesTracker f25891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f25892d;

    public /* synthetic */ c(ActivityFramesTracker activityFramesTracker, Activity activity, int i) {
        this.f25890b = i;
        this.f25891c = activityFramesTracker;
        this.f25892d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25890b) {
            case 0:
                this.f25891c.lambda$addActivity$2(this.f25892d);
                break;
            default:
                this.f25891c.lambda$setMetrics$3(this.f25892d);
                break;
        }
    }
}
