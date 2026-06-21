package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class MainLooperHandler {

    @NotNull
    private final Handler handler;

    public MainLooperHandler() {
        this(Looper.getMainLooper());
    }

    @NotNull
    public Thread getThread() {
        return this.handler.getLooper().getThread();
    }

    public void post(@NotNull Runnable runnable) {
        this.handler.post(runnable);
    }

    public MainLooperHandler(@NotNull Looper looper) {
        this.handler = new Handler(looper);
    }
}
