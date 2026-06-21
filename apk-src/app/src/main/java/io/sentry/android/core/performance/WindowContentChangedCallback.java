package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.WindowCallbackAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class WindowContentChangedCallback extends WindowCallbackAdapter {

    @NotNull
    private final Runnable callback;

    public WindowContentChangedCallback(@NotNull Window.Callback callback, @NotNull Runnable runnable) {
        super(callback);
        this.callback = runnable;
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.callback.run();
    }
}
