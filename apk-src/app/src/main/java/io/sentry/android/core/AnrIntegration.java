package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.internal.ads.om1;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.TransactionEnd;
import io.sentry.protocol.Mechanism;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AnrIntegration implements Integration, Closeable {

    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static ANRWatchDog anrWatchDog;

    @NotNull
    protected static final AutoClosableReentrantLock watchDogLock = new AutoClosableReentrantLock();

    @NotNull
    private final Context context;

    @Nullable
    private SentryOptions options;
    private boolean isClosed = false;

    @NotNull
    private final AutoClosableReentrantLock startLock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AnrHint implements AbnormalExit, TransactionEnd {
        private final boolean isBackgroundAnr;

        public AnrHint(boolean z5) {
            this.isBackgroundAnr = z5;
        }

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.AbnormalExit
        @Nullable
        public Long timestamp() {
            return null;
        }
    }

    public AnrIntegration(@NotNull Context context) {
        this.context = ContextUtils.getApplicationContext(context);
    }

    @NotNull
    private Throwable buildAnrThrowable(boolean z5, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        String strK = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z5) {
            strK = om1.k("Background ", strK);
        }
        Thread thread = applicationNotResponding.getThread();
        ApplicationNotResponding applicationNotResponding2 = thread == null ? new ApplicationNotResponding(strK) : new ApplicationNotResponding(strK, thread);
        Mechanism mechanism = new Mechanism();
        mechanism.setType(AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL);
        return new ExceptionMechanismException(mechanism, applicationNotResponding2, thread, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.startLock.acquire();
        try {
            if (!this.isClosed) {
                startAnrWatchdog(iScopes, sentryAndroidOptions);
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

    private void startAnrWatchdog(@NotNull IScopes iScopes, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = watchDogLock.acquire();
        try {
            if (anrWatchDog == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.log(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                ANRWatchDog aNRWatchDog = new ANRWatchDog(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new f(this, iScopes, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.context);
                anrWatchDog = aNRWatchDog;
                aNRWatchDog.start();
                sentryAndroidOptions.getLogger().log(sentryLevel, "AnrIntegration installed.", new Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th2;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.startLock.acquire();
        try {
            this.isClosed = true;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            iSentryLifecycleTokenAcquire = watchDogLock.acquire();
            try {
                ANRWatchDog aNRWatchDog = anrWatchDog;
                if (aNRWatchDog != null) {
                    aNRWatchDog.interrupt();
                    anrWatchDog = null;
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } finally {
            }
        } finally {
        }
    }

    @Nullable
    public ANRWatchDog getANRWatchDog() {
        return anrWatchDog;
    }

    @Override // io.sentry.Integration
    public final void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        register(iScopes, (SentryAndroidOptions) sentryOptions);
    }

    /* JADX INFO: renamed from: reportANR, reason: merged with bridge method [inline-methods] */
    public void lambda$startAnrWatchdog$1(@NotNull IScopes iScopes, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(AppState.getInstance().isInBackground());
        SentryEvent sentryEvent = new SentryEvent(buildAnrThrowable(zEquals, sentryAndroidOptions, applicationNotResponding));
        sentryEvent.setLevel(SentryLevel.ERROR);
        iScopes.captureEvent(sentryEvent, HintUtils.createWithTypeCheckHint(new AnrHint(zEquals)));
    }

    private void register(@NotNull IScopes iScopes, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            IntegrationUtils.addIntegrationToSdkVersion("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new u((Object) this, iScopes, sentryAndroidOptions, 3));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
