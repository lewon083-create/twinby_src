package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.core.internal.gestures.SentryWindowCallback;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    @NotNull
    private final Application application;
    private final boolean isAndroidxLifecycleAvailable;

    @Nullable
    private SentryAndroidOptions options;

    @Nullable
    private IScopes scopes;

    @NotNull
    private final WeakHashMap<Window, WeakReference<SentryWindowCallback>> wrappedWindows = new WeakHashMap<>();

    @NotNull
    private final Object wrappedWindowsLock = new Object();

    public UserInteractionIntegration(@NotNull Application application, @NotNull io.sentry.util.LoadClass loadClass) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.isAndroidxLifecycleAvailable = loadClass.isClassAvailable("androidx.lifecycle.Lifecycle", this.options);
    }

    private void startTracking(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.scopes == null || this.options == null) {
            return;
        }
        synchronized (this.wrappedWindowsLock) {
            try {
                WeakReference<SentryWindowCallback> weakReference = this.wrappedWindows.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new NoOpWindowCallback();
                    }
                    SentryWindowCallback sentryWindowCallback = new SentryWindowCallback(callback, activity, new SentryGestureListener(activity, this.scopes, this.options), this.options);
                    window.setCallback(sentryWindowCallback);
                    synchronized (this.wrappedWindowsLock) {
                        this.wrappedWindows.put(window, new WeakReference<>(sentryWindowCallback));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void stopTracking(@NotNull Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            unwrapWindow(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    private void unwrapWindow(@NotNull Window window) {
        SentryWindowCallback sentryWindowCallback;
        Window.Callback callback = window.getCallback();
        if (callback instanceof SentryWindowCallback) {
            SentryWindowCallback sentryWindowCallback2 = (SentryWindowCallback) callback;
            sentryWindowCallback2.stopTracking();
            if (sentryWindowCallback2.getDelegate() instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(sentryWindowCallback2.getDelegate());
            }
            synchronized (this.wrappedWindowsLock) {
                this.wrappedWindows.remove(window);
            }
            return;
        }
        synchronized (this.wrappedWindowsLock) {
            try {
                WeakReference<SentryWindowCallback> weakReferenceRemove = this.wrappedWindows.remove(window);
                sentryWindowCallback = weakReferenceRemove != null ? weakReferenceRemove.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sentryWindowCallback != null) {
            sentryWindowCallback.stopTracking();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ArrayList<Window> arrayList;
        this.application.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.wrappedWindowsLock) {
            arrayList = new ArrayList(this.wrappedWindows.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                unwrapWindow(window);
            }
        }
        synchronized (this.wrappedWindowsLock) {
            this.wrappedWindows.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        stopTracking(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        startTracking(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        boolean z5 = this.options.isEnableUserInteractionBreadcrumbs() || this.options.isEnableUserInteractionTracing();
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z5));
        if (z5) {
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("UserInteraction");
            if (this.isAndroidxLifecycleAvailable) {
                Activity activity = CurrentActivityHolder.getInstance().getActivity();
                if ((activity instanceof androidx.lifecycle.u) && ((androidx.lifecycle.w) ((androidx.lifecycle.u) activity).getLifecycle()).f1606c == androidx.lifecycle.o.f1577f) {
                    startTracking(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }
}
