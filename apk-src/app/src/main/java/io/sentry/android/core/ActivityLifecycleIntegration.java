package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.om1;
import io.sentry.FullyDisplayedReporter;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Instrumenter;
import io.sentry.Integration;
import io.sentry.MeasurementUnit;
import io.sentry.NoOpTransaction;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryOptions;
import io.sentry.SpanOptions;
import io.sentry.SpanStatus;
import io.sentry.TracesSamplingDecision;
import io.sentry.TransactionContext;
import io.sentry.TransactionOptions;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.android.core.performance.ActivityLifecycleSpanHelper;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    static final String APP_START_COLD = "app.start.cold";
    static final String APP_START_WARM = "app.start.warm";
    private static final String TRACE_ORIGIN = "auto.ui.activity";
    static final String TTFD_OP = "ui.load.full_display";
    static final long TTFD_TIMEOUT_MILLIS = 25000;
    static final String TTID_OP = "ui.load.initial_display";
    static final String UI_LOAD_OP = "ui.load";

    @NotNull
    private final ActivityFramesTracker activityFramesTracker;

    @Nullable
    private ISpan appStartSpan;

    @NotNull
    private final Application application;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;
    private boolean isAllActivityCallbacksAvailable;

    @Nullable
    private SentryAndroidOptions options;

    @Nullable
    private IScopes scopes;
    private boolean performanceEnabled = false;
    private boolean timeToFullDisplaySpanEnabled = false;
    private boolean firstActivityCreated = false;

    @Nullable
    private FullyDisplayedReporter fullyDisplayedReporter = null;

    @NotNull
    private final WeakHashMap<Activity, ISpan> ttidSpanMap = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<Activity, ISpan> ttfdSpanMap = new WeakHashMap<>();

    @NotNull
    private final WeakHashMap<Activity, ActivityLifecycleSpanHelper> activitySpanHelpers = new WeakHashMap<>();

    @NotNull
    private SentryDate lastPausedTime = new SentryNanotimeDate(new Date(0), 0);

    @Nullable
    private Future<?> ttfdAutoCloseFuture = null;

    @NotNull
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private boolean fullyDisplayedCalled = false;

    @NotNull
    private final AutoClosableReentrantLock fullyDisplayedLock = new AutoClosableReentrantLock();

    public ActivityLifecycleIntegration(@NotNull Application application, @NotNull BuildInfoProvider buildInfoProvider, @NotNull ActivityFramesTracker activityFramesTracker) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
        if (buildInfoProvider.getSdkInfoVersion() >= 29) {
            this.isAllActivityCallbacksAvailable = true;
        }
    }

    private void cancelTtfdAutoClose() {
        Future<?> future = this.ttfdAutoCloseFuture;
        if (future != null) {
            future.cancel(false);
            this.ttfdAutoCloseFuture = null;
        }
    }

    private void clear() {
        this.firstActivityCreated = false;
        this.lastPausedTime = new SentryNanotimeDate(new Date(0L), 0L);
        this.activitySpanHelpers.clear();
    }

    private void finishAppStartSpan() {
        SentryDate projectedStopTimestamp = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options).getProjectedStopTimestamp();
        if (!this.performanceEnabled || projectedStopTimestamp == null) {
            return;
        }
        finishSpan(this.appStartSpan, projectedStopTimestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: finishExceededTtfdSpan, reason: merged with bridge method [inline-methods] */
    public void lambda$startTracing$1(@Nullable ISpan iSpan, @Nullable ISpan iSpan2) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.setDescription(getExceededTtfdDesc(iSpan));
        SentryDate finishDate = iSpan2 != null ? iSpan2.getFinishDate() : null;
        if (finishDate == null) {
            finishDate = iSpan.getStartDate();
        }
        finishSpan(iSpan, finishDate, SpanStatus.DEADLINE_EXCEEDED);
    }

    private void finishSpan(@Nullable ISpan iSpan) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish();
    }

    private void finishTransaction(@Nullable ITransaction iTransaction, @Nullable ISpan iSpan, @Nullable ISpan iSpan2) {
        if (iTransaction == null || iTransaction.isFinished()) {
            return;
        }
        finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
        lambda$startTracing$1(iSpan2, iSpan);
        cancelTtfdAutoClose();
        SpanStatus status = iTransaction.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        iTransaction.finish(status);
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new h(this, iTransaction, 1));
        }
    }

    @NotNull
    private String getActivityName(@NotNull Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @NotNull
    private String getAppStartDesc(boolean z5) {
        return z5 ? "Cold Start" : "Warm Start";
    }

    @NotNull
    private String getAppStartOp(boolean z5) {
        return z5 ? APP_START_COLD : APP_START_WARM;
    }

    @NotNull
    private String getExceededTtfdDesc(@NotNull ISpan iSpan) {
        String description = iSpan.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return iSpan.getDescription() + " - Deadline Exceeded";
    }

    @NotNull
    private String getTtfdDesc(@NotNull String str) {
        return om1.x(str, " full display");
    }

    @NotNull
    private String getTtidDesc(@NotNull String str) {
        return om1.x(str, " initial display");
    }

    private boolean isPerformanceEnabled(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean isRunningTransactionOrTrace(@NotNull Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyScope$3(IScope iScope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            iScope.setTransaction(iTransaction);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearScope$4(ITransaction iTransaction, IScope iScope, ITransaction iTransaction2) {
        if (iTransaction2 == iTransaction) {
            iScope.clearTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTracing$0(WeakReference weakReference, String str, ITransaction iTransaction) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFirstFrameDrawn, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$onActivityResumed$9(@Nullable ISpan iSpan, @Nullable ISpan iSpan2) {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (appStartTimeSpan.hasStarted() && appStartTimeSpan.hasNotStopped()) {
            appStartTimeSpan.stop();
        }
        if (sdkInitTimeSpan.hasStarted() && sdkInitTimeSpan.hasNotStopped()) {
            sdkInitTimeSpan.stop();
        }
        finishAppStartSpan();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.fullyDisplayedLock.acquire();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions == null || iSpan2 == null) {
                finishSpan(iSpan2);
                if (this.fullyDisplayedCalled) {
                    finishSpan(iSpan);
                }
            } else {
                SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
                long millis = TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan2.getStartDate()));
                Long lValueOf = Long.valueOf(millis);
                MeasurementUnit.Duration duration = MeasurementUnit.Duration.MILLISECOND;
                iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_INITIAL_DISPLAY, lValueOf, duration);
                if (iSpan != null && this.fullyDisplayedCalled) {
                    this.fullyDisplayedCalled = false;
                    iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(millis), duration);
                    iSpan.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(millis), duration);
                    finishSpan(iSpan, sentryDateNow);
                }
                finishSpan(iSpan2, sentryDateNow);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFullFrameDrawn, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityCreated$7(@NotNull ISpan iSpan, @NotNull ISpan iSpan2) {
        cancelTtfdAutoClose();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.fullyDisplayedLock.acquire();
        try {
            if (!iSpan.isFinished()) {
                this.fullyDisplayedCalled = true;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
                iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan2.getStartDate()))), MeasurementUnit.Duration.MILLISECOND);
                finishSpan(iSpan2, sentryDateNow);
            } else {
                finishSpan(iSpan2);
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

    private void setSpanOrigin(@NotNull SpanOptions spanOptions) {
        spanOptions.setOrigin(TRACE_ORIGIN);
    }

    private void startTracing(@NotNull Activity activity) {
        Boolean boolValueOf;
        SentryDate sentryDate;
        SentryDate sentryDate2;
        ITransaction iTransaction;
        SpanOptions spanOptions;
        WeakReference weakReference = new WeakReference(activity);
        if (this.scopes == null || isRunningTransactionOrTrace(activity)) {
            return;
        }
        if (!this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.put(activity, NoOpTransaction.getInstance());
            if (this.options.isEnableAutoTraceIdGeneration()) {
                TracingUtils.startNewTrace(this.scopes);
                return;
            }
            return;
        }
        stopPreviousTransactions();
        String activityName = getActivityName(activity);
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        TracesSamplingDecision tracesSamplingDecision = null;
        if (ContextUtils.isForegroundImportance() && appStartTimeSpanWithFallback.hasStarted()) {
            SentryDate startTimestamp = appStartTimeSpanWithFallback.getStartTimestamp();
            boolValueOf = Boolean.valueOf(AppStartMetrics.getInstance().getAppStartType() == AppStartMetrics.AppStartType.COLD);
            sentryDate = startTimestamp;
        } else {
            boolValueOf = null;
            sentryDate = null;
        }
        TransactionOptions transactionOptions = new TransactionOptions();
        long deadlineTimeout = this.options.getDeadlineTimeout();
        transactionOptions.setDeadlineTimeout(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.options.isEnableActivityLifecycleTracingAutoFinish()) {
            transactionOptions.setIdleTimeout(this.options.getIdleTimeout());
            transactionOptions.setTrimEnd(true);
        }
        transactionOptions.setWaitForChildren(true);
        transactionOptions.setTransactionFinishedCallback(new f(this, weakReference, activityName));
        if (this.firstActivityCreated || sentryDate == null || boolValueOf == null) {
            sentryDate2 = this.lastPausedTime;
        } else {
            TracesSamplingDecision appStartSamplingDecision = AppStartMetrics.getInstance().getAppStartSamplingDecision();
            AppStartMetrics.getInstance().setAppStartSamplingDecision(null);
            tracesSamplingDecision = appStartSamplingDecision;
            sentryDate2 = sentryDate;
        }
        transactionOptions.setStartTimestamp(sentryDate2);
        transactionOptions.setAppStartTransaction(tracesSamplingDecision != null);
        setSpanOrigin(transactionOptions);
        ITransaction iTransactionStartTransaction = this.scopes.startTransaction(new TransactionContext(activityName, TransactionNameSource.COMPONENT, UI_LOAD_OP, tracesSamplingDecision), transactionOptions);
        SpanOptions spanOptions2 = new SpanOptions();
        setSpanOrigin(spanOptions2);
        if (this.firstActivityCreated || sentryDate == null || boolValueOf == null) {
            iTransaction = iTransactionStartTransaction;
            spanOptions = spanOptions2;
        } else {
            iTransaction = iTransactionStartTransaction;
            spanOptions = spanOptions2;
            this.appStartSpan = iTransaction.startChild(getAppStartOp(boolValueOf.booleanValue()), getAppStartDesc(boolValueOf.booleanValue()), sentryDate, Instrumenter.SENTRY, spanOptions2);
            finishAppStartSpan();
        }
        String ttidDesc = getTtidDesc(activityName);
        Instrumenter instrumenter = Instrumenter.SENTRY;
        SentryDate sentryDate3 = sentryDate2;
        ISpan iSpanStartChild = iTransaction.startChild(TTID_OP, ttidDesc, sentryDate3, instrumenter, spanOptions);
        this.ttidSpanMap.put(activity, iSpanStartChild);
        if (this.timeToFullDisplaySpanEnabled && this.fullyDisplayedReporter != null && this.options != null) {
            ISpan iSpanStartChild2 = iTransaction.startChild(TTFD_OP, getTtfdDesc(activityName), sentryDate3, instrumenter, spanOptions);
            try {
                this.ttfdSpanMap.put(activity, iSpanStartChild2);
                this.ttfdAutoCloseFuture = this.options.getExecutorService().schedule(new g(this, iSpanStartChild2, iSpanStartChild, 0), TTFD_TIMEOUT_MILLIS);
            } catch (RejectedExecutionException e3) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e3);
            }
        }
        this.scopes.configureScope(new h(this, iTransaction, 0));
        this.activitiesWithOngoingTransactions.put(activity, iTransaction);
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> entry : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction(entry.getValue(), this.ttidSpanMap.get(entry.getKey()), this.ttfdSpanMap.get(entry.getKey()));
        }
    }

    private void stopTracing(@NotNull Activity activity, boolean z5) {
        if (this.performanceEnabled && z5) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity), null, null);
        }
    }

    /* JADX INFO: renamed from: applyScope, reason: merged with bridge method [inline-methods] */
    public void lambda$startTracing$2(@NotNull IScope iScope, @NotNull ITransaction iTransaction) {
        iScope.withTransaction(new f(this, iScope, iTransaction));
    }

    /* JADX INFO: renamed from: clearScope, reason: merged with bridge method [inline-methods] */
    public void lambda$finishTransaction$5(@NotNull IScope iScope, @NotNull ITransaction iTransaction) {
        iScope.withTransaction(new e(iTransaction, iScope));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.activityFramesTracker.stop();
    }

    @NotNull
    public WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    @NotNull
    public ActivityFramesTracker getActivityFramesTracker() {
        return this.activityFramesTracker;
    }

    @NotNull
    public WeakHashMap<Activity, ActivityLifecycleSpanHelper> getActivitySpanHelpers() {
        return this.activitySpanHelpers;
    }

    @Nullable
    public ISpan getAppStartSpan() {
        return this.appStartSpan;
    }

    @NotNull
    public WeakHashMap<Activity, ISpan> getTtfdSpanMap() {
        return this.ttfdSpanMap;
    }

    @NotNull
    public WeakHashMap<Activity, ISpan> getTtidSpanMap() {
        return this.ttidSpanMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        FullyDisplayedReporter fullyDisplayedReporter;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPreCreated(activity, bundle);
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.scopes != null && (sentryAndroidOptions = this.options) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.scopes.configureScope(new t(1, ClassUtil.getClassName(activity)));
            }
            startTracing(activity);
            final ISpan iSpan = this.ttidSpanMap.get(activity);
            final ISpan iSpan2 = this.ttfdSpanMap.get(activity);
            this.firstActivityCreated = true;
            if (this.performanceEnabled && iSpan != null && iSpan2 != null && (fullyDisplayedReporter = this.fullyDisplayedReporter) != null) {
                fullyDisplayedReporter.registerFullyDrawnListener(new FullyDisplayedReporter.FullyDisplayedReporterListener() { // from class: io.sentry.android.core.i
                    @Override // io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener
                    public final void onFullyDrawn() {
                        this.f25911a.lambda$onActivityCreated$7(iSpan, iSpan2);
                    }
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ActivityLifecycleSpanHelper activityLifecycleSpanHelperRemove = this.activitySpanHelpers.remove(activity);
            if (activityLifecycleSpanHelperRemove != null) {
                activityLifecycleSpanHelperRemove.clear();
            }
            if (this.performanceEnabled) {
                finishSpan(this.appStartSpan, SpanStatus.CANCELLED);
                ISpan iSpan = this.ttidSpanMap.get(activity);
                ISpan iSpan2 = this.ttfdSpanMap.get(activity);
                finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
                lambda$startTracing$1(iSpan2, iSpan);
                cancelTtfdAutoClose();
                stopTracing(activity, true);
                this.appStartSpan = null;
                this.ttidSpanMap.remove(activity);
                this.ttfdSpanMap.remove(activity);
            }
            this.activitiesWithOngoingTransactions.remove(activity);
            if (this.activitiesWithOngoingTransactions.isEmpty() && !activity.isChangingConfigurations()) {
                clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            ITransaction iTransaction = this.appStartSpan;
            if (iTransaction == null) {
                iTransaction = this.activitiesWithOngoingTransactions.get(activity);
            }
            activityLifecycleSpanHelper.createAndStopOnCreateSpan(iTransaction);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NotNull Activity activity) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            ITransaction iTransaction = this.appStartSpan;
            if (iTransaction == null) {
                iTransaction = this.activitiesWithOngoingTransactions.get(activity);
            }
            activityLifecycleSpanHelper.createAndStopOnStartSpan(iTransaction);
            activityLifecycleSpanHelper.saveSpanToAppStartMetrics();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = new ActivityLifecycleSpanHelper(activity.getClass().getName());
        this.activitySpanHelpers.put(activity, activityLifecycleSpanHelper);
        if (this.firstActivityCreated) {
            return;
        }
        IScopes iScopes = this.scopes;
        SentryDate sentryDateNow = iScopes != null ? iScopes.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
        this.lastPausedTime = sentryDateNow;
        activityLifecycleSpanHelper.setOnCreateStartTimestamp(sentryDateNow);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@NotNull Activity activity) {
        this.firstActivityCreated = true;
        IScopes iScopes = this.scopes;
        this.lastPausedTime = iScopes != null ? iScopes.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(@NotNull Activity activity) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            activityLifecycleSpanHelper.setOnStartStartTimestamp(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPostStarted(activity);
            }
            if (this.performanceEnabled) {
                ISpan iSpan = this.ttidSpanMap.get(activity);
                ISpan iSpan2 = this.ttfdSpanMap.get(activity);
                if (activity.getWindow() != null) {
                    FirstDrawDoneListener.registerForNextDraw(activity, new g(this, iSpan2, iSpan, 1), this.buildInfoProvider);
                } else {
                    new Handler(Looper.getMainLooper()).post(new g(this, iSpan2, iSpan, 2));
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.performanceEnabled) {
                this.activityFramesTracker.addActivity(activity);
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

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.performanceEnabled = isPerformanceEnabled(this.options);
        this.fullyDisplayedReporter = this.options.getFullyDisplayedReporter();
        this.timeToFullDisplaySpanEnabled = this.options.isEnableTimeToFullDisplayTracing();
        this.application.registerActivityLifecycleCallbacks(this);
        this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ActivityLifecycle");
    }

    public void setFirstActivityCreated(boolean z5) {
        this.firstActivityCreated = z5;
    }

    private void finishSpan(@Nullable ISpan iSpan, @NotNull SentryDate sentryDate) {
        finishSpan(iSpan, sentryDate, null);
    }

    private void finishSpan(@Nullable ISpan iSpan, @NotNull SentryDate sentryDate, @Nullable SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        if (spanStatus == null) {
            spanStatus = iSpan.getStatus() != null ? iSpan.getStatus() : SpanStatus.OK;
        }
        iSpan.finish(spanStatus, sentryDate);
    }

    private void finishSpan(@Nullable ISpan iSpan, @NotNull SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish(spanStatus);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }
}
