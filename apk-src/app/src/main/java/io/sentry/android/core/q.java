package io.sentry.android.core;

import android.graphics.Bitmap;
import io.sentry.EventProcessor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EventProcessor f25941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25942d;

    public /* synthetic */ q(EventProcessor eventProcessor, Object obj, int i) {
        this.f25940b = i;
        this.f25941c = eventProcessor;
        this.f25942d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f25940b) {
            case 0:
                return ((DefaultAndroidEventProcessor) this.f25941c).lambda$new$1((SentryAndroidOptions) this.f25942d);
            default:
                return ((ScreenshotEventProcessor) this.f25941c).lambda$process$0((Bitmap) this.f25942d);
        }
    }
}
