package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryWindowCallback extends WindowCallbackAdapter {

    @NotNull
    private final Window.Callback delegate;

    @NotNull
    private final SentryGestureDetector gestureDetector;

    @NotNull
    private final SentryGestureListener gestureListener;
    private volatile boolean inert;

    @NotNull
    private final MotionEventObtainer motionEventObtainer;

    @Nullable
    private final SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface MotionEventObtainer {
        @NotNull
        default MotionEvent obtain(@NotNull MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public SentryWindowCallback(@NotNull Window.Callback callback, @NotNull Context context, @NotNull SentryGestureListener sentryGestureListener, @Nullable SentryOptions sentryOptions) {
        this(callback, new SentryGestureDetector(context, sentryGestureListener), sentryGestureListener, sentryOptions, new MotionEventObtainer() { // from class: io.sentry.android.core.internal.gestures.SentryWindowCallback.1
        });
    }

    private void handleTouchEvent(@NotNull MotionEvent motionEvent) {
        if (this.inert) {
            return;
        }
        this.gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.gestureListener.onUp(motionEvent);
        }
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackAdapter, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                handleTouchEvent(this.motionEventObtainer.obtain(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public Window.Callback getDelegate() {
        return this.delegate;
    }

    public void stopTracking() {
        this.inert = true;
        this.gestureListener.stopTracing(SpanStatus.CANCELLED);
        this.gestureDetector.recycle();
    }

    public SentryWindowCallback(@NotNull Window.Callback callback, @NotNull SentryGestureDetector sentryGestureDetector, @NotNull SentryGestureListener sentryGestureListener, @Nullable SentryOptions sentryOptions, @NotNull MotionEventObtainer motionEventObtainer) {
        super(callback);
        this.delegate = callback;
        this.gestureListener = sentryGestureListener;
        this.options = sentryOptions;
        this.gestureDetector = sentryGestureDetector;
        this.motionEventObtainer = motionEventObtainer;
    }
}
