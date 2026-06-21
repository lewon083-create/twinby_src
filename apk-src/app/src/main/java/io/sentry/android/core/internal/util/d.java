package io.sentry.android.core.internal.util;

import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryFrameMetricsCollector f25922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Window f25923d;

    public /* synthetic */ d(SentryFrameMetricsCollector sentryFrameMetricsCollector, Window window, int i) {
        this.f25921b = i;
        this.f25922c = sentryFrameMetricsCollector;
        this.f25923d = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25921b) {
            case 0:
                this.f25922c.lambda$trackCurrentWindow$4(this.f25923d);
                break;
            default:
                this.f25922c.lambda$stopTrackingWindow$3(this.f25923d);
                break;
        }
    }
}
