package io.sentry.android.core;

import android.util.Log;
import io.sentry.Breadcrumb;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryLogLevel;
import io.sentry.logger.ILoggerApi;
import io.sentry.logger.SentryLogParameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryLogcatAdapter {
    private static void addAsBreadcrumb(@Nullable String str, @NotNull SentryLevel sentryLevel, @Nullable String str2) {
        addAsBreadcrumb(str, sentryLevel, str2, null);
    }

    private static void addAsLog(@NotNull SentryLogLevel sentryLogLevel, @Nullable String str, @Nullable Throwable th2) {
        ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
        if (scopesAdapter.getOptions().getLogs().isEnabled()) {
            String message = th2 != null ? th2.getMessage() : null;
            SentryLogParameters sentryLogParameters = new SentryLogParameters();
            sentryLogParameters.setOrigin("auto.log.logcat");
            if (th2 == null || message == null) {
                scopesAdapter.logger().log(sentryLogLevel, sentryLogParameters, str, new Object[0]);
                return;
            }
            ILoggerApi iLoggerApiLogger = scopesAdapter.logger();
            if (str != null) {
                message = gf.a.k(str, "\n", message);
            }
            iLoggerApiLogger.log(sentryLogLevel, sentryLogParameters, message, new Object[0]);
        }
    }

    public static int d(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2);
        addAsLog(SentryLogLevel.DEBUG, str2, null);
        return Log.d(str, str2);
    }

    public static int e(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2);
        addAsLog(SentryLogLevel.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int i(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.INFO, str2);
        addAsLog(SentryLogLevel.INFO, str2, null);
        return Log.i(str, str2);
    }

    public static int v(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2);
        addAsLog(SentryLogLevel.TRACE, str2, null);
        return Log.v(str, str2);
    }

    public static int w(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.WARNING, str2);
        addAsLog(SentryLogLevel.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static int wtf(@Nullable String str, @Nullable String str2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2);
        addAsLog(SentryLogLevel.FATAL, str2, null);
        return Log.wtf(str, str2);
    }

    private static void addAsBreadcrumb(@Nullable String str, @NotNull SentryLevel sentryLevel, @Nullable Throwable th2) {
        addAsBreadcrumb(str, sentryLevel, null, th2);
    }

    private static void addAsBreadcrumb(@Nullable String str, @NotNull SentryLevel sentryLevel, @Nullable String str2, @Nullable Throwable th2) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setCategory("Logcat");
        breadcrumb.setMessage(str2);
        breadcrumb.setLevel(sentryLevel);
        if (str != null) {
            breadcrumb.setData("tag", str);
        }
        if (th2 != null && th2.getMessage() != null) {
            breadcrumb.setData("throwable", th2.getMessage());
        }
        Sentry.addBreadcrumb(breadcrumb);
    }

    public static int d(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2, th2);
        addAsLog(SentryLogLevel.DEBUG, str2, th2);
        return Log.d(str, str2, th2);
    }

    public static int e(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2, th2);
        addAsLog(SentryLogLevel.ERROR, str2, th2);
        return Log.e(str, str2, th2);
    }

    public static int i(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.INFO, str2, th2);
        addAsLog(SentryLogLevel.INFO, str2, th2);
        return Log.i(str, str2, th2);
    }

    public static int v(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2, th2);
        addAsLog(SentryLogLevel.TRACE, str2, th2);
        return Log.v(str, str2, th2);
    }

    public static int w(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.WARNING, str2, th2);
        addAsLog(SentryLogLevel.WARN, str2, th2);
        return Log.w(str, str2, th2);
    }

    public static int wtf(@Nullable String str, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, th2);
        addAsLog(SentryLogLevel.FATAL, null, th2);
        return Log.wtf(str, th2);
    }

    public static int w(@Nullable String str, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.WARNING, th2);
        addAsLog(SentryLogLevel.WARN, null, th2);
        return Log.w(str, th2);
    }

    public static int wtf(@Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2, th2);
        addAsLog(SentryLogLevel.FATAL, str2, th2);
        return Log.wtf(str, str2, th2);
    }
}
