package io.sentry.android.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.NoOpLogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppState implements Closeable {

    @NotNull
    private static AppState instance = new AppState();
    private volatile LifecycleObserver lifecycleObserver;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private MainLooperHandler handler = new MainLooperHandler();

    @Nullable
    private volatile Boolean inBackground = null;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface AppStateListener {
        void onBackground();

        void onForeground();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public final class LifecycleObserver implements DefaultLifecycleObserver {
        final List<AppStateListener> listeners = new CopyOnWriteArrayList<AppStateListener>() { // from class: io.sentry.android.core.AppState.LifecycleObserver.1
            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public boolean add(AppStateListener appStateListener) {
                boolean zAdd = super.add(appStateListener);
                if (Boolean.FALSE.equals(AppState.this.inBackground)) {
                    appStateListener.onForeground();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(AppState.this.inBackground)) {
                    appStateListener.onBackground();
                }
                return zAdd;
            }
        };

        public LifecycleObserver() {
        }

        public List<AppStateListener> getListeners() {
            return this.listeners;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(@NonNull androidx.lifecycle.u uVar) {
            AppState.this.setInBackground(false);
            Iterator<AppStateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onForeground();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(@NonNull androidx.lifecycle.u uVar) {
            AppState.this.setInBackground(true);
            Iterator<AppStateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onBackground();
            }
        }
    }

    private AppState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addObserverInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$ensureLifecycleObserver$0(@NotNull ILogger iLogger) {
        LifecycleObserver lifecycleObserver = this.lifecycleObserver;
        if (lifecycleObserver != null) {
            try {
                ProcessLifecycleOwner.f1526j.f1532g.a(lifecycleObserver);
            } catch (Throwable th2) {
                this.lifecycleObserver = null;
                iLogger.log(SentryLevel.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    private void ensureLifecycleObserver(@NotNull ILogger iLogger) {
        if (this.lifecycleObserver != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f1526j;
            this.lifecycleObserver = new LifecycleObserver();
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                lambda$ensureLifecycleObserver$0(iLogger);
            } else {
                this.handler.post(new b(1, this, iLogger));
            }
        } catch (ClassNotFoundException unused) {
            iLogger.log(SentryLevel.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    @NotNull
    public static AppState getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: removeObserverInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$unregisterLifecycleObserver$1(@Nullable LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver != null) {
            ProcessLifecycleOwner.f1526j.f1532g.b(lifecycleObserver);
        }
    }

    public void addAppStateListener(@NotNull AppStateListener appStateListener) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ensureLifecycleObserver(NoOpLogger.getInstance());
            if (this.lifecycleObserver != null) {
                this.lifecycleObserver.listeners.add(appStateListener);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        unregisterLifecycleObserver();
    }

    public LifecycleObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    @Nullable
    public Boolean isInBackground() {
        return this.inBackground;
    }

    public void registerLifecycleObserver(@Nullable SentryOptions sentryOptions) {
        if (this.lifecycleObserver != null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ensureLifecycleObserver(sentryOptions != null ? sentryOptions.getLogger() : NoOpLogger.getInstance());
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

    public void removeAppStateListener(@NotNull AppStateListener appStateListener) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.lifecycleObserver != null) {
                this.lifecycleObserver.listeners.remove(appStateListener);
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

    public void resetInstance() {
        instance = new AppState();
    }

    public void setHandler(@NotNull MainLooperHandler mainLooperHandler) {
        this.handler = mainLooperHandler;
    }

    public void setInBackground(boolean z5) {
        this.inBackground = Boolean.valueOf(z5);
    }

    public void unregisterLifecycleObserver() {
        if (this.lifecycleObserver == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            this.lifecycleObserver.listeners.clear();
            this.lifecycleObserver = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                lambda$unregisterLifecycleObserver$1(lifecycleObserver);
            } else {
                this.handler.post(new b(2, this, lifecycleObserver));
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
