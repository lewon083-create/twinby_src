package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.appmetrica.analytics.impl.cp;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.SentryFramesDelayResult;
import io.sentry.util.Objects;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryFrameMetricsCollector implements Application.ActivityLifecycleCallbacks {
    private static final int MAX_FRAMES_COUNT = 3600;
    private static final long MAX_FRAME_AGE_NANOS = 300000000000L;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @Nullable
    private Choreographer choreographer;

    @Nullable
    private Field choreographerLastFrameTimeField;

    @Nullable
    private WeakReference<Window> currentWindow;

    @NotNull
    private final ConcurrentSkipListSet<DelayedFrame> delayedFrames;

    @Nullable
    private Window.OnFrameMetricsAvailableListener frameMetricsAvailableListener;

    @Nullable
    private Handler handler;
    private boolean isAvailable;
    private long lastFrameEndNanos;
    private long lastFrameStartNanos;

    @NotNull
    private final Map<String, FrameMetricsCollectorListener> listenerMap;

    @NotNull
    private final ILogger logger;

    @NotNull
    private final Set<Window> trackedWindows;
    private final WindowFrameMetricsManager windowFrameMetricsManager;
    private static final long oneSecondInNanos = TimeUnit.SECONDS.toNanos(1);
    private static final long frozenFrameThresholdNanos = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class DelayedFrame implements Comparable<DelayedFrame> {
        final long delayNanos;
        final long endNanos;
        final long startNanos;

        public DelayedFrame(long j10) {
            this(j10, j10, 0L);
        }

        public DelayedFrame(long j10, long j11, long j12) {
            this.startNanos = j10;
            this.endNanos = j11;
            this.delayNanos = j12;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull DelayedFrame delayedFrame) {
            int iCompare = Long.compare(this.endNanos, delayedFrame.endNanos);
            return iCompare != 0 ? iCompare : Long.compare(this.startNanos, delayedFrame.startNanos);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface FrameMetricsCollectorListener {
        void onFrameMetricCollected(long j10, long j11, long j12, long j13, boolean z5, boolean z10, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface WindowFrameMetricsManager {
        default void addOnFrameMetricsAvailableListener(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, @Nullable Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void removeOnFrameMetricsAvailableListener(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @SuppressLint({"NewApi"})
    public SentryFrameMetricsCollector(@NotNull Context context, @NotNull SentryOptions sentryOptions, @NotNull BuildInfoProvider buildInfoProvider) {
        this(context, sentryOptions, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.1
        });
    }

    private long getFrameCpuDuration(@NotNull FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
    }

    @SuppressLint({"NewApi"})
    private long getFrameStartTimestamp(@NotNull FrameMetrics frameMetrics) {
        return this.buildInfoProvider.getSdkInfoVersion() >= 26 ? frameMetrics.getMetric(10) : getLastKnownFrameStartTimeNanos();
    }

    public static boolean isFrozen(long j10) {
        return j10 > frozenFrameThresholdNanos;
    }

    public static boolean isSlow(long j10, long j11) {
        return j10 > j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(ILogger iLogger, Thread thread, Throwable th2) {
        iLogger.log(SentryLevel.ERROR, "Error during frames measurements.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ILogger iLogger) {
        try {
            this.choreographer = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$new$2(io.sentry.android.core.BuildInfoProvider r25, android.view.Window r26, android.view.FrameMetrics r27, int r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r27
            long r2 = java.lang.System.nanoTime()
            int r4 = r25.getSdkInfoVersion()
            r5 = 30
            if (r4 < r5) goto L1f
            android.content.Context r4 = r26.getContext()
            android.view.Display r4 = g2.u1.d(r4)
            float r4 = r4.getRefreshRate()
        L1c:
            r16 = r4
            goto L2c
        L1f:
            android.view.WindowManager r4 = r26.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            float r4 = r4.getRefreshRate()
            goto L1c
        L2c:
            long r4 = io.sentry.android.core.internal.util.SentryFrameMetricsCollector.oneSecondInNanos
            float r4 = (float) r4
            float r5 = r4 / r16
            long r5 = (long) r5
            long r10 = r0.getFrameCpuDuration(r1)
            long r5 = r10 - r5
            r7 = 0
            long r12 = java.lang.Math.max(r7, r5)
            long r5 = r0.getFrameStartTimestamp(r1)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L48
            long r5 = r2 - r10
        L48:
            long r1 = r0.lastFrameEndNanos
            long r1 = java.lang.Math.max(r5, r1)
            long r5 = r0.lastFrameStartNanos
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L55
            goto Lbb
        L55:
            r0.lastFrameStartNanos = r1
            long r5 = r1 + r10
            r0.lastFrameEndNanos = r5
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r16 - r3
            float r4 = r4 / r3
            long r3 = (long) r4
            boolean r14 = isSlow(r10, r3)
            if (r14 == 0) goto L70
            boolean r3 = isFrozen(r10)
            if (r3 == 0) goto L70
            r3 = 1
        L6e:
            r15 = r3
            goto L72
        L70:
            r3 = 0
            goto L6e
        L72:
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 <= 0) goto L9a
            long r3 = r0.lastFrameEndNanos
            r0.pruneOldFrames(r3)
            java.util.concurrent.ConcurrentSkipListSet<io.sentry.android.core.internal.util.SentryFrameMetricsCollector$DelayedFrame> r3 = r0.delayedFrames
            int r3 = r3.size()
            r4 = 3600(0xe10, float:5.045E-42)
            if (r3 >= r4) goto L9a
            java.util.concurrent.ConcurrentSkipListSet<io.sentry.android.core.internal.util.SentryFrameMetricsCollector$DelayedFrame> r3 = r0.delayedFrames
            io.sentry.android.core.internal.util.SentryFrameMetricsCollector$DelayedFrame r17 = new io.sentry.android.core.internal.util.SentryFrameMetricsCollector$DelayedFrame
            long r4 = r0.lastFrameEndNanos
            r18 = r1
            r20 = r4
            r22 = r12
            r17.<init>(r18, r20, r22)
            r1 = r17
            r3.add(r1)
            goto L9c
        L9a:
            r18 = r1
        L9c:
            java.util.Map<java.lang.String, io.sentry.android.core.internal.util.SentryFrameMetricsCollector$FrameMetricsCollectorListener> r1 = r0.listenerMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        La6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r1.next()
            r5 = r2
            io.sentry.android.core.internal.util.SentryFrameMetricsCollector$FrameMetricsCollectorListener r5 = (io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener) r5
            long r8 = r0.lastFrameEndNanos
            r6 = r18
            r5.onFrameMetricCollected(r6, r8, r10, r12, r14, r15, r16)
            goto La6
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.lambda$new$2(io.sentry.android.core.BuildInfoProvider, android.view.Window, android.view.FrameMetrics, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopTrackingWindow$3(Window window) {
        try {
            if (this.trackedWindows.remove(window)) {
                this.windowFrameMetricsManager.removeOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener);
            }
        } catch (Throwable th2) {
            this.logger.log(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackCurrentWindow$4(Window window) {
        if (this.trackedWindows.add(window)) {
            try {
                this.windowFrameMetricsManager.addOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener, this.handler);
            } catch (Throwable th2) {
                this.logger.log(SentryLevel.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    private void pruneOldFrames(long j10) {
        this.delayedFrames.headSet(new DelayedFrame(j10 - MAX_FRAME_AGE_NANOS)).clear();
    }

    private void setCurrentWindow(@NotNull Window window) {
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != window) {
            this.currentWindow = new WeakReference<>(window);
            trackCurrentWindow();
        }
    }

    @SuppressLint({"NewApi"})
    private void stopTrackingWindow(@NotNull Window window) {
        new Handler(Looper.getMainLooper()).post(new d(this, window, 1));
    }

    @SuppressLint({"NewApi"})
    private void trackCurrentWindow() {
        WeakReference<Window> weakReference = this.currentWindow;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.isAvailable || this.listenerMap.isEmpty() || this.handler == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new d(this, window, 0));
    }

    @NotNull
    public SentryFramesDelayResult getFramesDelay(long j10, long j11) {
        int i = 0;
        if (!this.isAvailable) {
            return new SentryFramesDelayResult(-1.0d, 0);
        }
        if (j11 <= j10) {
            return new SentryFramesDelayResult(-1.0d, 0);
        }
        long j12 = 0;
        if (!this.delayedFrames.isEmpty()) {
            for (DelayedFrame delayedFrame : this.delayedFrames.tailSet(new DelayedFrame(j10))) {
                if (delayedFrame.startNanos >= j11) {
                    break;
                }
                long j13 = delayedFrame.endNanos;
                long jMax = Math.max(j13 - delayedFrame.delayNanos, j10);
                long jMin = Math.min(j13, j11);
                if (jMin > jMax) {
                    i++;
                    j12 = (jMin - jMax) + j12;
                }
            }
        }
        return new SentryFramesDelayResult(j12 / 1.0E9d, i);
    }

    public long getLastKnownFrameStartTimeNanos() {
        Field field;
        Choreographer choreographer = this.choreographer;
        if (choreographer == null || (field = this.choreographerLastFrameTimeField) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        setCurrentWindow(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        stopTrackingWindow(activity.getWindow());
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.currentWindow = null;
    }

    @Nullable
    public String startCollection(@NotNull FrameMetricsCollectorListener frameMetricsCollectorListener) {
        if (!this.isAvailable) {
            return null;
        }
        String strGenerateSentryId = SentryUUID.generateSentryId();
        this.listenerMap.put(strGenerateSentryId, frameMetricsCollectorListener);
        trackCurrentWindow();
        return strGenerateSentryId;
    }

    public void stopCollection(@Nullable String str) {
        if (this.isAvailable) {
            if (str != null) {
                this.listenerMap.remove(str);
            }
            WeakReference<Window> weakReference = this.currentWindow;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.listenerMap.isEmpty()) {
                return;
            }
            stopTrackingWindow(window);
        }
    }

    @SuppressLint({"NewApi"})
    public SentryFrameMetricsCollector(@NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        this(context, iLogger, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.2
        });
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public SentryFrameMetricsCollector(@NotNull Context context, @NotNull SentryOptions sentryOptions, @NotNull BuildInfoProvider buildInfoProvider, @NotNull WindowFrameMetricsManager windowFrameMetricsManager) {
        this(context, sentryOptions.getLogger(), buildInfoProvider, windowFrameMetricsManager);
    }

    @SuppressLint({"NewApi", "PrivateApi"})
    public SentryFrameMetricsCollector(@NotNull Context context, @NotNull final ILogger iLogger, @NotNull final BuildInfoProvider buildInfoProvider, @NotNull WindowFrameMetricsManager windowFrameMetricsManager) {
        this.trackedWindows = new CopyOnWriteArraySet();
        this.listenerMap = new ConcurrentHashMap();
        this.isAvailable = false;
        this.lastFrameStartNanos = 0L;
        this.lastFrameEndNanos = 0L;
        this.delayedFrames = new ConcurrentSkipListSet<>();
        Context context2 = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.windowFrameMetricsManager = (WindowFrameMetricsManager) Objects.requireNonNull(windowFrameMetricsManager, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && buildInfoProvider.getSdkInfoVersion() >= 24) {
            this.isAvailable = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.e
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    SentryFrameMetricsCollector.lambda$new$0(iLogger, thread, th2);
                }
            });
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new cp(5, this, iLogger));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.choreographerLastFrameTimeField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                iLogger.log(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e3);
            }
            this.frameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.f
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                    this.f25925a.lambda$new$2(buildInfoProvider, window, frameMetrics, i);
                }
            };
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }
}
