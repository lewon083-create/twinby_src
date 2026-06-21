package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.NoOpLogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryUserFeedbackForm;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class FeedbackShakeIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    @NotNull
    private final Application application;

    @Nullable
    private volatile WeakReference<Activity> currentActivityRef;

    @Nullable
    private SentryAndroidOptions options;

    @Nullable
    private volatile Runnable previousOnFormClose;
    private volatile boolean isDialogShowing = false;

    @NotNull
    private final SentryShakeDetector shakeDetector = new SentryShakeDetector(NoOpLogger.getInstance());

    public FeedbackShakeIntegration(@NotNull Application application) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShakeDetection$0(Runnable runnable) {
        this.isDialogShowing = false;
        this.options.getFeedbackOptions().setOnFormClose(runnable);
        if (runnable != null) {
            runnable.run();
        }
        this.previousOnFormClose = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShakeDetection$1(Activity activity) {
        if (this.isDialogShowing || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            this.isDialogShowing = true;
            Runnable onFormClose = this.options.getFeedbackOptions().getOnFormClose();
            this.previousOnFormClose = onFormClose;
            this.options.getFeedbackOptions().setOnFormClose(new b(3, this, onFormClose));
            new SentryUserFeedbackForm.Builder(activity).create().show();
        } catch (Throwable th2) {
            this.isDialogShowing = false;
            this.options.getFeedbackOptions().setOnFormClose(this.previousOnFormClose);
            this.previousOnFormClose = null;
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to show feedback dialog on shake.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShakeDetection$2() {
        WeakReference<Activity> weakReference = this.currentActivityRef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Boolean boolIsInBackground = AppState.getInstance().isInBackground();
        if (activity == null || this.options == null || this.isDialogShowing || Boolean.TRUE.equals(boolIsInBackground)) {
            return;
        }
        activity.runOnUiThread(new b(4, this, activity));
    }

    private void startShakeDetection(@NotNull Activity activity) {
        if (this.options == null) {
            return;
        }
        stopShakeDetection();
        this.shakeDetector.start(activity, new t(2, this));
    }

    private void stopShakeDetection() {
        this.shakeDetector.stop();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        this.shakeDetector.close();
        if (this.isDialogShowing) {
            this.isDialogShowing = false;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().setOnFormClose(this.previousOnFormClose);
            }
            this.previousOnFormClose = null;
        }
        this.currentActivityRef = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Activity activity2 = this.currentActivityRef != null ? this.currentActivityRef.get() : null;
        if (this.isDialogShowing && activity == activity2) {
            this.isDialogShowing = false;
            this.currentActivityRef = null;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().setOnFormClose(this.previousOnFormClose);
            }
            this.previousOnFormClose = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        if (activity == (this.currentActivityRef != null ? this.currentActivityRef.get() : null)) {
            stopShakeDetection();
            if (this.isDialogShowing) {
                return;
            }
            this.currentActivityRef = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Activity activity2 = this.currentActivityRef != null ? this.currentActivityRef.get() : null;
        if (this.isDialogShowing && activity2 != null && activity2 != activity) {
            this.isDialogShowing = false;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().setOnFormClose(this.previousOnFormClose);
            }
            this.previousOnFormClose = null;
        }
        this.currentActivityRef = new WeakReference<>(activity);
        startShakeDetection(activity);
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().isUseShakeGesture()) {
            this.shakeDetector.init(this.application, this.options.getLogger());
            IntegrationUtils.addIntegrationToSdkVersion("FeedbackShake");
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(SentryLevel.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity != null) {
                this.currentActivityRef = new WeakReference<>(activity);
                startShakeDetection(activity);
            }
        }
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
