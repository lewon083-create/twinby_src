package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SystemOutLogger implements ILogger {
    @NotNull
    private String captureStackTrace(@NotNull Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(@Nullable SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        System.out.println(sentryLevel + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th2) {
        if (th2 == null) {
            log(sentryLevel, str, new Object[0]);
            return;
        }
        System.out.println(sentryLevel + ": " + String.format(str, th2.toString()) + "\n" + captureStackTrace(th2));
    }

    @Override // io.sentry.ILogger
    public void log(@NotNull SentryLevel sentryLevel, @Nullable Throwable th2, @NotNull String str, @Nullable Object... objArr) {
        if (th2 == null) {
            log(sentryLevel, str, objArr);
            return;
        }
        System.out.println(sentryLevel + ": " + String.format(str, objArr) + " \n " + th2.toString() + "\n" + captureStackTrace(th2));
    }
}
