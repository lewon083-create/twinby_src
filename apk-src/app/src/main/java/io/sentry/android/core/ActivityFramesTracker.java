package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityFramesTracker {

    @NotNull
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;

    @NotNull
    private final LazyEvaluator<Boolean> androidXAvailable;

    @NotNull
    private final Map<Activity, FrameCounts> frameCountAtStartSnapshots;

    @NotNull
    private LazyEvaluator<FrameMetricsAggregator> frameMetricsAggregator;

    @NotNull
    private final MainLooperHandler handler;

    @NotNull
    protected AutoClosableReentrantLock lock;

    @NotNull
    private final SentryAndroidOptions options;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class FrameCounts {
        private final int frozenFrames;
        private final int slowFrames;
        private final int totalFrames;

        private FrameCounts(int i, int i10, int i11) {
            this.totalFrames = i;
            this.slowFrames = i10;
            this.frozenFrames = i11;
        }
    }

    public ActivityFramesTracker(@NotNull io.sentry.util.LoadClass loadClass, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull MainLooperHandler mainLooperHandler) {
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameCountAtStartSnapshots = new WeakHashMap();
        this.lock = new AutoClosableReentrantLock();
        this.androidXAvailable = loadClass.isClassAvailableLazy("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger());
        this.frameMetricsAggregator = new LazyEvaluator<>(new p(2));
        this.options = sentryAndroidOptions;
        this.handler = mainLooperHandler;
    }

    @Nullable
    private FrameCounts calculateCurrentFrameCounts() {
        int i;
        int i10;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable() || !this.androidXAvailable.getValue().booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) this.frameMetricsAggregator.getValue().f1314a.f28099d;
        int i11 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i10 = 0;
        } else {
            int i12 = 0;
            i = 0;
            i10 = 0;
            while (i11 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                i12 += iValueAt;
                if (iKeyAt > 700) {
                    i10 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i11++;
            }
            i11 = i12;
        }
        return new FrameCounts(i11, i, i10);
    }

    @Nullable
    private FrameCounts diffFrameCountsAtEnd(@NotNull Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts;
        FrameCounts frameCountsRemove = this.frameCountAtStartSnapshots.remove(activity);
        if (frameCountsRemove == null || (frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts()) == null) {
            return null;
        }
        return new FrameCounts(frameCountsCalculateCurrentFrameCounts.totalFrames - frameCountsRemove.totalFrames, frameCountsCalculateCurrentFrameCounts.slowFrames - frameCountsRemove.slowFrames, frameCountsCalculateCurrentFrameCounts.frozenFrames - frameCountsRemove.frozenFrames);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$addActivity$2(Activity activity) {
        la.m mVar = this.frameMetricsAggregator.getValue().f1314a;
        mVar.getClass();
        if (la.m.f28096h == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            la.m.f28096h = handlerThread;
            handlerThread.start();
            la.m.i = new Handler(la.m.f28096h.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) mVar.f28099d;
            if (sparseIntArrayArr[i] == null && (mVar.f28098c & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((t1.e) mVar.f28101f, la.m.i);
        ((ArrayList) mVar.f28100e).add(new WeakReference(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FrameMetricsAggregator lambda$new$0() {
        return new FrameMetricsAggregator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runSafelyOnUiThread$5(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setMetrics$3(Activity activity) {
        la.m mVar = this.frameMetricsAggregator.getValue().f1314a;
        ArrayList arrayList = (ArrayList) mVar.f28100e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((t1.e) mVar.f28101f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stop$4() {
        la.m mVar = this.frameMetricsAggregator.getValue().f1314a;
        ArrayList arrayList = (ArrayList) mVar.f28100e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener((t1.e) mVar.f28101f);
                arrayList.remove(size);
            }
        }
    }

    private void runSafelyOnUiThread(Runnable runnable, String str) {
        try {
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                runnable.run();
            } else {
                this.handler.post(new u(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    private void snapshotFrameCountsAtStart(@NotNull Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts();
        if (frameCountsCalculateCurrentFrameCounts != null) {
            this.frameCountAtStartSnapshots.put(activity, frameCountsCalculateCurrentFrameCounts);
        }
    }

    public void addActivity(@NotNull Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } else {
                runSafelyOnUiThread(new c(this, activity, 0), "FrameMetricsAggregator.add");
                snapshotFrameCountsAtStart(activity);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
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

    public boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable.getValue().booleanValue() && this.options.isEnableFramesTracking() && !this.options.isEnablePerformanceV2();
    }

    public void setMetrics(@NotNull Activity activity, @NotNull SentryId sentryId) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            runSafelyOnUiThread(new c(this, activity, 1), null);
            FrameCounts frameCountsDiffFrameCountsAtEnd = diffFrameCountsAtEnd(activity);
            if (frameCountsDiffFrameCountsAtEnd != null && (frameCountsDiffFrameCountsAtEnd.totalFrames != 0 || frameCountsDiffFrameCountsAtEnd.slowFrames != 0 || frameCountsDiffFrameCountsAtEnd.frozenFrames != 0)) {
                MeasurementValue measurementValue = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.totalFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue2 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.slowFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue3 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.frozenFrames), MeasurementUnit.NONE);
                HashMap map = new HashMap();
                map.put(MeasurementValue.KEY_FRAMES_TOTAL, measurementValue);
                map.put(MeasurementValue.KEY_FRAMES_SLOW, measurementValue2);
                map.put(MeasurementValue.KEY_FRAMES_FROZEN, measurementValue3);
                this.activityMeasurements.put(sentryId, map);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
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

    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new d(0, this), "FrameMetricsAggregator.stop");
                la.m mVar = this.frameMetricsAggregator.getValue().f1314a;
                Object obj = mVar.f28099d;
                mVar.f28099d = new SparseIntArray[9];
            }
            this.activityMeasurements.clear();
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

    @Nullable
    public Map<String, MeasurementValue> takeMetrics(@NotNull SentryId sentryId) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
            this.activityMeasurements.remove(sentryId);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return map;
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

    public ActivityFramesTracker(@NotNull io.sentry.util.LoadClass loadClass, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(loadClass, sentryAndroidOptions, new MainLooperHandler());
    }

    public ActivityFramesTracker(@NotNull io.sentry.util.LoadClass loadClass, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull MainLooperHandler mainLooperHandler, @NotNull FrameMetricsAggregator frameMetricsAggregator) {
        this(loadClass, sentryAndroidOptions, mainLooperHandler);
        this.frameMetricsAggregator = new LazyEvaluator<>(new m(1, frameMetricsAggregator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FrameMetricsAggregator lambda$new$1(FrameMetricsAggregator frameMetricsAggregator) {
        return frameMetricsAggregator;
    }
}
