package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25920c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f25918a = i;
        this.f25919b = obj;
        this.f25920c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        switch (this.f25918a) {
            case 0:
                ScreenshotUtils.lambda$captureScreenshot$0((AtomicBoolean) this.f25919b, (CountDownLatch) this.f25920c, i);
                break;
            default:
                PixelCopyStrategy.capture$lambda$1((PixelCopyStrategy) this.f25919b, (View) this.f25920c, i);
                break;
        }
    }
}
