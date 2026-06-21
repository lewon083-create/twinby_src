package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.DateUtils;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.NoOpLogger;
import io.sentry.SentryAttributeType;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class DefaultAndroidEventProcessor implements EventProcessor {

    @NotNull
    private final BuildInfoProvider buildInfoProvider;
    final Context context;

    @NotNull
    private final LazyEvaluator<String> deviceFamily = new LazyEvaluator<>(new p(0));

    @Nullable
    final Future<DeviceInfoUtil> deviceInfoUtil;

    @NotNull
    private final SentryAndroidOptions options;

    public DefaultAndroidEventProcessor(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        Future<DeviceInfoUtil> futureSubmit;
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new q(this, sentryAndroidOptions, 0));
        } catch (RejectedExecutionException e3) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Device info caching task rejected.", e3);
            futureSubmit = null;
        }
        this.deviceInfoUtil = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void fixExceptionOrder(@NotNull SentryEvent sentryEvent) {
        SentryStackTrace stacktrace;
        List<SentryStackFrame> frames;
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null || exceptions.size() <= 1) {
            return;
        }
        SentryException sentryException = exceptions.get(exceptions.size() - 1);
        if (!"java.lang".equals(sentryException.getModule()) || (stacktrace = sentryException.getStacktrace()) == null || (frames = stacktrace.getFrames()) == null) {
            return;
        }
        Iterator<SentryStackFrame> it = frames.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().getModule())) {
                Collections.reverse(exceptions);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0() {
        return ContextUtils.getFamily(NoOpLogger.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DeviceInfoUtil lambda$new$1(SentryAndroidOptions sentryAndroidOptions) {
        return DeviceInfoUtil.getInstance(this.context, sentryAndroidOptions);
    }

    private void mergeOS(@NotNull SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future != null) {
            try {
                sentryBaseEvent.getContexts().setOperatingSystem(future.get().getOperatingSystem());
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            if (name == null || name.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + name.trim().toLowerCase(Locale.ROOT);
            }
            sentryBaseEvent.getContexts().put(str, operatingSystem);
        }
    }

    private void mergeUser(@NotNull SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getId() == null) {
            user.setId(Installation.id(this.context));
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull Hint hint) {
        App app = sentryBaseEvent.getContexts().getApp();
        if (app == null) {
            app = new App();
        }
        setAppExtras(app, hint);
        setPackageInfo(sentryBaseEvent, app);
        sentryBaseEvent.getContexts().setApp(app);
    }

    private void setAppExtras(@NotNull App app, @NotNull Hint hint) {
        Boolean boolIsInBackground;
        app.setAppName(ContextUtils.getApplicationName(this.context));
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        if (appStartTimeSpanWithFallback.hasStarted()) {
            app.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
        }
        if (HintUtils.isFromHybridSdk(hint) || app.getInForeground() != null || (boolIsInBackground = AppState.getInstance().isInBackground()) == null) {
            return;
        }
        app.setInForeground(Boolean.valueOf(!boolIsInBackground.booleanValue()));
    }

    private void setCommons(@NotNull SentryBaseEvent sentryBaseEvent, boolean z5, boolean z10) {
        mergeUser(sentryBaseEvent);
        setDevice(sentryBaseEvent, z5, z10);
        setSideLoadedInfo(sentryBaseEvent);
    }

    private void setDevice(@NotNull SentryBaseEvent sentryBaseEvent, boolean z5, boolean z10) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            if (this.deviceInfoUtil != null) {
                try {
                    sentryBaseEvent.getContexts().setDevice(this.deviceInfoUtil.get().collectDeviceInformation(z5, z10));
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            mergeOS(sentryBaseEvent);
        }
    }

    private void setDist(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull String str) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(str);
        }
    }

    private void setOs(@NotNull SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("os.name", new SentryLogEventAttributeValue(sentryAttributeType, "Android"));
            sentryLogEvent.setAttribute("os.version", new SentryLogEventAttributeValue(sentryAttributeType, Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th2);
        }
    }

    private void setPackageInfo(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull App app) {
        DeviceInfoUtil deviceInfoUtil;
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, 4096, this.options.getLogger(), this.buildInfoProvider);
        if (packageInfo != null) {
            setDist(sentryBaseEvent, ContextUtils.getVersionCode(packageInfo, this.buildInfoProvider));
            Future<DeviceInfoUtil> future = this.deviceInfoUtil;
            if (future != null) {
                try {
                    deviceInfoUtil = future.get();
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th2);
                    deviceInfoUtil = null;
                }
                ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app);
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            deviceInfoUtil = null;
            ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app);
        }
    }

    private void setSideLoadedInfo(@NotNull SentryBaseEvent sentryBaseEvent) {
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            ContextUtils.SideLoadedInfo sideLoadedInfo = future.get().getSideLoadedInfo();
            if (sideLoadedInfo != null) {
                for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                    sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void setThreads(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        if (sentryEvent.getThreads() != null) {
            boolean zIsFromHybridSdk = HintUtils.isFromHybridSdk(hint);
            for (SentryThread sentryThread : sentryEvent.getThreads()) {
                boolean zIsMainThread = AndroidThreadChecker.getInstance().isMainThread(sentryThread);
                if (sentryThread.isCurrent() == null) {
                    sentryThread.setCurrent(Boolean.valueOf(zIsMainThread));
                }
                if (!zIsFromHybridSdk && sentryThread.isMain() == null) {
                    sentryThread.setMain(Boolean.valueOf(zIsMainThread));
                }
            }
        }
    }

    private boolean shouldApplyScopeData(@NotNull SentryBaseEvent sentryBaseEvent, @NotNull Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    @NotNull
    public User getDefaultUser(@NotNull Context context) {
        User user = new User();
        user.setId(Installation.id(context));
        return user;
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public Long getOrder() {
        return 8000L;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryEvent process(@NotNull SentryEvent sentryEvent, @NotNull Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryEvent, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryEvent, hint);
            setThreads(sentryEvent, hint);
        }
        setCommons(sentryEvent, true, zShouldApplyScopeData);
        fixExceptionOrder(sentryEvent);
        return sentryEvent;
    }

    private void setOs(@NotNull SentryMetricsEvent sentryMetricsEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryMetricsEvent.setAttribute("os.name", new SentryLogEventAttributeValue(sentryAttributeType, "Android"));
            sentryMetricsEvent.setAttribute("os.version", new SentryLogEventAttributeValue(sentryAttributeType, Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th2);
        }
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryLogEvent process(@NotNull SentryLogEvent sentryLogEvent) {
        setDevice(sentryLogEvent);
        setOs(sentryLogEvent);
        return sentryLogEvent;
    }

    private void setDevice(@NotNull SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(sentryAttributeType, Build.BRAND));
            sentryLogEvent.setAttribute("device.model", new SentryLogEventAttributeValue(sentryAttributeType, Build.MODEL));
            sentryLogEvent.setAttribute("device.family", new SentryLogEventAttributeValue(sentryAttributeType, this.deviceFamily.getValue()));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th2);
        }
    }

    @Override // io.sentry.EventProcessor
    @Nullable
    public SentryMetricsEvent process(@NotNull SentryMetricsEvent sentryMetricsEvent, @NotNull Hint hint) {
        setDevice(sentryMetricsEvent);
        setOs(sentryMetricsEvent);
        return sentryMetricsEvent;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryTransaction process(@NotNull SentryTransaction sentryTransaction, @NotNull Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryTransaction, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryTransaction, hint);
        }
        setCommons(sentryTransaction, false, zShouldApplyScopeData);
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    @NotNull
    public SentryReplayEvent process(@NotNull SentryReplayEvent sentryReplayEvent, @NotNull Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryReplayEvent, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryReplayEvent, hint);
        }
        setCommons(sentryReplayEvent, false, zShouldApplyScopeData);
        return sentryReplayEvent;
    }

    private void setDevice(@NotNull SentryMetricsEvent sentryMetricsEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryMetricsEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(sentryAttributeType, Build.BRAND));
            sentryMetricsEvent.setAttribute("device.model", new SentryLogEventAttributeValue(sentryAttributeType, Build.MODEL));
            sentryMetricsEvent.setAttribute("device.family", new SentryLogEventAttributeValue(sentryAttributeType, this.deviceFamily.getValue()));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th2);
        }
    }
}
