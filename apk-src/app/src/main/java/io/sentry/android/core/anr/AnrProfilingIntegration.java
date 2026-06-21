package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.appmetrica.analytics.impl.cp;
import io.appmetrica.analytics.impl.lp;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.NoOpLogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.SentryRandom;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AnrProfilingIntegration implements Integration, Closeable, AppState.AppStateListener, Runnable {
    static final int MAX_NUM_STACKS = 151;
    public static final long POLLING_INTERVAL_MS = 66;
    public static final long THRESHOLD_ANR_MS = 4000;
    private static final long THRESHOLD_SUSPICION_MS = 1000;

    @Nullable
    private volatile Handler mainHandler;

    @Nullable
    private volatile Thread mainThread;

    @Nullable
    private volatile SentryAndroidOptions options;

    @Nullable
    private volatile AnrProfileManager profileManager;
    private final AtomicBoolean enabled = new AtomicBoolean(true);
    private final Runnable updater = new lp(2, this);

    @NotNull
    private final AutoClosableReentrantLock lifecycleLock = new AutoClosableReentrantLock();

    @NotNull
    private final AutoClosableReentrantLock profileManagerLock = new AutoClosableReentrantLock();
    private volatile long lastMainThreadExecutionTime = SystemClock.uptimeMillis();
    final AtomicInteger numCollectedStacks = new AtomicInteger();
    private volatile MainThreadState mainThreadState = MainThreadState.IDLE;

    @NotNull
    private volatile ILogger logger = NoOpLogger.getInstance();

    @Nullable
    private volatile Thread thread = null;
    private volatile boolean sampled = false;
    private volatile boolean inForeground = false;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum MainThreadState {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    private void addStackTrace(@NotNull AnrStackTrace anrStackTrace) {
        if (this.enabled.get()) {
            this.numCollectedStacks.incrementAndGet();
            getProfileManager().add(anrStackTrace);
        }
    }

    private void clearStacks() {
        this.numCollectedStacks.set(0);
        getProfileManager().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$1(AnrProfileManager anrProfileManager) {
        if (anrProfileManager == null) {
            return;
        }
        try {
            anrProfileManager.close();
        } catch (IOException unused) {
            this.logger.log(SentryLevel.WARNING, "Failed to close AnrProfileManager", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.lastMainThreadExecutionTime = SystemClock.uptimeMillis();
    }

    public void checkMainThread(@NotNull Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.lastMainThreadExecutionTime;
        if (jUptimeMillis < THRESHOLD_SUSPICION_MS) {
            this.mainThreadState = MainThreadState.IDLE;
            this.sampled = false;
        }
        if (this.mainThreadState == MainThreadState.IDLE && jUptimeMillis > THRESHOLD_SUSPICION_MS) {
            ILogger iLogger = this.logger;
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            if (iLogger.isEnabled(sentryLevel)) {
                this.logger.log(sentryLevel, "ANR: main thread is suspicious", new Object[0]);
            }
            this.mainThreadState = MainThreadState.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && SentryRandom.current().nextDouble() < anrProfilingSampleRate.doubleValue()) {
                this.sampled = true;
            }
            if (this.sampled) {
                clearStacks();
            }
        }
        if (this.sampled && (this.mainThreadState == MainThreadState.SUSPICIOUS || this.mainThreadState == MainThreadState.ANR_DETECTED)) {
            if (this.numCollectedStacks.get() < MAX_NUM_STACKS) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                AnrStackTrace anrStackTrace = new AnrStackTrace(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                ILogger iLogger2 = this.logger;
                SentryLevel sentryLevel2 = SentryLevel.DEBUG;
                if (iLogger2.isEnabled(sentryLevel2)) {
                    this.logger.log(sentryLevel2, "AnrWatchdog: capturing main thread stacktrace took " + jUptimeMillis3 + "ms", new Object[0]);
                }
                addStackTrace(anrStackTrace);
            } else {
                ILogger iLogger3 = this.logger;
                SentryLevel sentryLevel3 = SentryLevel.DEBUG;
                if (iLogger3.isEnabled(sentryLevel3)) {
                    this.logger.log(sentryLevel3, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.mainThreadState != MainThreadState.SUSPICIOUS || jUptimeMillis <= THRESHOLD_ANR_MS) {
            return;
        }
        ILogger iLogger4 = this.logger;
        SentryLevel sentryLevel4 = SentryLevel.DEBUG;
        if (iLogger4.isEnabled(sentryLevel4)) {
            this.logger.log(sentryLevel4, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.mainThreadState = MainThreadState.ANR_DETECTED;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.enabled.set(false);
        AppState.getInstance().removeAppStateListener(this);
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacks(this.updater);
        }
        Thread thread = this.thread;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.profileManagerLock.acquire();
        try {
            AnrProfileManager anrProfileManager = this.profileManager;
            this.profileManager = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new cp(4, this, anrProfileManager));
                } catch (Throwable unused) {
                    this.logger.log(SentryLevel.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
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

    @NotNull
    public AnrProfileManager getProfileManager() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.profileManagerLock.acquire();
        try {
            if (this.profileManager == null) {
                SentryOptions sentryOptions = (SentryOptions) Objects.requireNonNull(this.options, "Options can't be null");
                String cacheDirPath = sentryOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                this.profileManager = new AnrProfileManager(sentryOptions, AnrProfileRotationHelper.getFileForRecording(new File(cacheDirPath)));
            }
            AnrProfileManager anrProfileManager = this.profileManager;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return anrProfileManager;
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

    @NotNull
    public MainThreadState getState() {
        return this.mainThreadState;
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        if (this.enabled.get()) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
            try {
                this.inForeground = false;
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
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        if (this.enabled.get()) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
            try {
                if (this.inForeground) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                }
                this.inForeground = true;
                this.updater.run();
                Thread thread = this.thread;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.thread = thread2;
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
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.logger = sentryOptions.getLogger();
        if (this.options.isAnrProfilingEnabled()) {
            if (this.options.getCacheDirPath() == null) {
                this.logger.log(SentryLevel.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.mainThread = mainLooper.getThread();
            this.mainHandler = new Handler(mainLooper);
            IntegrationUtils.addIntegrationToSdkVersion("AnrProfiling");
            AppState.getInstance().addAppStateListener(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.mainHandler;
        Thread thread = this.mainThread;
        if (handler == null || thread == null) {
            return;
        }
        while (this.enabled.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.inForeground) {
                        checkMainThread(thread);
                        handler.removeCallbacks(this.updater);
                        handler.post(this.updater);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.inForeground && this.enabled.get()) {
                                try {
                                    wait();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        this.updater.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th3) {
                this.logger.log(SentryLevel.WARNING, "Failed to execute AnrStacktraceIntegration", th3);
                return;
            }
        }
    }
}
