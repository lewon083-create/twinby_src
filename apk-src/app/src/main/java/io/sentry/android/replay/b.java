package io.sentry.android.replay;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.replay.capture.CaptureStrategy;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ScopeCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f25976c;

    public /* synthetic */ b(f0 f0Var, int i) {
        this.f25975b = i;
        this.f25976c = f0Var;
    }

    @Override // io.sentry.ScopeCallback
    public final void run(IScope iScope) {
        switch (this.f25975b) {
            case 0:
                ReplayIntegration.onScreenshotRecorded$lambda$4(this.f25976c, iScope);
                break;
            default:
                CaptureStrategy.Companion.createSegment$lambda$1(this.f25976c, iScope);
                break;
        }
    }
}
