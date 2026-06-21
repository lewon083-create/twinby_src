package io.sentry.android.core;

import io.sentry.SentryOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25898c;

    public /* synthetic */ d(int i, Object obj) {
        this.f25897b = i;
        this.f25898c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25897b) {
            case 0:
                ((ActivityFramesTracker) this.f25898c).lambda$stop$4();
                break;
            case 1:
                ((AndroidContinuousProfiler) this.f25898c).lambda$start$0();
                break;
            case 2:
                ((AndroidProfiler) this.f25898c).lambda$start$0();
                break;
            case 3:
                InternalSentrySdk.deleteCurrentSessionFile((SentryOptions) this.f25898c);
                break;
            case 4:
                ((SentryShakeDetector) this.f25898c).lambda$stop$0();
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f25898c).lambda$scheduleUnregisterReceiver$1();
                break;
        }
    }
}
