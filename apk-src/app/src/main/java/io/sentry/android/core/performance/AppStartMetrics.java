package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import io.sentry.IContinuousProfiler;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransactionProfiler;
import io.sentry.NoOpLogger;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.CurrentActivityHolder;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AppStartMetrics extends ActivityLifecycleCallbacksAdapter {
    private static volatile AppStartMetrics instance;
    private static long CLASS_LOADED_UPTIME_MS = SystemClock.uptimeMillis();

    @NotNull
    public static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    @NotNull
    private AppStartType appStartType = AppStartType.UNKNOWN;
    private final LazyEvaluator<Boolean> appLaunchedInForeground = new LazyEvaluator<>(new LazyEvaluator.Evaluator<Boolean>() { // from class: io.sentry.android.core.performance.AppStartMetrics.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        @NotNull
        public Boolean evaluate() {
            return Boolean.valueOf(ContextUtils.isForegroundImportance());
        }
    });
    private volatile long firstIdle = -1;
    private ITransactionProfiler appStartProfiler = null;
    private IContinuousProfiler appStartContinuousProfiler = null;
    private TracesSamplingDecision appStartSamplingDecision = null;
    private boolean isCallbackRegistered = false;
    private boolean shouldSendStartMeasurements = true;
    private final AtomicInteger activeActivitiesCounter = new AtomicInteger();
    private final AtomicBoolean firstDrawDone = new AtomicBoolean(false);

    @NotNull
    private final TimeSpan appStartSpan = new TimeSpan();

    @NotNull
    private final TimeSpan sdkInitTimeSpan = new TimeSpan();

    @NotNull
    private final TimeSpan applicationOnCreate = new TimeSpan();

    @NotNull
    private final Map<ContentProvider, TimeSpan> contentProviderOnCreates = new HashMap();

    @NotNull
    private final List<ActivityLifecycleTimeSpan> activityLifecycles = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.performance.AppStartMetrics$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Handler val$handler;

        public AnonymousClass3(Handler handler) {
            this.val$handler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            AppStartMetrics.this.checkCreateTimeOnMain();
        }

        @Override // java.lang.Runnable
        public void run() {
            AppStartMetrics.this.firstIdle = SystemClock.uptimeMillis();
            this.val$handler.post(new a(2, this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCreateTimeOnMain() {
        if (this.activeActivitiesCounter.get() == 0) {
            this.appLaunchedInForeground.setValue(Boolean.FALSE);
            ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
            if (iTransactionProfiler != null && iTransactionProfiler.isRunning()) {
                this.appStartProfiler.close();
                this.appStartProfiler = null;
            }
            IContinuousProfiler iContinuousProfiler = this.appStartContinuousProfiler;
            if (iContinuousProfiler == null || !iContinuousProfiler.isRunning()) {
                return;
            }
            this.appStartContinuousProfiler.close(true);
            this.appStartContinuousProfiler = null;
        }
    }

    @NotNull
    public static AppStartMetrics getInstance() {
        if (instance == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (instance == null) {
                    instance = new AppStartMetrics();
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
        return instance;
    }

    public static void onApplicationCreate(@NotNull Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStarted()) {
            appStartMetrics.applicationOnCreate.setStartedAt(jUptimeMillis);
            appStartMetrics.registerLifecycleCallbacks(application);
        }
    }

    public static void onApplicationPostCreate(@NotNull Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStopped()) {
            appStartMetrics.applicationOnCreate.setDescription(application.getClass().getName().concat(".onCreate"));
            appStartMetrics.applicationOnCreate.setStoppedAt(jUptimeMillis);
        }
    }

    public static void onContentProviderCreate(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setStartedAt(jUptimeMillis);
        getInstance().contentProviderOnCreates.put(contentProvider, timeSpan);
    }

    public static void onContentProviderPostCreate(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = getInstance().contentProviderOnCreates.get(contentProvider);
        if (timeSpan == null || !timeSpan.hasNotStopped()) {
            return;
        }
        timeSpan.setDescription(contentProvider.getClass().getName().concat(".onCreate"));
        timeSpan.setStoppedAt(jUptimeMillis);
    }

    public void addActivityLifecycleTimeSpans(@NotNull ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        this.activityLifecycles.add(activityLifecycleTimeSpan);
    }

    public void clear() {
        this.appStartType = AppStartType.UNKNOWN;
        this.appStartSpan.reset();
        this.sdkInitTimeSpan.reset();
        this.applicationOnCreate.reset();
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
        ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
        if (iTransactionProfiler != null) {
            iTransactionProfiler.close();
        }
        this.appStartProfiler = null;
        IContinuousProfiler iContinuousProfiler = this.appStartContinuousProfiler;
        if (iContinuousProfiler != null) {
            iContinuousProfiler.close(true);
        }
        this.appStartContinuousProfiler = null;
        this.appStartSamplingDecision = null;
        this.appLaunchedInForeground.resetValue();
        this.isCallbackRegistered = false;
        this.shouldSendStartMeasurements = true;
        this.firstDrawDone.set(false);
        this.activeActivitiesCounter.set(0);
        this.firstIdle = -1L;
    }

    @NotNull
    public TimeSpan createProcessInitSpan() {
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setup("Process Initialization", this.appStartSpan.getStartTimestampMs(), this.appStartSpan.getStartUptimeMs(), CLASS_LOADED_UPTIME_MS);
        return timeSpan;
    }

    @NotNull
    public List<ActivityLifecycleTimeSpan> getActivityLifecycleTimeSpans() {
        ArrayList arrayList = new ArrayList(this.activityLifecycles);
        Collections.sort(arrayList);
        return arrayList;
    }

    public IContinuousProfiler getAppStartContinuousProfiler() {
        return this.appStartContinuousProfiler;
    }

    public ITransactionProfiler getAppStartProfiler() {
        return this.appStartProfiler;
    }

    public TracesSamplingDecision getAppStartSamplingDecision() {
        return this.appStartSamplingDecision;
    }

    @NotNull
    public TimeSpan getAppStartTimeSpan() {
        return this.appStartSpan;
    }

    @NotNull
    public TimeSpan getAppStartTimeSpanWithFallback(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (this.appStartType != AppStartType.UNKNOWN && this.appLaunchedInForeground.getValue().booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                TimeSpan appStartTimeSpan = getAppStartTimeSpan();
                if (appStartTimeSpan.hasStarted() && appStartTimeSpan.getDurationMs() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return appStartTimeSpan;
                }
            }
            TimeSpan sdkInitTimeSpan = getSdkInitTimeSpan();
            if (sdkInitTimeSpan.hasStarted() && sdkInitTimeSpan.getDurationMs() <= TimeUnit.MINUTES.toMillis(1L)) {
                return sdkInitTimeSpan;
            }
        }
        return new TimeSpan();
    }

    @NotNull
    public AppStartType getAppStartType() {
        return this.appStartType;
    }

    @NotNull
    public TimeSpan getApplicationOnCreateTimeSpan() {
        return this.applicationOnCreate;
    }

    public long getClassLoadedUptimeMs() {
        return CLASS_LOADED_UPTIME_MS;
    }

    @NotNull
    public List<TimeSpan> getContentProviderOnCreateTimeSpans() {
        ArrayList arrayList = new ArrayList(this.contentProviderOnCreates.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public long getFirstIdle() {
        return this.firstIdle;
    }

    @NotNull
    public TimeSpan getSdkInitTimeSpan() {
        return this.sdkInitTimeSpan;
    }

    public boolean isAppLaunchedInForeground() {
        return this.appLaunchedInForeground.getValue().booleanValue();
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        CurrentActivityHolder.getInstance().setActivity(activity);
        if (this.activeActivitiesCounter.incrementAndGet() == 1 && !this.firstDrawDone.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.appStartSpan.getStartUptimeMs();
            if (!this.appLaunchedInForeground.getValue().booleanValue() || jUptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.appStartType = AppStartType.WARM;
                this.shouldSendStartMeasurements = true;
                this.appStartSpan.reset();
                this.appStartSpan.setStartedAt(jUptimeMillis);
                CLASS_LOADED_UPTIME_MS = jUptimeMillis;
                this.contentProviderOnCreates.clear();
                this.applicationOnCreate.reset();
            } else if (this.appStartType == AppStartType.UNKNOWN) {
                if (bundle != null) {
                    this.appStartType = AppStartType.WARM;
                } else if (this.firstIdle == -1 || jUptimeMillis <= this.firstIdle) {
                    this.appStartType = AppStartType.COLD;
                } else {
                    this.appStartType = AppStartType.WARM;
                }
            }
        }
        this.appLaunchedInForeground.setValue(Boolean.TRUE);
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        CurrentActivityHolder.getInstance().clearActivity(activity);
        if (this.activeActivitiesCounter.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.appStartType = AppStartType.WARM;
        this.appLaunchedInForeground.setValue(Boolean.TRUE);
        this.shouldSendStartMeasurements = true;
        this.firstDrawDone.set(false);
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        CurrentActivityHolder.getInstance().clearActivity(activity);
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        CurrentActivityHolder.getInstance().setActivity(activity);
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        CurrentActivityHolder.getInstance().setActivity(activity);
        if (this.firstDrawDone.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            FirstDrawDoneListener.registerForNextDraw(activity, new a(0, this), new BuildInfoProvider(NoOpLogger.getInstance()));
        } else {
            new Handler(Looper.getMainLooper()).post(new a(1, this));
        }
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        CurrentActivityHolder.getInstance().clearActivity(activity);
    }

    public void onAppStartSpansSent() {
        this.shouldSendStartMeasurements = false;
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
    }

    /* JADX INFO: renamed from: onFirstFrameDrawn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public synchronized void lambda$onActivityStarted$1() {
        if (!this.firstDrawDone.getAndSet(true)) {
            AppStartMetrics appStartMetrics = getInstance();
            appStartMetrics.getSdkInitTimeSpan().stop();
            appStartMetrics.getAppStartTimeSpan().stop();
        }
    }

    public void registerLifecycleCallbacks(@NotNull Application application) {
        ActivityManager activityManager;
        if (this.isCallbackRegistered) {
            return;
        }
        this.isCallbackRegistered = true;
        this.appLaunchedInForeground.resetValue();
        application.registerActivityLifecycleCallbacks(instance);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfoD = b4.a.d(historicalProcessStartReasons.get(0));
                if (applicationStartInfoD.getStartupState() == 0) {
                    if (applicationStartInfoD.getStartType() == 1) {
                        this.appStartType = AppStartType.COLD;
                    } else {
                        this.appStartType = AppStartType.WARM;
                    }
                }
            }
        }
        AppStartType appStartType = this.appStartType;
        AppStartType appStartType2 = AppStartType.UNKNOWN;
        if (appStartType == appStartType2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: io.sentry.android.core.performance.AppStartMetrics.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    AppStartMetrics.this.firstIdle = SystemClock.uptimeMillis();
                    AppStartMetrics.this.checkCreateTimeOnMain();
                    return false;
                }
            });
        } else if (appStartType == appStartType2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new AnonymousClass3(handler));
        }
    }

    public void setAppLaunchedInForeground(boolean z5) {
        this.appLaunchedInForeground.setValue(Boolean.valueOf(z5));
    }

    public void setAppStartContinuousProfiler(IContinuousProfiler iContinuousProfiler) {
        this.appStartContinuousProfiler = iContinuousProfiler;
    }

    public void setAppStartProfiler(ITransactionProfiler iTransactionProfiler) {
        this.appStartProfiler = iTransactionProfiler;
    }

    public void setAppStartSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        this.appStartSamplingDecision = tracesSamplingDecision;
    }

    public void setAppStartType(@NotNull AppStartType appStartType) {
        this.appStartType = appStartType;
    }

    public void setClassLoadedUptimeMs(long j10) {
        CLASS_LOADED_UPTIME_MS = j10;
    }

    public void setFirstIdle(long j10) {
        this.firstIdle = j10;
    }

    public boolean shouldSendStartMeasurements() {
        return this.shouldSendStartMeasurements && this.appLaunchedInForeground.getValue().booleanValue();
    }
}
