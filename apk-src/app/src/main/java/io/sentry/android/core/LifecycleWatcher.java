package io.sentry.android.core;

import io.appmetrica.analytics.impl.A2;
import io.appmetrica.analytics.impl.C0232ia;
import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.Session;
import io.sentry.android.core.AppState;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class LifecycleWatcher implements AppState.AppStateListener {

    @NotNull
    private final ICurrentDateProvider currentDateProvider;
    private final boolean enableAppLifecycleBreadcrumbs;
    private final boolean enableSessionTracking;
    private final AtomicLong lastUpdatedSession;

    @NotNull
    private final IScopes scopes;
    private final long sessionIntervalMillis;

    @NotNull
    private final LazyEvaluator<Timer> timer;

    @NotNull
    private final AutoClosableReentrantLock timerLock;

    @Nullable
    private TimerTask timerTask;

    public LifecycleWatcher(@NotNull IScopes iScopes, long j10, boolean z5, boolean z10) {
        this(iScopes, j10, z5, z10, CurrentDateProvider.getInstance());
    }

    private void addAppBreadcrumb(@NotNull String str) {
        if (this.enableAppLifecycleBreadcrumbs) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("navigation");
            breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
            breadcrumb.setCategory("app.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.scopes.addBreadcrumb(breadcrumb);
        }
    }

    private void cancelTask() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            TimerTask timerTask = this.timerTask;
            if (timerTask != null) {
                timerTask.cancel();
                this.timerTask = null;
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
    public static /* synthetic */ Timer lambda$new$0() {
        return new Timer(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startSession$1(IScope iScope) {
        Session session;
        if (this.lastUpdatedSession.get() != 0 || (session = iScope.getSession()) == null || session.getStarted() == null) {
            return;
        }
        this.lastUpdatedSession.set(session.getStarted().getTime());
    }

    private void scheduleEndSession() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            cancelTask();
            this.timerTask = new TimerTask() { // from class: io.sentry.android.core.LifecycleWatcher.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (LifecycleWatcher.this.enableSessionTracking) {
                        LifecycleWatcher.this.scopes.endSession();
                    }
                    LifecycleWatcher.this.scopes.getOptions().getReplayController().stop();
                    LifecycleWatcher.this.scopes.getOptions().getContinuousProfiler().close(false);
                }
            };
            this.timer.getValue().schedule(this.timerTask, this.sessionIntervalMillis);
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

    private void startSession() {
        cancelTask();
        long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis();
        this.scopes.configureScope(new t(0, this));
        long j10 = this.lastUpdatedSession.get();
        if (j10 == 0 || j10 + this.sessionIntervalMillis <= currentTimeMillis) {
            if (this.enableSessionTracking) {
                this.scopes.startSession();
            }
            this.scopes.getOptions().getReplayController().start();
        }
        this.scopes.getOptions().getReplayController().resume();
        this.lastUpdatedSession.set(currentTimeMillis);
    }

    @NotNull
    public Timer getTimer() {
        return this.timer.getValue();
    }

    @Nullable
    public TimerTask getTimerTask() {
        return this.timerTask;
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        this.lastUpdatedSession.set(this.currentDateProvider.getCurrentTimeMillis());
        this.scopes.getOptions().getReplayController().pause();
        scheduleEndSession();
        addAppBreadcrumb(A2.f22054g);
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        startSession();
        addAppBreadcrumb(C0232ia.f24064g);
    }

    public LifecycleWatcher(@NotNull IScopes iScopes, long j10, boolean z5, boolean z10, @NotNull ICurrentDateProvider iCurrentDateProvider) {
        this.lastUpdatedSession = new AtomicLong(0L);
        this.timer = new LazyEvaluator<>(new p(1));
        this.timerLock = new AutoClosableReentrantLock();
        this.sessionIntervalMillis = j10;
        this.enableSessionTracking = z5;
        this.enableAppLifecycleBreadcrumbs = z10;
        this.scopes = iScopes;
        this.currentDateProvider = iCurrentDateProvider;
    }
}
