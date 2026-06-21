package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.sentry.ISentryLifecycleToken;
import io.sentry.util.AutoClosableReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryGestureDetector {

    @Nullable
    private MotionEvent currentDownEvent;
    private float downX;
    private float downY;
    private boolean ignoreUpEvent;
    private boolean isInTapRegion;
    private float lastX;
    private float lastY;

    @NotNull
    private final GestureDetector.OnGestureListener listener;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final int maximumFlingVelocity;
    private final int minimumFlingVelocity;
    private final int touchSlopSquare;

    @Nullable
    private VelocityTracker velocityTracker;

    public SentryGestureDetector(@NotNull Context context, @NotNull GestureDetector.OnGestureListener onGestureListener) {
        this.listener = onGestureListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.touchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        this.minimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.maximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void onTouchEvent(@NotNull MotionEvent motionEvent) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (actionMasked == 0) {
                this.downX = motionEvent.getX();
                float y7 = motionEvent.getY();
                this.downY = y7;
                this.lastX = this.downX;
                this.lastY = y7;
                this.isInTapRegion = true;
                this.ignoreUpEvent = false;
                MotionEvent motionEvent2 = this.currentDownEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.currentDownEvent = MotionEvent.obtain(motionEvent);
                this.listener.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f10 = x10 - this.downX;
                    float f11 = y10 - this.downY;
                    if ((f11 * f11) + (f10 * f10) > this.touchSlopSquare) {
                        this.listener.onScroll(this.currentDownEvent, motionEvent, this.lastX - x10, this.lastY - y10);
                        this.isInTapRegion = false;
                        this.lastX = x10;
                        this.lastY = y10;
                    }
                } else if (actionMasked == 3) {
                    recycle();
                } else if (actionMasked == 5) {
                    this.isInTapRegion = false;
                    this.ignoreUpEvent = true;
                }
            } else if (this.ignoreUpEvent) {
                recycle();
            } else {
                if (this.isInTapRegion) {
                    this.listener.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    this.velocityTracker.computeCurrentVelocity(1000, this.maximumFlingVelocity);
                    float xVelocity = this.velocityTracker.getXVelocity(pointerId);
                    float yVelocity = this.velocityTracker.getYVelocity(pointerId);
                    if (Math.abs(xVelocity) > this.minimumFlingVelocity || Math.abs(yVelocity) > this.minimumFlingVelocity) {
                        this.listener.onFling(this.currentDownEvent, motionEvent, xVelocity, yVelocity);
                    }
                }
                recycle();
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void recycle() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            MotionEvent motionEvent = this.currentDownEvent;
            this.currentDownEvent = null;
            VelocityTracker velocityTracker = this.velocityTracker;
            this.velocityTracker = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
