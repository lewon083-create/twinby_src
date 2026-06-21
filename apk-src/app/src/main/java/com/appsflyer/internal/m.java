package com.appsflyer.internal;

import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.appmetrica.analytics.impl.C0422q0;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2482b;

    public /* synthetic */ m(int i) {
        this.f2482b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2482b) {
            case 0:
                AFj1sSDK.getRevenue();
                return;
            case 1:
                int i = AlarmManagerSchedulerBroadcastReceiver.f2524a;
                return;
            case 2:
                throw null;
            case 3:
                C0422q0.e();
                return;
            case 4:
                AndroidThreadChecker.lambda$new$0();
                return;
            case 5:
                SentryNdk.lambda$static$0();
                return;
            case 6:
                return;
            default:
                Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                return;
        }
    }

    private final void a() {
    }
}
