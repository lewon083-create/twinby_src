package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidFatalLogger implements ILogger {

    @NotNull
    private final String tag;

    public AndroidFatalLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(@NotNull SentryLevel sentryLevel) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(@Nullable SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            Log.println(toLogcatLevel(sentryLevel), this.tag, String.format(str, objArr));
        }
    }

    public AndroidFatalLogger(@NotNull String str) {
        this.tag = str;
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, String.format(str, objArr), th2);
        } else {
            log(sentryLevel, str, th2);
        }
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th2) {
        Log.wtf(this.tag, str, th2);
    }
}
