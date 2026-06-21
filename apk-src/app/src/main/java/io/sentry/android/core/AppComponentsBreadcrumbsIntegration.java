package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.protocol.Device;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {
    private static final long DEBOUNCE_WAIT_TIME_MS = 60000;

    @NotNull
    private static final Hint EMPTY_HINT = new Hint();

    @NotNull
    private final Context context;

    @Nullable
    private SentryAndroidOptions options;

    @Nullable
    private IScopes scopes;

    @NotNull
    private final Debouncer trimMemoryDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), DEBOUNCE_WAIT_TIME_MS, 0);

    public AppComponentsBreadcrumbsIntegration(@NotNull Context context) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureConfigurationChangedBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void lambda$onConfigurationChanged$0(long j10, @NotNull Configuration configuration) {
        if (this.scopes != null) {
            Device.DeviceOrientation orientation = DeviceOrientations.getOrientation(this.context.getResources().getConfiguration().orientation);
            String lowerCase = orientation != null ? orientation.name().toLowerCase(Locale.ROOT) : StringUtils.UNDEFINED;
            Breadcrumb breadcrumb = new Breadcrumb(j10);
            breadcrumb.setType("navigation");
            breadcrumb.setCategory("device.orientation");
            breadcrumb.setData("position", lowerCase);
            breadcrumb.setLevel(SentryLevel.INFO);
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_CONFIGURATION, configuration);
            this.scopes.addBreadcrumb(breadcrumb, hint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureLowMemoryBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void lambda$onTrimMemory$1(long j10, int i) {
        if (this.scopes != null) {
            Breadcrumb breadcrumb = new Breadcrumb(j10);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            breadcrumb.setMessage("Low memory");
            breadcrumb.setData("action", "LOW_MEMORY");
            breadcrumb.setData("level", Integer.valueOf(i));
            breadcrumb.setLevel(SentryLevel.WARNING);
            this.scopes.addBreadcrumb(breadcrumb, EMPTY_HINT);
        }
    }

    private void executeInBackground(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.context.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.options;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().log(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        executeInBackground(new n(this, System.currentTimeMillis(), configuration, 0));
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i >= 40 && !this.trimMemoryDebouncer.checkForDebounce()) {
            executeInBackground(new zl.l(this, i, 2, System.currentTimeMillis()));
        }
    }

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.options.isEnableAppComponentBreadcrumbs()));
        if (this.options.isEnableAppComponentBreadcrumbs()) {
            try {
                this.context.registerComponentCallbacks(this);
                sentryOptions.getLogger().log(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                IntegrationUtils.addIntegrationToSdkVersion("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.options.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().log(SentryLevel.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
