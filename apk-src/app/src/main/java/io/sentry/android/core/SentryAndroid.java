package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryAndroid {
    private static final String FRAGMENT_CLASS_NAME = "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks";
    static final String SENTRY_DISTRIBUTION_INTEGRATION_CLASS_NAME = "io.sentry.android.distribution.DistributionIntegration";
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_REPLAY_INTEGRATION_CLASS_NAME = "io.sentry.android.replay.ReplayIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final String TIMBER_CLASS_NAME = "timber.log.Timber";
    private static final long sdkInitMillis = SystemClock.uptimeMillis();

    @NotNull
    protected static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    private SentryAndroid() {
    }

    private static void deduplicateIntegrations(@NotNull SentryOptions sentryOptions, boolean z5, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Integration integration : sentryOptions.getIntegrations()) {
            if (z5 && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z10 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
            if (integration instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i10));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i11 = 0; i11 < arrayList3.size() - 1; i11++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList3.get(i11));
            }
        }
    }

    public static void init(@NotNull Context context) {
        init(context, new AndroidLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$1(ILogger iLogger, Context context, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) {
        boolean z5;
        io.sentry.util.LoadClass loadClass = new io.sentry.util.LoadClass();
        boolean zIsClassAvailable = loadClass.isClassAvailable(TIMBER_CLASS_NAME, sentryAndroidOptions);
        boolean z10 = true;
        if (loadClass.isClassAvailable(FRAGMENT_CLASS_NAME, sentryAndroidOptions) && loadClass.isClassAvailable(SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
            z5 = true;
        } else {
            z5 = true;
            z10 = false;
        }
        boolean z11 = (zIsClassAvailable && loadClass.isClassAvailable(SENTRY_TIMBER_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) ? z5 : false;
        boolean zIsClassAvailable2 = loadClass.isClassAvailable(SENTRY_REPLAY_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        boolean zIsClassAvailable3 = loadClass.isClassAvailable(SENTRY_DISTRIBUTION_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        io.sentry.util.LoadClass loadClass2 = new io.sentry.util.LoadClass();
        ActivityFramesTracker activityFramesTracker = new ActivityFramesTracker(loadClass2, sentryAndroidOptions);
        AndroidOptionsInitializer.loadDefaultAndMetadataOptions(sentryAndroidOptions, context, iLogger, buildInfoProvider);
        AndroidOptionsInitializer.installDefaultIntegrations(context, sentryAndroidOptions, buildInfoProvider, loadClass2, activityFramesTracker, z10, z11, zIsClassAvailable2, zIsClassAvailable3);
        boolean z12 = z11;
        boolean z13 = z10;
        try {
            optionsConfiguration.configure(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        if (sentryAndroidOptions.isEnablePerformanceV2() && buildInfoProvider.getSdkInfoVersion() >= 24) {
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            if (appStartTimeSpan.hasNotStarted()) {
                appStartTimeSpan.setStartedAt(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            appStartMetrics.registerLifecycleCallbacks((Application) context.getApplicationContext());
        }
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (sdkInitTimeSpan.hasNotStarted()) {
            sdkInitTimeSpan.setStartedAt(sdkInitMillis);
        }
        AndroidOptionsInitializer.initializeIntegrationsAndProcessors(sentryAndroidOptions, context, buildInfoProvider, loadClass2, activityFramesTracker, zIsClassAvailable2);
        deduplicateIntegrations(sentryAndroidOptions, z13, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$2(AtomicBoolean atomicBoolean, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null || session.getStarted() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static void init(@NotNull Context context, @NotNull ILogger iLogger) {
        init(context, iLogger, new a(6));
    }

    public static void init(@NotNull Context context, @NotNull Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    @SuppressLint({"NewApi"})
    public static void init(@NotNull Context context, @NotNull ILogger iLogger, @NotNull Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new f(iLogger, context, optionsConfiguration), true);
                IScopes currentScopes = Sentry.getCurrentScopes();
                if (ContextUtils.isForegroundImportance()) {
                    if (currentScopes.getOptions().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        currentScopes.configureScope(new t(4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            currentScopes.startSession();
                        }
                    }
                    currentScopes.getOptions().getReplayController().start();
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
        } catch (IllegalAccessException e3) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
        } catch (InstantiationException e7) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e7);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e7);
        } catch (NoSuchMethodException e10) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InvocationTargetException e11) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }
}
